/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package dao;

import java.util.List;
import model.Barang;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Fuady
 */
@Repository
public class BarangDao extends BaseDaoHibernate<Barang>{
    public List<Barang> cariNamaBarang(String nama) {
        String query = "from " + domainClass.getName();
        query += " where nama like '" + nama + "%' ";
        return sessionFactory.getCurrentSession().createQuery(query).list();
    }
}
