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
        System.out.print("Masukkan kode produk: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama produk: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan harga produk: ");
        double harga = scanner.nextDouble();
        scanner.nextLine();

        manajemen.tambahProduk(new Produk(kode, nama, harga));
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
