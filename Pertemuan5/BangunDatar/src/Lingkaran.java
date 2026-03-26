

public class Lingkaran extends BangunDatar implements Iresize {
    // ====== ATRIBUT ======
    private double jari;

    // ====== METHOD KONSTRUKTOR ======
    public Lingkaran() {
        setJumlahSisi(0);
    }

    public Lingkaran(double jari, String warna, String border) {
        super(0, warna, border);
        this.jari = jari;
    }

    // ====== METHOD SELEKTOR ======
    public double getJari() {
        return jari;
    }

    // ====== METHOD MUTATOR  ======
    public void setJari(double jari) {
        this.jari = jari;
    }

    // ====== METHOD LAINNYA ======
    public void printInfo() {
        System.out.println("\n=== INFO LINGKARAN ===");
        super.printInfo();
        System.out.println("Jari        : " + this.jari);
    }

    public double getLuas() {
        return Math.PI * Math.pow(jari, 2);
    }

    public double getKeliling() {
        return 2 * Math.PI * jari;
    }

    public void zoomIn(){
        jari = jari * 1.1;
    }

    public void zoomOut(){
        jari = jari * 0.9;
    }

    public void zoom(int percent){
        jari = jari * percent / 100;
    }
}