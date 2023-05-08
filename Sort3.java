import java.util.*;
public class Sort3 {
    public static void main(String[] args) {
        int[] dataAwal = {20, 10, 20, 99, 201, 67, 89, 100, 12, 23, 42, 52, 80, 100, 123};
        System.out.println("Data awal = " + Arrays.toString(dataAwal) +"\n");

        // Insertion Sort
        long startTime = System.nanoTime();
        int[] sortedData = insertionSort(dataAwal);
        long endTime = System.nanoTime();
        System.out.println("Hasil sorting dengan Insertion Sort: " + Arrays.toString(sortedData));
        System.out.println("Durasi sorting dengan Insertion Sort: " + (endTime - startTime) / 100);
        System.out.println("\n");

        // Bubble Sort
        startTime = System.nanoTime();
        sortedData = bubbleSort(dataAwal);
        endTime = System.nanoTime();
        System.out.println("Hasil sorting dengan Bubble Sort: " + Arrays.toString(sortedData));
        System.out.println("Durasi sorting dengan Bubble Sort: " + (endTime - startTime) / 100);
        System.out.println("\n");

        // Merge Sort
        startTime = System.nanoTime();
        sortedData = mergeSort(dataAwal);
        endTime = System.nanoTime();
        System.out.println("Hasil sorting dengan Merge Sort: " + Arrays.toString(sortedData));
        System.out.println("Durasi sorting dengan Merge Sort: " + (endTime - startTime) / 100);
        System.out.println("\n");

        // Quick Sort
        startTime = System.nanoTime();
        sortedData = quickSort(dataAwal, 0, dataAwal.length - 1);
        endTime = System.nanoTime();
        System.out.println("Hasil sorting dengan Quick Sort: " + Arrays.toString(sortedData));
        System.out.println("Durasi sorting dengan Quick Sort: " + (endTime - startTime) / 100);
    }

    public static int[] insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
        return arr;
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = Arrays.copyOfRange(arr, 0, mid);
        int[] right = Arrays.copyOfRange(arr, mid, arr.length);
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0, j = 0, k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] <= right[j]) {
                result[k++] = left[i++];
            } else {
                result[k++] = right[j++];
            }
        }
        while (i < left.length) {
            result[k++] = left[i++];
        }
        while (j < right.length) {
            result[k++] = right[j++];
        }
        return result;
    }

    public static int[] quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
        return arr;
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr[j] < pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }
}