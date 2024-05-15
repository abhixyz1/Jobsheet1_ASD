class fungsi {

    public static void main(String[] args) {
  
      int[][] stok = {
        {10, 5, 15, 7}, 
        {6, 11, 9, 12},
        {2, 10, 10, 5},
        {5, 7, 12, 9}
      };
      
      //
      printPendapatan(stok);
      
      //
      int[] pengurangan = {-1, -2, 0, -5};
      printStokCabang(stok[3], pengurangan);
      
    }
  
    public static void printPendapatan(int[][] stok) {
      int[] harga = {75000, 50000, 60000, 10000};
      System.out.println("=============================================================");
      System.out.println("| Pendapatan setiap cabang jika semua bunga habis terjual:  |");
      System.out.println("=============================================================");
      for(int i=0; i<stok.length; i++) {
        int total = 0;
        for(int j=0; j<stok[i].length; j++) {
          total += stok[i][j] * harga[j];  
        }
        System.out.println("| Royal Garden Cabang Ke- " + (i+1) + ": " + total);
      }
      System.out.println();
    }
  
    
    public static void printStokCabang(int[] stok, int[] pengurangan) {
        String[] nama = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        System.out.println("=============================================================");
        System.out.println("| Jumlah stock setiap jenis bunga pada cabang RoyalGarden 4:|");
        System.out.println("=============================================================");
        for(int i=0; i<stok.length; i++) {
            int sisa = stok[i] + pengurangan[i];
            System.out.println(String.format("| %-10s: %d", nama[i], sisa));
        }
        System.out.println("=============================================================");
    }
  
  }