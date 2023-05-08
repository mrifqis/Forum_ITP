import java.util.Scanner;

public class SelectionControl {
    
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
System.out.print("Masukkan umur anda: ");
int umur = input.nextInt();

if(umur<=5){
System.out.println("umur " + umur + " tahun itu BALITA");
}
else if(umur<=12){
System.out.println("umur " + umur + " tahun itu ANAK");
}
else if(umur<=17){
System.out.println("umur " + umur + " tahun itu REMAJA");
}
else if(umur<=60){
System.out.println("umur " + umur + " tahun itu DEWASA");
}
else if(umur<0) {
System.out.println("Usia tidak valid");
}
else{
System.out.println("umur " + umur + " tahun itu LANSIA");
}
}
}