import java.util.Scanner;

public class Konversi {
    public static void main(String[] args) {
        //Konversi meter ke cm

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai meter: ");
        float centimeter, meter;
        meter = input.nextFloat();

        centimeter = (meter * 100);
        System.out.println(meter + " meter sama dengan: " + centimeter + " cm");

        System.out.println("==================================");

        //Konversi huruf besar dan kecil
        System.out.println("Konversi Huruf Besar dan Kecil");
        String KataSatu, KataDua, Kombinasi;

        System.out.println("Kata Satu\t:");
        KataSatu = input.next();

        System.out.println("Kata Dua\t:");
        KataDua = input.next();

        Kombinasi = KataSatu.concat (" ").concat(KataDua);

        String hurufBesar = Kombinasi.toUpperCase();
        String hurufKecil = Kombinasi.toLowerCase();

        System.out.println("Huruf BESAR BESAR\t:" + hurufBesar);
        System.out.println("Huruf Kecil kecil\t:" + hurufKecil);
    }
}