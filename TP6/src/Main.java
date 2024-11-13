import classes.BubbleSort;
import classes.DLinkedList;
import classes.BubbleSort;
import classes.Quicksort;

import java.util.ArrayList;

public class Main {


   public static void main(String[] args) {
      Integer[] list = new Integer[10];
      Quicksort.randomInit(list, 10);
      Quicksort.quickSort(list, 0, list.length-1);
      for (int val : list) {
         System.out.print(val + " ");
      }

   }
}