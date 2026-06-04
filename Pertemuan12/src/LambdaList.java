// Nama File    : LambdaList.java
// Deskripsi    : Implementasi lambda expression pada ArrayList
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 4 Juni 2026
import java.util.ArrayList;

public class LambdaList {
    public static void main(String[] args) {
        ArrayList<String> mahasiswaList = new ArrayList<>();
        mahasiswaList.add("Adi");
        mahasiswaList.add("Bambang");
        mahasiswaList.add("Cici");
        mahasiswaList.add("Didi");

        // Mencetak nama mahasiswa menggunakan lambda
        mahasiswaList.forEach(nama -> System.out.println(nama));
    }
}
