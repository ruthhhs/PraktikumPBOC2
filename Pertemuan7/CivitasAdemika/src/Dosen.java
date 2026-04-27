public class Dosen extends CivitasAkademika {
    // ====== ATRIBUT ======
    private String nip;


    // ====== KONSTRUKTOR ======
    public Dosen(String nip, String nama){
        this.nip = nip;
        this.setNama(nama);
    }

    public Dosen(){
        this("-", "a/n");
    }

    // ====== METHOD SELEKTOR ======
    @Override
    // dosen memiliki atribut nomor nip
    public String getNomor(){
        return nip;
    }

    // ====== METHOD MUTATOR ======
    public void setNip(String nip){
        this.nip = nip;
    }

    // ====== METHOD LAINNYA ======
}
