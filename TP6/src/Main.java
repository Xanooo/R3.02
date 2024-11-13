import classes.BubbleSort;
import classes.DLinkedList;
import classes.BubbleSort;
import classes.Quicksort;

import java.util.ArrayList;

public class Main {


   public static void main(String[] args) {
      Integer[] list = new Integer[50];
      Quicksort.randomInit(list, 50);
      long tempsDebut = System.nanoTime();
      Quicksort.quickSort(list, 0, list.length-1);
      long tempsFin = System.nanoTime();
      for (int val : list) {
         System.out.print(val + " ");
      }
      System.out.println(tempsFin - tempsDebut + "milliseconds");
   }
}