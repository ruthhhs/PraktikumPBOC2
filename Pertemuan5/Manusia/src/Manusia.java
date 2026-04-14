// Nama File    : Manusia.java
// Deskripsi    : Berisi atribut dan method dalam class Manusia
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 14 April 2026

public abstract class Manusia {
    // ====== ATRIBUT ======
    private String nama;
    private Tanggal mulaiKerja;
    private String alamat;
    private double pendapatan;
    private static int counterManusia;

    // ====== METHOD KONSTRUKTOR ======
    Manusia(String nama, Tanggal mulaiKerja, String alamat, double pendapatan){
        this.nama = nama;
        this.mulaiKerja = mulaiKerja;
        this.alamat = alamat;
        this.pendapatan = pendapatan;
        counterManusia ++;
    }

    Manusia(){
        this("", new Tanggal(), "", 0);
    }

    // ====== METHOD SELEKTOR ======
    public String getNama(){
        return nama;
    }

    public Tanggal getMulaiKerja(){
        return mulaiKerja;
    }

    public String getAlamat(){
        return alamat;
    }

    public double getPendapatan(){
        return pendapatan;
    }

    public static int getCounterManusia(){
        return counterManusia;
    }

    // ====== METHOD MUTATOR ======
    public void setNama(String nama){
        this.nama = nama;
    }

    public void setMulaiKerja(Tanggal mulaiKerja){
        this.mulaiKerja = mulaiKerja;
    }

    public void setAlamat(String alamat){
        this.alamat = alamat;
    }

    public void setPendapatan(double pendapatan){
        this.pendapatan = pendapatan;
    }

    // ====== METHOD LAINNYA ======
    public void cetakInfo(){
        System.out.println("Nama        : " + nama);
        System.out.print("Mulai Kerja : ");
        mulaiKerja.printTanggal();
        System.out.println("Alamat      : " + alamat);
        System.out.println("Pendapatan  : " + pendapatan);
    }

    public abstract int hitungMasaKerja(Tanggal hariIni);
}
