import java.util.Collection;

public class Node<T> {
    private T value;
    private Collection<Node> children;

    public Node(T value) {
        this.value = value;
    }

    public Node(T value, Collection<Node> children) {
        this.value = value;
        this.children = children;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public Collection<Node> getChildren() {
        return children;
    }

    public void setChildren(Collection<Node> children) {
        this.children = children;
    }

    public void addChild(Node child) {
        this.children.add(child);

    }

    public void removeChild(Node child) {
        this.children.remove(child);
    }
    }