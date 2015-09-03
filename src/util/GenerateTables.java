/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;
import model.Barang;
import model.Login;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;
import org.hibernate.tool.hbm2ddl.SchemaExport;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MasterServices;
import service.TransaksiServices;

/**
 *
 * @author ifnu
 */
public class GenerateTables {

    public static void main(String[] args) throws SQLException {
        AbstractApplicationContext appContext
                = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");

        DataSource dataSource = (DataSource) appContext.getBean("dataSource");

        Configuration cfg = new AnnotationConfiguration()
                .configure("hibernate.cfg.xml");
        Connection conn = dataSource.getConnection();
        new SchemaExport(cfg, conn).create(true, true);

        MasterServices masterServices = (MasterServices) appContext.getBean("MasterServices");
        TransaksiServices transaksiServices = (TransaksiServices) appContext.getBean("TransaksiServices");
        SessionFactory sessionFactory = (SessionFactory) appContext.getBean("sessionFactory");
        Session s = sessionFactory.openSession();
        s.getTransaction().begin();

        Login login = new Login();
        login.setUsername("admin");
        login.setPassword("admin".getBytes());
        
        Barang b = new Barang();
        b.setNama("LPG 5 KG");
        b.setHargaBeli(new BigDecimal("15000"));
        b.setHargaJualEceran(new BigDecimal("18000"));
        b.setHargaJualGrosir(new BigDecimal("16500"));
        b.setSatuan("Tabung");
        b.setStock(100);
        
        Barang b1 = new Barang();
        b1.setNama("Telor Ayam");
        b1.setHargaBeli(new BigDecimal("18000"));
        b1.setHargaJualEceran(new BigDecimal("22000"));
        b1.setHargaJualGrosir(new BigDecimal("20000"));
        b1.setSatuan("Kg");
        b1.setStock(200);
        
        Barang b2 = new Barang();
        b2.setNama("Jahe Susu");
        b2.setHargaBeli(new BigDecimal("6000"));
        b2.setHargaJualEceran(new BigDecimal("8000"));
        b2.setHargaJualGrosir(new BigDecimal("7000"));
        b2.setSatuan("Lusin");
        b2.setStock(50);
        

        
        masterServices.simpan(login);
        s.save(b);
        s.save(b1);
        s.save(b2);
        
        s.getTransaction().commit();

        List<Login> nts = s.createQuery("from Login log")
                .list();
        for (Login test : nts) {
            System.out.println(test.getUsername());
            System.out.println(test.getPassword());
        }

        

        s.close();

        System.exit(0);
    }
}
