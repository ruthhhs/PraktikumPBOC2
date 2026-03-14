public class Pegawai {
    // ====== ATRIBUT ======
    private String nip;
    private String nama;
    private Tanggal tanggalLahir;
    private Tanggal mulaiKerja;
    private String jabatan;
    private Integer gajiPokok;
    private Double tunjangan;
    private Double persenTunjang;
    private Integer bup;

    // ====== METHOD KONSTRUKTOR ======
    public Pegawai(
        String nip,
        String nama,
        Tanggal tanggalLahir,
        Tanggal mulaiKerja,
        String jabatan,
        Integer gajiPokok,
        Integer bup,
        Double persenTunjang,
        Tanggal hariIni
    ) {
            this.nip = nip;
            this.nama = nama;
            this.tanggalLahir = tanggalLahir;
            this.mulaiKerja = mulaiKerja;
            this.jabatan = jabatan;
            this.gajiPokok = gajiPokok;
            this.bup = bup;
            this.persenTunjang = persenTunjang;
            hitungTunjangan(hariIni);
        }

    public Pegawai() {
        this(
            "-",
            "-",
            new Tanggal(1, 1, 2000),
            new Tanggal(1, 1, 2020),
            "-",
            3700000, // umr semarang wkwkw
            70,
            0.0,
            new Tanggal()
        );
    }

    // ====== METHOD SELEKTOR ======
    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public Tanggal getTanggalLahir() {
        return tanggalLahir;
    }

    public Tanggal getMulaiKerja() {
        return mulaiKerja;
    }

    public String getJabatan() {
        return jabatan;
    }

    public Integer getGajiPokok() {
        return gajiPokok;
    }

    public Double getTunjangan() {
        return tunjangan;
    }

    public Double getPersenTunjang() {
        return persenTunjang;
    }

    public Integer getBup() {
        return bup;
    }

    // ====== METHOD MUTATOR  ======
    public void setNip (String nip){
        this.nip = nip;
    }

    public void setNama (String nama){
        this.nama = nama;
    }

    public void setTanggalLahir (Tanggal tanggalLahir){
        this.tanggalLahir = tanggalLahir;
    }

    public void setMulaiKerja (Tanggal mulaiKerja){
        this.mulaiKerja = mulaiKerja;
    }

    public void setJabatan (String jabatan){
        this.jabatan = jabatan;
    }

    public void setGajiPokok (Integer gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void setPersenTunjang (Double persenTunjang) {
        this.persenTunjang = persenTunjang;
    }

    public void setBup(Integer bup) {
        this.bup = bup;
    }

    // ====== METHOD HITUNG ======
    public String hitungMasaKerja (Tanggal hariIni){
        int tahun = hariIni.getTahun() - mulaiKerja.getTahun();
        int bulan = hariIni.getBulan() - mulaiKerja.getBulan();
        return tahun + " tahun " + bulan + " bulan";
    }

    public Tanggal hitungPensiun(){
        Tanggal pensiun = new Tanggal(
            tanggalLahir.getHari(),
            tanggalLahir.getBulan(),
            tanggalLahir.getTahun() + bup
        );
        return pensiun;
    }

    public void hitungTunjangan(Tanggal hariIni){
        int masaKerja = hariIni.getTahun() - mulaiKerja.getTahun();
        this.tunjangan = (persenTunjang *
                            masaKerja *
                            gajiPokok / 100);
    }

    // ====== METHOD LAINNYA ======
    public void printInfo(Tanggal hariIni) {
        if (jabatan == "-") {
            System.out.println("\n===== Data Pegawai =====");
        }
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.print("Tanggal Lahir : ");
        tanggalLahir.printTanggal();
        System.out.print("Mulai Kerja   : ");
        mulaiKerja.printTanggal();
        System.out.println("Jabatan       : " + jabatan);
        System.out.println("Masa Kerja    : " + hitungMasaKerja(hariIni));
        System.out.print("Pensiun       : ");
        hitungPensiun().printTanggal();
        System.out.println("Gaji Pokok    : Rp " + gajiPokok + ".0");
        hitungTunjangan(hariIni);
        System.out.println("Tunjangan     : Rp " + tunjangan);
    }
}
