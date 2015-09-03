/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Fuady
 */
public class Server {
    private static Connection koneksi;

    public static Connection connect(){
       //untuk koneksi ke driver
       try{
           Class.forName("com.mysql.jdbc.Driver");
           System.out.println("berhasil load driver");
       }catch(ClassNotFoundException cnfe){
           System.out.println("Tidak ada Driver "+cnfe);
       }

       //untuk koneksi ke database
       try{
           String url="jdbc:mysql://localhost:3306/klontong";
           koneksi=DriverManager.getConnection(url,"root","");
           System.out.println("Berhasil koneksi");
       }catch(SQLException se){
           JOptionPane.showMessageDialog(null,"Gagal koneksi...MySQL server belum aktif");
           System.exit(0);
       }
       return koneksi;
    }
}
