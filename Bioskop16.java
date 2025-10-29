import java.util.Scanner;

public class Bioskop16 {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    final double hargaTiket = 50000;
    int tiketTerjual = 0;
    double totalPendapatan = 0;

    while (true) {
        System.out.print("Masukan jumlah tiket (0 untuk membatalkan): ");
        int jumlahTiket = sc.nextInt();

        if (jumlahTiket < 0) {
            System.out.println("Jumlah tiket tidak valid, Silahkan masukkan ulang.\n");
            continue;
        }
        
        if (jumlahTiket == 0) {
            System.out.println("\nProgram selesai");
            System.out.println("Tiket terjual sehari " + tiketTerjual);
            System.out.println("Pendapatan sehari: Rp " + totalPendapatan);
            break;
        }

        double totalHarga = hargaTiket * jumlahTiket;

       if (jumlahTiket > 10) {
            totalHarga -= totalHarga * 0.15; 
            System.out.println("Diskon 15% diterapkan!");
        } else if (jumlahTiket > 4) {
            totalHarga -= totalHarga * 0.10; 
            System.out.println("Diskon 10% diterapkan!");
            
        }


        System.out.println("Total harga yang harus dibayar: Rp " + totalHarga + "\n");

            totalPendapatan += totalHarga;
            tiketTerjual += jumlahTiket;
        }

        sc.close();
    }
}
