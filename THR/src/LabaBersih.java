import java.util.Scanner;

public class LabaBersih {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.print("Masukkan pendapatan: ");
            double pendapatan = input.nextDouble();
            System.out.print("Masukkan biaya: ");
            double biaya = input.nextDouble();

            double labaBersih = pendapatan - biaya;
            System.out.println("Laba bersih: " + labaBersih);

            System.out.print("Apakah Anda ingin menghitung laba bersih lagi? (y/n): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih!");
        input.close();
    }
}

