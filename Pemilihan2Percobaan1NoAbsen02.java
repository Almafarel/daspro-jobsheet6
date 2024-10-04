import java.util.Scanner;
public class Pemilihan2Percobaan1NoAbsen02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan sebuah tahun: ");
        int tahun = sc.nextInt();
        if ((tahun % 4) == 0) {
            if ((tahun % 100) != 0) {
                System.out.println("Tahun Kabisat");          
        } else
                System.out.println("Bukan tahun Kabisat");


    }
}

}
   