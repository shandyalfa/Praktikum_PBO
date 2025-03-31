import java.util.ArrayList;

public class ManajemenProduk {
    private ArrayList<Produk> daftarProduk;

    // Kontruktor
    public ManajemenProduk() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(String kode, String nama, double harga) {
        daftarProduk.add(new Produk(kode, nama, harga));
        System.out.println("Batik berhasil ditambahkan.");
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

    // Metode protected untuk demonstrasi
    protected void tampilkanDaftarProduk() {
        for (Produk p : daftarProduk) {
            System.out.println(p);
        }
    }

    // Metode default untuk demonstrasi
    void tambahProdukDefault(String kode, String nama, double harga) {
        daftarProduk.add(new Produk(kode, nama, harga));
        System.out.println("Batik berhasil ditambahkan (default).");
    }
}
