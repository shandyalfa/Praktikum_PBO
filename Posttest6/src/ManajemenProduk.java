import java.util.ArrayList;

class ManajemenProduk {
    private ArrayList<Produk> daftarProduk;

    public ManajemenProduk() {
        daftarProduk = new ArrayList<>();
    }

    public void tambahProduk(Produk produk) {
        try {
            if (produk == null) {
                throw new IllegalArgumentException("Produk tidak boleh null.");
            }
            daftarProduk.add(produk);
            System.out.println("Produk berhasil ditambahkan: " + produk);
        } catch (IllegalArgumentException e) {
            System.out.println("Error saat menambahkan produk: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Kesalahan tidak terduga: " + e.getMessage());
        }
    }

    public void tampilkanProduk() {
        try {
            if (daftarProduk.isEmpty()) {
                System.out.println("Tidak ada produk.");
                return;
            }
            for (Produk p : daftarProduk) {
                System.out.println(p);
            }
        } catch (Exception e) {
            System.out.println("Gagal menampilkan produk: " + e.getMessage());
        }
    }

    public boolean updateProduk(String kode, String namaBaru, double hargaBaru) {
        try {
            if (kode == null || kode.isEmpty()) {
                throw new IllegalArgumentException("Kode produk tidak boleh kosong.");
            }
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
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Kesalahan saat update: " + e.getMessage());
            return false;
        }
    }

    public boolean hapusProduk(String kode) {
        try {
            if (kode == null || kode.isEmpty()) {
                throw new IllegalArgumentException("Kode produk tidak boleh kosong.");
            }
            for (Produk p : daftarProduk) {
                if (p.getKode().equals(kode)) {
                    daftarProduk.remove(p);
                    System.out.println("Produk berhasil dihapus.");
                    return true;
                }
            }
            System.out.println("Produk tidak ditemukan.");
            return false;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        } catch (Exception e) {
            System.out.println("Kesalahan saat menghapus produk: " + e.getMessage());
            return false;
        }
    }
}
