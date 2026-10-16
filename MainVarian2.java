
public class MainVarian2 {
    public static void main(String[] args) {

        // Membuat perpustakaan dengan 2 rak
        Perpustakaan perpustakaan = new Perpustakaan("Perpustakaan Polinema", 2);

        // Membuat kepala perpustakaan
        Pustakawan kepala = new Pustakawan("P-01", "Bu Dewi");

        perpustakaan.setKepala(kepala);

        // Membuat anggota
        Anggota a1 = new Anggota("A-01", "Rafi");
        Anggota a2 = new Anggota("A-02", "Nadia");

        // Membuat koleksi buku dan majalah
        Buku b1 = new Buku(
                "B-01", "Pemrograman Java", "Abdul Kadir");

        Buku b2 = new Buku(
                "B-02", "Struktur Data", "Rinaldi");

        Majalah m1 = new Majalah(
                "M-01", "Info Komputer", "Mei 2026");

        // Mengatur peminjam dan hari keterlambatan
        b1.setPeminjam(a1);
        b1.setHariTerlambat(4);

        b2.setPeminjam(a2);
        b2.setHariTerlambat(25);

        m1.setPeminjam(a1);
        m1.setHariTerlambat(6);

        // Menyimpan koleksi ke rak
        perpustakaan.simpanKoleksi(b1);
        perpustakaan.simpanKoleksi(b2);
        perpustakaan.simpanKoleksi(m1, 2);

        // Mencetak informasi perpustakaan
        perpustakaan.tampilInfo();

        // Membuat petugas sirkulasi
        PetugasSirkulasi petugas = new PetugasSirkulasi("Petugas 1");

        // Mencetak rincian denda ketiga koleksi
        System.out.println("\n=== RINCIAN DENDA ===");

        petugas.cetakDenda(b1);
        petugas.cetakDenda(b2);
        petugas.cetakDenda(m1);

        // Jawaban C3

        Koleksi k = new Majalah("M-09", "Tempo", "Juni 2026");

        k.setHariTerlambat(6);

        System.out.println("\n=== Jawaban C3 ===");
        System.out.println("Jenis: " + k.getJenis());
        System.out.println("Denda: " + k.hitungDenda());

    }
}
