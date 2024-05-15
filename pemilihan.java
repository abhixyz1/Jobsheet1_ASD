import java.util.Scanner;

public class pemilihan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("================================");
        System.out.println("Program Menghitung Nilai Akhir");
        System.out.println("================================");
        System.out.print("Masukkan Nilai Tugas : ");
        double nilaiTugas = input.nextDouble();
        System.out.print("Masukkan Nilai Kuis : ");
        double nilaiKuis = input.nextDouble();
        System.out.print("Masukkan Nilai UTS : ");
        double nilaiUTS = input.nextDouble();
        System.out.print("Masukkan Nilai UAS : ");
        double nilaiUAS = input.nextDouble();
        System.out.println("================================");
        System.out.println("================================");

        double nilaiAkhir = (nilaiTugas * 0.2) + (nilaiKuis * 0.2) + (nilaiUTS * 0.3) + (nilaiUAS * 0.3);

        if (nilaiTugas < 0 || nilaiTugas > 100 || nilaiKuis < 0 || nilaiKuis > 100 || nilaiUTS < 0 || nilaiUTS > 100 || nilaiUAS < 0 || nilaiUAS > 100) {
            System.out.println("Nilai Tidak Valid");
        }
        else if (nilaiAkhir <= 100 && nilaiAkhir > 80) {
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : A");
        } else if (nilaiAkhir <= 80 && nilaiAkhir > 73) {
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : B+");
        } else if (nilaiAkhir <= 73 && nilaiAkhir > 65) {
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : B");
        } else if (nilaiAkhir <= 65 && nilaiAkhir > 60) {
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : C+");
        } else if (nilaiAkhir <= 60 && nilaiAkhir > 50) {
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : C");
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39) {
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : D");
        } else if (nilaiAkhir <= 39 && nilaiAkhir >= 0){
            System.out.println("Nilai Akhir : " + nilaiAkhir);
            System.out.println("Nilai Huruf : E");
        }
        System.out.println("================================");
        System.out.println("================================");
        
        if ((nilaiAkhir <= 100 && nilaiAkhir > 80 || nilaiAkhir <= 80 && nilaiAkhir > 73 || nilaiAkhir <= 73 && nilaiAkhir > 65
         || nilaiAkhir <= 65 && nilaiAkhir > 60 || nilaiAkhir <= 60 && nilaiAkhir > 50)) {
            System.out.println("Selamat Anda Lulus");
        } else if (nilaiAkhir <= 50 && nilaiAkhir > 39 || nilaiAkhir <= 39 && nilaiAkhir >= 0) {
            System.out.println("Maaf, Anda Tidak Lulus");
        } else {
            System.out.println();
        }
    }
}