package test;
import classes.Quicksort;
import org.junit.Test;
import org.junit.Before;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;

public class QuicksortTest {
    private int[] liste;
    @Before
    public void setUp() throws Exception {
        liste = new int[]{10, 9, 7, 5, 1, 20};
    }

    @Test
    public void testPartition(){
        assertEquals(5, Quicksort.partition(liste, 0, liste.length-1));
    }

    @Test
    public void testSort(){
        Quicksort.quickSort(liste, 0, liste.length-1);
        String texte ="";
        for (int val : liste) {
            texte +=  val + " ";
        }
        assertEquals("1 5 7 9 10 20 ", texte);
    }
}
