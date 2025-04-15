public class TransaksiPembelian {
    String kodeTransaksi;
    String namaPembeli;
    String tanggalPembelian;
    int qty;
    Barang brg;

    public TransaksiPembelian(String kodeTransaksi, String namaPembeli, String tanggalPembelian, int qty, Barang brg) {
        this.kodeTransaksi = kodeTransaksi;
        this.namaPembeli = namaPembeli;
        this.tanggalPembelian = tanggalPembelian;
        this.qty = qty;
        this.brg = brg;

    }

    void tampilDataTransaksi(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s %-20s\n", kodeTransaksi, namaPembeli, tanggalPembelian, brg.nama, qty, brg.harga);
    }
}
