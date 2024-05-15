import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("| Program Menghitung Kecepatan, Jarak, dan Waktu |");
        System.out.println("==================================================");
        System.out.println("| 1. Kecepatan                                   |");
        System.out.println("| 2. Jarak                                       |");
        System.out.println("| 3. Waktu                                       |");
        System.out.println("==================================================");
        System.out.print("| Masukkan Pilihan : ");
        int pilihan = sc.nextInt();

        if (pilihan == 1) {
            System.out.print("| Masukkan Jarak (m) : ");
            double jarak = sc.nextDouble();
            System.out.print("| Masukkan Waktu (s) : ");
            double waktu = sc.nextDouble();
            rumusKecepatan(jarak, waktu);
        } else if (pilihan == 2) {
            System.out.print("| Masukkan Kecepatan (m/s) : ");
            double kecepatan = sc.nextDouble();
            System.out.print("| Masukkan Waktu (s) : ");
            double waktu = sc.nextDouble();
            rumusJarak(kecepatan, waktu);

        } else if (pilihan == 3) {
            System.out.print("| Masukkan Kecepatan (m/s) : ");
            double kecepatan = sc.nextDouble();
            System.out.print("| Masukkan Jarak (m) : ");
            double jarak = sc.nextDouble();
            rumusWaktu(kecepatan, jarak);
        } else {
            System.out.println("Pilihan tidak valid"); 
        }
        System.out.println("==================================================");
    }
    static void rumusKecepatan(double jarak, double waktu){
        double kecepatan = jarak / waktu;
        System.out.println("| Kecepatan : " + kecepatan + " m/s");
    }
    static void rumusJarak(double kecepatan, double waktu){
        double jarak = kecepatan * waktu;
        System.out.println("| Jarak : " + jarak + " m");
    }
    static void rumusWaktu(double kecepatan, double jarak){
        double waktu = jarak / kecepatan;
        System.out.println("| Waktu : " + waktu + " s");
    }
}
