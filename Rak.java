public class Rak {
    private String kode;
    private Koleksi[] isi;
    private int jumlah;

    public Rak(String kode) {
        this.kode = kode;
        this.isi = new Koleksi[3];
        this.jumlah = 0;
    }

    public String getKode() {
        return kode;
    }

    public boolean tambahKoleksi(Koleksi k) {
        if (isPenuh()) {
            System.out.println(
                    "Rak " + kode + " sudah penuh! Koleksi "
                            + k.getKode() + " gagal disimpan.");
            return false;
        }

        isi[jumlah] = k;
        jumlah++;
        return true;
    }

    public boolean isPenuh() {
        return jumlah == isi.length;
    }

    public Koleksi[] getIsi() {
        return isi.clone();
    }
}
