// Nama File    : MBangunDatar.java
// Deskripsi    : Driver yang menjalankan class BangunDatar, Persegi, dan Lingkaran
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 12 Maret 2026

public class MBangunDatar {
    public static void main(String[] args){
        // Membuat BangunDatar
        BangunDatar BD1 = new BangunDatar(1, "Putih", "Hitam");
        System.out.println("=== INFO BANGUN DATAR ===");
        BD1.printInfo();

        // Membuat Persegi
        Persegi P1 = new Persegi(5, "Kuning", "Merah");
        P1.printInfo();
        System.out.println("Luas        : " + P1.getLuas());
        System.out.println("Keliling    : " + P1.getKeliling());
        System.out.println("Diagonal    : " + P1.getKeliling());

        // Membuat Lingkaran
        Lingkaran L1 = new Lingkaran();
        L1.setJari(5);
        L1.setWarna("Hijau");
        L1.setBorder("Biru");
        L1.printInfo();
        System.out.println("Luas        : " + L1.getLuas());
        System.out.println("Keliling    : " + L1.getKeliling());

        System.out.println("Jumlah Objek Bangun Datar: " + BangunDatar.getCounterBangunDatar());

        // nyoba static overiding (?)
        // BangunDatar.printCounterBangunDatar();
    }
}
