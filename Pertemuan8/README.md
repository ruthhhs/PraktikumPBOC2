## Konsep Generik

**Generik** adalah konsep dimana beberapa tipe data tidak perlu didefinisikan secara terpisah pisah untuk bisa memiliki perilaku tertentu. Generik bisa diterapkan ke class,method, dan larik.

Generik bisa diartikan sebagai *kebalikan inheritance*. Inheritance mewarisi perilaku yang sama ke banyak class anaknya, sedangkan generik menampung perilaku yang berbeda-beda itu ke suatu kelas saja.

### Contoh penggunaan generik yaitu:

Class `Datum<T>` yang bisa menyimpan data apa saja sesuai tipe data `T`.

T ini bisa di isi apa saja, mulai dari `integer`, `String`, sampai class tertentu (misalnya dalam folder ini `Anabul`, beserta turunannya)

Kemudian Datum<T> bisa disimpan ke dalam array (larik) bernama `Data<T>[]`.

