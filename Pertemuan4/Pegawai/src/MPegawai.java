public class MPegawai {
    public static void main(String[] args){
        // tanggal hari ini
        Tanggal hariIni = new Tanggal(10, 3, 2026);

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
    }
}
