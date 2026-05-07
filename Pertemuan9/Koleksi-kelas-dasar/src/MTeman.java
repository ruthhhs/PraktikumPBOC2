// Nama File    : MTeman.java
// Deskripsi    : Driver yang menjalankan class Teman
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 7 Mei 2026

public class MTeman {
    public static void main(String[] args) {
        Teman T1 = new Teman();

        // ini ga bisa karna setNama itu cuma ngubah nama yang udah ada, bukan menambah
        // T1.setNama(1, "Coco");
        // T1.setNama(2, "Agot");

        T1.addNama("Coco");
        T1.addNama("Agot");
        System.out.println("Teman ke-1: " + T1.getNama(1));
        System.out.println("Teman ke-2: " + T1.getNama(2));

        // nah ini baru boleh, karna emang udah ada
        T1.setNama(1, "Agot");
        T1.setNama(2, "Coco");
        System.out.println("Teman ke-1: " + T1.getNama(1));
        System.out.println("Teman ke-2: " + T1.getNama(2));

        System.out.println("Jumlah teman: " + T1.getNbelm());

        // nambah teman lagi
        T1.addNama("Tetia");
        T1.addNama("Qifley");
        T1.addNama("Riche");
        System.out.println("Jumlah teman: " + T1.getNbelm());

        // hapus teman
        T1.delNama("Qifley");
        System.out.println("Jumlah teman: " + T1.getNbelm());

        // ganti nama teman
        System.out.println("Nama lama: " + T1.getNama(4));
        T1.gantiNama("Riche", "Richeh");
        System.out.println("Nama baru: " + T1.getNama(4));

        // apakah teman dan hitung nama
        System.out.println("Apakah Coco teman? " + T1.isMember("Coco"));
        System.out.println("Jumlah teman dengan nama Agot: " + T1.countNama("Agot"));

        // tampilkan semua teman
        System.out.println("\nDaftar teman:");
        T1.showTeman();
    }
}
