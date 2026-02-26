// Nama File    : MTitik.java
// Deskripsi    : Driver yang menjalankan class Titik
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Februari 2026

public class Mtitik {
    public static void main(String[] args) {
        // 01. CLASS & OBJECT
        Titik T1 = new Titik();
        T1.setAbsis(3);
        T1.setOrdinat(5);
        System.out.print("Titik 1 : ");
        T1.printTitik();

        T1.geser(2, 3);
        System.out.print("Titik 1 : ");
        T1.printTitik();

        // 02. OBJECT REFERENCE
        Titik T2 = T1;
        System.out.print("Titik 2 : ");
        T2.printTitik();

        T1.setAbsis(10);
        T1.setOrdinat(10);
        System.out.print("Titik 2 : ");
        T2.printTitik();
        // 03. OVERLOADING CONSTRUCTOR
        Titik T3 = new Titik(3, 4);
        System.out.print("Titik 3 : ");
        T3. printTitik();

        // 04. STATIC ATRIBUT & METHOD
        System.out.println("counterTitik : " + Titik.getCounterTitik());
        Titik.getCounterTitik();
        Titik T4 = new Titik();
        System.out.print("Titik 4 : ");
        T4. printTitik();
        System.out.println("counterTitik : " + Titik.getCounterTitik());

        // 05. KEYWORD `THIS`
        // di file Titik.java

        // 06. FINALISASI METHOD
        System.out.println();

        System.out.println("Kuadran Titik 1 : " + T1.getKuadran());
        System.out.println("Jarak Pusat Titik 1 : " + T1.getJarakPusat());
        System.out.println("Jarak Titik 1 ke Titik 3: " + T1.getJarak(T3));

        System.out.println();

        T1.refleksiX();
        System.out.print("Titik 1 : ");
        T1. printTitik();
        System.out.println("Kuadran Titik 1 : " + T1.getKuadran());
        T1.refleksiY();
        System.out.print("Titik 1 : ");
        T1. printTitik();
        System.out.println("Kuadran Titik 1 : " + T1.getKuadran());

        System.out.println();

        Titik T6 = new Titik();
        T6 = T1.getRefleksiX();
        System.out.print("Titik 6 : ");
        T6. printTitik();

        Titik T7 = new Titik();
        T7 = T1.getRefleksiY();
        System.out.print("Titik 7 : ");
        T7. printTitik();
    }
}
