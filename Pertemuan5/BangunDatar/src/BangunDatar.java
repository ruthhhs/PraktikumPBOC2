

public abstract class BangunDatar {
    // ====== ATRIBUT ======
    private int jumlahSisi;
    private String warna;
    private String border;
    private static int counterBangunDatar;

    // ====== METHOD KONSTRUKTOR ======
    public BangunDatar(int jumlahSisi, String warna, String border) {
        this.jumlahSisi = jumlahSisi;
        this.warna = warna;
        this.border = border;
        counterBangunDatar ++;
    }
    
    public BangunDatar() {
        this(0, "-", "-");
    }

    // ====== METHOD SELEKTOR ======
    public int getJumlahSisi() {
        return jumlahSisi;
    }

    public String getWarna() {
        return warna;
    }

    public String getBorder() {
        return border;
    }

    static public int getCounterBangunDatar() {
        return counterBangunDatar;
    }

    // ====== METHOD MUTATOR  ======
    public void setJumlahSisi (int jumlahSisi) {
        this.jumlahSisi = jumlahSisi;
    }

    public void setWarna (String warna) {
        this.warna = warna;
    }

    public void setBorder (String border) {
        this.border = border;
    }

    // ====== METHOD LAINNYA ======
    public void printInfo() {
        System.out.println("Jumlah Sisi : " + jumlahSisi);
        System.out.println("Warna       : " + warna);
        System.out.println("Border      : " + border);
    }

    public void printCounterBangunDatar() {
        System.out.println("Jumlah Objek Bangun Datar: " + getCounterBangunDatar());
    }

    public abstract double getLuas();
    public abstract double getKeliling();

    public boolean isEqualLuas (BangunDatar X) {
        return this.getLuas() == X.getLuas();
    }

    public boolean isEqualKeliling (BangunDatar X) {
        return this.getKeliling() == X.getKeliling();
    }
}