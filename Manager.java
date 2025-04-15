public class Manager extends Pekerja {
    private String departemen;            // Menyimpan nama departemen manager

    public Manager(String departemen, double gaji, int tahun, int bulan, int tanggal, String nama, String nik, boolean jenisKelamin, boolean menikah) {
        super(gaji, tahun, bulan, tanggal, nama, nik, jenisKelamin, menikah); // Memanggil konstruktor Pekerja
        this.departemen = departemen;     // Menyimpan nama departemen
    }

    @Override
    public double getPendapatan() {
        return super.getPendapatan() + (0.1 * gaji); // Pendapatan ditambah 10% dari gaji karena jabatan sebagai manager
    }

    @Override
    public String toString() {
        return "--------------------------" +
               "\nnama\t\t: " + nama +                         // Menampilkan nama
               "\nnik\t\t: " + nik +                           // Menampilkan NIK
               "\njenis kelamin\t: " + (jenisKelamin ? "Laki-laki" : "Perempuan") +
               "\npendapatan\t: " + getPendapatan() +          // Menampilkan pendapatan
               "\ntahun masuk\t: " + tahunMasuk.getDayOfMonth() + "  " + tahunMasuk.getMonthValue() + "  " + tahunMasuk.getYear() +
               "\njumlah anak\t: " + jumlahAnak +              // Menampilkan jumlah anak
               "\ngaji\t\t: " + gaji +                          // Menampilkan gaji
               "\ndepartemen\t: " + departemen +               // Menampilkan departemen
               "\n--------------------------";
    }    
}