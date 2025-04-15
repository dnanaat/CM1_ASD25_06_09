import java.util.Scanner;
public class ServiceClass {
<<<<<<< HEAD

    TransaksiPembelian[] trs;
    int index;

    public ServiceClass(int size) {
        trs = new TransaksiPembelian[size];
        index = 0;
    }

    void tampilBarang(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s", "Kode Barang", "Nama Barang", "Kategori", "Stock", "Harga");
        System.out.println();
        for (int i = 0; i < trs.length; i++) {
            trs[i].brg.tampilDataBarang();
        }
        System.out.println();
    }

    void tambahDataTransaksi(TransaksiPembelian trP) {
        if (index < trs.length) {
            trs[index] = trP;
            index++;
        } else {
            System.out.println("Data sudah penuh!");
        }
    }

    void tampilTransaksi() {
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s", "Kode Transaksi", "Nama Pembeli", "Tanggal Pembelian", "Nama Barang", "Kuantitas", "Harga");
        System.out.println();
        for (int i = 0; i < trs.length; i++) {
            trs[i].tampilDataTransaksi();
        }
        System.out.println();
    }

    void cariBarangNama(Scanner sc) {
        System.out.print("Cari nama barang : ");
        String carinama = sc.nextLine();

        boolean found = false;

        for (int i = 0; i < trs.length; i++) {
            if (carinama.equalsIgnoreCase(trs[i].brg.nama)) {
                System.out.printf("%-20s %-20s %-20s %-20s %-20s", "Kode Barang", "Nama Barang", "Kategori", "Stock", "Harga");
                System.out.println();
                trs[i].brg.tampilDataBarang();
                found = true;
            }
        }

        if (!found) {
            System.out.println("Barang '" + carinama + "' tidak ditemukan!");
        }
    }

    void urutkanBarangBerdasarkanNama() {
        for (int i = 0; i < trs.length - 1; i++) {
            int idxMin = i;

            for (int j = i + 1; j < trs.length; j++) {
                if (trs[j].brg.nama.compareTo(trs[idxMin].brg.nama) < 0) {
                    idxMin = j;
                }
            }
            TransaksiPembelian temp = trs[idxMin];
            trs[idxMin] = trs[i];
            trs[i] = temp;
=======
    TransaksiPembelian[] trs = new TransaksiPembelian[100];
    int index = 0;

    public void tambahDataTransaksi(TransaksiPembelian trP) {
        if (index < trs.length) {
            trs[index] = trP;
            index++;
        }
    }

    public void searching(String key) {
        boolean found = false;
        for (int i = 0; i < index; i++) {
            if (trs[i].brg.nama.equalsIgnoreCase(key)) {
                trs[i].tampilDataTransaksi();
                found = true;
            }
        }
        if (!found) {
            System.out.println("Barang dengan nama '" + key + "' tidak ditemukan.");
        }
    }

    public void sorting() {
        for (int i = 0; i < index; i++) {
            for (int j = i + 1; j < index; j++) {
                if (trs[i].brg.nama.compareToIgnoreCase(trs[j].brg.nama) > 0) {
                    TransaksiPembelian temp = trs[i];
                    trs[i] = trs[j];
                    trs[j] = temp;
                }
            }
>>>>>>> 6ae8a1719667fb3d835fc1f0734d42519465fe6e
        }
    }
}
