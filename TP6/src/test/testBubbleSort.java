package test;
import classes.BubbleSort;
import org.junit.Assert;
import org.junit.Test;
import org.junit.Before;
import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBubbleSort {
    ArrayList<Integer> list1;
    BubbleSort b;
    @Before
    public void setUp() throws Exception {
        b = new BubbleSort();
        list1 = new ArrayList<>();
        list1.add(5);
        list1.add(3);
        list1.add(1);
        list1.add(2);
    }

    @Test
    public void testBubbleSort() {
        assertEquals("[1, 2, 3, 5]", b.bubbleSort(list1));
    }
}
