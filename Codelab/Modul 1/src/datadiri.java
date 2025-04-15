import java.util.Scanner;
import java.time.LocalDate;

public class datadiri {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan jenis kelamin (L/P): ");
        char jenisKelamin = scanner.next().charAt(0);

        System.out.print("Masukkan tahun lahir: ");
        int tahunLahir = scanner.nextInt();

        int tahunSekarang = LocalDate.now().getYear();
        int umur = tahunSekarang - tahunLahir;

        String kelamin = (jenisKelamin == 'L' || jenisKelamin == 'l') ? "Laki-laki" :
                (jenisKelamin == 'P' || jenisKelamin == 'p') ? "Perempuan" : "Tidak valid";

        System.out.println("\nNama: " + nama);
        System.out.println("Jenis Kelamin: " + kelamin);
        System.out.println("Umur: " + umur + " tahun");

        scanner.close();  // Menutup scanner yang benar
    }
}
