package Taks2;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== KALKULATOR SEDERHANA ===");

        // Input dua angka
        System.out.print("Masukkan angka pertama: ");
        double angka1 = scanner.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = scanner.nextDouble();

        // Hitung dan tampilkan hasil operasi matematika
        // TODO: Implementasikan operasi berikut:
        // - Penjumlahan
        // - Pengurangan
        // - Perkalian
        // - Pembagian (perhatikan pembagian dengan nol)
        // - Modulus/sisa bagi

        // Tampilkan hasil dengan format yang rapi
        System.out.println("\\n=== HASIL PERHITUNGAN ===");
        // Implementasi di sini...

        scanner.close();
    }
}

