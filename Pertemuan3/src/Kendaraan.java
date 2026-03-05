// Nama File    : Kendaraan.java
// Deskripsi    : Berisi atribut dan method dalam class Kendaraan
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 05 Maret 2026

public class Kendaraan {
    // ====== ATRIBUT ======
    private String noPlat;
    private String jenis;

    // ====== METHOD KONSTRUKTOR ======
    Kendaraan(String noPlat, String jenis){
        this.noPlat = noPlat;
        this.jenis = jenis;
    }

    Kendaraan(){
        this("", "");
    }

    // ====== METHOD SELEKTOR ======
    String getNoPlat(){
        return this.noPlat;
    }

    String getJenis(){
        return this.jenis;
    }

     // ====== METHOD MUTATOR ======
    void setNoPlat(String noPlat){
        this.noPlat = noPlat;
    }

    void setJenis(String jenis){
        this.jenis = jenis;
    }
}
