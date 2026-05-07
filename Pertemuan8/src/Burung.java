// Nama File    : Burung.java
// Deskripsi    : Berisi atribut dan method dalam class Burung
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class Burung extends Anabul {
    // ==== METHOD KONSTRUKTOR ====
    Burung(String nama){
        this.nama = nama;
    }

    Burung(){
        this("");
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Burung: " + nama + " terbang.");
    }

    void suara(){
        System.out.println("Burung: " + nama + " berciut.");
    }
}