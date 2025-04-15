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

    void tampilDataTransaksi() {
        System.out.println("Kode Transaksi: " + kodeTransaksi);
        System.out.println("Nama Pembeli: " + namaPembeli);
        System.out.println("Tanggal Pembelian: " + tanggalPembelian);
        System.out.println("Jumlah: " + qty);
    }
}
