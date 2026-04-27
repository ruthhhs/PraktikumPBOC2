public class Seminar {
    // ====== ATRIBUT ======
    private String namaSeminar;
    private CivitasAkademika[] peserta;
    private int banyakPeserta;

    // ====== KONSTRUKTOR ======
    public Seminar(String namaSeminar){
        this.namaSeminar = namaSeminar;
        this.peserta = new CivitasAkademika[100];
        this.banyakPeserta = 0;
    }

    public Seminar(){
        this("-");
        this.peserta = new CivitasAkademika[100];
        this.banyakPeserta = 0;
    }

    // ====== METHOD SELEKTOR ======
    public String getNamaSeminar(){
        return namaSeminar;
    }

    // menghitung jumlah semua peserta
    public int countPeserta(){
        return banyakPeserta;
    }

    // menghitung jumlah peserta yang mahasiswa saja
    public int countMahasiswa(){
        int countMhs = 0;
        for (int i=0; i<banyakPeserta; i++){
            if (peserta[i] instanceof Mahasiswa){
                countMhs ++;
            }
        }
        return countMhs;
    }

    // ====== METHOD MUTATOR ======
    public void setNamaSeminar(String namaSeminar){
        this.namaSeminar = namaSeminar;
    }

    // ====== METHOD LAINNYA ======
    // memasukkan dosen dan mahasiswa ke daftar peserta seminar, maksimal 100 peserta
    public void registrasi(CivitasAkademika ca){
        if (banyakPeserta < 100) {
            peserta[banyakPeserta] = ca;
            banyakPeserta ++;
        }
    }

    // menampilkan data seminar berupa nama seminar, jumlah peserta, dan data pesertanya
    public void tampilPeserta(){
        System.out.println("=== Daftar Peserta \"Seminar " + namaSeminar + "\" ===");
        System.out.println("Jumlah Peserta   : " + this.countPeserta());
        System.out.println("Jumlah Mahasiswa : " + this.countMahasiswa());
        for (int i=0; i<banyakPeserta; i++){
            System.out.println((i+1) +
                                ") No: " + peserta[i].getNomor() +
                                ", Nama: " + peserta[i].getNama());
        }
        System.out.println();
    }
}
