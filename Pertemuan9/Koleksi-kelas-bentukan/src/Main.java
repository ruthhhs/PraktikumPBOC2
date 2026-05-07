// Nama File    : Main.java
// Deskripsi    : Driver yang menjalankan semua Pertemuan 9
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 7 Mei 2026

public class Main {
    public static void main(String[] args) {
        // baut anabul
        Anabul a1 = new Anjing("Cookie");
        Anabul a2 = new Kucing("Mochi", 4.0);
        Anabul a3 = new Anggora("Gora", 3.6);
        Anabul a4 = new KembangTelon("Telon", 3.3);

        // masukin list
        Piaraan antrianKlinik = new Piaraan();
        antrianKlinik.enqueueAnabul(a1);
        antrianKlinik.enqueueAnabul(a2);
        antrianKlinik.enqueueAnabul(a3);
        antrianKlinik.enqueueAnabul(a4);

        // nampilkan urutan
        System.out.println("=== Antrian saat ini: ===");
        antrianKlinik.showAnabul();

        // nampilkan jumlah semua anabul
        System.out.println("Jumlah semua anabul: " + antrianKlinik.getNbelm());

        // nampilkan jumlah kucing
        System.out.println("Jumlah kucing: " + antrianKlinik.countKucing());

        // hitung bobot semua kucing
        System.out.println("Bobot semua kucing: " + antrianKlinik.bobotKucing());

        // nampilkan urutan dengan jenis
        System.out.println("\n===Antrian saat ini (dengan jenis): ===");
        antrianKlinik.showJenisAnabul();

        // ambil antrian pertama
        System.out.println("\n=== Ambil antrian pertama ===");
        System.out.println("Anabul yang diambil: " + antrianKlinik.dequeueAnabul().getNama());
        System.out.println("Antrian setelah diambil: ");
        antrianKlinik.showJenisAnabul();

        // buat anabul baru dan ngecek member
        Anabul a5 = new Kucing("Void", 3.8);
        System.out.println("\nApakah Void ada di dalam antrian? " + antrianKlinik.isMember(a5));

        // menambah antrian baru
        System.out.println("\n=== Menambah antrian baru ===");
        antrianKlinik.enqueueAnabul(a5);
        antrianKlinik.showJenisAnabul();

        // mengecek member lagi
        System.out.println("\nApakah Void ada di dalam antrian? " + antrianKlinik.isMember(a5));
    }
}
