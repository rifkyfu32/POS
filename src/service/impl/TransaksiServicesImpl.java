/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.impl;

import dao.PembelianDao;
import dao.PenjualanDao;
import java.util.List;
import model.Pembelian;
import model.Penjualan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.TransaksiServices;

/**
 *
 * @author Fuady
 */
@Service(value="TransaksiServices")
@Transactional(readOnly=true)
public class TransaksiServicesImpl implements TransaksiServices{

    @Autowired private PenjualanDao penjualanDao;    

    @Autowired private PembelianDao pembelianDao; 
    
    @Transactional(readOnly=false)
    @Override
    public Pembelian simpan(Pembelian p) {
        return pembelianDao.save(p);
    }

    @Transactional(readOnly=false)
    @Override
    public Pembelian hapus(Pembelian p) {
        return pembelianDao.delete(p);
    }

    @Override
    public Pembelian getPembelian(String id) {
        return pembelianDao.getById(id);
    }

    @Override
    public List<Pembelian> getPembelians() {
        return pembelianDao.getAll();
    }

    @Transactional(readOnly=false)
    @Override
    public Penjualan simpan(Penjualan p) {
        return penjualanDao.save(p);
    }

    @Transactional(readOnly=false)
    @Override
    public Penjualan hapus(Penjualan p) {
        return penjualanDao.delete(p);
    }

    @Override
    public Penjualan getPenjualan(Long id) {
        return penjualanDao.getById(id);
    }

    @Override
    public List<Penjualan> getPenjualans() {
        return penjualanDao.getAll();
    }
    
}
