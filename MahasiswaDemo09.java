import java.util.Scanner;

public class MahasiswaDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi09 mb = new MahasiswaBerprestasi09();
        
        System.out.println("Masukkan jumlah mahasiswa: ");
        int jumMhs = sc.nextInt();
        sc.nextLine(); 

        for (int i = 0; i < jumMhs; i++) {
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

        mb.tampil();

        System.out.println("\n=== Pencarian Data Mahasiswa ===");
        System.out.println("Masukkan IPK mahasiswa yang ingin dicari: ");
        System.out.print("Ipk : ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan Sequential Searching");
        double posisi = mb.sequentialSearching(cari);
        int pss = (int) posisi;
        mb.tampilPosisi(cari, pss);
        mb.tampilDataSearch(cari, pss);

        System.out.println("Pencarian data");
        System.out.println("Masukkan IPK mahasiswa yang ingin dicari: ");
        System.out.print("Ipk : ");
        double cari2 = sc.nextDouble();

        System.out.println("Menggunakan Binary Searching");
        double posisi2 = mb.findBinarySearch(cari2, 0, jumMhs - 1);
        int pss2 = (int) posisi2;
        mb.tampilPosisi(cari, pss2);
        mb.tampilDataSearch(cari, pss2);

        sc.close();
    }
}