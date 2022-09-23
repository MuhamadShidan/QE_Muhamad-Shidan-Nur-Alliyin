API Testing adalah tipe software testing yang memvalidasi API, terjadi pada Business Layer, Software Layer yang paling kritis karena menghubungkan Presentation Layer dan Database Layer. API Layer juga menjadi penghubung antara Unit Layer dan UI Layer. Unit Layer adalah sebuah fitur aplikasi yang belum dapat dilihat user, bekerja dengan cepat karena masih satu modul, tapi memiliki nilai bisnis yang rendah. UI Layer adalah tampilan aplikasi yang dapat dilihat user, bekerja dengan lebih lama dibandung Unit Layer karena kumpulan dari Unit Layer dan API Layer, tapi memiliki nilai bisnis yang tinggi.

Yang dilakukan API Testing :
- memverifikasi fungsionalitas dan mengekspos kegagalan.
- memverifikasi panggilan dengan dua atau lebih parameter pada URL.
- memverifikasi behavior API dari eksternal environment.
- memverifikasi sequence of API calls.
- memverifikasi return value berdasarkan condition input.
- memverikasi API tidak mengembalikan nilai apapun.
- memverifikasi API triggers some other event or calls another API.
- memverifikasi struktur data.
- memverifikasi status kode HTTP benar.
- memverifikasi response JSON.
- memverifikasi response header.
- memverifikasi basic performance sanity.

Tujuan API Testing :
- menguji functionality, reliability, performance, and security dari programming interfaces.
- mencegah ditemukannya bug dari expected behavior software yang menyimpang.
- memastikan sesuai dengan spesifikasi requirement.
- mencegah regresi antara code merges and releases.
- continuous testing memastikan dapat diakses ketika software release.

Mengapa harus melakukan API testing?
- Language independent : independen / tidak terikat pada Bahasa pemrograman yang digunakan untuk mengembangkan aplikasi, karena menguji pertukaran data melalui XML dan JSON.
- GUI independent : independen / tidak terikat pada Graphical User Interface (GUI) atau yang sering disebut interface, karena menguji fungsionalitas dan seberapa kuat dari beban yang diberikan.
- Improved test coverage : meningkatkan test coverage dengan automation test termasuk positive test & negative test.
- Enables faster release : memungkinkan release aplikasi lebih cepat.

Bagaimana melakukan API testing?
- API specification review : mendokumentasikan requirement API testing yang dapat menjawab :

· Apa sajakah fitur API?

- Setting up test environment : menyiapkan set parameter yang diperlukan, seperti konfigurasi database dan server untuk requirement aplikasi.
- Combining application data : menggabungkan data aplikasi dengan test API.
- Deciding what API for : menentukan tipe API testing yang akan dilakukan.
- Test execution & reporting : melakukan pengujian, mendokumentasikan pengujian dan hasil pengujian.

Tipe API Testing :
- Functionality Testing : menguji functionalitas API .
- Validation Testing : menguji API dari verifikasi aspek produk, behaviour, dan efisiensi.
- Reliability Testing : menguji koneksi dan hasil API yang konsisten.
- Load Testing : menguji respon API dibawah beban kondisi normal dan tinggi (bagian dari Performance Testing).
- Exploratory Testing : menguji API tidak sesuai rules aplikasi.
- Security Testing : menguji API dari external threats.
- Adhoc Testing : menguji API tanpa rencana dan dokumentasi.
- Usability Testing : menguji API dari segi user friendly.
- Dynamic Testing : menguji API dari analisis behaviour code, melibatkan nilai input dan output. 

Bagian dari validasi dan verifikasi, Tekniknya terdiri dari Functional Testing dan Nonfunctional Testing. Levelnya terdiri dari Unit Testing, Integration Testing, System Testing, Dan Acceptance Testing.
- Performance Testing : menguji API dari beban dan kecepatan internet.
- Data Driven Testing : menguji API dari data output yang dihasilkan.
- Regression Testing : menguji API dari keseluruhan aplikasi terhadap perubahan code aplikasi.
- UI Testing : menguji API dari tampilannya.
- Penetration Testing : menguji API dari perspektif penyerang keamanan dan integritas system, aplikasi, jaringan, dan database. Termasuk teknik Black Box Testing.
- Fuzz Testing : menguji API dari skenario terburuk.
- End to end Testing : menguji API dari flow aplikasi dari awal hingga akhir apakah sudah sesuai ekspektasi.