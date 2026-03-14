public class DosenTamu extends Pegawai{
    // ====== ATRIBUT ======
    private String nidk;
    private String fakultas;

    // ====== METHOD KONSTRUKTOR ======
    public DosenTamu() {
        setJabatan("Dosen Tamu");
        setPersenTunjang(2.5);
        setBup(55);
        this.nidk = "-";
        this.fakultas = "-";
    }

    public DosenTamu(
        String nidk,
        String fakultas,
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
        this.nidk = "-";
        this.fakultas = "-";
    }

    // ====== METHOD SELEKTOR ======
    public String getNidk() {
        return nidk;
    }

    public String getFakultas() {
        return fakultas;
    }

    // ====== METHOD MUTATOR  ======
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // ====== METHOD LAINNYA ======
    public void printInfo(Tanggal hariIni) {
        System.out.println("\n===== Data Dosen Tamu =====");
        System.out.println("NIDK          : " + nidk);
        System.out.println("Fakutlas      : " + fakultas);
        super.printInfo(hariIni);
    }
}