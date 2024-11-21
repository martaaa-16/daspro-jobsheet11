import java.util.Scanner;

public class Tugas215 {
    public static void main(String[] args) {
        int[][] dataPenjualan = {
            {20, 20, 25, 20, 10, 60, 10},  // Kopi
            {30, 80, 40, 10, 15, 20, 25},  // Teh
            {5, 9, 20, 25, 10, 5, 45},     // Es Degan
            {50, 8, 17, 18, 30, 6, 5},     // Roti Bakar
            {15, 10, 16, 15, 10, 10, 55}   // Gorengan
        };

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n============ Menu Cafe ============");
            System.out.println("1. Input Data Penjualan");
            System.out.println("2. Seluruh Data Penjualan");
            System.out.println("3. Menu dengan Penjualan Tertinggi");
            System.out.println("4. Rata-rata Penjualan Setiap Menu");
            System.out.println("5. Selesai");
            System.out.print("Pilih 1 opsi: ");
            int pilih = sc.nextInt();

            switch (pilih) {
                case 1:
                    inputDataPenjualan(dataPenjualan, sc);
                    break;
                case 2:
                    seluruhDataPenjualan(dataPenjualan);
                    break;
                case 3:
                    menuPenjualanTertinggi(dataPenjualan);
                    break;
                case 4:
                    rata2PenjualanTiapMenu(dataPenjualan);
                    break;
                case 5:
                    System.out.println("Selesai...");
                    return;
                default:
                    System.out.println("Pilihan tidak valid. Coba ulangi lagi!");
            }
        }
    }

    // Fungsi untuk input data penjualan
    public static void inputDataPenjualan(int[][] dataPenjualan, Scanner sc) {
        System.out.println("Input Data Penjualan:");
        for (int i = 0; i < dataPenjualan.length; i++) {
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print("Masukkan penjualan untuk menu " + (i + 1) + ", hari ke-" + (j + 1) + ": ");
                dataPenjualan[i][j] = sc.nextInt();
            }
        }
    }

    // Fungsi untuk menampilkan seluruh data penjualan
    public static void seluruhDataPenjualan(int[][] dataPenjualan) {
        System.out.println("Data Penjualan:");
        for (int i = 0; i < dataPenjualan.length; i++) {
            System.out.print("Menu " + (i + 1) + ": ");
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                System.out.print(dataPenjualan[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Fungsi untuk menampilkan Menu yang memiliki penjualan tertinggi
    public static void menuPenjualanTertinggi(int[][] dataPenjualan) {
        int maxPenjualan = 0;
        int indeksMenu = 0;

        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                indeksMenu = i;
            }
        }

        System.out.println("Menu dengan penjualan tertinggi adalah " + (indeksMenu + 1) + " dengan total penjualan " + maxPenjualan);
    }

    // Fungsi untuk menampilkan rata-rata penjualan untuk setiap menu
    public static void rata2PenjualanTiapMenu(int[][] dataPenjualan) {
        System.out.println("Rata-rata penjualan untuk tiap menu:");
        for (int i = 0; i < dataPenjualan.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < dataPenjualan[i].length; j++) {
                totalPenjualan += dataPenjualan[i][j];
            }
            double rata2 = (double) totalPenjualan / dataPenjualan[i].length;
            System.out.println("Menu " + (i + 1) + ": " + rata2);
        }
    }
}       