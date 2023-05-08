import java.util.Scanner;

public class TP2_4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        char choice;
        int num = 0;
        int beda = 0;
        Boolean ulang = true;

        System.out.println("Belajar Deret Aritmatika, Geometri, dan Menghitung Faktorial\n");

        
        while (ulang) {

            do {
                try {
                    System.out.print("Masukkan banyak angka yang mau dicetak [2..10]: ");
                    num = sc.nextInt();
                } catch (Exception e) {
                    System.out.println("Inputan salah");
                    sc.next();
                    continue;
                } 
                } while (num < 2 || num > 10);

        do {
            try {
                System.out.print("Masukkan beda masing-masing [2..9]: ");
                beda = sc.nextInt();
            } catch (Exception e) {
                System.out.println("Inputan salah");
                sc.next();
                continue;
            }
        } while (beda < 2 || beda > 9);

            System.out.println("Deret Aritmatika: ");
            for (int i = 1; i <= num * beda; i = i + beda) {
                System.out.print(i + " ");
            }

            System.out.println("\nDeret Geometri: ");
            int a = 1, total = 0;
            for (int i = 1; i <= num; i++) {
                System.out.print(a + total);
                a = a * beda;
                if (i < num) {
                    System.out.print(" ");
                } else {
                    System.out.print("");
                }
            }

            System.out.println("\nFaktorial dari " + num + ": ");
            for (int i = num; i >= 1; i--) {
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" = ");
                }
            } 
            System.out.print(factorial(num));

            System.out.println("\nanda mau ulang? [y/t]");
            choice = sc.next().charAt(0);
            
            if (choice == 'y' || choice == 'Y') {
                continue;
            } else if (choice == 't' || choice == 'T') {
                ulang = false; 
            } else {
                System.out.println("Inputan salah");
                ulang = false;
            }
    }
}

        private static int factorial(int n) {
            if (n == 1) {
                return 1;
            } else {
                return n * factorial(n - 1);
            }
        }
}