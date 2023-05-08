public class TP2_3 {
    public static void main(String[] args) {

        /*System.out.println("Program Looping While\n");
        int a = 1;

        while (a < 10) {
            System.out.println("loop ke-" + a);
            a++;
        } 

        System.out.println("\nProgram Looping Do While\n");
        int b = 2; 
        do {
            System.out.println("loop" + b);
            b++;
        } while (b < 9);

        System.out.println("\nProgram Looping Do While False\n");
        int c = 1;

        do {
            System.out.println("loop" + c);
            c++;
        } while (false); */

        System.out.println("\nProgram Looping For Loop\n");
        for (int i = 1; i <= 5; i++) {
            System.out.println("loop ke-" + i);
        }

        System.out.println("\nProgram Looping For Loop Versi 2\n");
        int i = 1;
        for (; i <= 5; ) {
            System.out.println("loop ke-" + i);
            i++;
        }
    }
}
