// Nama File    : Anabul.java
// Deskripsi    : Berisi atribut dan method dalam class Anabul
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class Anabul {
    // ==== ATRIBUT ====
    String nama;

    // ==== METHOD KONSTRUKTOR ====
    Anabul(String nama){
        this.nama = nama;
    }

    Anabul(){
        this("");
    }

    // ==== METHOD SELEKTOR ====
    String getNama(){
        return this.nama;
    }

    // ==== METHOD MUTATOR ====
    void setNama(String nama){
        this.nama = nama;
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Anabul: " + nama + " bergerak.");
    }

    void suara(){
        System.out.println("Anabul: " + nama + " bersuara.");
    }
}
