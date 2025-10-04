public class Fakultas {
    private static String namaFakultas = "Fakultas Kedokteran";

    private static String namaDekan = "Prof. dr. Arfianti, M.Biomed, MSc, Ph.D";

    public static String getNamaFakultas() {
        return namaFakultas;
    }

    public static String getNamaDekan() {
        return namaDekan;
    }

    public static void infoFakultas() {
        System.out.println("--- Informasi Fakultas ---");
        System.out.println("Nama Fakultas: " + namaFakultas);
        System.out.println("Nama Dekan   : " + namaDekan);
        System.out.println("-------------------------");
    }
}