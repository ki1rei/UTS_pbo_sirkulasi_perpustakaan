public abstract class Koleksi {
    protected String kode;
    protected String judul;
    protected int hariTerlambat;
    private Anggota peminjam;

    public Koleksi(String kode, String judul) {
        this.kode = kode;
        this.judul = judul;
        this.hariTerlambat = 0;
        this.peminjam = null;
    }

    public String getKode() {
        return kode;
    }

    public String getJudul() {
        return judul;
    }

    public void setPeminjam(Anggota a) {
        this.peminjam = a;
    }

    public Anggota getPeminjam() {
        return peminjam;
    }

    public void setHariTerlambat(int hari) {
        if (hari < 0) {
            throw new IllegalArgumentException(
                "Hari terlambat tidak boleh negatif."
            );
        }
        this.hariTerlambat = hari;
    }

    public int getHariTerlambat() {
        return hariTerlambat;
    }

    public abstract int hitungDenda();

    public abstract String getJenis();
}
