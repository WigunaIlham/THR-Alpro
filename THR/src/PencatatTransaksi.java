import java.util.Scanner;

public class PencatatTransaksi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            double saldo = 0;
            char opsi;
            do {
                System.out.print("Masukkan jumlah transaksi: ");
                double transaksi = input.nextDouble();
                saldo += transaksi;
                System.out.print("Apakah ingin memasukkan transaksi lagi? (y/n): ");
                opsi = input.next().charAt(0);
            } while (opsi == 'y' || opsi == 'Y');

            System.out.println("Saldo akhir: " + saldo);

            System.out.print("Apakah Anda ingin mencatat transaksi baru? (y/n): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih!");
        input.close();
    }
}

