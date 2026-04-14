// Nama File    : MBangunDatar.java
// Deskripsi    : Driver yang menjalankan class BangunDatar, Persegi, dan Lingkaran
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 18 Maret 2026

public class MBangunDatar {
    public static void main(String[] args){
        // Membuat BangunDatar
        // BangunDatar BD1 = new BangunDatar(1, "Putih", "Hitam"); // ga bisa, karna abstrak

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

        System.out.println("\nJumlah Objek Bangun Datar: " + BangunDatar.getCounterBangunDatar());

        System.out.println("\n___ UJI METHOD IS EQUAL ___");
        System.out.println("Is Equal Luas     : " + P1.isEqualLuas(L1));
        System.out.println("Is Equal Keliling : " + P1.isEqualKeliling(L1));

        System.out.print("\n___ UJI METHOD ZOOM ___");
        System.out.println("\nSisi Persegi        : " + P1.getSisi());
        System.out.println("Luas Persegi        : " + P1.getLuas());
        System.out.println("Keliling Persegi    : " + P1.getKeliling());
        P1.zoomIn();
        System.out.println("\nSisi Persegi zoom in        : " + P1.getSisi());
        System.out.println("Luas Persegi zoom in        : " + P1.getLuas());
        System.out.println("Keliling Persegi zoom in    : " + P1.getKeliling());
        P1.zoom(150);
        System.out.println("\nSisi Persegi zoom 150%      : " + P1.getSisi());
        System.out.println("Luas Persegi zoom 150%      : " + P1.getLuas());
        System.out.println("Keliling Persegi zoom 150%  : " + P1.getKeliling());
        P1.zoomOut();
        System.out.println("\nSisi Persegi zoom out       : " + P1.getSisi());
        System.out.println("Luas Persegi zoom out       : " + P1.getLuas());
        System.out.println("Keliling Persegi zoom out   : " + P1.getKeliling());

        // contoh kalau di polimorphisme
        // misal bikin persegi, tapi melalui BangunDatar
        BangunDatar P2 = new Persegi(3, "Merah", "Kuning");
        // dia baru bisa dipanggil kalau di-casting
        ((Persegi)P2).zoomIn();
        // gausa di print hehe, biar rapih
    }
}
