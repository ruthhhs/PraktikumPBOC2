// Nama File    : OperatorGenerik.java
// Deskripsi    : Berisi atribut dan method dalam class OperatorGenerik
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class OperatirGenerik {
    public static <T> void Tukar (Datum<T> a, Datum<T> b){
        T temp = a.getIsi();
        a.setIsi(b.getIsi());
        b.setIsi(temp);
    }

    // // contoh salah
    // public static <T> void Tukar (T a, T b){
    //     T temp = a;
    //     a = b;
    //     b = temp;
    // }
}
