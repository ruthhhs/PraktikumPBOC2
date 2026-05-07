// Nama File    : Main.java
// Deskripsi    : Driver yang menjalankan semua Pertemuan 8
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 30 April 2026

public class Main {
    public static void main(String[] args) {
        // bikin objek anabul dulu

        // Anabul A1 = new Anabul("Si itu");
        Anabul A2 = new Anjing("Oppy Goopy");
        // Anabul A3 = new Burung("Little Jim Bob");
        Anabul A4 = new Kucing("Larry", 3.5);
        Anabul A5 = new Anggora("Wowo", 3.6);
        Anabul A6 = new KembangTelon("Owi", 3.2);

        // KELAS GENERIK
        System.out.println("===== KELAS GENERIK =====\n");

        Datum<Anabul> data = new Datum<> (A4); // kucing
        data.tampilkanAnabul(data.getIsi());
        data.setIsi(A2); // anjing
        data.tampilkanAnabul(data.getIsi());

        Datum<Anabul> data2 = new Datum<> (A5); // anggora
        data2.tampilkanAnabul(data2.getIsi());
        data2.setIsi(A6); //kembang telon
        data2.tampilkanAnabul(data2.getIsi());

        // METHOD GENERIK
        System.out.println("===== METHOD GENERIK =====\n");

        Datum<Anabul> hewan1 = new Datum<> (A4); // kucing
        Datum<Anabul> hewan2 = new Datum<> (A2); // anjing
        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());

        // prosedur tukar yang bener
        System.err.println("setelah pertukaran:\n");
        OperatirGenerik.Tukar(hewan1, hewan2);

        hewan1.tampilkanAnabul(hewan1.getIsi());
        hewan2.tampilkanAnabul(hewan2.getIsi());

        // LARIK GENERIK
        System.out.println("===== LARIK GENERIK =====\n");

        // a.
        System.out.println("a) Aplikasi Kelas Data\n");
        
        Data<String> dataNama = new Data<>(new String[0]);
        dataNama.setIsi(1, "Coco");
        dataNama.setIsi(2, "Agot");
        dataNama.setIsi(4, "Tetia");
        dataNama.setIsi(5, "Richeh");

        System.out.println("Isi elm ke-1: " + dataNama.getIsi(1));
        System.out.println("Isi elm ke-2: " + dataNama.getIsi(2));
        System.out.println("Isi elm ke-3: " + dataNama.getIsi(3));
        System.out.println("Isi elm ke-4: " + dataNama.getIsi(4));
        System.out.println("Isi elm ke-5: " + dataNama.getIsi(5));
        System.out.println("\nBanyak elm efektif: " + dataNama.getSize());

    }
}
