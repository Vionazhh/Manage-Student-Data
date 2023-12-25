package ManageStudentData;
import java.util.Scanner;
/**
 *
 * @author Viona
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        UniversityManagement management = new UniversityManagement();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Menu:");
            System.out.println("1. Mendaftarkan Mahasiswa");
            System.out.println("2. Menampilkan Informasi Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilihan Anda: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    registerStudent(management, scanner);
                    break;
                case 2:
                    displayStudentsInfo(management);
                    break;
                case 3:
                    System.out.println("Terima kasih!");
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih 1, 2, atau 3.");
                    break;
            }
        } while (choice != 3);
    }

    // Method untuk mendaftarkan mahasiswa
    public static void registerStudent(UniversityManagement management, Scanner scanner) {
        System.out.println("Jenis Mahasiswa \n1. Undergraduate \n2. Graduate");
        System.out.print("Pilihan Anda: ");
        int studentType = scanner.nextInt();

        System.out.print("Nama Mahasiswa: ");
        String name = scanner.next();

        System.out.print("Umur Mahasiswa: ");
        int age = scanner.nextInt();

        if (studentType == 1) {
            System.out.print("Kelas Mahasiswa: ");
            String className = scanner.next();
            UndergraduateStudent undergraduate = new UndergraduateStudent(name, age, className);
            management.registerStudent(undergraduate);
        } else if (studentType == 2) {
            System.out.print("Program Studi Mahasiswa: ");
            String programStudi = scanner.next();
            GraduateStudent graduate = new GraduateStudent(name, age, programStudi);
            management.registerStudent(graduate);
        } else {
            System.out.println("Pilihan Jenis Mahasiswa Tidak Valid.");
        }
    }

    // Method untuk menampilkan informasi mahasiswa
    public static void displayStudentsInfo(UniversityManagement management) {
        System.out.println("Informasi Mahasiswa:");
        management.displayStudentsInfo();
    }
}

