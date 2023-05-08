public class breakcont {
    
    public static void main(String[] args) {
    
    //Break
    System.out.println("Break");
    for (int i = 0; i < 10; i++) {
        if (i == 5)
        {
        break;
        }
        System.out.println(i);
        }

    //Continue
    System.out.println("\nContinue");
    for (int i = 0; i < 10; i++) {
        if (i == 5)
        {
        continue;
        }
        System.out.println(i);
        }
    }
        
}