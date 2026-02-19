// Nama File    : Titik.java
// Deskripsi    : Berisi atribut dan method dalam class Titik
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 19 Februari 2026

public class Titik {
    // ====== ATRIBUT ======
    double absis;
    double ordinat;

    // ====== METHOD ======
    Titik() {
        absis = 0;
        ordinat = 0;
    }

    double getAbsis(){
        return absis;
    }

    double getOrdinat(){
        return ordinat;
    }

    void setAbsis(double x){
        absis = x;
    }

    void setOrdinat(double y){
        ordinat = y;
    }

    void geser(double x, double y){
        absis = absis + x;
        ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }
} //end class titik