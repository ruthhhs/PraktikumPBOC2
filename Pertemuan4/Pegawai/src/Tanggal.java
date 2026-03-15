// Nama File    : Tanggal.java
// Deskripsi    : Berisi atribut dan method dalam class Tanggal
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 12 Maret 2026

public class Tanggal {
    // ====== ATRIBUT ======
    private Integer hari; 
    private Integer bulan;
    private Integer tahun;

    // ====== METHOD KONSTRUKTOR ======
    public Tanggal(Integer hari, Integer bulan, Integer tahun){
        this.hari = hari;
        this.bulan = bulan;
        this.tahun = tahun;
    }

    public Tanggal() {
        this(0, 0, 0);
    }

    // ====== METHOD SELEKTOR ======
    public Integer getHari(){
        return this.hari;
    }

    public Integer getBulan(){
        return this.bulan;
    }

    public Integer getTahun(){
        return this.tahun;
    }

    // ====== METHOD MUTATOR  ======
    public void setHari(Integer hari){
        this.hari = hari;
    }

    public void setBulan(Integer bulan){
        this.bulan = bulan;
    }

    public void setTahun(Integer tahun){
        this.tahun = tahun;
    }

    // ====== METHOD LAINNYA ======
    public void printTanggal() {
        System.out.print(hari);
        if(bulan == 1){
            System.out.print(" Januari ");
        } else if (bulan == 2){
            System.out.print(" Februari ");
        } else if(bulan == 3){
            System.out.print(" Maret ");
        } else if(bulan == 4){
            System.out.print(" April ");
        } else if(bulan == 5){
            System.out.print(" Mei ");
        } else if(bulan == 6){
            System.out.print(" Juni ");
        } else if(bulan == 7){
            System.out.print(" Juli ");
        } else if(bulan == 8){
            System.out.print(" Agustus ");
        } else if(bulan == 9){
            System.out.print(" September ");
        } else if(bulan == 10){
            System.out.print(" Oktober ");
        } else if(bulan == 11){
            System.out.print(" November ");
        } else if(bulan == 12){
            System.out.print(" Desember ");
        }
        System.out.println(tahun);
    }
}
