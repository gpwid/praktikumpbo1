class Main {
    public static void main(String[] args) {
        // Object 1: Dibuat menggunakan constructor default
        Kendaraan kendaraan1 = new Kendaraan();
        // Object 2: Dibuat menggunakan constructor dengan 2 parameter
        Kendaraan kendaraan2 = new Kendaraan(Tipe.MOTOR, "Yamaha");
        // Object 3: Dibuat menggunakan constructor dengan 3 parameter
        Kendaraan kendaraan3 = new Kendaraan(Tipe.BUS, "Mercedes-Benz", 2021);

        System.out.println("\n--- Menampilkan Info Kendaraan ---");

        // Mendemonstrasikan method overloading
        kendaraan1.info("1. Info Kendaraan Default:");
        kendaraan2.info("2. Info Kendaraan Roda Dua:");
        kendaraan3.info("3. Info Kendaraan Umum:");
    }
}