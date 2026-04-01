public class SortingMain09 {
    public static void main(String[] args) {
        int a[] = {20, 10, 2, 7, 12};
        Sorting dataurut1 = new Sorting(a, a.length);
        System.out.println("Data awal 1");
        dataurut1.tampil();
        dataurut1.bubbleSort();
        System.out.println("Data setelah diurutkan : ");
        dataurut1.tampil();
    }
}
