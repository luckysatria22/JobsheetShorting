import java.util.Scanner;

public class DosenDemo09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen09 dd = new DataDosen09();
        int pilihan;

        do {
            System.out.println("\n====== MENU DATA DOSEN ======");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Usia Termuda - Tertua)");
            System.out.println("4. Sorting DSC (Usia Tertua - Termuda)");
            System.out.println("5. Insertion Sort");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu : ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Kode Dosen     : ");
                    String kode = sc.nextLine();
                    System.out.print("Nama Dosen     : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L/P) : ");
                    String jk = sc.nextLine();
                    boolean jenisKelamin = jk.equalsIgnoreCase("L");
                    System.out.print("Usia           : ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    dd.tambah(new Dosen09(kode, nama, jenisKelamin, usia));
                    System.out.println("Data dosen berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n====== DATA DOSEN ======");
                    dd.tampil();
                    break;

                case 3:
                    dd.sortingASC();
                    System.out.println("Data berhasil diurutkan ASC (termuda ke tertua).");
                    dd.tampil();
                    break;

                case 4:
                    dd.sortingDSC();
                    System.out.println("Data berhasil diurutkan DSC (tertua ke termuda).");
                    dd.tampil();
                    break;

                case 5:
                    dd.insertionSort();
                    System.out.println("Data berhasil diurutkan dengan Insertion Sort (ASC).");
                    dd.tampil();
                    break;

                case 0:
                    System.out.println("Program selesai. Terima kasih!");
                    break;

                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }

        } while (pilihan != 0);

        sc.close();
    }
}