// Nama File    : Data.java
// Deskripsi    : Berisi atribut dan method dalam class Data
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class Data<T> {
    // ==== ATRIBUT ====
    private T[] ruang;
    private int banyak;
    
    // ==== METHOD KONSTRUKTOR ====
    public Data(T[] contohRuang){
        this.ruang = (T[]) new Object[100];
        this.banyak = 0;
    }

    // ==== METHOD SELEKTOR ====
    public T getIsi(int posisi){
        return ruang[posisi - 1];
    }

    public int getSize(){
        return banyak;
    }

    // ==== METHOD MUTATOR ====
    public void setIsi(int posisi, T isi){
        if (ruang[posisi - 1] == null){
            banyak ++;
        }
        ruang[posisi - 1] = isi;
    }

    // ==== METHOD LAINNYA ====
}
