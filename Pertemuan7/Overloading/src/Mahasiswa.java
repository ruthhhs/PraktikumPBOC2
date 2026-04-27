public class Mahasiswa {
    // ====== ATRIBUT ======
    private String nim;
    private String nama;
    private String prodi;

    // ====== METHOD KONSTRUKTOR ======
    Mahasiswa(String nim, String nama, String prodi){
        this.nama = nama;
        this.nim = nim;
        this.prodi = prodi;
    }

    Mahasiswa(){
        this("-999", "n/a", "n/a");
    }

    Mahasiswa(Mahasiswa M){
        this(M.nim, M.nama, M.prodi);
    }

    // ====== METHOD SELEKTOR ======
    String getNim(){
        return this.nim;
    }

    String getNama(){
        return this.nama;
    }

    String getProdi(){
        return this.prodi;
    }

    // ====== METHOD MUTATOR ======
    void setNim(String nim){
        this.nim = nim;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void setProdi(String prodi){
        this.prodi = prodi;
    }

    void setProdi(){
        this.prodi = "Kosong";
    }

    void setProdi(Mahasiswa M){
        this.prodi = M.prodi;
    }

    // ====== METHOD LAINNYA ======
    // menampilkan data mahasiswa
    void printMhs(){
        System.out.println(
            "=== Data Mahasiswa ===\n" +
            "NIM   : " + this.getNim() + "\n" +
            "Nama  : " + this.getNama() + "\n" +
            "Prodi : " + this.getProdi() + "\n"
        );
    }
}
