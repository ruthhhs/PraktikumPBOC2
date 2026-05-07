// Nama File    : MAnabul.java
// Deskripsi    : Driver yang menjalankan Anabul
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 23 April 2026

public class MAnabul {
    public static void main(String[] args) {
        Anabul A1 = new Anabul("Si itu");
        A1.gerak();
        A1.suara();
        
        Anabul A2 = new Anjing("Oppy Goopy");
        A2.gerak();
        A2.suara();

        Anabul A3 = new Burung("Little Jim Bob");
        A3.gerak();
        A3.suara();
        
        Anabul A4 = new Kucing("Larry");
        A4.gerak();
        A4.suara();
    }
}
