Jawaban Pertanyaan 6.2.3 - Sequential Search

1. Jelaskan perbedaan method tampilDataSearch dan tampilPosisi pada class MahasiswaBerprestasi!
tampilPosisi hanya menampilkan posisi/indeks array tempat data ditemukan, contohnya "Data ditemukan pada indeks ke-2". Sedangkan tampilDataSearch menampilkan seluruh detail data mahasiswa yang ditemukan seperti NIM, Nama, Kelas, dan IPK. Jadi tampilPosisi menjawab "di mana" data berada, sementara tampilDataSearch menjawab "apa isi" data tersebut.

2. Jelaskan fungsi break pada kode program sequential search!
Perintah break berfungsi untuk menghentikan perulangan secara paksa begitu data yang dicari sudah ditemukan. Tanpa break, loop akan terus berjalan hingga elemen terakhir meskipun data sudah ketemu, sehingga terjadi pemborosan proses. Dengan break, pencarian langsung berhenti di elemen yang cocok sehingga lebih efisien.

3. Apa fungsi variabel pos atau indeks hasil pencarian dalam program sequential search?
Variabel pos berfungsi sebagai penanda posisi (indeks) di dalam array tempat data yang dicari ditemukan. Variabel ini digunakan untuk mengakses objek Mahasiswa pada indeks tersebut agar datanya bisa ditampilkan. Selain itu, pos juga berfungsi sebagai penanda bahwa data tidak ditemukan apabila nilainya tetap -1 setelah pencarian selesai.

4. Jika terdapat lebih dari satu data dengan nilai yang sama, hasil pencarian sequential search yang dibuat di atas akan menampilkan data ke berapa? Jelaskan.
Program akan menampilkan data yang pertama kali ditemukan, yaitu data dengan indeks terkecil (paling depan dalam array). Hal ini terjadi karena ketika data ditemukan, program langsung mengeksekusi break sehingga pencarian berhenti dan tidak melanjutkan ke elemen berikutnya meskipun ada nilai yang sama.

5. Berkaitan dengan pertanyaan nomor 2, apa yang terjadi jika perintah break dihapus dari kode?
Jika break dihapus, loop akan terus berjalan sampai elemen terakhir array meskipun data sudah ditemukan sebelumnya. Akibatnya, jika terdapat lebih dari satu data dengan nilai yang sama, nilai pos akan terus diperbarui ke indeks terakhir yang cocok, sehingga program akan menampilkan data yang terakhir ditemukan, bukan yang pertama. Proses pencarian juga menjadi tidak efisien karena tidak berhenti lebih awal.


Jawaban Pertanyaan 6.3.3 - Binary Search

1. Tunjukkan pada kode program yang mana proses divide dijalankan!
Proses divide dijalankan pada baris perhitungan nilai mid, yaitu:
mid = (left + right) / 2;
Baris ini membagi array menjadi dua bagian tengah, sehingga pencarian hanya dilakukan pada salah satu sisi (kiri atau kanan) dari titik tengah tersebut.

2. Tunjukkan pada kode program yang mana proses conquer dijalankan!
Proses conquer dijalankan pada bagian kondisi perbandingan setelah mid ditemukan, yaitu:
if (cari == listMhs[mid].ipk) maka pos = mid dan break, kemudian if (cari < listMhs[mid].ipk) maka right = mid - 1, dan if (cari > listMhs[mid].ipk) maka left = mid + 1.
Di sinilah masalah "diselesaikan" dengan menentukan apakah data ditemukan atau pencarian harus dilanjutkan ke sisi kiri atau kanan.

3. Apa fungsi left, right, dan mid?
left adalah batas indeks paling kiri (awal) dari bagian array yang sedang ditelusuri. right adalah batas indeks paling kanan (akhir) dari bagian array yang sedang ditelusuri. mid adalah indeks tengah yang dihitung dari left dan right, digunakan sebagai titik pembanding untuk menentukan apakah data ada di sisi kiri, kanan, atau tepat di posisi mid.

4. Jika data IPK yang dimasukkan tidak urut, apakah program masih dapat berjalan? Mengapa demikian?
Program tetap berjalan dan tidak akan error, namun hasil pencariannya bisa salah atau data tidak ditemukan meskipun sebenarnya ada. Hal ini karena binary search mengasumsikan data sudah dalam kondisi terurut (ascending/descending). Jika data tidak urut, logika perbandingan left dan right menjadi tidak valid sehingga pencarian bisa melompati elemen yang seharusnya diperiksa.

5. Jika IPK dimasukkan dari terbesar ke terkecil (3.8, 3.7, 3.5, 3.4, 3.2) dan yang dicari adalah 3.2, bagaimana hasilnya? Jika tidak sesuai, ubah kode agar sesuai!
Hasilnya tidak akan sesuai karena binary search default berasumsi data urut ascending. Ketika data descending, logika pergeseran left dan right menjadi terbalik sehingga data 3.2 tidak akan ditemukan. Untuk memperbaikinya, kondisi pergeseran pointer dibalik menjadi seperti berikut:
if (cari > listMhs[mid].ipk) maka right = mid - 1 dan if (cari < listMhs[mid].ipk) maka left = mid + 1.
Dengan begitu binary search dapat bekerja dengan benar pada data yang terurut descending.

6. Jelaskan bagaimana binary search menentukan bahwa data yang dicari tidak ditemukan di dalam array!
Binary search menentukan data tidak ditemukan ketika nilai left sudah lebih besar dari nilai right (left > right). Kondisi ini berarti seluruh bagian array sudah ditelusuri namun tidak ada elemen yang nilainya sama dengan data yang dicari. Pada saat itu loop while berhenti dan variabel pos tetap bernilai -1 (nilai awal), yang menjadi penanda bahwa data tidak ada dalam array.

7. Modifikasi program agar jumlah mahasiswa yang diinputkan sesuai dengan masukan dari keyboard!
Ubah deklarasi array pada class MahasiswaBerprestasi agar ukurannya dinamis, kemudian pada MahasiswaDemo tambahkan Scanner untuk membaca jumlah mahasiswa dari keyboard terlebih dahulu sebelum looping input data. Contohnya:
Scanner sc = new Scanner(System.in);
System.out.print("Masukkan jumlah mahasiswa: ");
int n = sc.nextInt();
MahasiswaBerprestasi mb = new MahasiswaBerprestasi(n);
Lalu pada konstruktor MahasiswaBerprestasi, inisialisasi array dengan ukuran n:
listMhs = new Mahasiswa[n];
Dengan begitu jumlah mahasiswa yang diinput tidak terbatas pada angka tetap, melainkan sesuai dengan yang diketikkan pengguna saat program berjalan.