public class Manusia {
    protected String nama;                 // Menyimpan nama manusia
    protected String nik;                  // Menyimpan NIK (Nomor Induk Kependudukan)
    protected boolean jenisKelamin;        // true = laki-laki, false = perempuan
    protected boolean menikah;             // Status pernikahan: true jika sudah menikah

    public Manusia(String nama, String nik, boolean jenisKelamin, boolean menikah) {
        this.nama = nama;                  // Menginisialisasi nama
        this.nik = nik;                    // Menginisialisasi NIK
        this.jenisKelamin = jenisKelamin;  // Menginisialisasi jenis kelamin
        this.menikah = menikah;            // Menginisialisasi status pernikahan
    }

    public double getTunjangan() {
        if (menikah) {
            return jenisKelamin ? 25 : 20; // Jika menikah: laki-laki → 25, perempuan → 20
        } else {
            return 15;                     // Jika belum menikah → 15
        }
    }

    public double getPendapatan() {
        return getTunjangan();             // Default pendapatan adalah tunjangan
    }

    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +                           // Menampilkan nama
               "\nnik\t\t: " + nik +                             // Menampilkan NIK
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + // Menampilkan jenis kelamin
               "\npendapatan\t: " + getPendapatan() +            // Menampilkan pendapatan
               "\n--------------------------";
    }    
}