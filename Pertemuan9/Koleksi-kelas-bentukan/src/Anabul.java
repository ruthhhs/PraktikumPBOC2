// Nama File    : Anabul.java
// Deskripsi    : Berisi atribut dan method dalam class Anabul
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 7 Mei 2026

public abstract class Anabul {
    // ==== ATRIBUT ====
    String nama;
    // String panggilan;

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
    abstract void gerak();
    abstract void suara();
}
