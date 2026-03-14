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
        System.out.println(hari + " " + bulan + " " + tahun);
    }
}
