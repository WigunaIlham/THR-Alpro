import java.util.Scanner;

public class KalkulatorKeuntunganInvestasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.print("Masukkan jumlah investasi: ");
            int jumlahInvestasi = input.nextInt();
            double[] investasi = new double[jumlahInvestasi];
            System.out.print("Masukkan tingkat pengembalian investasi (%): ");
            double tingkatPengembalian = input.nextDouble() / 100;

            for (int i = 0; i < jumlahInvestasi; i++) {
                System.out.print("Investasi ke-" + (i + 1) + ": ");
                investasi[i] = input.nextDouble();
            }

            double totalKeuntungan = 0;
            for (double nilai : investasi) {
                totalKeuntungan += nilai * tingkatPengembalian;
            }

            System.out.println("Total keuntungan dari investasi: " + totalKeuntungan);

            System.out.print("Apakah Anda ingin menghitung keuntungan investasi lagi? (y/n): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih!");
        input.close();
    }
}

