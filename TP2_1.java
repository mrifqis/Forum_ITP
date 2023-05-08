import java.util.Scanner;

public class TP2_1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Program Fungsi Penjumlahan\n");

        System.out.print("Masukkan angka pertama: ");
        int a = sc.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = sc.nextInt();

        System.out.println("Hasil penjumlahan " + a + " + " + b + " = " + sum(a, b));
        System.out.println("Hasil faktorial " + a + " = " + factorial(a));
        System.out.println("Hasil faktorial " + b + " = " + factorial(b));

    }

    // Fungsi penjumlahan
    public static int sum(int a, int b) {
        return a + b;
    }

    // Fungsi rekursif
    public static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}