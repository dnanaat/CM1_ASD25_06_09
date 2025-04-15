import java.util.Scanner;
public class MainSistemProject {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        Barang brg1 = new Barang("Br01", "Leo Keripik", "Makanan", 10, 1000);
        Barang brg2 = new Barang("Br02", "You C1000 Botol", "Minuman", 10, 7000);
        Barang brg3 = new Barang("Br03", "Teh Pucuk Botol", "Minuman", 10, 4000);
        Barang brg4 = new Barang("Br04", "Rinso Cair", "Sabun", 10, 7000);
        Barang brg5 = new Barang("Br05", "Mama Lemon Cair", "Sabun", 10, 1000);

        TransaksiPembelian tr1 = new TransaksiPembelian("Tr001", "Santi", "21-04-2024", 1, brg1);
        TransaksiPembelian tr2 = new TransaksiPembelian("Tr002", "Vani", "21-04-2024", 1, brg2);
        TransaksiPembelian tr3 = new TransaksiPembelian("Tr003", "Siska", "21-04-2024", 1, brg3);
        TransaksiPembelian tr4 = new TransaksiPembelian("Tr004", "MeiMei", "21-04-2024", 1, brg4);
        TransaksiPembelian tr5 = new TransaksiPembelian("Tr005", "Ihsan", "21-04-2024", 1, brg5);

        ServiceClass serviceClass = new ServiceClass(5);
        serviceClass.tambahDataTransaksi(tr1);
        serviceClass.tambahDataTransaksi(tr2);
        serviceClass.tambahDataTransaksi(tr3);
        serviceClass.tambahDataTransaksi(tr4);
        serviceClass.tambahDataTransaksi(tr5);

        while (true) {
            System.out.println("============== TOKO Manasuka ==============");
            System.out.println("BANK MENU : ");
            System.out.println("1. Data Barang");
            System.out.println("2. Data Transaksi");
            System.out.println("3. Pencarian Data");
            System.out.println("4. Pengurutan Data");
            System.out.println("5. Exit");
            System.out.print("Masukkan pilihan menu : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 1) {
                serviceClass.tampilBarang();
            }

            else if (menu == 2) {
                serviceClass.tampilTransaksi();
            }

            else if (menu == 3) {
                serviceClass.cariBarangNama(sc);
            }

            else if (menu == 4) {
                serviceClass.urutkanBarangBerdasarkanNama();
            }

            else if (menu == 5) {
                break;
            }

            else {
                System.out.println("Pilihan menu tidak tersedia!\n");
            }

        }

    }
}
