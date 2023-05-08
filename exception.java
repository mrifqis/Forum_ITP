import java.util.Scanner;

public class exception {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

// try catch java.util.InputMismatchException
        try {
            System.out.print("Input a = ");
            int a = input.nextInt();
        }
        catch (Exception e) {
            System.out.println("inputan harus angka");
        }
            finally {
                System.out.println("Program selesai");
            }
    }
}