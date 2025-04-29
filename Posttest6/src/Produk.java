// Interface ProdukInterface
interface ProdukInterface {
    String informasiProduk();
    boolean validasiHarga(double harga);
}

// Abstract class Produk
abstract class Produk {
    private final String kode;
    private String nama;
    private double harga;

    // Static field (contoh penggunaan static)
    private static int jumlahProduk = 0;

    // Constructor lengkap
    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
        jumlahProduk++; // setiap produk baru, tambah jumlah
    }

    // Constructor dengan harga default 0
    public Produk(String kode, String nama) {
        this(kode, nama, 0.0);
    }

    // Static method
    public static int getJumlahProduk() {
        return jumlahProduk;
    }

    // Setter
    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    // Getter
    public final String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    // Abstract method
    public abstract String getDeskripsi();

    @Override
    public String toString() {
        return "Kode: " + kode + ", Nama: " + nama + ", Harga: " + harga;
    }
}

// Subclass BatikTulis
class BatikTulis extends Produk implements ProdukInterface {
    private String teknik;

    public BatikTulis(String kode, String nama, double harga, String teknik) {
        super(kode, nama, harga);
        this.teknik = teknik;
    }

    public BatikTulis(String kode, String nama, String teknik) {
        super(kode, nama);
        this.teknik = teknik;
    }

    public String getTeknik() {
        return teknik;
    }

    @Override
    public String getDeskripsi() {
        return "Batik Tulis dengan teknik: " + teknik;
    }

    // Implementasi interface
    @Override
    public String informasiProduk() {
        return "Informasi Batik Tulis: " + getNama() + " (" + getTeknik() + ")";
    }

    @Override
    public boolean validasiHarga(double harga) {
        try {
            if (harga < 0) {
                throw new IllegalArgumentException("Harga tidak boleh negatif.");
            }
            return true;
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
            return false;
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Teknik: " + teknik;
    }
}

// Subclass BatikCap
class BatikCap extends Produk {
    private String jenisCetakan;

    public BatikCap(String kode, String nama, double harga, String jenisCetakan) {
        super(kode, nama, harga);
        this.jenisCetakan = jenisCetakan;
    }

    public BatikCap(String kode, String nama, String jenisCetakan) {
        super(kode, nama);
        this.jenisCetakan = jenisCetakan;
    }

    public String getJenisCetakan() {
        return jenisCetakan;
    }

    @Override
    public String getDeskripsi() {
        return "Batik Cap dengan cetakan: " + jenisCetakan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Cetakan: " + jenisCetakan;
    }
}

// final class BatikPrint
final class BatikPrint extends Produk {
    private String bahanKain;

    public BatikPrint(String kode, String nama, double harga, String bahanKain) {
        super(kode, nama, harga);
        this.bahanKain = bahanKain;
    }

    public BatikPrint(String kode, String nama, String bahanKain) {
        super(kode, nama);
        this.bahanKain = bahanKain;
    }

    public String getBahanKain() {
        return bahanKain;
    }

    @Override
    public String getDeskripsi() {
        return "Batik Print dengan bahan kain: " + bahanKain;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bahan Kain: " + bahanKain;
    }
}
