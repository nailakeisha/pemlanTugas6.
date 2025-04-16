import java.time.LocalDate; // Mengimpor kelas LocalDate untuk tanggal masuk kerja

public class Pekerja extends Manusia { // Kelas Pekerja turunan dari Manusia
    protected double gaji;             // Gaji pokok
    protected LocalDate tahunMasuk;    // Tanggal mulai bekerja
    protected int jumlahAnak;          // Jumlah anak

    public Pekerja(double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(nama, nik, jenisKelamin, menikah);               // Panggil konstruktor induk
        this.gaji = gaji;                                       // Set gaji pokok
        this.tahunMasuk = LocalDate.of(tahun, bulan, tanggal); // Set tanggal masuk kerja
    }

    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak; // Mengatur jumlah anak
    }

    public double getBonus() {
        int tahunSekarang = LocalDate.now().getYear();         // Ambil tahun sekarang
        int lama = tahunSekarang - tahunMasuk.getYear();       // Hitung masa kerja
        if (lama < 10) return gaji * 0.05;                      // Bonus 5% jika <10 tahun
        else if (lama == 10) return gaji * 0.1;                 // Bonus 10% jika 10 tahun
        else return gaji * 0.15;                                // Bonus 15% jika >10 tahun
    }

    public double getGajiTotal() {
        return gaji + getBonus(); // Gaji total = gaji pokok + bonus
    }

    @Override
    public double getPendapatan() {
        return super.getTunjangan() + getBonus() + (jumlahAnak * 20) + gaji;
        // Total pendapatan = tunjangan + bonus + tunjangan anak + gaji
    }

    @Override
    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +                             // Nama
               "\nnik\t\t: " + nik +                               // NIK
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + // Jenis kelamin
               "\npendapatan\t: " + getPendapatan() +              // Total pendapatan
               "\ntahun masuk\t: " + tahunMasuk.getDayOfMonth() + "  " + tahunMasuk.getMonthValue() + "  " + tahunMasuk.getYear() + // Tanggal masuk
               "\njumlah anak\t: " + jumlahAnak +                  // Jumlah anak
               "\ngaji\t\t: " + gaji +                              // Gaji pokok
               "\ngaji total\t: " + getGajiTotal() +               // Gaji total (gaji + bonus)
               "\n--------------------------";
    }
}
