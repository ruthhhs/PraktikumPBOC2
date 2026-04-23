public class Anjing extends Anabul {
    // ==== METHOD KONSTRUKTOR ====
    Anjing(String nama){
        this.nama = nama;
    }

    Anjing(){
        this("");
    }

    // ==== METHOD LAINNYA ====
    void gerak(){
        System.out.println("Anjing " + nama + " berlari");
    }

    void suara(){
        System.out.println("Anjing " + nama + " menggonggong.");
    }
}