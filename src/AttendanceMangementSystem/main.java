/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package AttendanceMangementSystem;

/**
 *
 * @author nguye
 */
public class main {
    static String dbUsername = "baor1611_";
    static String dbPassword = "baor1611";

    static String jdbcUrl = "jdbc:sqlserver://sql.bsite.net\\MSSQL2016;databaseName=baor1611_;user=baor1611_;password=baor1611;encrypt=true;trustServerCertificate=true;";
    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
