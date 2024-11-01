import java.util.Scanner;
public class tugas2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int jumlahPesanan, total = 0 ;
        
        System.out.println("=========================");
        System.out.println("===== KANTIN RIGID ======");
        System.out.println("=========================");
        System.out.print(" Masukkan jumlah pesanan : ");
        jumlahPesanan = sc.nextInt();
        String[] pesanan = new String [jumlahPesanan];
        int[] harga = new int [jumlahPesanan];
        
        
        for (int i = 0 ; i < jumlahPesanan ; i++){
            sc.nextLine();
            System.out.print("Makanan dan minuman yang ingin di pesan ke " + (i+1) + " : " );
            pesanan [i] = sc.nextLine();
            System.out.print("Harga Makanan dan Minuman pesanan ke  " + (i+1) + " : ");
            harga [i] = sc.nextInt();
        }
        for (int i = 0 ; i <harga.length ; i++){
            System.out.println("Pesanan ke " + (i+1)  + " " +pesanan [i] + " harga " + harga[i]);
            total += harga[i];
        }
        System.out.println("Total harga : " + total);
        


    }
}