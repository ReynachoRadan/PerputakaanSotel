
// Kelas utama untuk uji coba
public class Main {
    public static void main(String[] args) {
        // Membuat objek BukuFiksi
        BukuFiksi bukuFiksi = new BukuFiksi("Judul Buku Fiksi", "Pengarang Fiksi", 2020, 50, "Fantasi");
        System.out.println("Judul: " + bukuFiksi.getJudul());
        System.out.println("Pengarang: " + bukuFiksi.getPengarang());
        System.out.println("Tahun Terbit: " + bukuFiksi.getTahunTerbit());
        System.out.println("Stok: " + bukuFiksi.getStok());
        System.out.println("Genre: " + bukuFiksi.getGenre());

        // Membuat objek BukuNonFiksi
        BukuNonFiksi bukuNonFiksi = new BukuNonFiksi("Judul Buku Non-Fiksi", "Pengarang Non-Fiksi", 2018, 30, "Teknologi");
        System.out.println("\nJudul: " + bukuNonFiksi.getJudul());
        System.out.println("Pengarang: " + bukuNonFiksi.getPengarang());
        System.out.println("Tahun Terbit: " + bukuNonFiksi.getTahunTerbit());
        System.out.println("Stok: " + bukuNonFiksi.getStok());
        System.out.println("Topik: " + bukuNonFiksi.getTopik());
    }
}

