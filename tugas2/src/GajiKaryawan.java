/*
    FAHMI KURNIA DWIPUTRA
    051075227
    TUGAS 2 ALGORITMA DAN PEMROGRAMAN
*/
import java.util.Scanner;
import java.text.DecimalFormat;
public class GajiKaryawan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input golongan dan Jam Lembur
        System.out.println("Masukkan Golongan (A/B/C): ");
        String golongan = input.nextLine().toUpperCase();

        System.out.println("Masukkan Jam Lembur: ");
        int jamLembur = input.nextInt();

        double gajiPokok = 0;
        double gajiLembur = 0;

        // Menentukan gaji pokok berdasarkan golongan
        if (golongan.equals("A")) {
            gajiPokok = 5000000;
        }else if (golongan.equals("B")){
            gajiPokok = 6500000;
        }else if (golongan.equals("C")) {
            gajiPokok = 9500000;
        }else{
            System.out.println("Golongan tidak valid!");
            return;
        }
        
        // Menentukan gaji lembur berdasarkan jam lembur
        if (jamLembur == 1) {
            gajiLembur = 0.30 * gajiPokok;
        }else if (jamLembur == 2) {
            gajiLembur = 0.32 * gajiPokok;
        }else if (jamLembur == 3) {
            gajiLembur = 0.34 * gajiPokok;
        }else if (jamLembur == 4) {
            gajiLembur = 0.36 * gajiPokok;
        }else if (jamLembur >= 5) {
            gajiLembur = 0.38 * gajiPokok;
        }else{
            gajiLembur = 0; // Tidak Lembur
        }

        double totalGaji = gajiPokok + gajiLembur;

        DecimalFormat rupiah = new DecimalFormat("#,###");
        // Output hasil
        System.out.println("======================================================");
        System.out.println("Golongan Karyawan : " + golongan);
        System.out.println("Gaji Pokok        : Rp " + rupiah.format(gajiPokok));
        System.out.println("Gaji Lembur       : Rp " + rupiah.format(gajiLembur) );
        System.out.println("Total Penghasilan : Rp " + rupiah.format(totalGaji));
    }
}
