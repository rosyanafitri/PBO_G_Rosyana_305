import java.util.Scanner;
import java.util.Objects;

public class Mahasiswa extends User {
    private String validNama = "Rosyana Fitri Satriyo";
    private String validNIM = "202410370110305";

    public Mahasiswa(String nama, String nim) {
        super(nama, nim);
    }

    @Override
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String inputNIM = scanner.nextLine();

        return Objects.equals(inputNama, validNama) && Objects.equals(inputNIM, validNIM);
    }

    @Override
    public void displayInfo() {
        System.out.println("Login Mahasiswa berhasil!");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM: " + getNim());
    }
}