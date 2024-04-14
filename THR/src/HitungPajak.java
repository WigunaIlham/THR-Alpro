import java.util.Scanner;

public class HitungPajak {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan pendapatan tahunan Anda: ");
        double pendapatanTahunan = input.nextDouble();
        System.out.print("Masukkan tarif pajak penghasilan Anda (sebagai persentase): ");
        double tarifPajak = input.nextDouble() / 100;

        double pajak = pendapatanTahunan * tarifPajak;
        System.out.println("Jumlah pajak penghasilan Anda: " + pajak);

        input.close();
    }
}

