import java.util.Scanner;

public class F41 {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("A: ");
Integer a = input.nextInt();
System.out.print("B: ");
Integer b = input.nextInt();

// augmented assignment operator
System.out.println("\naugmented assignment operator");
System.out.println("-----------------------------------");
a += b;
System.out.println("a+b: " + a);
a -= b;
System.out.println("a-b: " + a);
a *= b;
System.out.println("a*b: " + a);
a /= b;
System.out.println("a/b: " + a);
a %= b;
System.out.println("a%b: " + a);

// increment and decrement operators
System.out.println("\nincrement and decrement operators");
System.out.println("-----------------------------------");
a++;
System.out.println("a++: " + a);
++a;
System.out.println("++a: " + a);
b--;
System.out.println("b--: " + b);
--b;
System.out.println("--b: " + b);
}
}