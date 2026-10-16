public class Perpustakaan {
    private String nama;
    private Rak[] daftarRak;
    private Pustakawan kepala;

    public Perpustakaan(String nama, int jumlahRak) {
        if (jumlahRak < 1) {
            throw new IllegalArgumentException(
                    "Jumlah rak minimal 1.");
        }

        this.nama = nama;
        this.daftarRak = new Rak[jumlahRak];

        for (int i = 0; i < jumlahRak; i++) {
            daftarRak[i] = new Rak("R-" + (i + 1));
        }
    }

    public void setKepala(Pustakawan p) {
        this.kepala = p;
    }

    public void simpanKoleksi(Koleksi k) {
        for (Rak rak : daftarRak) {
            if (!rak.isPenuh()) {
                rak.tambahKoleksi(k);
                return;
            }
        }

        System.out.println(
                "Semua rak penuh! Koleksi "
                        + k.getKode() + " gagal disimpan.");
    }

    public void simpanKoleksi(Koleksi k, int nomorRak) {
        if (nomorRak < 1 || nomorRak > daftarRak.length) {
            System.out.println(
                    "Nomor rak " + nomorRak + " tidak valid!");
            return;
        }

        daftarRak[nomorRak - 1].tambahKoleksi(k);
    }

    public void tampilInfo() {
        System.out.println("Perpustakaan: " + nama);
        System.out.println(
                "Kepala: " +
                        (kepala == null ? "Belum ditentukan" : kepala.getNama()));

        System.out.println("Daftar Rak:");

        for (Rak rak : daftarRak) {
            System.out.println(
                    rak.getKode() + " - " +
                            (rak.isPenuh() ? "Penuh" : "Belum penuh"));
        }
    }
}
