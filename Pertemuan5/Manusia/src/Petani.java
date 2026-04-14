// Nama File    : Petani.java
// Deskripsi    : Berisi atribut dan method dalam class Petani
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 14 April 2026

public class Petani extends Manusia implements Pajak{
    // ====== ATRIBUT ======
    private String asalKota;
    private static int counterPetani;

    // ====== METHOD KONSTRUKTOR ======
    Petani(String nama, Tanggal mulaiKerja, String alamat, double pendapatan, String asalKota){
        super(nama, mulaiKerja, alamat, pendapatan);
        this.asalKota = asalKota;
        counterPetani ++;
    }

    // ====== METHOD SELEKTOR ======
    public String getAsalKota(){
        return asalKota;
    }

    public static int getCounterPetani(){
        return counterPetani;
    }

    // ====== METHOD MUTATOR ======
    public void setAsalKota(String asalKota){
        this.asalKota = asalKota;
    }

    // ====== METHOD LAINNYA ======
    public void cetakInfo(){
        System.out.println("=== Cetak Info Petani ===");
        super.cetakInfo();
        System.out.println("Asal Kota   : " + asalKota);
        System.out.println();
    }

    public int hitungMasaKerja(Tanggal hariIni){
        return hariIni.getTahun() - this.getMulaiKerja().getTahun() + 0;
    }

    public double hitungPajak(){
        return 0;
    }
}
