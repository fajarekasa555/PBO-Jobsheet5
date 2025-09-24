package relasiclass.tugas;

public class Rak {
    private String kode;
    private Buku[] arrayBuku;

    public Rak(String kode, int kapasitas) {
        this.kode = kode;
        this.arrayBuku = new Buku[kapasitas];
    }

    public void setBuku(Buku buku, int posisi) {
        if (posisi < 1 || posisi > arrayBuku.length) {
            System.out.println("Posisi tidak valid.");
            return;
        }
        arrayBuku[posisi - 1] = buku;
    }

    public Buku getBuku(int posisi) {
        if (posisi < 1 || posisi > arrayBuku.length) return null;
        return arrayBuku[posisi - 1];
    }

    public String info() {
        String s = "Rak: " + kode + "\n";
        for (int i = 0; i < arrayBuku.length; i++) {
            s += "Posisi " + (i+1) + ":\n";
            if (arrayBuku[i] != null) s += arrayBuku[i].info();
            else s += "Kosong\n";
        }
        return s;
    }
}
