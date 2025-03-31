public class Produk {
    private String kode;
    private String nama;
    private double harga;

    // Constructor
    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    // Getter
    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Setter
    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    // Menampilkan informasi produk
    @Override
    public String toString() {
        return "Kode: " + kode + ", Nama: " + nama + ", Harga: " + harga;
    }
}
