// Nama File    : MTitik.java
// Deskripsi    : Driver yang menjalankan class Titik
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 19 Februari 2026

public class Mtitik {
    public static void main(String[] args) {
        // membuat objek titik baru
        Titik T1 = new Titik();

        // memasukkan nilai pada objek
        T1.setAbsis(3);
        T1.setOrdinat(5);
        T1.printTitik();

        // mengenakan objek dengan method geser
        T1.geser(2, 3);
        T1.printTitik();
    }
}
