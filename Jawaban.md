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

Jawaban Pertanyaan (5.3.4)
Pertanyaan 1 — Perulangan dalam bubbleSort()
javafor (int i=0; i<listMhs.length-1; i++){
    for (int j=1; j<listMhs.length-i; j++){
a. Mengapa syarat perulangan i adalah i < listMhs.length-1 ?
Karena perulangan i mewakili jumlah tahap bubble sort yang diperlukan. Untuk n data, cukup dilakukan n-1 tahap — pada tahap terakhir, elemen yang tersisa sudah pasti sudah berada di posisi yang benar tanpa perlu dibandingkan lagi. Jika syaratnya i < listMhs.length (tanpa -1), maka terjadi satu tahap yang tidak berguna dan sia-sia.

b. Mengapa syarat perulangan j adalah j < listMhs.length-i ?
Karena setiap selesai satu tahap (i), elemen terbesar sudah "menggelembung" ke posisi paling akhir dan sudah pasti terurut, sehingga tidak perlu dibandingkan lagi. Dengan mengurangi i pada batas atas j, perulangan dalam semakin pendek di setiap tahap, sehingga program lebih efisien dan tidak membandingkan elemen yang sudah terurut.

c. Jika data = 50, berapakali perulangan i berlangsung? Ada berapa Tahap?
Perulangan i berlangsung: 49 kali (listMhs.length - 1 = 50 - 1 = 49)
Jumlah Tahap bubble sort yang ditempuh: 49 Tahap
Setiap satu iterasi i = satu Tahap bubble sort, sehingga jumlah iterasi = jumlah tahap.

Pertanyaan 2 — Modifikasi Input Dinamis dari Keyboard
javaimport java.util.Scanner;
public class MahasiswaDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi mb = new MahasiswaBerprestasi();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); // flush

        for (int i = 0; i < n; i++) {
            System.out.println("--- Data Mahasiswa ke-" + (i + 1) + " ---");
            System.out.print("NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); // flush

            mb.tambah(new Mahasiswa(nim, nama, kelas, ipk));
        }

        System.out.println("\n====== Data Sebelum Diurutkan ======");
        mb.tampil();

        mb.bubbleSort();

        System.out.println("====== Data Setelah Bubble Sort ======");
        mb.tampil();

        sc.close();
    }
}

Jawaban Pertanyaan (5.3.7)
1. Proses Mencari Indeks Minimum
javaint idxMin = i;
for (int j = i + 1; j < listMhs.length; j++) {
    if (listMhs[j].ipk < listMhs[idxMin].ipk) {
        idxMin = j;
    }
}
Proses ini berfungsi untuk mencari posisi (indeks) elemen dengan nilai IPK terkecil dari posisi i hingga akhir array. Variabel idxMin awalnya diasumsikan berada di posisi i, kemudian dibandingkan satu per satu dengan elemen berikutnya. Jika ditemukan elemen yang IPK-nya lebih kecil, maka idxMin diperbarui ke indeks tersebut.
2. Proses Penukaran (Swap)
javaMahasiswa tmp = listMhs[i];
listMhs[i] = listMhs[idxMin];
listMhs[idxMin] = tmp;
Setelah indeks minimum ditemukan, proses ini berfungsi untuk menukar posisi elemen terkecil (listMhs[idxMin]) dengan elemen pada posisi i (listMhs[i]). Variabel tmp digunakan sebagai tempat penyimpanan sementara agar data tidak hilang saat penukaran berlangsung.