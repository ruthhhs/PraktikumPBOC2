// Nama File    : Manusia.java
// Deskripsi    : Driver yang menjalankan Manusia, PNS, Pengusaha, Petani dan Pajak
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 14 April 2026

public class MManusia {
    public static void main(String[] args) {
        Tanggal hariIni = new Tanggal(14, 4, 2026);

        PNS p1 = new PNS("Satriyo",new Tanggal(1, 4, 2006),"Jl. Seroja",15000000,"198302032006041002");
        Pengusaha pe1 = new Pengusaha("Adhy",new Tanggal(1, 1, 2000),"Jl.Air",55000000,"000-556-773-212-000-5");
        Petani pt1 = new Petani("Nugraha",new Tanggal(9, 1, 1977),"Jl. Bunga 9 Tembalang",5000000,"wonogiri");
        PNS p2 = new PNS("Panji",new Tanggal(1, 4, 2010),"Jl. Panorama 111 Tembalang",10000000,"198004212010041002");

        System.out.println("Jumlah Manusia   = " + Manusia.getCounterManusia());
        System.out.println("Jumlah PNS       = " + PNS.getCounterPNS());
        System.out.println("Jumlah Pengusaha = " + Pengusaha.getCounterPengusaha());
        System.out.println("Jumlah Petani    = " + Petani.getCounterPetani());
        System.out.println();

        System.out.println("Pajak PNS p1        = " + p1.hitungPajak());
        System.out.println("Pajak Pengusaha pe1 = " + pe1.hitungPajak());
        System.out.println("Pajak Petani pt1    = " + pt1.hitungPajak());
        System.out.println();

        System.out.println("Masa Kerja p1  = " + p1.hitungMasaKerja(hariIni) + " tahun");
        System.out.println("Masa Kerja pe1 = " + pe1.hitungMasaKerja(hariIni) + " tahun");
        System.out.println("Masa Kerja pt1 = " + pt1.hitungMasaKerja(hariIni) + " tahun");
        System.out.println();

        p1.cetakInfo();
        p2.cetakInfo();
        pe1.cetakInfo();
        pt1.cetakInfo();

    }
}
