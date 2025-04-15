import java.time.LocalDate; // Mengimpor kelas LocalDate untuk menyimpan dan memanipulasi tanggal

public class Pekerja extends Manusia { // Kelas Pekerja adalah turunan dari kelas Manusia
    protected double gaji;             // Menyimpan nilai gaji pekerja
    protected LocalDate tahunMasuk;    // Menyimpan tanggal pekerja mulai bekerja
    protected int jumlahAnak;          // Menyimpan jumlah anak dari pekerja

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);            // Memanggil konstruktor dari kelas induk (Manusia)
        this.gaji = gaji;                                    // Menginisialisasi atribut gaji
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal); // Membuat objek tanggal masuk kerja
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak; // Setter untuk mengatur jumlah anak
    }

    public double getBonus() {
        int tahunSekarang = LocalDate.now().getYear();       // Mengambil tahun sekarang dari sistem
        int lama = tahunSekarang - tahunMasuk.getYear();     // Menghitung lama bekerja (dalam tahun)
        if (lama < 10) return gaji * 0.05;                   // Jika kurang dari 10 tahun → bonus 5%
        else if (lama <= 10) return gaji * 0.1;              // Jika tepat 10 tahun → bonus 10%
        else return gaji * 0.15;                             // Jika lebih dari 10 tahun → bonus 15%
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBonus() + (jumlahAnak * 20) + gaji; 
        // Menghitung total pendapatan:
        // Tunjangan (dari Manusia) + bonus kerja + tunjangan anak (20 per anak) + gaji pokok
    }

    @Override
    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +                                          // Menampilkan nama pekerja
               "\nnik\t\t: " + nik +                                            // Menampilkan NIK pekerja
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + // Menampilkan jenis kelamin
               "\npendapatan\t: " + getPendapatan() +                           // Menampilkan total pendapatan
               "\ntahun masuk\t: " + tahunMasuk.getDayOfMonth() + "  " + tahunMasuk.getMonthValue() + "  " + tahunMasuk.getYear() + 
               // Menampilkan tanggal masuk kerja (hari, bulan, tahun)
               "\njumlah anak\t: " + jumlahAnak +                              // Menampilkan jumlah anak
               "\ngaji\t\t: " + gaji +                                          // Menampilkan gaji pokok
               "\n--------------------------";
    }
}