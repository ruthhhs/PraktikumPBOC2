// Nama File    : KembangTelon.java
// Deskripsi    : Berisi atribut dan method dalam class KembangTelon
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 7 Mei 2026

public class KembangTelon extends Kucing{
    // ==== METHOD KONSTRUKTOR ====
    KembangTelon(String nama, double bobot){
        super(nama, bobot);
    }

    // ==== METHOD LAINNYA ====
    @Override
    void gerak(){
        System.out.println("Kembang Telon: " + nama + " berjalan santai.");
    }

    @Override
    void suara(){
        System.out.println("Kembang Telon: " + nama + " mengeong cimit.");
    }
}