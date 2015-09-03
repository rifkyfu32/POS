/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package service.impl;

import dao.BarangDao;
import dao.LoginDao;
import java.util.List;
import model.Barang;
import model.Login;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import service.MasterServices;

/**
 *
 * @author Fuady
 */
@Service(value="MasterServices")
@Transactional(readOnly=true)
public class MasterServicesImpl implements MasterServices{

    @Autowired private BarangDao barangDao;
    @Autowired private LoginDao loginDao;
    
    @Transactional(readOnly=false)
    @Override
    public Barang simpan(Barang b) {
        return barangDao.save(b);
    }

    @Transactional(readOnly=false)
    @Override
    public Barang hapus(Barang b) {
        return barangDao.delete(b);
    }

    @Override
    public Barang getBarang(Long id) {
        return barangDao.getById(id);
    }

    @Override
    public List<Barang> getBarangs() {
        return barangDao.getAll();
    }

    @Transactional(readOnly=false)
    @Override
    public Login simpan(Login l) {
        return loginDao.save(l);
    }

    @Override
    public Login getLogin(String user) {
        return loginDao.getById(user);
    }

    @Override
    public List<Barang> cariBarangs(String nama) {
        return barangDao.cariNamaBarang(nama);
    }
    
}
