enum Tipe {
    MOBIL, MOTOR, BUS, TRUK
}

public class Kendaraan {
    private Tipe tipe;
    private String merek;
    private int tahun;

    // Constructor 1: Default tanpa parameter
    public Kendaraan() {
        this.tipe = Tipe.MOBIL;
        this.merek = "Unknown";
        this.tahun = 2025;
    }
    // Constructor 2: Dengan dua parameter
    public Kendaraan(Tipe tipe, String merek) {
        this.tipe = tipe;
        this.merek = merek;
        this.tahun = 2025;
    }
    // Constructor 3 : Dengan tiga parameter
    public Kendaraan(Tipe tipe, String merek, int tahun) {
        this.tipe = tipe;
        this.merek = merek;
        this.tahun = tahun;
    }

    // Method 1: Tanpa parameter
    public void info() {
        System.out.println("Tipe: " + this.tipe + ", Merek: " + this.merek + ", Tahun: " + this.tahun);
    }
    // Method 2: Dengan parameter String sebagai prefix
    public void info(String prefix) {
        System.out.println(prefix);
        System.out.println("  -> Tipe: " + this.tipe + ", Merek: " + this.merek + ", Tahun: " + this.tahun);
    }
}