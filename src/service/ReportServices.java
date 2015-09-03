/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import java.util.Date;
import net.sf.jasperreports.engine.JasperPrint;

/**
 *
 * @author Fuady
 */
public interface ReportServices {

    JasperPrint getLaporanPenjualanHarian(Date date);

    JasperPrint getLaporanPembelianHarian(Date date);
    
    JasperPrint getLaporanPiutangPenjualan();
    
    JasperPrint getLaporanPiutangPembelian();
    
    JasperPrint getLaporanKeuntunganHarian(Date date);
    
}
