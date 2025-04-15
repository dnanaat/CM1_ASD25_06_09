public class Barang {
    String kodeBarang;
    String nama;
    String kategori;
    int stock;
    int harga;

    Barang(){

    }

    Barang(String kodeBarang, String nama, String kategori, int stock, int harga) {
        this.kodeBarang = kodeBarang;
        this.nama = nama;
        this.kategori = kategori;
        this.stock = stock;
        this.harga= harga;
    }

    void tampilDataBarang(){
        System.out.printf("%-20s %-20s %-20s %-20s %-20s\n", kodeBarang, nama, kategori, stock, harga);
    }
}
