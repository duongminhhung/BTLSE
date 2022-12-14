/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class KetNoiSQL {
//    public static String databaseName = "QuanLyThuVien_HKP2T";
    public static Connection getConnection() {
    	Connection conn = null;
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			try {
				conn = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=QuanLyThuVien_HKP2T;user=sa;password=12345;encrypt=true;trustServerCertificate=true;sslProtocol=T");
//				System.out.println("yes");
				return conn;
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
    }
    public static void main(String[] args) {
        KetNoiSQL.getConnection();
    }
}
