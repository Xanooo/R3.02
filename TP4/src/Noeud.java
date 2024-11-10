import java.util.ArrayList;
import java.util.List;

public class Noeud<T> {
    private T value;
    private List<Noeud<T>> children;


    public Noeud(T value) {
        this.value = value;
        this.children = new ArrayList<>();
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public List<Noeud<T>> getChildren() {
        return children;
    }

    public boolean isLeaf(){
        return children.isEmpty();
    }

    public void addChildren(Noeud<T> noeud) {
        this.children.add(noeud);
    }


    }