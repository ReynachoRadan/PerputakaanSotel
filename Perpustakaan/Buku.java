// Superclass Buku
class Buku {
    // Atribut
    private String judul;
    private String pengarang;
    private int tahunTerbit;
    private int stok;

    // Konstruktor
    public Buku(String judul, String pengarang, int tahunTerbit, int stok) {
        this.judul = judul;
        this.pengarang = pengarang;
        this.tahunTerbit = tahunTerbit;
        this.stok = stok;
    }

    // Getter dan setter
    public String getJudul() {
        return judul;
    }

    public void setJudul(String judul) {
        this.judul = judul;
    }

    public String getPengarang() {
        return pengarang;
    }

    public void setPengarang(String pengarang) {
        this.pengarang = pengarang;
    }

    public int getTahunTerbit() {
        return tahunTerbit;
    }

    public void setTahunTerbit(int tahunTerbit) {
        this.tahunTerbit = tahunTerbit;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}

// Subclass BukuFiksi yang mewarisi dari Buku
class BukuFiksi extends Buku {
    // Atribut tambahan khusus untuk BukuFiksi
    private String genre;

    // Konstruktor
    public BukuFiksi(String judul, String pengarang, int tahunTerbit, int stok, String genre) {
        super(judul, pengarang, tahunTerbit, stok);
        this.genre = genre;
    }

    // Getter dan setter untuk atribut genre
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}

// Subclass BukuNonFiksi yang mewarisi dari Buku
class BukuNonFiksi extends Buku {
    // Atribut tambahan khusus untuk BukuNonFiksi
    private String topik;

    // Konstruktor
    public BukuNonFiksi(String judul, String pengarang, int tahunTerbit, int stok, String topik) {
        super(judul, pengarang, tahunTerbit, stok);
        this.topik = topik;
    }

    // Getter dan setter untuk atribut topik
    public String getTopik() {
        return topik;
    }

    public void setTopik(String topik) {
        this.topik = topik;
    }
}
