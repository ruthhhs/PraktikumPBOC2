package jdbc.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author
 * Ruth Septriana Sipangkar
 * 24060124120024
 */
public class MysqlUtility {
    private static Connection koneksi;
    
    public static Connection getConnection() {
        if (koneksi == null){
            try {
                // Class.forName("com.mysql.jdbc.Driver");
                Class.forName("com.mysql.cj.jdbc.Driver");
                String url = "jdbc:mysql://localhost:3306/jdbc_mhs";
                String user = "mahasiswa";
                String password = "rahasia";
                koneksi = DriverManager.getConnection(url, user, password);
                if (koneksi != null) {
                  System.out.println("Koneksi Berhasil");
                }
            } catch (ClassNotFoundException cne) {
                System.out.println("Gagal load driver: " + cne.getMessage());
            } catch (SQLException sqle) {
                System.out.println("Gagal Koneksi:" + sqle.getMessage());
            }
        }
        return koneksi;
    }
}