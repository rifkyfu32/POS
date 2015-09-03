/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.impl;

import java.io.InputStream;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import model.LaporanKeuntunganHarian;
import model.LaporanPembelianHarian;
import model.LaporanPenjualanHarian;
import model.LaporanPiutangPembelian;
import model.LaporanPiutangPenjualan;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.transform.Transformers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.ReportServices;

/**
 *
 * @author Fuady
 */
@Service("reportServices")
@Transactional(readOnly = true)
public class ReportServicesImpl implements ReportServices{
    
    private static final Logger log = Logger.getLogger(ReportServicesImpl.class);
    @Autowired private SessionFactory sessionFactory;

    @Override
    public JasperPrint getLaporanPenjualanHarian(Date date) {
        try{
            List<LaporanPenjualanHarian> laporanPenjualanHarians =
                sessionFactory.getCurrentSession()
                    .createQuery("select p.barang.nama as namaBarang, sum(p.jumlah) as jumlah, "
                    + " sum(p.subtotal) as subTotal from PenjualanDetail p "
                    + " where day(p.penjualan.tanggal) = day(:date) "
                    + " group by p.barang.nama order by p.barang.nama")
                    .setParameter("date", date)
                    .setResultTransformer(
                        Transformers.aliasToBean(LaporanPenjualanHarian.class))
                    .list();

            InputStream is = ReportServicesImpl.class
                    .getResourceAsStream("/reports/LaporanPenjualanHarianReport.jasper");

            Map<String,Object> parameters = new HashMap<>();
            parameters.put("date", date);

            return JasperFillManager.fillReport(is, parameters, 
                    new JRBeanCollectionDataSource(laporanPenjualanHarians));
        }catch(JRException ex){
            log.error("error generate LaporanPenjualanHarian", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getLaporanPembelianHarian(Date date) {
        try{
            List<LaporanPembelianHarian> laporanPembelianHarians =
                sessionFactory.getCurrentSession()
                    .createQuery("select p.barang.nama as namaBarang, sum(p.jumlah) as jumlah, "
                    + " sum(p.subtotal) as subTotal from PembelianDetail p "
                    + " where day(p.pembelian.tanggal) = day(:date) "
                    + " group by p.barang.nama order by p.barang.nama")
                    .setParameter("date", date)
                    .setResultTransformer(
                        Transformers.aliasToBean(LaporanPenjualanHarian.class))
                    .list();

            InputStream is = ReportServicesImpl.class
                    .getResourceAsStream("/reports/LaporanPembelianHarianReport.jasper");

            Map<String,Object> parameters = new HashMap<>();
            parameters.put("date", date);

            return JasperFillManager.fillReport(is, parameters, 
                    new JRBeanCollectionDataSource(laporanPembelianHarians));
        }catch(JRException ex){
            log.error("error generate LaporanPembelianHarian", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getLaporanPiutangPenjualan() {
        try{
            List<LaporanPiutangPenjualan> laporanPiutangPenjualans =
                sessionFactory.getCurrentSession()
                    .createQuery("select id as id, tanggal as tanggal, "
                    + " total as total, keterangan as keterangan from Penjualan "
                    + " where status=1 ")
                    .setResultTransformer(
                        Transformers.aliasToBean(LaporanPiutangPenjualan.class))
                    .list();
            InputStream is = ReportServicesImpl.class
                    .getResourceAsStream("/reports/LaporanPiutangPenjualanReport.jasper");

            Map<String,Object> parameters = new HashMap<>();

            return JasperFillManager.fillReport(is, parameters, 
                    new JRBeanCollectionDataSource(laporanPiutangPenjualans));
        }catch(JRException ex){
            log.error("error generate LaporanPiutangPenjualan", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getLaporanPiutangPembelian() {
        try{
            List<LaporanPiutangPembelian> laporanPiutangPembelians =
                sessionFactory.getCurrentSession()
                    .createQuery("select nota as nota, tanggal as tanggal, "
                    + " total as total, keterangan as keterangan from Pembelian "
                    + " where status=1 ")
                    .setResultTransformer(
                        Transformers.aliasToBean(LaporanPiutangPembelian.class))
                    .list();
            InputStream is = ReportServicesImpl.class
                    .getResourceAsStream("/reports/LaporanPiutangPembelianReport.jasper");

            Map<String,Object> parameters = new HashMap<>();

            return JasperFillManager.fillReport(is, parameters, 
                    new JRBeanCollectionDataSource(laporanPiutangPembelians));
        }catch(JRException ex){
            log.error("error generate LaporanPiutangPembelian", ex);
        }
        return null;
    }

    @Override
    public JasperPrint getLaporanKeuntunganHarian(Date date) {
        try{
            List<LaporanKeuntunganHarian> laporanKeuntunganHarians =
                sessionFactory.getCurrentSession()
                    .createQuery("select p.barang.nama as namaBarang, (p.harga-p.barang.hargaBeli)*sum(p.jumlah) as keuntungan "
                    + " from PenjualanDetail p "
                    + " where day(p.penjualan.tanggal) = day(:date) "
                    + " group by p.barang.nama order by p.barang.nama")
                    .setParameter("date", date)
                    .setResultTransformer(
                        Transformers.aliasToBean(LaporanKeuntunganHarian.class))
                    .list();

            InputStream is = ReportServicesImpl.class
                    .getResourceAsStream("/reports/LaporanKeuntunganHarianReport.jasper");

            Map<String,Object> parameters = new HashMap<>();
            parameters.put("date", date);

            return JasperFillManager.fillReport(is, parameters, 
                    new JRBeanCollectionDataSource(laporanKeuntunganHarians));
        }catch(JRException ex){
            log.error("error generate LaporanKeuntunganHarian", ex);
        }
        return null;
    }
    
}
