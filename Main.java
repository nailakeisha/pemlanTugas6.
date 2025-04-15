public class Main {
    public static void main(String[] args) {
        Manusia a = new Manusia("A", "111", true, true);   // Membuat objek Manusia dengan nama A, menikah, laki-laki
        System.out.println(a);                             // Menampilkan informasi objek a

        Mahasiswa b = new Mahasiswa("16515030111100", 4.0, "B", "111", false, false); // Membuat objek Mahasiswa dengan IPK 4.0
        System.out.println(b);                             // Menampilkan informasi objek b

        Pekerja c = new Pekerja(1000, 2016, 3, 2, "C", "111", true, true); // Membuat objek Pekerja dengan gaji 1000, masuk kerja Maret 2016
        c.setJumlahAnak(4);                                // Menetapkan jumlah anak menjadi 4
        System.out.println(c);                             // Menampilkan informasi objek c

        Manager d = new Manager("HRD", 1000, 2017, 1, 2, "D", "111", true, true); // Membuat objek Manager di departemen HRD
        d.setJumlahAnak(3);                                // Menetapkan jumlah anak menjadi 3
        System.out.println(d);                             // Menampilkan informasi objek d
    }
}