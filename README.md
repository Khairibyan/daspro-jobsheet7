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


