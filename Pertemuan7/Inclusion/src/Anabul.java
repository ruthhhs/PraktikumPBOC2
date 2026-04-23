public class Anabul {
    // ==== ATRIBUT ====
    String nama;

    // ==== METHOD KONSTRUKTOR ====
    Anabul(String nama){
        this.nama = nama;
    }

    Anabul(){
        this("");
    }

    // ==== METHOD SELEKTOR ====
    String getNama(){
        return this.nama;
    }

    // ==== METHOD MUTATOR ====
    void setNama(String nama){
        this.nama = nama;
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Anabul " + nama + " bergerak.");
    }

    void suara(){
        System.out.println("Anabul " + nama + " bersuara.");
    }
}
