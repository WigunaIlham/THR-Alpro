import java.util.Scanner;

public class KalkulatorCicilan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan jumlah pinjaman: ");
        double pinjaman = input.nextDouble();
        System.out.print("Masukkan suku bunga tahunan (%): ");
        double sukuBunga = input.nextDouble() / 100;
        System.out.print("Masukkan jangka waktu pinjaman (tahun): ");
        double tahun = input.nextDouble();
        double cicilan = (pinjaman * sukuBunga + pinjaman) / (tahun * 12);
        System.out.println("Jumlah cicilan bulanan: " + cicilan);
        input.close();
    }
}

