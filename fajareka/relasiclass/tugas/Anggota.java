package relasiclass.tugas;

public class Anggota {
    private String id;
    private String nama;

    public Anggota(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    public String info() {
        return "ID: " + id + "\nNama: " + nama + "\n";
    }
}
