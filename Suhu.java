import java.util.Scanner;

public class Suhu {
    public static void main (String[] args)  {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai celcius: ");
        double celcius, fahrenheit, kelvin;
        celcius = input.nextDouble();

        fahrenheit = (celcius * 9/5) + 32;
        kelvin = celcius + 273.15f;

        System.out.println(celcius + " celcius sama dengan: " + fahrenheit + " fahrenheit");
        System.out.println(celcius + " celcius sama dengan: " + kelvin + " kelvin");
    }
}