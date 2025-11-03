import java.util.Scanner;

public class soalmudah2 {
    public static void main(String[] args) {
     Scanner masukkan = new Scanner(System.in);
        System.out.print("Masukkan nilai : ");
        int nilai;
        nilai = masukkan.nextInt();
        if (nilai == 0) {
            System.out.println("nilai 0");
        } else if (nilai % 2 == 0) {
            System.out.println("nilai genap");
        } else {
            System.out.println("nilai ganjil");
        }   
    }
}
