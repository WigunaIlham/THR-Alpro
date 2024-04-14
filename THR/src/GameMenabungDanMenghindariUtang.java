import java.util.Scanner;

public class GameMenabungDanMenghindariUtang {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int skor = 0;

        System.out.println("Selamat datang di Game Menabung dan Menghindari Utang!");
        System.out.println("Tujuan Anda adalah untuk menabung sebanyak mungkin dan menghindari utang.");
        System.out.println("Anda akan diberikan pilihan untuk menabung atau mengambil utang.");

        for (int i = 1; i <= 5; i++) {
            System.out.println("\nHari ke-" + i + ":");
            System.out.println("Apakah Anda ingin menabung (1) atau mengambil utang (2)?");
            int pilihan = input.nextInt();

            if (pilihan == 1) {
                System.out.println("Anda berhasil menabung!");
                skor += 10;
            } else if (pilihan == 2) {
                System.out.println("Anda mengambil utang.");
                skor -= 20;
            } else {
                System.out.println("Pilihan tidak valid.");
            }
        }

        System.out.println("\nPermainan selesai!");
        System.out.println("Skor Anda: " + skor);

        if (skor >= 30) {
            System.out.println("Selamat! Anda berhasil menabung dan menghindari utang.");
        } else {
            System.out.println("Anda perlu memperbaiki kebiasaan keuangan Anda.");
        }

        input.close();
    }
}

