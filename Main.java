public class Main {
    public static void main(String[] args) {

        System.out.println("## Detail Jurusan Mahasiswa ##");

        Jurusan jurusanTI = new Jurusan();

        jurusanTI.setKodeJurusan(55);
        jurusanTI.setNamaJurusan("S1 Teknik Informatika");

        System.out.println("Nama Jurusan: " + jurusanTI.getNamaJurusan());
        System.out.println("Kode Jurusan: " + jurusanTI.getKodeJurusan());

        System.out.println("Fakultas    : " + Fakultas.getNamaFakultas());
        System.out.println("==============================\n");

        Fakultas.infoFakultas();
    }
}