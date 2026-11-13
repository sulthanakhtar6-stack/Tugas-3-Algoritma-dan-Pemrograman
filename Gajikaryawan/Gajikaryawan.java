import java.util.Scanner;

public class Gajikaryawan {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            // Array gaji: indeks 0 = A, 1 = B, 2 = C
            int[] gaji = {5000000, 6500000, 9500000};

            // Array persen lembur: indeks 0 = 1 jam, ..., 4 = >= 5 jam
            int[] lembur = {30, 32, 34, 36, 38};

            System.out.print("Masukkan Golongan (A/B/C): ");
            String golongan = input.next().toUpperCase();

            System.out.print("Masukkan Jam Lembur: ");
            int jamLembur = input.nextInt();

            // Menentukan gaji pokok berdasarkan golongan
            int gajiPokok;
            if (golongan.equals("A")) {
                gajiPokok = gaji[0];
            } else if (golongan.equals("B")) {
                gajiPokok = gaji[1];
            } else if (golongan.equals("C")) {
                gajiPokok = gaji[2];
            } else {
                System.out.println("Golongan tidak valid!");
                return;
            }

            // Menentukan persen lembur berdasarkan jam lembur
            int persen;
            if (jamLembur < 0) {
                System.out.println("Jam lembur tidak valid!");
                return;
            } else if (jamLembur == 0) {
                persen = 0;
            } else if (jamLembur == 1) {
                persen = lembur[0];
            } else if (jamLembur == 2) {
                persen = lembur[1];
            } else if (jamLembur == 3) {
                persen = lembur[2];
            } else if (jamLembur == 4) {
                persen = lembur[3];
            } else { // jamLembur >= 5
                persen = lembur[4];
            }

            // Perhitungan menggunakan operator
            double gajiLembur = gajiPokok * persen / 100.0;
            double totalGaji = gajiPokok + gajiLembur;

            // Output
            System.out.println("\n===== SLIP GAJI =====");
            System.out.println("Golongan      : " + golongan);
            System.out.println("Gaji Pokok    : Rp. " + String.format("%,d", gajiPokok));
            System.out.println("Jam Lembur    : " + jamLembur + " jam");
            System.out.println("Persen Lembur : " + persen + "%");
            System.out.println("Gaji Lembur   : Rp. " + String.format("%,.0f", gajiLembur));
            System.out.println("Total Gaji    : Rp. " + String.format("%,.0f", totalGaji));
        }
    }
}