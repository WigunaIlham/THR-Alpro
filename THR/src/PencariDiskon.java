import java.util.Scanner;

public class PencariDiskon {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga produk: ");
        double hargaProduk = input.nextDouble();
        System.out.print("Masukkan persentase diskon: ");
        double diskon = input.nextDouble();
        double hargaDiskon = hargaProduk * (1 - diskon / 100);
        System.out.println("Harga setelah diskon: " + hargaDiskon);
        input.close();
    }
}
