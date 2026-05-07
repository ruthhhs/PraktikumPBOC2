// Nama File    : Piaraan.java
// Deskripsi    : Berisi atribut dan method dalam class Piaraan
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 7 Mei 2026

import java.util.LinkedList;

public class Piaraan {
    // ==== ATRIBUT ====
    private LinkedList<Anabul> Lanabul;
    private int nbelm;

    // ==== METHOD KONSTRUKTOR ====
    Piaraan(){
        this.Lanabul = new LinkedList<>();
        this.nbelm = 0;
    }

    // ==== METHOD SELEKTOR ====
    public int getNbelm(){
        return this.nbelm;
    }

    public Anabul getAnabul(){
        return this.Lanabul.pollFirst();
    }

    // ==== METHOD MUTATOR ====
    public void enqueueAnabul(Anabul anabul){
        this.Lanabul.addLast(anabul);
        this.nbelm++;
    }

    public Anabul dequeueAnabul(){
        Anabul removed = this.Lanabul.pollFirst();
        this.nbelm--;
        return removed;
    }

    // ==== METHOD LAINNYA ====
    public boolean isMember(Anabul anabul){
        return Lanabul.contains(anabul);
    }

    public void showAnabul(){
        for(int i = 0; i < Lanabul.size(); i++){
            System.out.println("Anabul urutan ke-" + (i+1) + ": " + Lanabul.get(i).getNama());
        }
    }

    public int countKucing(){
        int count = 0;
        for(int i = 0; i < Lanabul.size(); i++){
            if (Lanabul.get(i) instanceof Kucing){
                count++;
            }
        }
        return count;
    }

    public double bobotKucing(){
        double bobot = 0;
        for(int i = 0; i < Lanabul.size(); i++){
            if (Lanabul.get(i) instanceof Kucing){
                bobot = bobot + ((Kucing) Lanabul.get(i)).getBobot();
            }
        }
        return bobot;
    }

    public void showJenisAnabul(){
        for(int i = 0; i < Lanabul.size(); i++){
            System.out.println("Antrian " + (i+1) + ". Jenis " + this.Lanabul.get(i).getClass().getSimpleName()+ ": " + Lanabul.get(i).getNama());
        }
    }
}
