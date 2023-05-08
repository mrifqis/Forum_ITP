import java.util.Scanner;

public class Bitwise {
public static void main (String [] args){
Scanner input = new Scanner(System.in);

System.out.println("--Aplikasi M. Rifqi Saifudin--");
System.out.print("Input a = ");
int a = input.nextInt();
System.out.print("Input b = ");
int b = input.nextInt();

//operator Matematika
System.out.println("\nOperator Matemaika\n");
int c = a + b;
int d = a - b;
int e = a * b;
int f = a / b;
int g = a % b;

System.out.println("Operasi Tambah\na + b = " + c + "\n");
System.out.println("Operasi Kurang\na - b = " + d);
System.out.println("\nOperasi Kali\na * b = " + e);
System.out.println("\nOeprasi Bagi\na / b = " + f);
System.out.println("a / b, sisa hasil bagi = " + g);

//operator Logika
System.out.println("\nOperator Logika");
String GanjilGenapA = a % 2 == 0 ? "Genap" : "Ganjil";
String GanjilGenapB = b % 2 == 0 ? "Genap" : "Ganjil";

System.out.println("a merupakan bilangan " + GanjilGenapA);
System.out.println("b merupakan bilangan " + GanjilGenapB);

//operator bitwise
System.out.println("\nOperator Bitwise");
int op1 = a | b;
int op2 = a & b;
int op3 = a << 3;
int op4 = b >> 2;
int op5 = ~a;
int op6 = a ^ b;

System.out.println("Kalau a | b alias OR maka hasilnya = " + op1);
System.out.println("Kalau a & b alias AND maka hasilnya = " + op2);
System.out.println("Kalau a << 3 alias Bitwise left Shift maka hasilnya = " + op3);
System.out.println("Kalau b >> 2 alias Bitwise right Shift maka hasilnya = " + op4);
System.out.println("Kalau ~a alias NOT maka hasilnya = " + op5);
System.out.println("Kalau a ^ b alias NOR maka hasilnya = " + op6);
}

}