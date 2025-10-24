import java.util.Scanner;

public class KafeDoWhile16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int kopi, teh, roti, totalHarga, hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000;

        do {
            System.out.print("Masukan nama pelanggan (ketik 'batal' untuk keluar): ");
            String nama = sc.nextLine();
            
            if (nama.equalsIgnoreCase("batal")) {
                System.out.println("Terima kasih! transaksi selesai.");
                break;
            }

            System.out.print("Jumlah kopi: ");
            kopi = sc.nextInt();

            System.out.print("Jumlah teh: ");
            teh = sc.nextInt();

            System.out.print("Jumlah roti: ");
            roti = sc.nextInt();

            totalHarga = (kopi * hargaKopi) + (teh * hargaTeh) + (roti * hargaRoti);
            System.out.println("Total harga untuk " + nama + " adalah: Rp " + totalHarga);
            sc.nextLine(); // Clear the newline character
        } while (true);

        sc.close();
    }
}