package classes;

public class DLinkedList {
    private DNode head, tail;
    private long size;

    public DLinkedList() {
        head = new DNode("", null, null);
        tail = new DNode("", null, null);
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public void addFirstDouble(String value){
        DNode newNode = new DNode(value, null, null);
        if (isEmpty()){
            head = tail = newNode;

        }
        else {
            newNode.setNext(head);
            head.setPrev(newNode);
            head = newNode;
        }
        size++;
    }

    public void addLastDouble(String value){
        DNode newNode = new DNode(value, null, null);
        if (isEmpty()) {
            head = tail = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrev(tail);
            tail = newNode;
        }
        size++;
    }

    public void afficherListe(){
        DNode temp = head;
        while (temp != null){
            System.out.println(temp.getElement() + " - ");
            temp = temp.getNext();
        }
        System.out.println("null");
    }

}
