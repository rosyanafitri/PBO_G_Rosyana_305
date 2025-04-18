import java.util.Scanner;
import java.util.Objects;

public class Admin extends User {
    private String username;
    private String password;
    private String adminNIMPostfix = "006"; // Mengasumsikan 3 digit NIM terakhir adalah 006

    public Admin(String nama, String nim, String username, String password) {
        super(nama, nim);
        this.username = username;
        this.password = password;
    }

    @Override
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan username: ");
        String inputUsername = scanner.nextLine();
        System.out.print("Masukkan password: ");
        String inputPassword = scanner.nextLine();
        String validUsername = "Admin" + adminNIMPostfix;
        String validPassword = "password" + adminNIMPostfix;

        return Objects.equals(inputUsername, validUsername) && Objects.equals(inputPassword, validPassword);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Admin berhasil!");
    }
}