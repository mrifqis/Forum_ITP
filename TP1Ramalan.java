import java.util.Scanner;
import java.util.Random;
import java.io.IOException;

public class TP1Ramalan {
    public static void main (String[] args)  {
        System.out.println("Selamat datang di program ramalan Cupu");
        System.out.println("Data Anda : ");
        System.out.println("+++++++++++++++++++++++++++++++++++");
        
        // Input Data Anda
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama Anda\t: ");
        String nama;
        nama = input.next();

        System.out.print("Masukkan Umur Anda\t: ");
        int umur;
        umur = input.nextInt();

        System.out.println("\nData Pasangan Anda : ");
        System.out.println("+++++++++++++++++++++++++++++++++++");

        System.out.print("Masukkan nama Pasangan Anda\t: ");
        String namaPasangan;
        namaPasangan = input.next();

        System.out.print("Masukkan Umur Pasangan Anda\t: ");
        int umurPasangan;
        umurPasangan = input.nextInt();

        // Random Ramalan
        Random random = new Random();
        int low = 50;
        int high = 100;
        int ramalan = random.nextInt(high-low) + low;
        float hasilramal = (float) (ramalan/1.1);

        // Output Ramalan
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println(nama + " [" + umur + "] Tahun");
        
        // Love 
        final int size = 4  ;  
          
        // bagian atas love  
        for (int m = 0; m < size; m++) {  
            for (int n = 0; n <= 4 * size; n++) {  
                double pos1 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - size, 2));  
                double pos2 = Math.sqrt(Math.pow(m - size, 2) + Math.pow(n - 3 * size, 2));
                
                if (pos1 < size + 0.5 || pos2 < size + 0.5) {  
                System.out.print('*');  
                } else {  
                System.out.print(' ');  
            }  
        }  
        System.out.print(System.lineSeparator());  
    }  
        // bagian bawah love  
        for (int m = 1; m <= 2 * size; m++)  {  
            for (int n = 0; n < m; n++) {  
            System.out.print(' ');  
        }  
        for (int n = 0; n < 4 * size + 1 - 2 * m; n++) {  
        System.out.print("*");  
        }  
        System.out.print(System.lineSeparator());  
    }  

        System.out.println(namaPasangan + " [" + umurPasangan + "] Tahun");

        // Tekan Enter
        System.out.println("Tekan Enter untuk melanjutkan");
        breakConsule();

        System.out.printf("Kecocokan anda dengan pasangan anda adalah :\t: " + "%.2f", hasilramal);
        System.out.println("%");


        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("Terima kasih karena anda telah menggunakan jasa Ramalan kami.. ^^v");
    }

    private static void breakConsule() {
        try {
            System.in.read();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}