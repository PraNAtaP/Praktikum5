import java.util.Scanner;

public class MahasiswaDemo19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        MahasiswaBerprestasi19 list = new MahasiswaBerprestasi19();

        for (int i = 0; i < 5; i++) {
            System.out.println("Input data mahasiswa ke-" + (i + 1));
            System.out.print("Masukkan NIM   : ");
            String nim = sc.nextLine();
            System.out.print("Masukkan Nama  : ");
            String nama = sc.nextLine();
            System.out.print("Masukkan Kelas : ");
            String kelas = sc.nextLine();
            System.out.print("Masukkan IPK   : ");
            double ipk = sc.nextDouble();
            sc.nextLine(); 

            Mahasiswa19 m = new Mahasiswa19(nim, nama, kelas, ipk);
            list.tambah(m);
            System.out.println();
        }

        System.out.println("Data Mahasiswa sebelum Sorting : ");
        list.tampil();

        System.out.println("Data yang sudah terurut menggunakan SELECTION SORT (ASC) : ");
        list.selectionSort();
        list.tampil();

        sc.close();
    }
}
