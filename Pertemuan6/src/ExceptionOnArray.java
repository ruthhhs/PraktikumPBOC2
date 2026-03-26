// Nama File    : ExceptionOnArray.java
// Deskripsi    : Program yang menjalankan eksepsi
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 26 Maret 2026

public class ExceptionOnArray {
    public static void main(String[] args) {
        Integer[] arraIntegers = new Integer[4];
        try{
            arraIntegers[2] = 11;
            arraIntegers[4] = 10;
        } catch(ArrayIndexOutOfBoundsException exception) {
            exception.printStackTrace();
        } finally {
            System.out.println("clean up code...");
        }
    }
}
