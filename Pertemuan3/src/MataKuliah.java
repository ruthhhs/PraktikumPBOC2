// Nama File    : MataKuliah.java
// Deskripsi    : Berisi atribut dan method dalam class MataKuliah
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 05 Maret 2026

public class MataKuliah {
    // ====== ATRIBUT ======
    private String idMatkul;
    private String nama;
    private Integer sks;

    // ====== METHOD KONSTRUKTOR ======
    MataKuliah(String idMatkul, String nama, Integer sks){
        this.idMatkul = idMatkul;
        this.nama = nama;
        this.sks = sks;
    }

    MataKuliah(){
        this("", "", 0);
    }

    // ====== METHOD SELEKTOR ======
    String getIdMatkul(){
        return this.idMatkul;
    }

    String getNama(){
        return this.nama;
    }

    Integer getSks(){
        return this.sks;
    }

     // ====== METHOD MUTATOR ======
    void setIdMatkul(String idMatkul){
        this.idMatkul = idMatkul;
    }

    void setNama(String nama){
        this.nama = nama;
    }

    void setProdi(Integer sks){
        this.sks = sks;
    }
}
