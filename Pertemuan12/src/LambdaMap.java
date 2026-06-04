// Nama File    : LambdaMap.java
// Deskripsi    : Implementasi lambda expression pada HashMap
// Pembuat      : Ruth Septriana Sipangkar / 24060124120024
// Tanggal      : 4 Juni 2026
import java.util.HashMap;

public class LambdaMap {
    public static void main(String[] args) {
        HashMap<String, Integer> mahasiswaMap = new HashMap<>();
        mahasiswaMap.put("Adi", 123);
        mahasiswaMap.put("Bambang", 124);
        mahasiswaMap.put("Cici", 125);
        mahasiswaMap.put("Didi", 126);

        // Mencetak nama dan nim mahasiswa menggunakan lambda
        mahasiswaMap.forEach((nama, nim) -> System.out.println("Nama: " + nama + "\t NIM: " + nim));
    }
}
