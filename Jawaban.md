Jawaban Pertanyaan (5.2.5)
1. Jelaskan fungsi kode program Bubble Sort (perulangan bersarang):
Kode tersebut adalah inti dari algoritma Bubble Sort. Perulangan luar i mengontrol berapa kali "tahap" pengurutan dilakukan (sebanyak n-1 kali). Perulangan dalam j membandingkan dua elemen yang berdekatan (data[j] dan data[j+1]), jika elemen kiri lebih besar maka ditukar (swap) menggunakan variabel temp. Setiap tahap, elemen terbesar "menggelembung" ke posisi akhir, sehingga batas perulangan j dikurangi i agar tidak membandingkan elemen yang sudah terurut.
2. Kode yang merupakan algoritma pencarian nilai minimum pada Selection Sort:
int idxMin = i;
for (int j = i + 1; j < jmlDat; j++) {
    if (data[j] < data[idxMin]) {
        idxMin = j;
    }
}
Kode ini mencari indeks elemen terkecil dari posisi i hingga akhir array, lalu menukarnya ke posisi i.
3. Maksud kondisi perulangan while (j >= 0 && data[j] > temp) pada Insertion Sort:
Kondisi ini berarti: selama indeks j masih valid (≥ 0) dan elemen data[j] lebih besar dari nilai yang sedang disisipkan (temp), maka geser elemen data[j] ke kanan (data[j+1] = data[j]). Perulangan berhenti ketika posisi yang tepat untuk menyisipkan temp sudah ditemukan.
4. Tujuan dari perintah data[j + 1] = temp pada Insertion Sort:
Perintah ini berfungsi untuk menyisipkan nilai temp ke posisi yang tepat setelah perulangan while selesai. Setelah semua elemen yang lebih besar sudah digeser ke kanan, j+1 adalah posisi kosong yang sesuai untuk menempatkan nilai temp sehingga array tetap terurut.