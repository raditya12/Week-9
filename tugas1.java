import java.util.Scanner;
public class tugas1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int nilaiTertinggi = 0, nilaiTerendah = 100 , jumlahMhs;
        double total = 0;
        double rata2;
        System.out.print("Masukkan Jumlah Mahasiswa : ");
        jumlahMhs = sc.nextInt();
        int[] nilaiMhs = new int [jumlahMhs] ;
        for( int i = 0 ; i < nilaiMhs.length ; i++){
            System.out.print("Masukkan nilai mahasiswa ke -" +(i+1) + " = ");
            nilaiMhs[i] += sc.nextInt();
        }

        for ( int i = 0 ; i < nilaiMhs.length ; i++){
            total += nilaiMhs [i];
        }

        for ( int angka : nilaiMhs){
            if (angka >  nilaiTertinggi) {
                nilaiTertinggi = angka;
            }else if ( angka < nilaiTerendah){
                nilaiTerendah = angka;
            }else {

            }
        }
        
        System.out.println("Nilai tertinggi " + nilaiTertinggi);
        System.out.println("Nilai terendah " + nilaiTerendah);
        
        rata2 = total / nilaiMhs.length;
        System.out.println("Rata - rata nilai = " + rata2);
        
        for ( int i =0 ; i < nilaiMhs.length ; i++ ){
            System.out.println("Nilai yang dimasukkan indeks ke - " + i + " : " + nilaiMhs[i]);
        }
    }
}