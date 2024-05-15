import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String mataKuliah[] = {
            "Agama",
            "Konsep Teknologi Informasi",
            "Critical Thinking dan Problem Solving",
            "Matematika Dasar",
            "Bahasa Inggris",
            "Dasar Pemrograman",
            "Praktikum Dasar Pemrograman",
            "Bahasa Indonesia",
            "Pengantar Akuntansi, Manajemen dan Bisnis"};

        double totalSKS = 19;
        double totalnilaiSetara = 0;

        double[] nilaiAngka = new double[mataKuliah.length];
        String[] nilaiHuruf = new String[mataKuliah.length];
        double[] nilaiSetara = new double[mataKuliah.length];
        double[] sksMataKuliah = {2, 2, 2, 2, 2, 2, 3, 2, 2};
        
        System.out.println("================================");
        System.out.println("Program Menghitung IP Semester");
        System.out.println("================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("masukkan nilai Angka untuk MK " + mataKuliah[i] + " : ");
            nilaiAngka[i] = sc.nextDouble();
        
        
        if (nilaiAngka[i] > 80 && nilaiAngka[i] <=100 ) {
            nilaiHuruf[i] = "A ";
            nilaiSetara[i] = 4.0;
        } else if (nilaiAngka[i] > 73 && nilaiAngka[i] <= 80) {
            nilaiHuruf[i] = "B+";
            nilaiSetara[i] = 3.5;
        } else if (nilaiAngka[i] > 65 && nilaiAngka[i] <= 73) {
            nilaiHuruf[i] = "B ";
            nilaiSetara[i] = 3.0;
        } else if (nilaiAngka[i] > 60 && nilaiAngka[i] <= 65) {
            nilaiHuruf[i] = "C+";
            nilaiSetara[i] = 2.5;
        } else if (nilaiAngka[i] > 50 && nilaiAngka[i] <= 60) {
            nilaiHuruf[i] = "C ";
            nilaiSetara[i] = 2.0;
        } else if (nilaiAngka[i] > 39 && nilaiAngka[i] <= 50) {
            nilaiHuruf[i] = "D ";
            nilaiSetara[i] = 1.0;
        } else {
            nilaiHuruf[i] = "E ";
            nilaiSetara[i] = 0;
        }

        totalnilaiSetara += nilaiSetara[i] * sksMataKuliah[i];
        }
    
        System.out.println("============================================================================================== ");
        System.out.println("| Hasil Konversi Nilai                                                                       |");
        System.out.println("==============================================================================================");
        System.out.println("| Mata Kuliah                                     | Nilai Angka | Nilai Huruf | Nilai Setara |");
        System.out.println("==============================================================================================");

        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.printf("| %-45s   | %-11.2f | %-11s | %-12.2f |\n", mataKuliah[i], nilaiAngka[i], nilaiHuruf[i], nilaiSetara[i]);
        }

        System.out.println("============================================================================================== ");

        double ipSemester = totalnilaiSetara / totalSKS;
        System.out.println("IP : " + ipSemester);

    }
}
