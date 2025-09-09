package Taks3;

public class DataLossStudy {
    public static void main(String[] args) {
        System.out.println("=== STUDI KASUS DATA LOSS ===");

        // Kasus 1: Sistem Penilaian
        System.out.println("1. Sistem Penilaian:");
        double nilaiAsli = 87.65;
        int nilaiHuruf = (int) nilaiAsli; // Data loss!

        System.out.println("Nilai asli: " + nilaiAsli);
        System.out.println("Nilai setelah casting ke int: " + nilaiHuruf);
        System.out.println("Data yang hilang: " + (nilaiAsli - nilaiHuruf));

        // Kasus 2: Populasi Negara
        System.out.println("\\n2. Data Populasi:");
        long populasiIndonesia = 273_523_615L; // 273 juta+
        int populasiInt = (int) populasiIndonesia; // Overflow!

        System.out.println("Populasi asli (long): " + populasiIndonesia);
        System.out.println("Populasi setelah casting ke int: " + populasiInt);

        // TODO: Buat 3 skenario lagi yang mendemonstrasikan data loss:
        // - Konversi mata uang (rupiah ke dollar dengan presisi)
        // - Pengukuran jarak GPS
        // - Perhitungan waktu dengan milidetik
    }
}
