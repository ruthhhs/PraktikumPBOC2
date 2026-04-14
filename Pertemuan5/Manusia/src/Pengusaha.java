// Nama File    : Pengusaha.java
// Deskripsi    : Berisi atribut dan method dalam class Pengusaha
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 14 April 2026

public class Pengusaha extends Manusia implements Pajak{
    // ====== ATRIBUT ======
    private String npwp;
    private static int counterPengusaha;

    // ====== METHOD KONSTRUKTOR ======
    Pengusaha(String nama, Tanggal mulaiKerja, String alamat, double pendapatan, String npwp){
        super(nama, mulaiKerja, alamat, pendapatan);
        this.npwp = npwp;
        counterPengusaha ++;
    }

    // ====== METHOD SELEKTOR ======
    public String getNpwp(){
        return npwp;
    }

    public static int getCounterPengusaha(){
        return counterPengusaha;
    }

    // ====== METHOD MUTATOR ======
    public void setNpwp(String npwp){
        this.npwp = npwp;
    }

    // ====== METHOD LAINNYA ======
    public void cetakInfo(){
        System.out.println("=== Cetak Info Pengusaha ===");
        super.cetakInfo();
        System.out.println("NPWP        : " + npwp);
        System.out.println();
    }

    public int hitungMasaKerja(Tanggal hariIni){
        return hariIni.getTahun() - this.getMulaiKerja().getTahun() + 2;
    }

    public double hitungPajak(){
        return 15 * getPendapatan() / 100;
    }
}
