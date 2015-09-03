/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.util.List;
import model.Pembelian;
import model.Penjualan;

/**
 *
 * @author Fuady
 */
public interface TransaksiServices {
    Pembelian simpan (Pembelian p);
    Pembelian hapus (Pembelian p);
    Pembelian getPembelian(String id);
    List<Pembelian> getPembelians();
    
    Penjualan simpan (Penjualan p);
    Penjualan hapus (Penjualan p);
    Penjualan getPenjualan(Long id);
    List<Penjualan> getPenjualans();
}
