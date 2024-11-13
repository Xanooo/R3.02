import classes.BubbleSort;
import classes.DLinkedList;
import classes.BubbleSort;
import classes.Quicksort;

import java.util.ArrayList;

public class Main {


   public static void main(String[] args) {
      int[] list={10,7,8,6,2,1};
      Quicksort.quickSort(list, 0, list.length-1);
      for (int val : list) {
         System.out.print(val + " ");
      }

   }
}