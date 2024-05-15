
    import java.util.Scanner;

public class tes {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Mendapatkan jumlah film dan penonton
        System.out.print("Masukkan jumlah film: ");
        int jumlahFilm = scanner.nextInt();
        System.out.print("Masukkan jumlah penonton: ");
        int jumlahPenonton = scanner.nextInt();

        // Membuat array untuk menyimpan rating
        int[][] rating = new int[jumlahPenonton][jumlahFilm];

        // Membaca rating dari user
        for (int i = 0; i < jumlahPenonton; i++) {
            for (int j = 0; j < jumlahFilm; j++) {
                System.out.printf("Masukkan rating film %d dari penonton %d: ", j + 1, i + 1);
                rating[i][j] = scanner.nextInt();
            }
        }

        // Menghitung rata-rata rating untuk setiap film
        double[] rataRataRating = new double[jumlahFilm];
        for (int i = 0; i < jumlahFilm; i++) {
            double totalRating = 0;
            for (int j = 0; j < jumlahPenonton; j++) {
                totalRating += rating[j][i];
            }
            rataRataRating[i] = totalRating / jumlahPenonton;
        }

        // Mencari film dengan rata-rata rating paling tinggi dan paling rendah
        int filmRatingTertinggi = 0;
        int filmRatingTerendah = 0;
        for (int i = 1; i < jumlahFilm; i++) {
            if (rataRataRating[i] > rataRataRating[filmRatingTertinggi]) {
                filmRatingTertinggi = i;
            }
            if (rataRataRating[i] < rataRataRating[filmRatingTerendah]) {
                filmRatingTerendah = i;
            }
        }

        // Menampilkan hasil
        System.out.println("Rata-rata rating untuk setiap film:");
        for (int i = 0; i < jumlahFilm; i++) {
            System.out.printf("Film %d: %.2f\n", i + 1, rataRataRating[i]);
        }

        System.out.println("\nFilm dengan rating tertinggi: Film " + (filmRatingTertinggi + 1));
        System.out.println("Film dengan rating terendah: Film " + (filmRatingTerendah + 1));
    }
}


