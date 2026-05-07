// Nama File    : Teman.java
// Deskripsi    : Berisi atribut dan method dalam class Teman
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 7 Mei 2026

import java.util.ArrayList;

public class Teman {
    // ===== ATRIBUT =====
    private int nbelm;
    private ArrayList<String> Lnama;

    // ===== KONSTRUKTOR =====
    public Teman() {
        this.Lnama = new ArrayList<>();
        this.nbelm = 0;
    }

    // ===== METHOD GETTER =====
    public int getNbelm() {
        return nbelm;
    }

    public String getNama(int index) {
        return Lnama.get(index-1);
    }

    // ===== METHOD SETTER =====
    public void setNama(int index, String nama) {
        if (Lnama.get(index-1) != null) {
            this.Lnama.set(index-1, nama);
        }
    }

    // ===== METHOD MUTATOR =====
    public void addNama(String nama) {
        this.Lnama.add(nama);
        this.nbelm++;
    }

    public void delNama(String nama){
        if (this.isMember(nama)) {
            if(Lnama.remove(nama)){
                this.nbelm--;
            }
        }
    }

    public void gantiNama(String nama, String namaBaru){
        for(int i = 0; i < Lnama.size(); i++){
            if(Lnama.get(i).equals(nama)){
                int index = Lnama.indexOf(nama);
                if(index != -1){
                    this.Lnama.set(index, namaBaru);
                }
            }
        }
    }

    // ===== METHOD LAINNYA =====
    public boolean isMember(String nama){
        return Lnama.contains(nama);
    }

    public int countNama(String nama){
        int count = 0;
        for(int i = 0; i < Lnama.size(); i++){
            if(Lnama.get(i).equals(nama)){
                count++;
            }
        }
        return count;
    }

    public void showTeman(){
        for(int i = 0; i < Lnama.size(); i++){
            System.out.println("Teman ke-" + (i+1) + ": " + Lnama.get(i));
        }
    }

}
