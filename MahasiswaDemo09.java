import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi09 mb = new MahasiswaBerprestasi09();

        System.out.print("Masukkan jumlah mahasiswa: ");
        int n = sc.nextInt();
        sc.nextLine(); 

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
            sc.nextLine(); 

            mb.tambah(new Mahasiswa09(nim, nama, kelas, ipk));
        }

        System.out.println("\n====== Data Sebelum Diurutkan ======");
        mb.tampil();

        mb.bubbleSort();
        System.out.println("====== Data Setelah Bubble Sort ======");
        mb.tampil();

        mb.selectionSort();
        System.out.println("====== Data Setelah Selection Sort ======");
        mb.tampil();

        mb.insertionSort();
        System.out.println("====== Data Setelah Insertion Sort ======");
        mb.tampil();

        sc.close();
    }
}