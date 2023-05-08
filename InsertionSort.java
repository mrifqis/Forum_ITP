import java.util.*;

public class InsertionSort {
  static Scanner sc;
  
  public static void insertionSort(double[] list) {
  /** The method for sorting the numbers */
    for (int i = 1; i < list.length; i++) {
      /** insert list[i] into a sorted sublist list[0..i-1] so that
        list[0..i] is sorted. */
      double currentElement = list[i];
      int k;
      for (k = i - 1; k >= 0 && list[k] < currentElement; k--) {
        list[k + 1] = list[k];
        }
    // Insert the current element into list[k + 1]
      list[k + 1] = currentElement;
      }
    }
  
  public static void main(String[] args) {
        sc = new Scanner(System.in);
        double[] list = new double[5];
        System.out.println("Masukkan 5 angka (tipe double): ");
        for (int i = 0; i < list.length; i++) {
            list[i] = sc.nextDouble();
        }
        System.out.println("Sebelum diurutkan: \t" + Arrays.toString(list));
        insertionSort(list);
        System.out.println("Urut menurun: \t\t" + Arrays.toString(list));
    }
  }