public class Mobil {
    public String merek;
    public String warna;
    public int tahun;
    public double harga;

    // Constructor 1: Default
    public Mobil() {
        this.merek = "Unknown";
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }

    // Constructor 2 : Dengan merek saja
    public Mobil(String merek) {
        this.merek = merek;
        this.warna = "Putih";
        this.tahun = 2023;
        this.harga = 0.0;
    }
}