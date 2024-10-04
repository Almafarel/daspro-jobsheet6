import java.util.Scanner;
public class DiskonBuku {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.print("Masukkan jenis buku (kamus/novel/lainnya): ");
        String jenisBuku = sc.nextLine().toLowerCase(); 
        System.out.print("Masukkan jumlah buku: ");
        int jumlahBuku = sc.nextInt();
        
        // Tetapkan harga per buku (misal Rp75.000)
        double hargaPerBuku = 75000;
        double totalHarga = hargaPerBuku * jumlahBuku;
        double diskon = 0;

        // Menentukan diskon berdasarkan jenis buku dan jumlah buku
        if (jenisBuku.equals("kamus")) {
            diskon = 10; // Diskon awal 10%
            if (jumlahBuku > 2) {
                diskon += 2; // Tambah diskon 2% jika buku lebih dari 2
            }
        } else if (jenisBuku.equals("novel")) {
            diskon = 7; // Diskon awal 7%
            if (jumlahBuku > 3) {
                diskon += 2; // Tambah diskon 2% jika buku lebih dari 3
            } else {
                diskon += 1; // Tambah diskon 1% jika buku kurang dari atau sama dengan 3
            }
        } else {
            if (jumlahBuku > 3) {
                diskon = 5; // Diskon 5% jika buku bukan kamus atau novel, dan lebih dari 3 buku
            }
        }

        // Menghitung total diskon dan harga setelah diskon
        double jumlahDiskon = (diskon / 100) * totalHarga;
        double totalSetelahDiskon = totalHarga - jumlahDiskon;

        // Menampilkan jumlah diskon dan total harga yang harus dibayar
        System.out.printf("Jumlah diskon: Rp%.2f\n", jumlahDiskon);
        System.out.printf("Total yang harus dibayar: Rp%.2f\n", totalSetelahDiskon);

        
    }
}
    

