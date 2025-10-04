public class Main {
    public static void main(String[] args) {

        System.out.println("== Detail Jurusan Mahasiswa ==");

        Jurusan jurusanTI = new Jurusan();

        jurusanTI.setKodeJurusan(01);
        jurusanTI.setNamaJurusan("S1 Kedokteran");

        System.out.println("Nama Jurusan: " + jurusanTI.getNamaJurusan());
        System.out.println("Kode Jurusan: " + jurusanTI.getKodeJurusan());

        System.out.println("Fakultas    : " + Fakultas.getNamaFakultas());
        System.out.println("==============================");

        Fakultas.infoFakultas();
    }
}