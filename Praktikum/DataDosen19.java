public class DataDosen19 {
    Dosen19 dataDosen[] = new Dosen19[10];
    int idx;

    void tambah(Dosen19 dsn) {
        if (idx < dataDosen.length) {
            dataDosen[idx] = dsn;
            idx++;
        } else {
            System.out.println("data sudah penuh");
        }
    }

    void tampil() {
        for (Dosen19 dsn : dataDosen) {
            dsn.tampil();
            System.out.println("-------------------------------");
        }
    }

    void sortingASC(){
        for (int i = 0; i < dataDosen.length - 1; i++) {
            for (int j = 1; j < dataDosen.length - i; j++) {
                if (dataDosen[j].usia < dataDosen[j - 1].usia) {
                    Dosen19 tmp = dataDosen[j];
                    dataDosen[j] = dataDosen[j - 1];
                    dataDosen[j - 1] = tmp;
                }
            }
        }
    }

    void sortingDSC(){
        for (int i = 0; i < dataDosen.length; i++) {
            int idxMin = i;
            for (int j = i + 1; j < dataDosen.length; j++) {
                if (dataDosen[j].usia > dataDosen[idxMin].usia) {
                    idxMin = j;
                }
            }
            Dosen19 tmp = dataDosen[idxMin];
            dataDosen [idxMin] = dataDosen[i];
            dataDosen[i] = tmp;
        }
    }
}