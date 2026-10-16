public class PetugasSirkulasi {
    private String nama;

    public PetugasSirkulasi(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    public void cetakDenda(Koleksi k) {
        String namaPeminjam = k.getPeminjam() == null
                ? "Belum dipinjam"
                : k.getPeminjam().getNama();

        System.out.println(
                "[" + k.getJenis() + "] " +
                        k.getKode() + " " +
                        k.getJudul() +
                        " | Peminjam : " + namaPeminjam +
                        " | Terlambat " + k.getHariTerlambat() +
                        " Hari | Denda: " + k.hitungDenda());
    }
}
