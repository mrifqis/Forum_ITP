public class Main {

    public static void main(String[] args) {
        String[] days = {"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        
        // While
        int a = 0;
        System.out.println("Hari dalam Seminggu menggunakan While: ");
        while (a < days.length) {
        System.out.print(days[a] + " | ");
        a++;
        }
        System.out.println();
        
        // Do While
        int b = 0;
        System.out.println("Hari dalam Seminggu menggunakan Do While: ");
        do {
        System.out.print(days[b] + " | ");
        b++;
        } while (b < days.length);
        
        System.out.println();
        
        // For Loop
        System.out.println("Hari dalam Seminggu menggunakan For Loop: ");
        for (int i = 0;i < days.length;i++){
        System.out.print(days[i]);
        if (i < days.length - 1) {
        System.out.print(", ");
        } else { 
        System.out.print(".");
        }
        }
        }
    
    }