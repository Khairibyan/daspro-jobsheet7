import java.util.Scanner;

public class TarifParkir16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jenis, durasi;
        double bayar, totalHarian = 0;

        while (true) {
            System.out.print("Masukkan jenis kendaraan (1 : Mobil, 2 : Motor, 0 : Keluar): ");
            jenis = sc.nextInt();

            if (jenis == 0) {
                System.out.println("Total pendapatan parkir: Rp " + totalHarian);
                break;
            }
            if (jenis < 1 || jenis > 2) {
                System.out.println("Input tidak valid.");
                continue;
            }

            System.out.print("Masukkan durasi (jam): ");
            durasi = sc.nextInt();

            if (durasi > 5) {
                bayar = 12500;
            } else if (jenis == 1) {
                bayar = durasi * 3000;
            } else {
                bayar = durasi * 2000;
            }

            System.out.println("Biaya: Rp " + bayar);
            totalHarian += bayar;
        }

        sc.close();
    }
}
