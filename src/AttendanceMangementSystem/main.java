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
    static String dbUsername = "sa";
    static String dbPassword = "heosua123";

    static String jdbcUrl = "jdbc:sqlserver://localhost:1434;databaseName=AttendanceManagementSystem;user=" + dbUsername + ";password=" + dbPassword;

    public static void main(String[] args) {
        LoginFrame loginFrame = new LoginFrame();
        loginFrame.setVisible(true);
    }
}
