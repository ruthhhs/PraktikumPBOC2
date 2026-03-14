public class Tendik extends Pegawai{
    // ====== ATRIBUT ======
    private String bidang;

    // ====== METHOD KONSTRUKTOR ======
        public Tendik() {
        setJabatan("Tendik");
        setPersenTunjang(1.0);
        setBup(55);
        this.bidang = "-";
    }

    public Tendik(
        String bidang,
        String nip,
        String nama,
        Tanggal tanggalLahir,
        Tanggal mulaiKerja,
        String jabatan,
        Integer gajiPokok,
        Integer bup,
        Float persenTunjang,
        Tanggal hariIni
    ) {
        super(
            nip,
            nama,
            tanggalLahir,
            mulaiKerja,
            "Dosen Tetap",
            gajiPokok,
            55,
            2.5,
            hariIni
        );
        this.bidang = "-";
    }


    // ====== METHOD SELEKTOR ======
    public String getBidang() {
        return bidang;
    }

    // ====== METHOD MUTATOR  ======
    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    // ====== METHOD LAINNYA ======
    public void printInfo(Tanggal hariIni) {
        System.out.println("\n===== Data Tendik =====");
        System.out.println("Bidang        : " + bidang);
        super.printInfo(hariIni);
    }
}
