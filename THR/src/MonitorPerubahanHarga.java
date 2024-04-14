import java.util.Scanner;

public class MonitorPerubahanHarga {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan harga awal produk: ");
        double hargaAwal = input.nextDouble();
        System.out.print("Masukkan harga saat ini: ");
        double hargaSaatIni = input.nextDouble();
        double perubahan = ((hargaSaatIni - hargaAwal) / hargaAwal) * 100;
        System.out.println("Persentase perubahan harga: " + perubahan + "%");
        input.close();
    }
}

