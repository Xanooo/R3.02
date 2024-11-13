package classes;

import java.util.ArrayList;

public class BubbleSort {

    private DLinkedList list;

    public BubbleSort() {
        list = new DLinkedList();
    }

    public String bubbleSort(DLinkedList list) {
        int n = list.getSize();
        for (int k = 0; k < n - 1; k++) {
            for (int j = 0; j < n - k - 1; j++) {
                if (list.getIndexElement(j) > list.getIndexElement(j + 1)) {
                    DNode temp = list.getIndexNode(j);
                    list.setList(j, list.getIndexNode(j + 1));
                    list.setList(j + 1, temp);
                }
            }
        }
        return list.afficherListe();
    }

}
