// File: MainProduk.java

// Abstract class Produk
abstract class Produk {
    private final String kode; // final attribute (tidak bisa diubah setelah konstruktor)
    private String nama;
    private double harga;

    // Constructor lengkap
    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    // Constructor dengan harga default 0
    public Produk(String kode, String nama) {
        this(kode, nama, 0.0);
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

    // Method abstrak untuk deskripsi khusus tiap produk
    public abstract String getDeskripsi();

    @Override
    public String toString() {
        return "Kode: " + kode + ", Nama: " + nama + ", Harga: " + harga;
    }
}



// Subclass BatikTulis
class BatikTulis extends Produk {
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

    @Override
    public String toString() {
        return "Kode: " + getKode() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Teknik: " + teknik;
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
        return "Kode: " + getKode() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Jenis Cetakan: " + jenisCetakan;
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
        return "Kode: " + getKode() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Bahan Kain: " + bahanKain;
    }
}


