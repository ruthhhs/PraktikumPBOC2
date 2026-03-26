// Nama File    : asersi1.java
// Deskripsi    : Program yang menjalankan asersi
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Maret 2026

public class asersi1 {
    public static void main(String[] args) {
        int x = 0;
        if (x>0) {
            System.out.println("x bilangan positif");
        } else {
            assert (x<0) : "ada kesalahan kode" ;
            System.out.println(("x bilangan negatif"));
        }
    }
}
