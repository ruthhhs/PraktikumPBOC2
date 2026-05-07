// Nama File    : Anggora.java
// Deskripsi    : Berisi atribut dan method dalam class Anggora
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class Anggora extends Kucing{
    // ==== METHOD KONSTRUKTOR ====
    Anggora(String nama, double bobot){
        super(nama, bobot);
    }

    // ==== METHOD LAINNYA ====
    @Override
    void gerak(){
        System.out.println("Anggora: " + nama + " lincah meloncat.");
    }

    @Override
    void suara(){
        System.out.println("Anggora: " + nama + " mengeong lembut.");
    }
}
