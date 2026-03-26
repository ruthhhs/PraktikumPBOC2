public class Lingkaran {
    private double jarijari;
    public Lingkaran (double jarijari){
        this.jarijari = jarijari;
    }
    public double hitungKeliling(){
        double keliling = 2*Math.PI*jarijari;
        return keliling;
    }
}
