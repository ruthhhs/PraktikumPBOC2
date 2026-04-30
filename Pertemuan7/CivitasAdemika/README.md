# Analisis Polimorfisme

**Polimorfisme** adalah adalah konsep dalam pemrograman berorientasi objek (OOP) yang memungkinkan suatu objek atau metode memiliki banyak bentuk tergantung konteks.

Polimorfisme terdiri dari:

## Coercion

**coercion** adalah keadaan dimana sistem bisa secara otomatis menangani perubahan tipe data. Kasus paling umum yaitu perubahan Integer ke String dan sebaliknya.

Dalam kasus CivitasAkademika, belum ada kode yang menampilkan konsep ini secara langsung. Tapi jika ingin dimimplementasikan, ada yang bisa dicoba. Misalnya di `setNim()` dan `setNip()` parameternya di input sebagai Integer, kemudian sistem secara otomatis mengubah ke String dengan method bawaan `toString()`

## Overloading

**overloading** adalah kondisi dimana bisa terdapat lebih dari satu method dengan nama yang sama, selama parameternya berbeda, biasanya tujuannya untuk keterbacaan kode dan reusable method.

Dalam kasus CivitasAkademika, contoh implementasi konsep overloading terdapat method konstruktor pada semua kelas. Karena masing masing konstruktor ada yang berparameter dan ada yang tidak. Contohnya konstruktor kelas Mahasiswa:

```
public Mahasiswa(String nim, String nama, Dosen doswal){
    this.nim = nim;
    this.setNama(nama);
    this.doswal = doswal;
}

public Mahasiswa(){
    this("-", "a/n", new Dosen());
}
```

Selain overloading, juga dikenal konsep **overriding**, yaitu  method dengan nama dan parameter sama pada kelas yang berbeda memiliki prosedur atau keluaran yang berbeda. Contohnya pada kelas CivitasAkademika, method `getNomor()` kemudian di-override di kelas Dosen dan Mahasiswa.

```
// CivitasAkademika
public abstract String getNomor();
```

```
// Dosen
@Override
public String getNomor(){
    return nip;
}
```

```
// Mahasiswa
@Override
public String getNomor(){
    return nim;
}
```

## Inclusion

**inclusion** adalah keadaan dimana suatu entitas/kelas digantikan entitas lain yang berada dalam keturunan yang sama atau masih satu keluarga, biasanya kuat ikatannya dengan **inheritance**.

Dalam kasus CivitasAkademika, contoh implementasi konsep inclusion sangat jelas terlihat pada kelas CivitasAkademika dengan anaknya yaitu Dosen dan Mahasiswa, karena inclusion sangat erat kaitannya dengan inheritance. Contohnya adalah pada pemanggilan method `registrasi()` dan `tampilPeserta()` di kelas Seminar. Dikedua method ini, baik Dosen dan Mahasiswa diperlakukan sebagai kelas yang sama walaupun keduanya berbeda.

```
public void tampilPeserta(){
    for (int i=0; i<banyakPeserta; i++){
        System.out.println( (i+1) +
                            ") No: " + peserta[i].getNomor() +
                            ", Nama: " + peserta[i].getNama()
                        );
    }
}
```

Kemudian dalam inclusion juga dikenal konsep **instanceof**, dimana kelas-kelas yang diaggap sama tadi dibedakan kembali. Contohnya pada kasus CivitasAkademika terdapat di methos `countMahasiswa()` pada kelas Seminar.

```
public int countMahasiswa(){
    int countMhs = 0;
    for (int i=0; i<banyakPeserta; i++){
        if (peserta[i] instanceof Mahasiswa){
            countMhs ++;
        }
    }
    return countMhs;
}
```