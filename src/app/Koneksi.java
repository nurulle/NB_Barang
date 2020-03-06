/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import com.mysql.cj.jdbc.MysqlDataSource;
import java.sql.Connection;

/**
 *
 * @author Lenovo
 */
public class Koneksi {
     public static  Connection MySQL(){
        try {
            MysqlDataSource ds = new MysqlDataSource();
            ds.setUser("kelasc");
            ds.setPassword("kelasc123");
            ds.setServerName("localhost");
            ds.setDatabaseName("uasok");
            ds.setServerTimezone("Asia/Jakarta");
            ds.setPortNumber(3306);
            Connection c = ds.getConnection();
            return c;
        } catch (Exception e) {
            System.err.println(e.getMessage());
            return null;
        }
    }
//     public static void main(String[] args) {
//        try {
//            Connection cn = MySQL(); //karena masih satu kelas
//            System.out.println(cn.getCatalog());
//        } catch (Exception e) {
//        }
//    }
}
