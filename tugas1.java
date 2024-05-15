import java.util.Scanner;

public class tugas1 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char KODE[] = {'A', 'B', 'D', 'E', 'F', 'G','H', 'L', 'N', 'T'};
        char KOTA[][] = {
            {'B', 'A', 'N', 'T', 'E', 'N'},
            {'J', 'A', 'K', 'A', 'R', 'T', 'A'},
            {'B', 'A', 'N', 'D', 'U', 'N', 'G'},
            {'C', 'I', 'R', 'E', 'B', 'O', 'N'},
            {'B', 'O', 'G', 'O', 'R'},
            {'P', 'E', 'K', 'A', 'L', 'O', 'N', 'G', 'A', 'N'},
            {'S', 'E', 'M', 'A', 'R', 'A', 'N', 'G'},
            {'S', 'U', 'R', 'A', 'B', 'A', 'Y', 'A'},
            {'M', 'A', 'L', 'A', 'N', 'G'},
            {'T', 'E', 'G', 'A', 'L'}
        };
        if (KODE.length == KOTA.length) {
            System.out.println("================================");
            System.out.print("| Masukkan Kode : ");
            char kodeKota = sc.next().charAt(0);
            boolean found = false;
            for (int i = 0; i < KODE.length; i++) {
                if (KODE[i] == kodeKota) {
                    found = true;
                    System.out.println("| Kode " + kodeKota + " berada di kota " + String.valueOf(KOTA[i]));
                    break;
                }
            }
            if (!found) {
                System.out.println("| Kode " + kodeKota + " tidak ditemukan");
            }
        } else {
            System.out.println("Data tidak valid");
            
        }

    }
}
