public class Dokter {
    private String nama;

    public Dokter(String nama) {
        this.nama = nama;
    }
    public void periksaPasien(Pasien p) {
        System.out.println("Dokter " + this.nama + " sedang memeriksa pasien " + p.getNama());
    }
}

