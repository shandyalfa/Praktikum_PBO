import java.util.InputMismatchException;
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
            try {
                System.out.println("\n1. Tambah Produk");
                System.out.println("2. Lihat Produk");
                System.out.println("3. Update Produk");
                System.out.println("4. Hapus Produk");
                System.out.println("5. Keluar");
                System.out.print("Pilih menu: ");
                int pilihan = scanner.nextInt();
                scanner.nextLine(); // membersihkan newline

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
            } catch (InputMismatchException e) {
                System.out.println("Input harus berupa angka! Coba lagi.");
                scanner.nextLine(); // membersihkan input yang salah
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan: " + e.getMessage());
            }
        }
    }

    private void tambahProduk() {
        try {
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
                default -> {
                    System.out.println("Jenis produk tidak valid.");
                    return;
                }
            }

            if (produkBaru != null) {
                manajemen.tambahProduk(produkBaru);
                System.out.println("Produk berhasil ditambahkan!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Format input salah. Ulangi lagi.");
            scanner.nextLine(); // bersihkan input
        } catch (Exception e) {
            System.out.println("Terjadi kesalahan saat menambahkan produk: " + e.getMessage());
        }
    }

    private void updateProduk() {
        try {
            System.out.print("Masukkan kode produk yang ingin diperbarui: ");
            String kode = scanner.nextLine();
            System.out.print("Masukkan nama baru: ");
            String namaBaru = scanner.nextLine();
            System.out.print("Masukkan harga baru: ");
            double hargaBaru = scanner.nextDouble();
            scanner.nextLine();

            manajemen.updateProduk(kode, namaBaru, hargaBaru);
        } catch (InputMismatchException e) {
            System.out.println("Harga harus berupa angka!");
            scanner.nextLine();
        } catch (Exception e) {
            System.out.println("Gagal memperbarui produk: " + e.getMessage());
        }
    }

    private void hapusProduk() {
        try {
            System.out.print("Masukkan kode produk yang ingin dihapus: ");
            String kode = scanner.nextLine();
            manajemen.hapusProduk(kode);
        } catch (Exception e) {
            System.out.println("Gagal menghapus produk: " + e.getMessage());
        }
    }
}

