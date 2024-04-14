import java.util.Scanner;

public class LabaRugiInvestasi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        char ulangi;
        do {
            System.out.print("Masukkan harga beli saham: ");
            double hargaBeli = input.nextDouble();
            System.out.print("Masukkan harga jual saham: ");
            double hargaJual = input.nextDouble();

            double labaRugi = hargaJual - hargaBeli;
            if (labaRugi > 0) {
                System.out.println("Anda mendapatkan laba sebesar: " + labaRugi);
            } else if (labaRugi < 0) {
                System.out.println("Anda mengalami rugi sebesar: " + labaRugi);
            } else {
                System.out.println("Anda tidak mendapatkan laba atau rugi.");
            }

            System.out.print("Apakah Anda ingin menghitung laba rugi lagi? (y/n): ");
            ulangi = input.next().charAt(0);
        } while (ulangi == 'y' || ulangi == 'Y');

        System.out.println("Terima kasih!");
        input.close();
    }
}

