import java.util.Scanner;

public class perulangan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan NIM : ");
        String nim = sc.nextLine();
        System.out.println("================================");

        int nimDua = Integer.parseInt(nim.substring(8));
        int n = nimDua;
        if (n < 10) {
            n += 10;
        }

        for (int i = 1; i <= n; i++) {
            if (i != 6 && i != 10) {
                if (i % 2 == 0) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("* ");
                }
            }
        }
    }
}
