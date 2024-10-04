import java.util.Scanner;
public class BilanganBesar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int bilangan;

       // Meminta user untuk memasukkan 3 buah bilangan
        System.out.print("Masukkan bilangan pertama (bil1): ");
        int bil1 = sc.nextInt();
        System.out.print("Masukkan bilangan kedua (bil2): ");
        int bil2 = sc.nextInt();
        System.out.print("Masukkan bilangan ketiga (bil3): ");
        int bil3 = sc.nextInt();
        
        // Menentukan bilangan terbesar
        int terbesar = Math.max(bil1, Math.max(bil2, bil3));
        
        // Menampilkan hasil bilangan terbesar
        System.out.println("Bilangan terbesar: " + terbesar);
        
        
    }


    }

