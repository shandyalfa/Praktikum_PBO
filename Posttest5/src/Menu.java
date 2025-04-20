import java.util.Scanner;

class Menu {
    private Scanner scanner;
    private ManajemenProduk manajemen;

    public Menu() {
        scanner = new Scanner(System.in);
        manajemen = new ManajemenProduk();
    }

    public void tampilkanMenu() {
        while (true) {
            System.out.println("\n1. Tambah Produk");
            System.out.println("2. Lihat Produk");
            System.out.println("3. Update Produk");
            System.out.println("4. Hapus Produk");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1 -> tambahProduk();
                case 2 -> manajemen.tampilkanProduk();
                case 3 -> updateProduk();
                case 4 -> hapusProduk();
                case 5 -> {
                    System.out.println("Keluar...");
                    scanner.close();
                    return;
                }
                default -> System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void tambahProduk() {
        System.out.println("\nPilih Jenis Produk:");
        System.out.println("1. Batik Tulis");
        System.out.println("2. Batik Cap");
        System.out.println("3. Batik Print");
        System.out.print("Pilihan: ");
        int jenis = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Masukkan kode produk: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga produk: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        Produk produkBaru = null;

        switch (jenis) {
            case 1 -> {
                System.out.print("Masukkan teknik batik tulis: ");
                String teknik = scanner.nextLine();
                produkBaru = new BatikTulis(kode, nama, harga, teknik);
            }
            case 2 -> {
                System.out.print("Masukkan jenis cetakan batik cap: ");
                String cetakan = scanner.nextLine();
                produkBaru = new BatikCap(kode, nama, harga, cetakan);
            }
            case 3 -> {
                System.out.print("Masukkan bahan kain batik print: ");
                String bahan = scanner.nextLine();
                produkBaru = new BatikPrint(kode, nama, harga, bahan);
            }
            default -> System.out.println("Jenis produk tidak valid.");
        }

        if (produkBaru != null) {
            manajemen.tambahProduk(produkBaru);
            System.out.println("Produk berhasil ditambahkan!");
        }
    }

    private void updateProduk() {
        System.out.print("Masukkan kode produk yang ingin diperbarui: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama baru: ");
        String namaBaru = scanner.nextLine();
        System.out.print("Masukkan harga baru: ");
        double hargaBaru = scanner.nextDouble();
        scanner.nextLine();

        manajemen.updateProduk(kode, namaBaru, hargaBaru);
    }

    private void hapusProduk() {
        System.out.print("Masukkan kode produk yang ingin dihapus: ");
        String kode = scanner.nextLine();
        manajemen.hapusProduk(kode);
    }
}
