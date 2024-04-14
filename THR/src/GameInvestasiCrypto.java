import java.util.Scanner;

public class GameInvestasiCrypto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int modal = 10000; // Modal awal
        int crypto = 0; // Jumlah crypto yang dimiliki
        int hargaCrypto = 100; // Harga crypto awal

        System.out.println("Selamat datang di Game Investasi Crypto!");
        System.out.println("Tujuan Anda adalah untuk menghasilkan keuntungan dari investasi crypto.");

        while (true) {
            System.out.println("\nHarga crypto saat ini: $" + hargaCrypto);
            System.out.println("Modal Anda: $" + modal);
            System.out.println("Jumlah crypto yang Anda miliki: " + crypto);

            System.out.println("\nApakah Anda ingin membeli crypto (1) atau menjual crypto (2)?");
            System.out.println("Tekan 0 untuk keluar dari game.");
            int pilihan = input.nextInt();

            if (pilihan == 0) {
                System.out.println("Permainan selesai!");
                break;
            } else if (pilihan == 1) {
                System.out.println("Masukkan jumlah crypto yang ingin Anda beli:");
                int jumlahBeli = input.nextInt();
                int totalBiaya = jumlahBeli * hargaCrypto;

                if (totalBiaya > modal) {
                    System.out.println("Maaf, Anda tidak memiliki cukup modal.");
                } else {
                    modal -= totalBiaya;
                    crypto += jumlahBeli;
                    System.out.println("Anda berhasil membeli " + jumlahBeli + " crypto.");
                }
            } else if (pilihan == 2) {
                System.out.println("Masukkan jumlah crypto yang ingin Anda jual:");
                int jumlahJual = input.nextInt();

                if (jumlahJual > crypto) {
                    System.out.println("Maaf, Anda tidak memiliki cukup crypto.");
                } else {
                    modal += jumlahJual * hargaCrypto;
                    crypto -= jumlahJual;
                    System.out.println("Anda berhasil menjual " + jumlahJual + " crypto.");
                }
            } else {
                System.out.println("Pilihan tidak valid.");
            }

            // Simulasi perubahan harga crypto secara acak
            hargaCrypto += (int) (Math.random() * 51) - 25; // Harga crypto berubah antara -25 hingga +25 setiap iterasi
        }

        input.close();
    }
}

