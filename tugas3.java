import java.util.Scanner;
public class tugas3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] menu = {"Nasi Goreng", "Mie Goreng", "Roti Bakar", "Kentang Goreng", "Teh Tarik", "Cappucino", "Chocolate Ice"};
        String hasil = "";

        String makanan;
        System.out.println("=================================");
        System.out.println("========= MAU PESAN APA =========");
        System.out.println("=================================");
        System.out.print("Nama makanan yang ingin di pesan : ");
        makanan = sc.nextLine();

        for (int i = 0 ; i < menu.length ; i++){
            if (makanan.equalsIgnoreCase(menu [i])) {
                hasil = menu[i];
            }
        }
        if (hasil != "") {
            System.out.println("Makanan yang ingin di pesan " + makanan + " tersedia ");
        }else
        System.out.println("makanan tidak tersedia");

    }
}