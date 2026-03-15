// Nama File    : DosenTamu.java
// Deskripsi    : Berisi atribut dan method dalam class DosenTamu
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 12 Maret 2026

public class DosenTamu extends Pegawai{
    // ====== ATRIBUT ======
    private String nidk;
    private String fakultas;
    private Tanggal akhirKontrak;

    // ====== METHOD KONSTRUKTOR ======
    public DosenTamu() {
        setJabatan("Dosen Tamu");
        setPersenTunjang(2.5);
        setBup(55);
        this.nidk = "-";
        this.fakultas = "-";
        this.akhirKontrak = new Tanggal(1, 1, 2022);
    }

    public DosenTamu(
        String nidk,
        String fakultas,
        Tanggal akhirKontrak,
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
        this.akhirKontrak = akhirKontrak;
    }

    // ====== METHOD SELEKTOR ======
    public String getNidk() {
        return nidk;
    }

    public String getFakultas() {
        return fakultas;
    }

    public Tanggal getAkhirKontrak() {
        return akhirKontrak;
    }

    // ====== METHOD MUTATOR  ======
    public void setNidk(String nidk) {
        this.nidk = nidk;
    }

    public void setFakultas(String fakultas) {
        this.fakultas = fakultas;
    }

    public void setAkhirKontrak(Tanggal akhirKontrak) {
        this.akhirKontrak = akhirKontrak;
    }

    // ====== METHOD HITUNG ======
    // overide
    public void hitungTunjangan(Tanggal hariIni){
        setTunjangan(getPersenTunjang() *
                        getGajiPokok() / 100);
    }

    // ====== METHOD LAINNYA ======
    public void printInfo(Tanggal hariIni) {
        System.out.println("\n===== Data Dosen Tamu =====");
        System.out.println("NIDK          : " + nidk);
        System.out.println("Fakutlas      : " + fakultas);
        System.out.print("Akhir Kontrak : ");
        akhirKontrak.printTanggal();
        super.printInfo(hariIni);
    }
}