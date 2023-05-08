import java.io.IOException;
import java.util.random;
import java.util.Scanner;

public class KunciTP1 {
    public static void main(String[] args)
    {
        String namaA, namaB;
        int umurA, umurB;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Selamat datang di program ramalan Cupu");
        System.out.println("♡");

        System.out.println("Data Anda : ");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan nama Anda\t: ");
        namaA = input.next();

        System.out.print("Masukkan Umur Anda\t: ");
        umurA = input.nextInt();
        input.nextLine();

        System.out.println("\nData Pasangan Anda : ");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.print("Masukkan nama Pasangan Anda\t: ");
        namaB = input.next();
        System.out.print("Masukkan Umur Pasangan Anda\t: ");
        umurB = input.nextInt();

        System.out.println("Tekan ENTER");
        breakConsule();

        system.out.println(namaA + "[" + umurA + "] Tahun");
        System.out.println("");
        
            final int size = 3;
        for (int m = 0; m < size; m++) {
            for (int m = 0; m < 5 * size; m++)
                double post1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));
                double post2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));

                if(post1 < size + 0.5 || post2 < size + 0.5) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
        }
    }
    for (int m = 1; m <= 2 * size; m++) {
        for (int n = 0; n < m; n++)
            System.out.print(" ");
        }
    for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {
        system.out.print("*");
    }
    system.out.print(namaB + "[" + umurB + "] Tahun");
        double value = random.nextDouble() * 100;
        while (value > 50);
        value = random.nextDouble() * 100;
        System.out.println("Ramalan Cupu\t: " + value + "%");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("♡");
        System.out.println("Terima kasih telah menggunakan program ramalan Cupu");
        
    private static void breakConsule() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        
}
