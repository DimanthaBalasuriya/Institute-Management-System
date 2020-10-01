package com.prog.cnv.sys.control.system.control;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 *
 * @author CHAMOD DIYAMANTHA BALASURIYA
 */
public class Database {

    private static Connection con;
    private static String host = "127.0.0.1";
    private static int port = 3306;
    private static String database = "cambridge_project";
    private static String dbUserName = "root";
    private static String dbPassword = "qwertyuiop12345";

    private static void setUpConnection() throws Exception {
        Class.forName("com.mysql.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/" + database, dbUserName, dbPassword);
    }

    public static ResultSet getData(String sql) throws Exception {
        if (con == null) {
            setUpConnection();
        }
        return con.createStatement().executeQuery(sql);
    }

    public static void sendData(String sql) throws Exception {
        if (con == null) {
            setUpConnection();
        }
        con.createStatement().executeUpdate(sql);
    }

    public static Connection getConnection() throws Exception {
        if (con == null) {
            setUpConnection();
        }
        return con;
    }

    public static boolean connectionTest() throws Exception {
        if (con == null) {
            return false;
        } else {
            return true;
        }
    }
//    
//    public static void main(String[] args) throws Exception{
//        setUpConnection();
//        if(connectionTest() == true){
//            System.out.println("Stab");
//        }else if(connectionTest() == false){
//            System.out.println("not stab");
//        }
//    }
}
