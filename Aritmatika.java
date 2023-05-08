import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Aritmatika {
    private static BufferedReader br = null;
    public static void main(String[] args) {
        System.out.println("Program Aritmatika");
System.out.println("==================");
        System.out.println();

        boolean cek = true;

        while (cek) {
            br = new BufferedReader(new InputStreamReader(System.in));
            try {
                System.out.print("Masukkan bilangan pertama: ");
                int bil1 = Integer.parseInt(br.readLine());
                System.out.print("Masukkan bilangan kedua: ");
                int bil2 = Integer.parseInt(br.readLine());

                System.out.println();
                int penjumlahan = bil1 + bil2;
                int pengurangan = bil1 - bil2;
                int perkalian = bil1 * bil2;
                double pembagian = (double)bil1 / (double)bil2;
                
                //Ganjil atau Genap
                String statusPenjumlahan = penjumlahan % 2 == 0 ? " (Genap)" : " (Ganjil)";
                String statusPengurangan = pengurangan % 2 == 0 ? " (Genap)" : " (Ganjil)";
                String statusPerkalian = perkalian % 2 == 0 ? " (Genap)" : " (Ganjil)";

                System.out.println("Hasil penjumlahan : " + bil1 + " + " + bil2 + " = "  + penjumlahan + statusPenjumlahan);
                System.out.println("Hasil pengurangan : " + bil1 + " - " + bil2 + " = "  + pengurangan + statusPengurangan);
                System.out.println("Hasil perkalian   : " + bil1 + " * " + bil2 + " = "  + perkalian + statusPerkalian);
                System.out.println("Hasil pembagian   : " + bil1 + " / " + bil2 + " = "  + pembagian);
                System.out.println();

                System.out.print("Ingin coba lagi (Y/N) ? ");

                String coba = br.readLine();

                if (coba.equalsIgnoreCase("N"))
                    cek = false;
                else if (coba.equalsIgnoreCase("Y"))
                    cek = true;
                else
                    System.exit(0);

            }

            catch (IOException ioe) {
                System.out.println("Error IOException");
            }

        }

    }

}