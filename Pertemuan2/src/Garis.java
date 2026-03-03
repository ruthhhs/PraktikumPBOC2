// Nama File    : Garis.java
// Deskripsi    : Berisi atribut dan method dalam class Garis
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Februari 2026

public class Garis {
    // ====== ATRIBUT ======
    Titik awal;
    Titik akhir;
    static int counterGaris = 0;

    // ====== METHOD KONSTRUKTOR ======
    Garis(Titik a, Titik b) {
        this.awal = a;
        this.akhir = b;
        counterGaris ++;
    }

    Garis() { // garis default
        this(new Titik(0, 0), new Titik(1, 1));
    }

    // ====== METHOD SELEKTOR ======
    Titik getAwal(){
        return this.awal;
    }

    Titik getAkhir(){
        return this.akhir;
    }

    static int getGounterGaris(){
        return counterGaris;
    }

    // ====== METHOD MUTATOR ======
    void setAwal(double x, double y){
        this.awal.setAbsis(x);
    }

    void setAkhir(double x, double y){
        this.akhir.setOrdinat(y);
    }

    // ====== METHOD LAINNYA ======
    double panjang(){
        return this.awal.getJarak(this.akhir);
    }

    double gradien(){
        return (
            this.akhir.getOrdinat() - this.awal.getOrdinat() /
            this.akhir.getAbsis() - this.awal.getAbsis()
        );
    }

    Titik getTengah() {
        return new Titik (
            (awal.getAbsis() + akhir.getAbsis()) / 2,
            (awal.getOrdinat() + akhir.getOrdinat()) / 2
        );
    }

    void sejajar(Garis G){
        if (this.gradien() == G.gradien()) {
            System.out.println("Sejajar");
        } else {
            System.out.println("Tidak Sejajar");
        }
    }

    void tegakLurus(Garis G){
        if (this.gradien() * G.gradien() == -1) {
            System.out.println("Tegak Lurus");
        } else {
            System.out.println("Tidak Tegak Lurus");
        }
    }

    void printGaris(){
        System.out.println(
            "Garis (" + awal.getAbsis() + "," + awal.getOrdinat() + 
            "), (" + akhir.getAbsis() + "," + akhir.getOrdinat() + ")"
        );
    }

    void persamaan(){
        double m = this.gradien();
        double c = this.awal.getOrdinat() - (m * this.awal.getAbsis());

        if (c > 0){
            System.out.println(
                "Persamaan Garis : y = " + m + "x + " + c
            );
        } else if (c < 0){
            System.out.println(
                "Persamaan Garis : y = " + m + "x - " + Math.abs(c)
            );
        } else {
            System.out.println(
                "Persamaan Garis : y = " + m + "x"
            );
        }
    }

} //end class garis
