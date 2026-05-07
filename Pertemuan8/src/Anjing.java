// Nama File    : Anjing.java
// Deskripsi    : Berisi atribut dan method dalam class Anjing
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class Anjing extends Anabul {
    // ==== METHOD KONSTRUKTOR ====
    Anjing(String nama){
        this.nama = nama;
    }

    Anjing(){
        this("");
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Anjing: " + nama + " berlari.");
    }

    void suara(){
        System.out.println("Anjing: " + nama + " menggonggong.");
    }
}