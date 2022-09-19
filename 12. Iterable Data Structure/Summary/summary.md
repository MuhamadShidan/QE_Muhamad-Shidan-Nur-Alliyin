Iterables / Bisa di iterasi
Objek yang bisa di iterasi adalah sebuah generalisasi dari sebuah array. Konsep itu membolehkan kita untuk membuat objek apapun yang bisa digunakan didalam perulangan for..of.

Tentu saja, Array bisa di iterasi. Tapi disana terdapat objek bawaan (built-in objek) lainnya, yang tentu saja bisa di iterasi. Contoh string juga bisa di iterasi.

Jika sebuah objek secara teknis bukan sebuah array, tapi representasi dari sebuah koleksi (list, set) dari sesuatu, lalu for..of adalah sintaks yang bagus untuk melakukan perulangan didalamnya, Jadi ayo kita lihat bagaimana cara membuat itu bekerja.

Symbol.iterator
Kita bisa dengan mudah mendapatkan konsep dari iterasi dengan membuatnya sendiri.

Untuk contoh, kita mempunyai sebuah objek yang bukanlah array, tapi cocok untuk for..of.

Seperti objek range yang merepresentasikan sebuah interval dari angka:

let range = {
  from: 1,
  to: 5
};

// Kita ingin membuat for..of untuk bisa digunakan:
// for(let num of range) ... num=1,2,3,4,5
Untuk bisa membuat range bisa diiterasi (dan membuat for..of bekerja) kita harus menambahkan sebuah metode kedalam objeknya bernama Symbol.iterator (Simbol built-in spesian yang hanya digunakan untuk hal itu).

Ketika for.of dimulai, itu akan memanggil metodenya sekali (atau error jika tidak ditemukan). Metodenya haruslah mengembalikan sebuah iterator – sebuah objek dengan metode next.
Selanjutnya, for..of bekerja hanya bila itu mengembalikan objek.
Ketika for..of menginginkan nilai selanjutnya, itu akan memanggil next() didalam objeknya.
Hasil dari next() harus mempunyai form {done: Boolean, value: any}, dimana done=true berarti iterasinya telah selesai, sebaliknya value adalah nilai selanjutnya.
Ini adalah implementasi penuh untuk range dengan catatan:

let range = {
  from: 1,
  to: 5
};

// 1. panggil for..of pertama kali untuk memanggil ini
range[Symbol.iterator] = function() {

  // ini akan mengembalikan objek iterator:
  // 2. Selanjutnya, for..of hanya bekerja dengan iterator ini, menanyakan nilai selanjutnya
  return {
    current: this.from,
    last: this.to,

    // 3. next() dipanggil untuk setiap iterasi oleh perulangan for..of
    next() {
      // 4. itu harus mengembalikan nilai sebagai sebuah objek {done:.., nilai:...}
      if (this.current <= this.last) {
        return { done: false, value: this.current++ };
      } else {
        return { done: true };
      }
    }
  };
};

// sekarang ini bekerja!
for (let num of range) {
  alert(num); // 1, lalu 2, 3, 4, 5
}
Perhatikan fitur utama dari iterables: pemisahan perhatian.

range sendiri tidak memiliki metode next().
Malah, objek lainnya, yang dipanggil “iterator” dibuat dengan memanggil ke range[Symbol.iterator](), dan next() miliknya menghasilkan nilai untuk diiterasi.
Jadi, objek iterator berbeda dari objek yang diiterasi.

Secara teknis, kita mungkin menyatukannya dan menggunakan range nya sendiri sebagai iterator untuk membuat kode lebih simpel.

Seperti ini:

let range = {
  from: 1,
  to: 5,

  [Symbol.iterator]() {
    this.current = this.from;
    return this;
  },

  next() {
    if (this.current <= this.to) {
      return { done: false, value: this.current++ };
    } else {
      return { done: true };
    }
  }
};

for (let num of range) {
  alert(num); // 1, lalu 2, 3, 4, 5
}
Sekarang range[Symbol.iterator]() mengembalikan objek rangenya sendiri: itu membutuhkan metode next() dan mengingat progress iterasi saat ini didalam this.current. Lebih pendek? Ya. Dan terkadang bagus juga.

Kekurangannya adalah sekarang menjadi mustahil untuk memiliki dua perulangan for..of yang berjalan didalam objeknya secara bersamaan: mereka akan membagi bagian-bagian iterasi, karena hanya terdapat satu iterator – objeknya sendiri. Tapi menggunakan dua for-of adalah hal yang jarang terjadi, bahkan didalam asinkron sekalipun.

Iterator tak terbatas/infinite iterator
Interator tak terbatas bisa dilakukan. Contoh, range menjadi tak terbatas terhadap range.to = Infinity. Atau kita bisa membuat objek yang bisa di iterasi dan menghasilkan rentetan tak terbatas dari angka yang acak. Juga bisa berguna.

Tidak ada batasan didalam next, itu bisa mengembalikan semakin banyak nilai, itu adalah hal yang normal.

Tentu saja, perulangan for..of didalam iterasi seperti itu takan ada habisnya. Tapi kita selalu bisa menghentikannya dengan menggunakan break.