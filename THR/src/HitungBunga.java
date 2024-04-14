import java.util.Scanner;

public class HitungBunga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.print("Masukkan saldo tabungan: ");
            double saldo = input.nextDouble();
            System.out.print("Masukkan suku bunga (%): ");
            double sukuBunga = input.nextDouble() / 100;

            double bunga = saldo * sukuBunga;
            System.out.println("Bunga yang Anda dapatkan: " + bunga);

            System.out.print("Apakah Anda ingin menghitung bunga tabungan lagi? (y/n): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih!");
        input.close();
    }
}
