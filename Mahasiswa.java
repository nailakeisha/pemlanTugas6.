public class Mahasiswa extends Manusia {
    private String nim;                   // NIM mahasiswa
    private double ipk;                   // IPK mahasiswa

    public Mahasiswa(String nim, double ipk, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah); // Memanggil konstruktor dari Manusia
        this.nim = nim;                // Menginisialisasi NIM
        this.ipk = ipk;                // Menginisialisasi IPK
    }

    public String getStatus() {
        String prodi = "";                 // Menyimpan nama program studi
        char kode = nim.charAt(6);        // Mengambil kode prodi dari karakter ke-7 NIM
        String angkatan = "20" + nim.substring(0, 2); // Mengambil 2 digit pertama NIM sebagai tahun angkatan

        // Menentukan nama prodi berdasarkan kode
        switch (kode) {
            case '2': prodi = "Teknik Informatika"; break;
            case '3': prodi = "Teknik Komputer"; break;
            case '4': prodi = "Sistem Informasi"; break;
            case '6': prodi = "Pendidikan Teknologi Informasi"; break;
            case '7': prodi = "Teknologi Informasi"; break;
        }
        return prodi + ", " + angkatan; // Mengembalikan status mahasiswa: prodi + angkatan
    }

    public double getBeasiswa() {
        if (ipk >= 3.5) return 75;        // Jika IPK >= 3.5 → beasiswa 75
        else if (ipk >= 3.0) return 50;   // Jika IPK >= 3.0 → beasiswa 50
        else return 0;                    // Lainnya tidak dapat beasiswa
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBeasiswa(); // Pendapatan = tunjangan dari Manusia + beasiswa
    }

    @Override
    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +                          // Menampilkan nama
               "\nnik\t\t: " + nik +                            // Menampilkan NIK
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + 
               "\npendapatan\t: " + getPendapatan() +           // Menampilkan pendapatan
               "\nnim\t\t: " + nim +                            // Menampilkan NIM
               "\nipk\t\t: " + ipk +                            // Menampilkan IPK
               "\nstatus\t\t: " + getStatus() +                 // Menampilkan status mahasiswa
               "\n--------------------------";
    }    
}