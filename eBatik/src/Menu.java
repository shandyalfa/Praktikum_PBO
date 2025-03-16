import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ManajemenProduk manajemen;

    // Constructor
    public Menu() {
        scanner = new Scanner(System.in);
        manajemen = new ManajemenProduk();
    }

    public void tampilkanMenu() {
        while (true) {
            System.out.println("\n1. Tambah Batik");
            System.out.println("2. Lihat Batik");
            System.out.println("3. Update Batik");
            System.out.println("4. Hapus Batik");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine(); // Konsumsi newline

            switch (pilihan) {
                case 1:
                    tambahProduk();
                    break;
                case 2:
                    manajemen.tampilkanProduk();
                    break;
                case 3:
                    updateProduk();
                    break;
                case 4:
                    hapusProduk();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        }
    }

    private void tambahProduk() {
        System.out.print("Masukkan kode batik: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama batik: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga batik: ");
        double harga = scanner.nextDouble();
        manajemen.tambahProduk(kode, nama, harga);
    }

    private void updateProduk() {
        System.out.print("Masukkan kode batik yang akan diupdate: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama batik: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga baru: ");
        double harga = scanner.nextDouble();
        manajemen.updateProduk(kode, nama, harga);
    }

    private void hapusProduk() {
        System.out.print("Masukkan kode batik yang akan dihapus: ");
        String kode = scanner.nextLine();
        manajemen.hapusProduk(kode);
    }
}
