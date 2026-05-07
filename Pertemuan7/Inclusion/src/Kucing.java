// Nama File    : Kucing.java
// Deskripsi    : Berisi atribut dan method dalam class Kucing
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 23 April 2026

public class Kucing extends Anabul {
    // ==== METHOD KONSTRUKTOR ====
    Kucing(String nama){
        this.nama = nama;
    }

    Kucing(){
        this("");
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Kucing " + nama + " membentuk roti.");
    }

    void suara(){
        System.out.println("Kucing " + nama + " mengeong.");
    }
}