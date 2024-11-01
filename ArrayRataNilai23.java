import java.util.Scanner;
public class ArrayRataNilai23 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

         int jumlahMhs;
         System.out.print("Masukkan Jumlah Mahasiswa : ");
         jumlahMhs= sc.nextInt();
         int[] nilaiMhs = new int[jumlahMhs];
         int lulus = 0, tidaklulus = 0, totalNilaiLulus = 0, totalNilaiTidakLulus = 0;
         double total = 0;
         double rata2;

         for (int i = 0; i < jumlahMhs ; i++){
            System.out.print("Masukkan nilai mahasiswa ke - " + (i+1) + " : ");
            nilaiMhs [i] = sc.nextInt();
         }
         for (int i = 0 ; i < nilaiMhs.length ; i++){
            total += nilaiMhs[i];
            if (nilaiMhs[i] > 70) {
               totalNilaiLulus += nilaiMhs[i];
                lulus++;
            }else if (nilaiMhs[i] < 70) {
               totalNilaiTidakLulus += nilaiMhs[i];
               tidaklulus++;
            }
         }
         System.out.println("Jumlah mahasiswa lulus : " + lulus);
         System.out.println("Jumlah mahasiswa tidak lulus : " +tidaklulus);

         double ratalulus = 0, ratatidaklulus =0;
         if (lulus > 0) {
            ratalulus = totalNilaiLulus / lulus;
            System.out.println("Rata rata nilai lulus : " + ratalulus);
         }
         if (tidaklulus > 0) {
            ratatidaklulus = (double) totalNilaiTidakLulus / tidaklulus;
            System.out.println("Rata rata nilai tidak lulus : " +ratatidaklulus);
         }
      }
}
