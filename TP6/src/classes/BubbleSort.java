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
                DNode currentNode = list.getIndexNode(j);
                DNode nextNode = currentNode.getNext();

                if (currentNode.getElement() > nextNode.getElement()) {
                    int temp = currentNode.getElement();
                    currentNode.setElement(nextNode.getElement());
                    nextNode.setElement(temp);
                }
            }
        }
        return list.afficherListe();
    }

}
