public class Fakultas {
    private static String namaFakultas = "Fakultas Teknik";

    private static String namaDekan = "Dr. Budi Santoso, M.T.";

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