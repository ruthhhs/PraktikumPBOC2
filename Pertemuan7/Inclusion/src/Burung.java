public class Burung extends Anabul {
    // ==== METHOD KONSTRUKTOR ====
    Burung(String nama){
        this.nama = nama;
    }

    Burung(){
        this("");
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Burung " + nama + " terbang.");
    }

    void suara(){
        System.out.println("Burung " + nama + " berciut.");
    }
}