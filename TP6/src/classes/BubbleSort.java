package classes;

import java.util.ArrayList;

public class BubbleSort {

    private ArrayList<Integer> list;

    public BubbleSort() {
        list = new ArrayList<>();
    }

    public String bubbleSort(ArrayList<Integer> list) {
        int n = list.size();
        for (int k = 0; k < n - 1; k++) {
            for (int j = 0; j < n - k - 1; j++) {
                if (list.get(j) > list.get(j + 1)) {
                    int temp = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, temp);
                }
            }
        }
        return list.toString();
    }

}
