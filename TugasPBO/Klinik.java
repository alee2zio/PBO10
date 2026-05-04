import java.util.List;
import java.util.ArrayList;

public class Klinik {
    private List<Ruangan> daftarruangan;
    private List<Dokter> daftarDokter;
    public Klinik(String Ruangan, List<Dokter> dokter) {
        this.daftarruangan = new ArrayList<>();
        this.daftarruangan.add(new Ruangan(Ruangan));
        this.daftarDokter = dokter;

    }
}
