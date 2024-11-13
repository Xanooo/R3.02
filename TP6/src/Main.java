import classes.BubbleSort;
import classes.DLinkedList;
import classes.BubbleSort;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {
       BubbleSort bubbleSort = new BubbleSort();
       DLinkedList linkedList = new DLinkedList();
       linkedList.addLastDouble(4);
       linkedList.addLastDouble(1);
       linkedList.addLastDouble(3);
       linkedList.addLastDouble(2);
       bubbleSort.bubbleSort(linkedList);
       String liste = linkedList.afficherListe();
       System.out.println(liste);
    }

}