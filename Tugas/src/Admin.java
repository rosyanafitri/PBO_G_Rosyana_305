import java.util.Scanner;

public class Admin {
    String username = "Admin010"; // Username admin tetap
    String password = "password010"; // Password admin tetap
    String nama; // Nama admin
    String nim; // NIM admin (mungkin kurang relevan)

    // Constructor untuk membuat objek Admin
    public Admin(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // Metode untuk login admin
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();

        // Cek apakah username dan password sesuai
        if (inputUsername.equals(username) && inputPassword.equals(password)) {
            System.out.println("Login Admin berhasil!");
            displayInfo(); // Tampilkan info admin
            return true;
        } else {
            System.out.println("Login gagal! Username atau password salah.");
            return false;
        }
    }

    // Metode untuk menampilkan info admin
    public void displayInfo() {
        System.out.println("Selamat datang, Admin " + nama + "!");
    }
}
