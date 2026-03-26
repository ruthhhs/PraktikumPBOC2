// Nama File    : asersi1.java
// Deskripsi    : Program yang menjalankan asersi pada demo Lingkaran
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Maret 2026

public class asersi2 {
    public static void main(String[] args) {
        double jarijari = 0;
        assert(jarijari>0) : "jari jari tidak boleh nol";

        Lingkaran l = new Lingkaran(jarijari);
        double kelilingLingkaran = l.hitungKeliling();
        System.out.println("Keliling Lingkaran : " + kelilingLingkaran);
    }
}
