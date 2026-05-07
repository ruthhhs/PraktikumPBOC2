// Nama File    : Datum.java
// Deskripsi    : Berisi atribut dan method dalam class Datum
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class Datum<T> {
    // ==== ATRIBUT ====
    private T isi;
    
    // ==== METHOD KONSTRUKTOR ====
    public Datum(T isi){
        this.isi = isi;
    }

    // ==== METHOD SELEKTOR ====
    public T getIsi(){
        return isi;
    }

    // ==== METHOD MUTATOR ====
    public void setIsi(T isi){
        this.isi = isi;
    }

    // ==== METHOD LAINNYA ====
    public void tampilkanAnabul(Anabul anabul){
        anabul.gerak();
        anabul.suara();

        if (anabul instanceof Kucing){
            ((Kucing) anabul).printBobot();
        }

        System.out.println();
    }
}