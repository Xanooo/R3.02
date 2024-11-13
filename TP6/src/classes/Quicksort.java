package classes;

import java.util.Random;

public class Quicksort {

    public static void randomInit(Integer[] input, int size){
        Random r = new Random();
        for (int i = 0; i < input.length; ++i){
            input[i] = r.nextInt(size);
        }
    }

    public static int partition(Integer[] list, int low, int high) {
        int pivot = list[high];

        int i = low - 1;


        for (int j = low; j <= high - 1; j++) {
            if (list[j] < pivot) {
                i++;
                swap(list, i, j);
            }
        }


        swap(list, i + 1, high);
        return i + 1;
    }

    public static void swap(Integer[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(Integer[] arr, int low, int high) {
        if (low < high) {

            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
}
