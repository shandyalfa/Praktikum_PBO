// Kelas ManajemenProduk
import java.util.ArrayList;  // Tambahkan ini!
class ManajemenProduk {
    private ArrayList<Produk> daftarProduk;

    public ManajemenProduk() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        daftarProduk.add(produk);
        System.out.println("Produk berhasil ditambahkan: " + produk);
    }

    public void tampilkanProduk() {
        if (daftarProduk.isEmpty()) {
            System.out.println("Tidak ada produk.");
            return;
        }
        for (Produk p : daftarProduk) {
            System.out.println(p);
        }
    }

    public boolean updateProduk(String kode, String namaBaru, double hargaBaru) {
        for (Produk p : daftarProduk) {
            if (p.getKode().equals(kode)) {
                p.setNama(namaBaru);
                p.setHarga(hargaBaru);
                System.out.println("Produk berhasil diperbarui.");
                return true;
            }
        }
        System.out.println("Produk tidak ditemukan.");
        return false;
    }

    public boolean hapusProduk(String kode) {
        for (Produk p : daftarProduk) {
            if (p.getKode().equals(kode)) {
                daftarProduk.remove(p);
                System.out.println("Produk berhasil dihapus.");
                return true;
            }
        }
        System.out.println("Produk tidak ditemukan.");
        return false;
    }
}
