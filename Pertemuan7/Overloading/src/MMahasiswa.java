// Nama File    : MMAhasiswa.java
// Deskripsi    : Driver yang menjalankan Mahasiswa
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 23 April 2026

public class MMahasiswa {
    public static void main(String[] args) {
        Mahasiswa M1 = new Mahasiswa();
        Mahasiswa M2 = new Mahasiswa("024", "Ruth", "Informatika");
        Mahasiswa M3 = new Mahasiswa(M2);

        M1.printMhs();
        M2.printMhs();
        M3.printMhs();

        M1.setNim("001");
        M1.setNama("Apaya");
        M1.setProdi();
        M1.printMhs();

        M1.setProdi("Sastra Mesin");
        M1.printMhs();

        M1.setProdi(M2);
        M1.printMhs();
    }
}
