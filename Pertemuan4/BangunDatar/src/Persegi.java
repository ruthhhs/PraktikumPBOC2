// Nama File    : Persegi.java
// Deskripsi    : Berisi atribut dan method dalam class Persegi
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 12 Maret 2026

public class Persegi extends BangunDatar {
    // ====== ATRIBUT ======
    private double sisi;

    // ====== METHOD KONSTRUKTOR ======
    public Persegi() {
        setJumlahSisi(4);
    }

    public Persegi(double sisi, String warna, String border) {
        super(4, warna, border);
        this.sisi = sisi;
    }

    // ====== METHOD SELEKTOR ======
    public double getSisi() {
        return sisi;
    }

    // ====== METHOD MUTATOR  ======
    public void setSisi (double sisi) {
        this.sisi = sisi;
    }

    // ====== METHOD LAINNYA ======
    public void printInfo() {
        System.out.println("=== INFO PERSEGI ===");
        super.printInfo();
        System.out.println("Sisi        : " + this.sisi);
    }

    public double getLuas() {
        return this.sisi * this.sisi;
    }

    public double getKeliling() {
        return 4 * this.sisi;
    }

    public double getDiagonal() {
        return Math.sqrt(Math.pow(sisi, 2) * 2) ;
    }
}