// Nama File    : Dosen.java
// Deskripsi    : Berisi atribut dan method dalam class Dosen
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 05 Maret 2026

public class Dosen {
    // ====== ATRIBUT ======
    private String nip;
    private String nama;
    private String prodi;

    // ====== METHOD KONSTRUKTOR ======
    Dosen(String nip, String nama, String prodi){
        this.nip = nip;
        this.nama = nama;
        this.prodi = prodi;
    }

    Dosen(){
        this("", "", "");
    }

    // ====== METHOD SELEKTOR ======
    String getNip(){
        return this.nip;
    }

    String getNama(){
        return this.nama;
    }

    String getProdi(){
        return this.prodi;
    }

    // ====== METHOD MUTATOR ======
    void setNip(String nip){
        this.nip = nip;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void setProdi(String prodi){
        this.prodi = prodi;
    }
}
