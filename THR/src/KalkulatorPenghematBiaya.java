import java.util.Scanner;

public class KalkulatorPenghematBiaya {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan biaya yang ingin Anda hemat: ");
        double biaya = input.nextDouble();
        System.out.print("Masukkan jumlah bulan penghematan: ");
        int bulan = input.nextInt();
        double penghematanPerBulan = biaya / bulan;
        System.out.println("Anda perlu menghemat " + penghematanPerBulan + " setiap bulan.");
        input.close();
    }
}

