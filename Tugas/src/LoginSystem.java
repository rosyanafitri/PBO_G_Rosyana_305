import java.util.Scanner;

public class LoginSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat objek Admin dan Mahasiswa
        Admin admin = new Admin("Administrator", "password010");
        Mahasiswa mahasiswa = new Mahasiswa("Rosyana Fitri Satriyo", "202410370110305");

        System.out.println("Pilih Jenis Login:");
        System.out.println("1. Admin");
        System.out.println("2. Mahasiswa");
        System.out.print("Masukkan pilihan (1/2): ");
        int pilihan = scanner.nextInt();

        scanner.nextLine(); // Bersihkan input newline

        // Lakukan login berdasarkan pilihan
        if (pilihan == 1) {
            System.out.println("\n--- Login Admin ---");
            admin.login();
        } else if (pilihan == 2) {
            System.out.println("\n--- Login Mahasiswa ---");
            mahasiswa.login();
        } else {
            System.out.println("Pilihan tidak valid.");
        }

        scanner.close(); // Tutup scanner
    }
}