public abstract class CivitasAkademika {
    // ====== ATRIBUT ======
    private String nama;

    // ====== KONSTRUKTOR ======
    public CivitasAkademika(String nama){
        this.nama = nama;
    }

    public CivitasAkademika(){
        this("a/n");
    }

    // ====== METHOD SELEKTOR ======
    public String getNama(){
        return nama;
    }

    // ====== METHOD MUTATOR ======
    public void setNama(String nama){
        this.nama = nama;
    }

    // ====== METHOD LAINNYA ======
    // menampilan nim/nim sesuai kelas anak (dosen/mahasiswa)
    public abstract String getNomor();
}
