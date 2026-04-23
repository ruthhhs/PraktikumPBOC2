public class Kucing extends Anabul {
    // ==== METHOD KONSTRUKTOR ====
    Kucing(String nama){
        this.nama = nama;
    }

    Kucing(){
        this("");
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Kucing " + nama + " membentuk roti.");
    }

    void suara(){
        System.out.println("Kucing " + nama + " mengeong.");
    }
}