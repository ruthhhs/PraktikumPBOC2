// Nama File    : MPegawai.java
// Deskripsi    : Driver yang menjalankan classPegawai, DosenTetap, DosenTamu, Tendik
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 12 Maret 2026

public class MPegawai {
    public static void main(String[] args){
        // tanggal hari ini (sesuai modul)
        Tanggal hariIni = new Tanggal(10, 3, 2025);

        // pegawai kosongan
        Pegawai P1 = new Pegawai();
        P1.printInfo(hariIni);

        // dosen kosongan
        DosenTetap D1 = new DosenTetap();
        D1.printInfo(hariIni);

        DosenTamu D2 = new DosenTamu();
        D2.printInfo(hariIni);

        // tendik kosongan
        Tendik T1 = new Tendik();
        T1.printInfo(hariIni);

        // nampilkan sesuai modul
        DosenTetap D3 = new DosenTetap();
        D3.setNip("9545647548");
        D3.setNidn("78647324");
        D3.setNama("Andi");
        D3.setTanggalLahir(new Tanggal(5, 5, 1990));
        D3.setMulaiKerja(new Tanggal(1, 1, 2015));
        D3.setFakultas("Fakultas Sains dan Matematika");
        D3.setGajiPokok(5000000);
        D3.printInfo(hariIni);
    }
}
