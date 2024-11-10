import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.*;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArbreTest {

    Arbre<String> tree;

    @BeforeEach
    public void setUp() {
        Noeud<String> node = new Noeud("Cyril");
        tree = new Arbre<>(node);

    }

    @Test
    public void testGetRoot(){
        assertEquals("Cyril", tree.getRoot().getValue());
    }

    @Test
    public void testAddChildren() {
        Noeud<String> node1 = new Noeud("Baptiste");



    }


    }



