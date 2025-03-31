
class Produk {
    private String kode;
    private String nama;
    private double harga;

    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public String getKode() {
        return kode;
    }

    public String getNama() {
        return nama;
    }

    public double getHarga() {
        return harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

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

    public String getTeknik() {
        return teknik;
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

    public String getJenisCetakan() {
        return jenisCetakan;
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis Cetakan: " + jenisCetakan;
    }
}

// Subclass BatikPrint
class BatikPrint extends Produk {
    private String bahanKain;

    public BatikPrint(String kode, String nama, double harga, String bahanKain) {
        super(kode, nama, harga);
        this.bahanKain = bahanKain;
    }

    public String getBahanKain() {
        return bahanKain;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bahan Kain: " + bahanKain;
    }
}
