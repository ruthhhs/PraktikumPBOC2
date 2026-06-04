// Nama File    : DiskonLambda.java
// Deskripsi    : Implementasi lambda expression pada interface IDiskon
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 4 Juni 2026

public class DiskonLambda {
    public static void main(String[] args) {
        // ga pake lambda
        IDiskon diskonMerdeka = new IDiskon() {
            @Override
            public double hitungDiskon(int harga) {
                return harga - (harga * 0.3);
            }
        };

        // pake lambda
        IDiskon diskonLebaran = (harga) -> harga - (harga * 0.4);
        
        // pake lambda block statement
        IDiskon diskonBiasa = (harga) -> {
            return harga - (harga * 0.1);
        };

        System.out.println("Harga diskon Merdeka: " + diskonMerdeka.hitungDiskon(100000));
        System.out.println("Harga diskon Lebaran: " + diskonLebaran.hitungDiskon(100000));
        System.out.println("Harga diskon Biasa  : " + diskonBiasa.hitungDiskon(100000));
    }
}