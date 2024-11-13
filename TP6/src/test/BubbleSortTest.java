package test;
import classes.BubbleSort;
import classes.DLinkedList;
import org.junit.Test;
import org.junit.Before;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BubbleSortTest {
    DLinkedList list1;
    BubbleSort b;
    @Before
    public void setUp() throws Exception {
        b = new BubbleSort();
        list1 = new DLinkedList();
        list1.addFirstDouble(5);
        list1.addFirstDouble(3);
        list1.addFirstDouble(1);
        list1.addFirstDouble(2);
    }

    @Test
    public void testBubbleSort() {
        //assertEquals(b.bubbleSort(list1));
    }
}
