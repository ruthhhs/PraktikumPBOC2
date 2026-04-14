// Nama File    : PNS.java
// Deskripsi    : Berisi atribut dan method dalam class PNS
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 14 April 2026

public class PNS extends Manusia implements Pajak{
    // ====== ATRIBUT ======
    private String nip;
    private static int counterPNS;

    // ====== METHOD KONSTRUKTOR ======
    PNS(String nama, Tanggal mulaiKerja, String alamat, double pendapatan, String nip){
        super(nama, mulaiKerja, alamat, pendapatan);
        this.nip = nip;
        counterPNS ++;
    }

    // ====== METHOD SELEKTOR ======
    public String getNip(){
        return nip;
    }

    public static int getCounterPNS(){
        return counterPNS;
    }

    // ====== METHOD MUTATOR ======
    public void setNip(String nip){
        this.nip = nip;
    }

    // ====== METHOD LAINNYA ======
    public void cetakInfo(){
        System.out.println("=== Cetak Info PNS ===");
        super.cetakInfo();
        System.out.println("NIP         : " + nip);
        System.out.println();
    }

    public int hitungMasaKerja(Tanggal hariIni){
        return hariIni.getTahun() - this.getMulaiKerja().getTahun() + 4;
    }

    public double hitungPajak(){
        return 10 * getPendapatan() / 100;
    }
}
