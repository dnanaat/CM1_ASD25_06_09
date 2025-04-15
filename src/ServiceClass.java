public class ServiceClass {
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
        }
    }
}
