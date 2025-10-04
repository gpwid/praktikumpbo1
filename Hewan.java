abstract class Hewan {
    String nama;
    public Hewan(String nama) {
        this.nama = nama;
    }
    // Method abstract (wajib diimplementasikan oleh subclass)
    abstract void suara();
    // Method biasa
    void info() {
        System.out.println("Nama hewan: " + nama);
    }
}