import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Sort {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] data = new int[5];

        while (true) {
            System.out.println("Menu Pilihan:");
            System.out.println("1. Random Data");
            System.out.println("2. Simulasi Bubble Sort - Ascending");
            System.out.println("3. Simulasi Selection Sort - Ascending");
            System.out.println("4. Simulasi Bubble Sort - Descending");
            System.out.println("5. Simulasi Selection Sort - Descending");
            System.out.println("6. Keluar");
            System.out.print("Pilih menu: ");
            int menu = scanner.nextInt();

            if (menu == 1) {
                System.out.print("Masukkan batas bawah: ");
                int lowerBound = scanner.nextInt();
                System.out.print("Masukkan batas atas: ");
                int upperBound = scanner.nextInt();
                generateRandomData(data, lowerBound, upperBound);
                System.out.println("Data acak: " + Arrays.toString(data));
            } else if (menu == 2) {
                System.out.println("Hasil Simulasi Bubble Sort - Ascending :");
                System.out.println("----------------------------------------");
                bubbleSortAscending(data, 5);
                System.out.println("\n----------------------------------------");
            } else if (menu == 3) {
                System.out.println("Hasil Simulasi Selection Sort - Ascending :");
                System.out.println("-------------------------------------------");
                selectionSortAscending(data, 5);
                System.out.println("\n-------------------------------------------");
            } else if (menu == 4) {
                System.out.println("Hasil Simulasi Bubble Sort - Descending :");
                System.out.println("-----------------------------------------");
                bubbleSortDescending(data,5);
                System.out.println("\n-----------------------------------------");
            } else if (menu == 5) {
                System.out.println("Hasil Simulasi Selection Sort - Descending");
                System.out.println("------------------------------------------");
                selectionSortDescending(data,5);
                System.out.println("\n------------------------------------------");
            } else if (menu == 6) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }

        scanner.close();
    }

    private static void generateRandomData(int[] data, int lowerBound, int upperBound) {
        try {
        Random random = new Random();
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        }
     } catch (Exception e) {
            System.out.println("Batas Atas harus lebih besar dari batas bawah");
        }
        
    }

    private static void bubbleSortAscending(int[] data, int jmlData) {
        // tampilkan data sebelum sorting
        System.out.print("Data sebelum di sorting: ");
        for(int i = 0 ; i < jmlData; i++){
            System.out.print(data[i] + " ");
        }

        // proses Bubble sort
        System.out.println("\nProses Bubble Sort Ascending");
        for(int i = 0; i < jmlData; i++){
            System.out.println("\nPass " + (i + 1) + " :");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");

            System.out.println();
            for(int j = 0; j < jmlData - 1; j++){
                if(data[j] > data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

                if(j < jmlData - (i + 1)){
                    for(int k = 0; k < jmlData; k++)
                        System.out.print(data[k] + " ");
                }
                System.out.println();
            }
            System.out.println("Result of Pass " + (i + 1) + " : ");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");
        }
        }

    private static void selectionSortAscending(int[] data, int jmlData) {
        // tampilkan data sebelum di sorting
        System.out.println("Data sebelum disorting: ");
        for(int i = 0; i < jmlData; i++)
            System.out.print(data[i] + " ");

        // proses selection sort
        System.out.print("\nProses Selection Sort Ascending");
        for(int i = 0; i < jmlData - 1; i++){
            System.out.println("\nPass " + (i + 1) + " : ");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");

            boolean tukar = false;
            int index = 0;
            int min = data[i];
            for(int j = i + 1; j < jmlData; j++){
                if(min > data[j]){
                    tukar = true;
                    index = j;
                    min = data[j];
                }
            }

            if(tukar == true){
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
            System.out.println("\nResult of Pass " + (i + 1) + " :");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");
        }
    }

    private static void bubbleSortDescending(int[] data, int jmlData) {
        // tampilkan data sebelum sorting
        System.out.print("\nData sebelum di sorting: ");
        for(int i = 0 ; i < jmlData; i++){
            System.out.print(data[i] + " ");
        }

        // proses Bubble sort
        System.out.println("\nProses Bubble Sort Descending");
        for(int i = 0; i < jmlData; i++){
            System.out.println("\nPass " + (i + 1) + " :");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");

            System.out.println();
            for(int j = 0; j < jmlData - 1; j++){
                if(data[j] < data[j + 1]){
                    int temp = data[j];
                    data[j] = data[j + 1];
                    data[j + 1] = temp;
                }

                if(j < jmlData - (i + 1)){
                    for(int k = 0; k < jmlData; k++)
                        System.out.print(data[k] + " ");
                }
                System.out.println();
            }
            System.out.println("\nResult of Pass " + (i + 1) + " :");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");
        }
    }

    private static void selectionSortDescending(int[] data, int jmlData) {
        // tampilkan data sebelum di sorting
        System.out.println("Data sebelum disorting: ");
        for(int i = 0; i < jmlData; i++)
            System.out.print(data[i] + " ");

        // proses selection sort
        System.out.print("\nProses Selection Sort Descending");
        for(int i = 0; i < jmlData - 1; i++){
            System.out.println("\nPass " + (i + 1) + " : ");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");

            boolean tukar = false;
            int index = 0;
            int min = data[i];
            for(int j = i + 1; j < jmlData; j++){
                if(min < data[j]){
                    tukar = true;
                    index = j;
                    min = data[j];
                }
            }

            if(tukar == true){
                int temp = data[i];
                data[i] = data[index];
                data[index] = temp;
            }
            System.out.println("\nResult of Pass " + (i + 1) + " :");
            for(int j = 0; j < jmlData; j++)
                System.out.print(data[j] + " ");
        }
    }
}
