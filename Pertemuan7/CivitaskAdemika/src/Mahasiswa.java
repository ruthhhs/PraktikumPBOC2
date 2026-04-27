public class Mahasiswa extends CivitasAkademika {
    // ====== ATRIBUT ======
    private String nim;
    private Dosen doswal;

    // ====== KONSTRUKTOR ======
    public Mahasiswa(String nim, String nama, Dosen doswal){
        this.nim = nim;
        this.setNama(nama);
        this.doswal = doswal;
    }

    public Mahasiswa(){
        this("-", "a/n", new Dosen());
    }

    // ====== METHOD SELEKTOR ======
    @Override
    // dosen memiliki atribut nomor nim
    public String getNomor(){
        return nim;
    }

    public Dosen getWali(){
        return doswal;
    }

    // ====== METHOD MUTATOR ======
    public void setNim(String nim){
        this.nim = nim;
    }

    public void setWali(Dosen doswal){
        this.doswal = doswal;
    }

    // ====== METHOD LAINNYA ======
    // menampilkan data mahasiswa dan nama dosen walinya
    public void tampilDataMahasiswa(){
        System.out.println("=== Data Mahasiswa ===");
        System.out.println("NIM         : " + this.nim);
        System.out.println("Nama Mhs    : " + this.getNama());
        System.out.println("Nama Doswal : " + this.getWali().getNama());
        System.out.println();
    }
}
