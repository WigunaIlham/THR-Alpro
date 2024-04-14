import java.security.SecureRandom;
import java.util.Scanner;

public class GeneratorKataSandiKeuangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan panjang kata sandi dalam angka : ");
        int panjang = input.nextInt();
        String karakter = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()-_=+";
        SecureRandom random = new SecureRandom();
        StringBuilder kataSandi = new StringBuilder(panjang);
        for (int i = 0; i < panjang; i++) {
            int acakIndex = random.nextInt(karakter.length());
            kataSandi.append(karakter.charAt(acakIndex));
        }
        System.out.println("Kata sandi yang dihasilkan: " + kataSandi.toString());
        input.close();
    }
}

