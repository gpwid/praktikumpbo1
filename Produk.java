import java.awt.*;

class Produk {
    public String nama;
    private double harga;
    protected int stok;
    private String namaSupplier = "Aura";

    // Static Variable
    static int jumlahProduk = 0;

    public Produk(String nama, double harga, int stok) {
        this.nama = nama;
        this.harga = harga;
        this.stok = stok;
        jumlahProduk++;
    }

    public static void infoJumlahProduk() {
        System.out.println("Total produk yang telah dibuat : " + jumlahProduk);
    }

    public void tampilkanInfo() {
        System.out.println("Nama : " + nama);
        System.out.println("Harga : " + harga);
        System.out.println("Stok : " + stok);
    }

    private void namaSupplier() {
        System.out.println("Nama supplier : " + namaSupplier);
    }

    public void namaSupplierPublik() {
        System.out.println("Nama supplier : " + namaSupplier);
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double hargaBaru) {
        if (hargaBaru > 0) {
            this.harga = hargaBaru;
        } else if (hargaBaru == 0) {
            this.harga = hargaBaru;
            System.out.println("Produk ini gratis");
        } else {
            System.out.println("Harga produk tidak boleh negatif");
        }
    }
}