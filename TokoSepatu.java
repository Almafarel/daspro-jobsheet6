import java.util.Scanner;
public class TokoSepatu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan merk sepatu (Converse/Sketcher/Nike): ");
        String merk = sc.nextLine();
        System.out.print("Masukkan kategori sepatu (Slip On/High Top/Woman/Man/Kids/Adult): ");
        String kategori = sc.nextLine();

        System.out.print("Masukkan ukuran sepatu: ");
        int ukuran = sc.nextInt();

        // Menentukan harga sepatu
        int harga = 0;

        // Menentukan harga sepatu berdasarkan merek, kategori, dan ukuran
        switch (merk) {
            case "Converse":
                // Jika merk Converse
                switch (kategori) {
                    case "Slip On":
                        if (ukuran >= 36 && ukuran <= 40) harga = 800000;
                        break;
                    case "High Top":
                        if (ukuran >= 40 && ukuran <= 44) harga = 1200000;
                        break;
                }
                break;
                
            case "Sketcher":
                // Jika merk Sketcher
                switch (kategori) {
                    case "Woman":
                        if (ukuran >= 36 && ukuran <= 41) harga = 1000000;
                        break;
                    case "Man":
                        if (ukuran >= 41 && ukuran <= 44) harga = 1800000;
                        break;
                }
                break;

            case "Nike":
                // Jika merk Nike
                switch (kategori) {
                    case "Kids":
                        if (ukuran >= 36 && ukuran <= 40) harga = 750000;
                        break;
                    case "Adult":
                        if (ukuran >= 40 && ukuran <= 44) harga = 1500000;
                        break;
                }
                break;

            default:
                // Jika merk tidak ditemukan
                System.out.println("Merek sepatu tidak valid.");
        }

        // Menampilkan harga sepatu jika ditemukan
        if (harga > 0) {
            System.out.printf("Harga sepatu: Rp%,d\n", harga);
        } else {
            System.out.println("Kategori atau ukuran sepatu tidak sesuai.");
        }

    }

}
    
