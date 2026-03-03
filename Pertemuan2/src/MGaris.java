// Nama File    : MGaris.java
// Deskripsi    : Driver yang menjalankan class class Garis
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Februari 2026

public class MGaris {
    public static void main(String[] args) {
        Titik T1 = new Titik(1, 2);
        Titik T2 = new Titik(3, 3);
        Titik T3 = new Titik(2, 2);
        Titik T4 = new Titik(7, 8);

        Garis G0 = new Garis();
        G0.printGaris();
        System.out.println("counterGaris : " + Garis.getGounterGaris());
        
        G0.setAwal(2, 3);
        G0.setAkhir(4, 4);
        Garis G1 = new Garis(T1, T2);
        Garis G2 = new Garis(T3, T4);
        
        G0.printGaris();
        G1.printGaris();
        G2.printGaris();
        System.out.println("counterGaris : " + Garis.getGounterGaris());

        System.out.println(" ");

        System.out.println("Panjang Garis G2 : " + G2.panjang());
        System.out.println("Gradien Garis G2 : " + G2.gradien());
        System.out.println("Titik Tengah Garis G2 : ");
        Titik Tx = G2.getTengah();
        Tx.printTitik();

        System.out.println(" ");

        System.out.println("Perbandingan G1 dengan G2");
        G1.sejajar(G2);
        G1.tegakLurus(G2);

        System.out.println(" ");

        G0.persamaan();
        G1.persamaan();
        G2.persamaan();
    }
}
