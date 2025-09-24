package relasiclass.tugas;

public class MainTugas {
    public static void main(String[] args) {
        Buku b1 = new Buku("978-1", "Algoritma & Struktur Data", "A. Author", 2);
        Buku b2 = new Buku("978-2", "Pemrograman Java", "B. Author", 1);

        Rak rak = new Rak("R1", 5);
        rak.setBuku(b1, 1);
        rak.setBuku(b2, 2);

        Anggota ag = new Anggota("A001", "Fajar E. S.");
        Peminjaman pinjam = new Peminjaman(ag, b1, "2025-09-24", 7);

        System.out.println(rak.info());
        pinjam.lakukanPinjam();
        System.out.println("Status buku setelah pinjam:");
        System.out.println(rak.getBuku(1).info());
    }
}
