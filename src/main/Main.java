/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import com.jtattoo.plaf.acryl.AcrylLookAndFeel;
import java.util.Properties;
import javax.swing.UIManager;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import service.MasterServices;
import service.TransaksiServices;
import util.Server;
import view.LoginView;
import view.MenuView;
import view.SplashScreen;
import org.apache.log4j.Logger;
import service.ReportServices;

/**
 *
 * @author Fuady
 */
public class Main {

    private static MenuView menuView;
    private static LoginView loginView;
    private static MasterServices masterServices;
    private static TransaksiServices transaksiServices;
    private static ReportServices reportServices;
    private static final Logger log = Logger.getLogger(Main.class);

    public static MenuView getMenuView() {
        return menuView;
    }

    public static LoginView getLoginView() {
        return loginView;
    }

    public static TransaksiServices getTransaksiServices() {
        return transaksiServices;
    }

    public static MasterServices getMasterServices() {
        return masterServices;
    }

    public static ReportServices getReportServices() {
        return reportServices;
    }   
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
            Properties props = new Properties();
            props.put("logoString", "Nemuide");
            props.put("macStyleWindowDecoration", "on");
            AcrylLookAndFeel.setCurrentTheme(props);
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            log.error("Error Menampilkan Look And Feel " +ex);
        }
        final SplashScreen splas = new SplashScreen();
        splas.setVisible(true);
        for (int i = 0; i <= 100; i++) {
            try {
                splas.getLabel().setText("" + i);
                splas.getProgressBar().setValue(i);
                Thread.sleep(30);
            } catch (InterruptedException e) {
                log.error("Error Menampilkan Splash Screen " +e);
            }
        }
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                
                Server.connect();
                ApplicationContext ac = new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
                masterServices = (MasterServices) ac.getBean("MasterServices");
                transaksiServices = (TransaksiServices) ac.getBean("TransaksiServices");
                reportServices = (ReportServices) ac.getBean("reportServices");
                menuView = new MenuView();
                loginView = new LoginView();
                splas.dispose();
                menuView.setVisible(true);
                loginView.setVisible(true);

            }
        });
    }

}
