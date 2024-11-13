package classes;

public class Quicksort {

    public static int partition(int[] list, int low, int high) {
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

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {

            int pivot = partition(arr, low, high);

            quickSort(arr, low, pivot - 1);
            quickSort(arr, pivot + 1, high);
        }
    }
}
