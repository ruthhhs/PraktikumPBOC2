public class Pegawai {
    // ====== ATRIBUT ======
    private String nip;
    private String nama;
    private Tanggal tanggalLahir;
    private Tanggal mulaiKerja;
    private String jabatan;
    private String masaKerja;
    private Tanggal pensiun;
    private Integer gajiPokok;
    private Integer tunjangan;
    private Integer bup;

    // ====== METHOD KONSTRUKTOR ======
    public Pegawai(
        String nip,
        String nama,
        Tanggal tanggalLahir,
        Tanggal mulaiKerja,
        String jabatan,
        // String masaKerja,
        // Tanggal pensiun,
        Integer gajiPokok,
        Integer persenTunjang,
        Tanggal hariIni
    ) {
            this.nip = nip;
            this.nama = nama;
            this.tanggalLahir = tanggalLahir;
            this.mulaiKerja = mulaiKerja;
            this.jabatan = jabatan;
            this.masaKerja = setMasaKerja();
            this.pensiun = setPensiun();
            this.gajiPokok = gajiPokok;
            this.tunjangan = setTunjangan(persenTunjang);
        }

    // public Pegawai() {
    //     this(
    //         "-",
    //         "-",
    //         new Tanggal(),
    //         new Tanggal(),
    //         "-",
    //         "-",
    //         new Tanggal(),
    //         0,
    //         0
    //     );
    // }

    // ====== METHOD SELEKTOR ======
    public String getNip() {
        return this.nip;
    }

    public String getNama() {
        return this.nama;
    }

    public Tanggal getTanggalLahir() {
        return this.tanggalLahir;
    }

    public Tanggal getMulaiKerja() {
        return this.mulaiKerja;
    }

    public String getJabatan() {
        return this.jabatan;
    }

    public String getMasaKerja() {
        return this.masaKerja;
    }

    public Tanggal getPensiun() {
        return this.pensiun;
    }

    public Integer getGajiPokok() {
        return this.gajiPokok;
    }

    public Integer getTunjangan() {
        return this.tunjangan;
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

    public void setMasaKerja (Tanggal mulaiKerja, Tanggal hariIni){
        this.masaKerja = (
            (hariIni.getTahun() - mulaiKerja.getTahun()) +
            " tahun " +
            (hariIni.getBulan() - mulaiKerja.getBulan()) +
            " bulan "
        );
    }

    public void setPensiun (Tanggal pensiun){
        pensiun.setBulan(pensiun.getBulan() + 1);
        pensiun.setTahun(pensiun.getTahun() + bup);;
    }

    public void setGajiPokok (Integer gajiPokok){
        this.gajiPokok = gajiPokok;
    }

    public void setTunjangan (Integer persenTunjang, Tanggal hariIni){
        this.tunjangan = (
            persenTunjang *
            (hariIni.getTahun() - mulaiKerja.getTahun()) * // masa kerja dalam tahun
            this.gajiPokok
        );
    }

    public Integer getBup() {
        return this.bup;
    }

    // ====== METHOD LAINNYA ======
    public void printInfo() {
        System.out.println("NIP           : " + nip);
        System.out.println("Nama          : " + nama);
        System.out.print("Tanggal Lahir : ");
        tanggalLahir.printTanggal();
        System.out.print("Mulai Kerja   : ");
        mulaiKerja.printTanggal();
        System.out.println("Jabatan       : " + jabatan);
        System.out.println("Masa Kerja    : " + masaKerja);
        System.out.print("Pensiun       : ");
        pensiun.printTanggal();
        System.out.println("Gaji Pokok    : Rp " + gajiPokok);
        System.out.println("Tunjangan     : Rp " + tunjangan);
    }
}
