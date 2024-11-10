import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NoeudTest {

    @Test
    public void testGetValue() {
        Noeud node = new Noeud(1);
        Noeud node2 = new Noeud("Baptiste");
        assertEquals(node.getValue(), 1);
        assertEquals(node2.getValue(), "Baptiste");

    }

    @Test
    public void testSetValue() {
        Noeud node = new Noeud(1);
        node.setValue(2);
        assertEquals(node.getValue(), 2);
    }

    @Test
    public void testGetFirst(){
        List<Noeud<Integer>> children = new ArrayList<>();
        Noeud node = new Noeud(1);
        Noeud node2 = new Noeud(2);
        children.add(node);
        assertEquals(children.getFirst(), node);
    }



}
