import java.util.Scanner;

public class TP1 {
    public static void main (String[] args)  {
        // Input Nama
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nama anda: ");
        String nama;
        nama = input.next();

        System.out.println("\nStok Gudang Input Barang");
        System.out.println("##########################\n");
        System.out.println("Selamat datang " + nama + "\n");

        // Input Nama Barang
        System.out.print("Masukkan nama barang yang mau ditambah : ");
        String namaBarang;
        namaBarang = input.next();

        // Input Jumlah Barang
        System.out.print("Masukkan jumlah barang yang mau ditambah : ");
        int jumlahBarang;
        jumlahBarang = input.nextInt();

        // Input Harga Beli Barang
        System.out.print("Masukkan harga beli untuk barang tersebut : ");
        float hargaBeli;
        hargaBeli = input.nextFloat();

        // Input Harga Jual Barang
        System.out.print("Masukkan harga jual untuk barang tersebut : ");
        double hargaJual;
        hargaJual = input.nextDouble();

        System.out.println("\nStok Gudang Rincian Barang");
        System.out.println("##########################\n");

        System.out.println("Nama Barang\t: " + namaBarang);
        System.out.println("Jumlah Barang\t: " + jumlahBarang);
        System.out.printf("Harga Beli\t: Rp. " + "%.2f %n", hargaBeli);  
        System.out.printf("Harga Jual\t: Rp. " + "%.2f %n", hargaJual);

    }
}