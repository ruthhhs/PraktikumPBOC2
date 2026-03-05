// Nama File    : MMahasiswa.java
// Deskripsi    : Driver yang menjalankan class Mahasiswa, Dosen, MataKuliah, Kendaraan
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 05 Maret 2026

public class MMahasiswa {
    public static void main(String[] args){
        // Buat Dosen
        Dosen D1 = new Dosen("D001", "A. S.Si., M.Cs.", "Informatika");
        System.out.println("Data Dosen      : " +
            D1.getNip() + " / " +
            D1.getNama() + " / " +
            D1.getProdi()
        );

        // Buat Mata Kuliah
        MataKuliah MK1 = new MataKuliah("MK001", "Dasar Pemrograman", 3);
        System.out.println("Data Mata Kuliah: " +
            MK1.getIdMatkul() + " / " +
            MK1.getNama() + " / " +
            MK1.getSks() + "SKS"
        );

        MataKuliah MK2 = new MataKuliah("MK002", "Dasar Sistem", 3);
        System.out.println("Data Mata Kuliah: " +
            MK2.getIdMatkul() + " / " +
            MK2.getNama() + " / " +
            MK2.getSks() + "SKS"
        );

        // Buat Kendaraan
        Kendaraan K1 = new Kendaraan("K001", "Motor");
        System.out.println("Data Kendaraan  : " +
            K1.getNoPlat() + " / " +
            K1.getJenis()
        );

        // Buat Mahasiswa
        Mahasiswa M1 = new Mahasiswa("M001", "Ruth", "Informatika");
        M1.printMhs();

        M1.setDosWal(D1);
        M1.setKendaraan(K1);
        M1.addMatkul(MK1);
        M1.addMatkul(MK2);
        M1.printDetailMhs();
        System.out.println("Jumlah Matkul : " + M1.getJumlahMatkul());
        System.out.println("Jumlah SKS    : " + M1.getJumlahSks());
    }
}
