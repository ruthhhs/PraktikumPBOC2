// Nama File    : Titik.java
// Deskripsi    : Berisi atribut dan method dalam class Titik
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Februari 2026

public class Titik {
    // ====== ATRIBUT ======
    double absis;
    double ordinat;
    static int counterTitik = 0;

    // ====== METHOD KONSTRUKTOR ======
    Titik() {
        this(0, 0);
    }

    Titik(double x, double y) {
        this.absis = x;
        this.ordinat = y;
        counterTitik ++;
    }

    // ====== METHOD SELEKTOR ======
    double getAbsis(){
        return this.absis;
    }

    double getOrdinat(){
        return this.ordinat;
    }
    
    static int getCounterTitik() {
        return counterTitik;
    }

    // ====== METHOD MUTATOR ======
    void setAbsis(double x){
        this.absis = x;
    }

    void setOrdinat(double y){
        this.ordinat = y;
    }

    // ====== METHOD LAINNYA ======
    void geser(double x, double y){
        this.absis = absis + x;
        this.ordinat = ordinat + y;
    }

    void printTitik(){
        System.out.println("Titik (" + absis + "," + ordinat +")");
    }

    int getKuadran() {
        if (this.absis > 0 && this.ordinat > 0) {
            return 1;
        } else if (this.absis > 0 && this.ordinat < 0) {
            return 2;
        } else if (this.absis < 0 && this.ordinat < 0){
            return 3;
        } else if (this.absis < 0 && this.ordinat > 0){
            return 4;
        } else {
            return 0;
        }
    }

    double getJarakPusat() {
        return Math.sqrt(
            Math.pow(this.absis, 2) + Math.pow(this.ordinat, 2)
        );
    }

    double getJarak(Titik T) {
        return Math.sqrt(
            Math.pow(T.absis - this.absis, 2) + Math.pow(T.ordinat - this.ordinat, 2)
        );
    }

    void refleksiX() {
        this.ordinat = this.ordinat * -1;
    }

    void refleksiY() {
        this.absis = this.absis * -1;
    }

    Titik getRefleksiX() {
        return new Titik(this.absis, this.ordinat * -1);
    }

    Titik getRefleksiY() {
        return new Titik(this.absis * -1, this.ordinat);
    }

} //end class titik