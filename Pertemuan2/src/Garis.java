// Nama File    : Garis.java
// Deskripsi    : Berisi atribut dan method dalam class Garis
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Februari 2026

public class Garis {
    // ====== ATRIBUT ======
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    // ====== METHOD KONSTRUKTOR ======
    Garis(Titik a, Titik b) {
        this.awal = a;
        this.akhir = b;
        counterGaris ++;
    }

    Garis() {
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // ====== METHOD SELEKTOR ======

    // ====== METHOD MUTATOR ======

    // ====== METHOD LAINNYA ======

} //end class garis
