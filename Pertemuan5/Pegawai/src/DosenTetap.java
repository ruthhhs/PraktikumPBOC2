// Nama File    : DosenTetap.java
// Deskripsi    : Berisi atribut dan method dalam class DosenTetap
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 12 Maret 2026

public class DosenTetap extends Pegawai{
    // ====== ATRIBUT ======
    private String nidn;
    private String fakultas;

    // ====== METHOD KONSTRUKTOR ======
    public DosenTetap() {
        setJabatan("Dosen Tetap");
        setPersenTunjang(2.0);
        setBup(65);
        this.nidn = "-";
        this.fakultas = "-";
    }

    public DosenTetap(
        String nidn,
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
            65,
            2.0,
            hariIni
        );
        this.nidn = "-";
        this.fakultas = "-";
    }

    // ====== METHOD SELEKTOR ======
    public String getNidn() {
        return nidn;
    }

    public String getFakultas() {
        return fakultas;
    }

    // ====== METHOD MUTATOR  ======
    public void setNidn(String nidn) {
        this.nidn = nidn;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    // ====== METHOD LAINNYA ======
    public void printInfo(Tanggal hariIni) {
        System.out.println("\n===== Data Dosen Tetap =====");
        System.out.println("NIDN          : " + nidn);
        System.out.println("Fakutlas      : " + fakultas);
        super.printInfo(hariIni);
    }
}
