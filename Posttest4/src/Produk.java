class Produk {
    private String kode;
    private String nama;
    private double harga;

    public Produk(String kode, String nama, double harga) {
        this.kode = kode;
        this.nama = nama;
        this.harga = harga;
    }

    public Produk(String kode, String nama) {
        this.kode = kode;
        this.nama = nama;
        this.harga = 0.0;
    }

    public void setHarga(double harga) {
        this.harga = harga;
    }

    public void setHarga(int harga) {
        this.harga = (double) harga;
    }

    public void setNama(String nama) {
        this.nama = nama;
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

    // toString tetap diisi meskipun hanya placeholder
    public String toString() {
        return "Produk";
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
    public String toString() {
        return "Kode: " + getKode() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Jenis Cetakan: " + jenisCetakan;
    }
}

// Subclass BatikPrint
class BatikPrint extends Produk {
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
    public String toString() {
        return "Kode: " + getKode() + ", Nama: " + getNama() + ", Harga: " + getHarga() + ", Bahan Kain: " + bahanKain;
    }
}


