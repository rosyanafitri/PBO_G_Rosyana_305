import java.util.Scanner;

public class Mahasiswa {
    String nama; // Nama mahasiswa
    String nim = "202410370110305"; // NIM mahasiswa tetap

    // Constructor untuk membuat objek Mahasiswa
    public Mahasiswa(String nama, String nim) {
        this.nama = nama;
        this.nim = nim;
    }

    // Metode untuk login mahasiswa
    public boolean login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan Nama: ");
        String inputNama = scanner.nextLine();
        System.out.print("Masukkan NIM: ");
        String inputNim = scanner.nextLine();

        // Cek apakah nama dan NIM sesuai
        if (inputNama.equals(nama) && inputNim.equals(nim)) {
            System.out.println("Login Mahasiswa berhasil!");
            displayInfo(); // Tampilkan info mahasiswa
            return true;
        } else {
            System.out.println("Login gagal! Nama atau NIM salah.");
            return false;
        }
    }

    // Metode untuk menampilkan info mahasiswa
    public void displayInfo() {
        System.out.println("Selamat datang, Mahasiswa " + nama + " dengan NIM " + nim + "!");
    }
}
