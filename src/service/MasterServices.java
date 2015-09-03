/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service;

import java.util.List;
import model.Barang;
import model.Login;

/**
 *
 * @author Fuady
 */
public interface MasterServices {
    Barang simpan (Barang b);
    Barang hapus (Barang b);
    Barang getBarang(Long id);
    List<Barang> getBarangs();
    List<Barang> cariBarangs(String nama);
    
    Login simpan(Login l);
    Login getLogin(String user);
}
