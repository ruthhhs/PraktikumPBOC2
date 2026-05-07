// Nama File    : Kucing.java
// Deskripsi    : Berisi atribut dan method dalam class Kucing
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 7 Mei 2026

public class Kucing extends Anabul {
    // ==== ATRIBUT ====
    protected double bobot;

    // ==== METHOD KONSTRUKTOR ====
    Kucing(String nama, double bobot){
        this.nama = nama;
        this.bobot = bobot;
    }

    Kucing(){
        this("", 0.0);
    }

    // ==== METHOD SELEKTOR ====
    double getBobot(){
        return bobot;
    }

    // ==== METHOD MUTATOR ====
    void setBobot(double bobot){
        this.bobot = bobot;
    }

    // ==== METHOD LAINNYA ====
    void printBobot(){
        System.out.println("Bobot " + nama + " : "+ bobot);
    }

    void gerak(){
        System.out.println("Kucing: " + nama + " membentuk roti.");
    }

    void suara(){
        System.out.println("Kucing: " + nama + " mengeong.");
    }
}