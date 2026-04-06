public class DataDosen09 {
    Dosen09[] dataDosen = new Dosen09[10];
    int idx = 0;

    // Tambah data dosen
    void tambah(Dosen09 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("Data dosen sudah penuh!");
        }
    }

    // Tampil semua data dosen
    void tampil() {
        if (idx == 0) {
            System.out.println("Belum ada data dosen.");
            return;
        }
        for (int i = 0; i < idx; i++) {
            dataDosen[i].tampil();
        }
    }

    // Sorting ASC berdasarkan usia (Bubble Sort)
    void sortingASC() {
        for (int i = 0; i < idx - 1; i++) {
            for (int j = 0; j < idx - i - 1; j++) {
                if (dataDosen[j].usia > dataDosen[j + 1].usia) {
                    Dosen09 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j + 1];
                    dataDosen[j + 1] = tmp;
                }
            }
        }
    }

    // Sorting DSC berdasarkan usia (Selection Sort)
    void sortingDSC() {
        for (int i = 0; i < idx - 1; i++) {
            int idxMax = i;
            for (int j = i + 1; j < idx; j++) {
                if (dataDosen[j].usia > dataDosen[idxMax].usia) {
                    idxMax = j;
                }
            }
            Dosen09 tmp = dataDosen[i];
            dataDosen[i] = dataDosen[idxMax];
            dataDosen[idxMax] = tmp;
        }
    }

    // Insertion Sort ASC berdasarkan usia
    void insertionSort() {
        for (int i = 1; i < idx; i++) {
            Dosen09 temp = dataDosen[i];
            int j = i - 1;
            while (j >= 0 && dataDosen[j].usia > temp.usia) {
                dataDosen[j + 1] = dataDosen[j];
                j--;
            }
            dataDosen[j + 1] = temp;
        }
    }
}