package relasiclass.tugas;

public class Peminjaman {
    private Anggota anggota;
    private Buku buku;
    private String tanggalPinjam;
    private int lamaHari;

    public Peminjaman(Anggota anggota, Buku buku, String tanggalPinjam, int lamaHari) {
        this.anggota = anggota;
        this.buku = buku;
        this.tanggalPinjam = tanggalPinjam;
        this.lamaHari = lamaHari;
    }

    public boolean lakukanPinjam() {
        if (buku.pinjam()) {
            System.out.println("Peminjaman berhasil untuk anggota: " + anggota.info());
            return true;
        } else {
            System.out.println("Maaf, buku sedang habis.");
            return false;
        }
    }

    public void kembalikan() {
        buku.kembalikan();
        System.out.println("Buku dikembalikan.");
    }
}
