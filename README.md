2.1.3 Pertanyaan

1. Sebutkan dan tunjukkan masing-masing komponen perulangan FOR pada kode program
Percobaan 1!

2. Mengapa variabel tertinggi diinisialisasi 0 dan terendah diinisialisasi 100? Apa yang
terjadi jika variabel tertinggi diinisialisasi 100 dan terendah diinisialisasi 0?

3. Jelaskan fungsi dan alur kerja dari potongan kode berikut!

4. Modifikasi kode program sehingga terdapat perhitungan untuk menentukan berapa
mahasiswa yang lulus dan yang tidak lulus berdasarkan batas kelulusan (nilai minimal 60).
Tampilkan jumlah mahasiswa lulus dan tidak lulus setelah menampilkan nilai tertinggi
dan terendah!

Jawaban :

1. int i = 0, i < 10, i++ 
    Inisialisasi: int i = 1 berfungsi untuk menentukan nilai awal variabel penghitung.
    Kondisi: i <= 10 berfungsi untuk menentukan batas perulangan agar berjalan sebanyak 10 kali.
    Increment: i++ berfungsi untuk menambah nilai i setiap kali satu perulangan selesai.

2. Variabel tertinggi diinisialisasi dengan 0 karena tidak ada nilai mahasiswa yang lebih rendah dari 0. Dengan begitu, nilai pertama yang dimasukkan akan langsung menjadi nilai tertinggi. Sedangkan variabel terendah diinisialisasi 100 karena tidak ada nilai yang lebih tinggi dari 100, sehingga nilai pertama yang dimasukkan akan langsung menjadi nilai terendah.
Jika dibalik menjadi tertinggi = 100 dan terendah = 0 maka hasilnya salah, karena nilai tertinggi akan selalu 100 dan nilai terendah akan selalu 0 meskipun input berbeda.

3. Potongan kode ini digunakan untuk membaca nilai mahasiswa dan membandingkannya dengan nilai tertinggi dan terendah yang sudah tersimpan.
Jika nilai yang baru dimasukkan lebih besar dari nilai tertinggi sebelumnya, maka nilai tersebut disimpan sebagai nilai tertinggi baru. Sebaliknya, jika lebih kecil dari nilai terendah, maka akan menjadi nilai terendah baru.

4. done


2.2.3 Pertanyaan

1. Pada potongan kode berikut, tentukan maksud dan kegunaan dari sintaks berikut:
a. nilai < 0 || nilai > 100
b. continue

2. Mengapa sintaks i++ dituliskan di akhir perulangan WHILE? Apa yang terjadi jika posisinya
dituliskan di awal perulangan WHILE?

3. Apabila jumlah mahasiswa yang dimasukkan adalah 19, berapa kali perulangan WHILE
akan berjalan?

4. Modifikasi kode program sehingga apabila terdapat mahasiswa yang mendapat nilai A,
program menampilkan pesan tambahan "Bagus, pertahankan nilainya"!

5. Commit dan push kode program ke Github

Jawaban :
1.      a. nilai < 0 || nilai > 100
    Mengecek apakah nilai di luar rentang 0–100.
    Kalau benar, berarti nilai tidak valid.
        b. continue
    Melewati sisa perintah di dalam loop dan lanjut ke iterasi berikutnya, supaya user bisa input nilai lagi tanpa menaikkan i.a. nilai < 0 || nilai > 100

2. Karena i++ harus dijalankan setelah input valid selesai.
Kalau ditulis di awal, i akan naik duluan meskipun nilai belum valid, jadi jumlah mahasiswa yang diproses jadi kurang dari seharusnya.

3. 19 kali, karena kondisi while (i < 19) akan mengulang selama i masih kurang dari 19.

4. done


2.3.3 Pertanyaan

1. Pada penggunaan DO-WHILE ini, apabila nama pelanggan yang dimasukkan pertama kali
adalah “batal”, maka berapa kali perulangan dilakukan?
2. Sebutkan kondisi berhenti yang digunakan pada perulangan DO-WHILE tersebut!
3. Apa fungsi dari penggunaan nilai true pada kondisi DO-WHILE?
4. Mengapa perulangan DO-WHILE tersebut tetap berjalan meskipun tidak ada komponen
inisialisasi dan update?

Jawaban :
1. Karena DO-WHILE selalu dijalankan minimal sekali sebelum pengecekan kondisi.
2. Kondisi berhenti terjadi saat nama pelanggan = "batal" dan perintah break dijalankan.
3. Nilai true membuat perulangan berjalan terus sampai dihentikan dengan break.
4. Karena kontrol perulangan diatur oleh kondisi true dan break, bukan variabel penghitung.