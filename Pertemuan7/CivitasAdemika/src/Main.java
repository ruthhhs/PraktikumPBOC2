// Nama File    : Main.java
// Deskripsi    : Driver yang menjalankan CivitasAkademika
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 23 April 2026

public class Main {
    public static void main(String[] args) {
        // membuat 2 dosen, 5 mahasiswa
        Dosen D1 = new Dosen("0034", "Adi");
        Dosen D2 = new Dosen("0035", "Budi");
        Mahasiswa M1 = new Mahasiswa("012", "Cindy", D1);
        Mahasiswa M2 = new Mahasiswa("013", "Desti", D1);
        Mahasiswa M3 = new Mahasiswa("014", "Edo", D2);
        Mahasiswa M4 = new Mahasiswa("015", "Frida", D2);
        Mahasiswa M5 = new Mahasiswa("016", "Gita", D2);
        M5.setWali(D1);

        // menampilkan data mahasiswa
        M1.tampilDataMahasiswa();
        M2.tampilDataMahasiswa();
        M3.tampilDataMahasiswa();
        M4.tampilDataMahasiswa();
        M5.tampilDataMahasiswa();

        // membuat seminar
        Seminar S1 = new Seminar("Pengenalan WebDev");
        S1.tampilPeserta();

        // registrasi seminar
        S1.registrasi(D1);
        S1.registrasi(D2);
        S1.tampilPeserta();
        
        S1.registrasi(M1);
        S1.registrasi(M2);
        S1.registrasi(M3);
        S1.registrasi(M4);
        S1.registrasi(M5);
        S1.tampilPeserta();

        // menampilkan jumlah peserta seminar
        // sebenarnya kedua method ini sudah di panggil di method tampilPeserta di kelas Seminar
        System.out.println("Jumlah Peserta   : " + S1.countPeserta());
        System.out.println("Jumlah Mahasiswa : " + S1.countMahasiswa());
    }
}
