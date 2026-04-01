public class SortingMain09 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting dataurut1 = new Sorting(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan : ");
        dataurut1.tampil();

        int b[] = {30, 20, 2, 8,14};
        Sorting dataurut2 = new Sorting(b, b.length);
        System.out.println("Data awal 2");
        dataurut2.tampil();
        dataurut2.SelectionSort();
        System.out.println("Data setelah diurutkan : ");
        dataurut2.tampil();

        int c[] = {40, 10,4, 9, 3};
        Sorting dataurut3 = new Sorting(c, c.length);
        System.out.println("Data awal 3");
        dataurut3.tampil();
        dataurut3.insertionSort();
        System.out.println("Data setelah diurutkan : ");
        dataurut3.tampil();
    }
}
