// Nama File    : coercionMain.java
// Deskripsi    : Driver yang menjalankan coercion
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 23 April 2026

public class coercionMain {
    public static void main(String[] args) {
        // char ke integer
        int c1 = 'a';
        System.out.println(c1); // out: 97

        // double ke integer
        double c2 = 3.14;
        int c3 = (int) c2;
        System.out.println(c3); // out: 3
        
        // integer ke double
        int c4 = 3;
        double c5 = c4;
        System.out.println(c5); // out: 3.0

        // char ke double
        char c6 = 'a';
        double c7 = (double) c6;
        System.out.println(c7); // out: 97.0

        // integer ke char
        int c8 = 97;
        char c9 = (char) c8;
        System.out.println(c9); // out: 'a'

        // double ke char
        double c10 = 97.0;
        char c11 = (char) c10;
        System.out.println(c11); // out: 'a'

        // integer ke char (pakai fungsi class)
        Integer c12 = 3;
        String c13 = c12.toString();
        System.out.println(c13); // out: "3"

        // ====== sesuai modul ======
        String x = "1234";
        String y = "5678";
        Integer xi = Integer.parseInt(x);
        Integer yi = Integer.parseInt(y);

        String S = x + y;
        Integer Z = xi + yi;

        System.out.println("Konkatenasi : " + S);
        System.out.println("Jumlah      : " + Z);
    }
}
