import java.util.Random;
import java.util.Scanner;

public class loop {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
Random random = new Random();

while (true){
// Random Number
int num = random.nextInt(100);
System.out.println(num);

// Continue
System.out.print("Continue? ");
while (true) {
String ask = input.nextLine();
if (ask.equalsIgnoreCase("N")) {
System.out.print("Thank you for using this program");
System.exit(0);
} else if (ask.equalsIgnoreCase("Y")) {
break;
} else {
System.out.print("Jawab dengan Y/N: ");
}
}
}
}
}