public class Manager extends Pekerja {
    private String departemen; // Departemen tempat manager bekerja

    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, nama, nik, jenisKelamin, menikah); // Panggil konstruktor Pekerja
        this.departemen = departemen; // Set nama departemen
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * gaji); // Tambah 10% dari gaji karena jabatan Manager
    }

    @Override
    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +                           // Nama
               "\nnik\t\t: " + nik +                             // NIK
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") + // Jenis kelamin
               "\npendapatan\t: " + getPendapatan() +            // Pendapatan total
               "\ntahun masuk\t: " + tahunMasuk.getDayOfMonth() + "  " + tahunMasuk.getMonthValue() + "  " + tahunMasuk.getYear() + // Tanggal masuk
               "\njumlah anak\t: " + jumlahAnak +                // Jumlah anak
               "\ngaji\t\t: " + gaji +                            // Gaji pokok
               "\ngaji total\t: " + getGajiTotal() +             // Gaji total (gaji + bonus)
               "\ndepartemen\t: " + departemen +                 // Nama departemen
               "\n--------------------------";
    }
}
