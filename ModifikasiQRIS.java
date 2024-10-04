import java.util.Scanner;
public class ModifikasiQRIS {
    public static void main(String[] args) {       
        Scanner inputAbsen = new Scanner(System.in);
        double diskon = 0, total_potongan = 0;
        int harga = 0, jumlah_beli;

        
        System.out.println("_________________________");
        System.out.println("===== MENU KAFE JTI =====");
        System.out.println("_________________________");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Roti");
        System.out.println("_________________________");
        System.out.print("Masukkan angka dari menu yang dipilih: ");
        int pilihan_menu = inputAbsen.nextInt();  

        
        inputAbsen.nextLine(); 

        
        System.out.print("Apakah punya member (Y/N): ");
        String member = inputAbsen.nextLine();  
        System.out.println("_________________________");

        
        System.out.print("Masukkan jumlah beli: ");
        jumlah_beli = inputAbsen.nextInt();  

       
        if (member.equalsIgnoreCase("y")) {
            diskon = 0.10;  // Diskon 10%
            System.out.println("Besar diskon = 10%");
            
            
            if (pilihan_menu == 1) {
                harga = 20000;  // Kopi
                System.out.println("Harga kopi = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 15000;  // Teh
                System.out.println("Harga teh = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 25000;  // Roti
                System.out.println("Harga roti = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return; 
            }

            
            total_potongan = (harga - (harga / diskon)) * jumlah_beli;
            System.out.println("Total bayar setelah diskon = " + total_potongan);
        
        
        } else if (member.equalsIgnoreCase("n")) {
            
            if (pilihan_menu == 1) {
                harga = 20000;  // Kopi
                System.out.println("Harga kopi = " + harga);
            } else if (pilihan_menu == 2) {
                harga = 15000;  // Teh
                System.out.println("Harga teh = " + harga);
            } else if (pilihan_menu == 3) {
                harga = 25000;  // Roti
                System.out.println("Harga roti = " + harga);
            } else {
                System.out.println("Masukkan pilihan menu dengan benar");
                return;  
            }

            total_potongan = harga / jumlah_beli;
            System.out.println("Total bayar = " + total_potongan);
        } else {
            System.out.println("Member tidak valid");
        }

        System.out.println("_____________________________");
        inputAbsen.close();  // Menutup scanner
    }


    
    }
    

