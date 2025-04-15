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

    void tampilDataTransaksi(){
        System.out.println("Kode Barang : " + kodeBarang);
        System.out.println("Nama        : " + nama);
        System.out.println("Kategori    : " + kategori);
        System.out.println("Stock       : " + stock);
        System.out.println("Harga       : " + harga);
    }
}
