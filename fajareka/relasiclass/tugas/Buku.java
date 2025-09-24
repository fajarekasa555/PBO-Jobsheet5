package relasiclass.tugas;

public class Buku {
    private String isbn;
    private String judul;
    private String penulis;
    private int jumlah;

    public Buku(String isbn, String judul, String penulis, int jumlah) {
        this.isbn = isbn;
        this.judul = judul;
        this.penulis = penulis;
        this.jumlah = jumlah;
    }

    public String info() {
        return String.format("ISBN: %s\nJudul: %s\nPenulis: %s\nJumlah: %d\n",
                isbn, judul, penulis, jumlah);
    }

    public boolean pinjam() {
        if (jumlah > 0) {
            jumlah--;
            return true;
        }
        return false;
    }

    public void kembalikan() {
        jumlah++;
    }
}
