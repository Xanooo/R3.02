package classes;

public class DNode {
    private int element;
    private DNode next, prev;

    /**
     * Constructeur de la classe DNode
     * @param element
     * @param next
     * @param prev
     */
    public DNode(int element, DNode next, DNode prev) {
        this.element = element;
        this.next = next;
        this.prev = prev;
    }

    /**
     * Renvoie l'élément de la classe DNode
     *
     * @return
     */
    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    /**
     * Renvoie le noeud suivant
     * @return
     */
    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }

    /**
     * Renvoie le noeud précédent
     * @return
     */
    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }
}
