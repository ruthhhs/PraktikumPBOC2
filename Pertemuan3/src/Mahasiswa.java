// Nama File    : Mahasiswa.java
// Deskripsi    : Berisi atribut dan method dalam class Mahasiswa
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 05 Maret 2026

import java.util.ArrayList;

public class Mahasiswa {
    // ====== ATRIBUT ======
    private String nim;
    private String nama;
    private String prodi;
    ArrayList<MataKuliah> listMatkul;
    private Dosen dosenWali;
    private Kendaraan kendaraan;

    // ====== METHOD KONSTRUKTOR ======
    Mahasiswa(String nim, String nama, String prodi){
        this.nim = nim;
        this.nama = nama;
        this.prodi = prodi;
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
    }

    Mahasiswa(){
        this("", "", "");
        this.listMatkul = new ArrayList<>();
        this.dosenWali = new Dosen();
        this.kendaraan = new Kendaraan();
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

    Dosen getDoswal(){
        return this.dosenWali;
    }

    Kendaraan getKendaraan(){
        return this.kendaraan;
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

    void setDosWal(Dosen dosenWali){
        this.dosenWali = dosenWali;
    }

    void setKendaraan(Kendaraan kendaraan){
        this.kendaraan = kendaraan;
    }

    // ====== METHOD LAINNYA ======
    // memasukkan mata kuliah ke list matkul
    void addMatkul(MataKuliah newMatkul){
        listMatkul.add(newMatkul);
    }

    // mengembalikan jumlah matkul yang dimiliki mahasiswa
    Integer getJumlahMatkul(){
        return listMatkul.size();
    }

    // mengembalikan jumlah sks yang dimiliki mahasiswa
    Integer getJumlahSks(){
        Integer jumlah = 0;
        for(int i=0; i<listMatkul.size(); i++){
            jumlah += listMatkul.get(i).getSks();
        }
        return jumlah;
    }

    // menampilkan data mahasiswa
    void printMhs(){
        System.out.println(
            "=== Data Mahasiswa ===\n" +
            "NIM   : " + this.getNim() + "\n" +
            "Nama  : " + this.getNama() + "\n" +
            "Prodi : " + this.getProdi()
        );
    }

    // menampilkan data mahasiswa beserta detail dosen, kendaraan, dan mata kuliahnya
    void printDetailMhs(){
        System.out.print(
            "=== Detail Mahasiswa ===\n" +
            "NIM        : " + this.getNim() + "\n" +
            "Nama       : " + this.getNama() + "\n" +
            "Prodi      : " + this.getProdi() + "\n" +
            "Kendaraan  : " + this.getKendaraan().getNoPlat() + "\n" +
            "Dosen Wali : " + this.getDoswal().getNama() + "\n" +
            "List Matkul: [ "
        );
        for(int i=0; i<listMatkul.size(); i++){
            if (i == listMatkul.size()-1){
                System.out.print(listMatkul.get(i).getNama());
            } else{
                System.out.print(listMatkul.get(i).getNama() + ", ");
            }
        }
        System.out.print(" ]\n");
    }
}
