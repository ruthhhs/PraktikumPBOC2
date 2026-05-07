// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class Dosen
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 23 April 2026

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
