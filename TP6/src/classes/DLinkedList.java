package classes;

public class DLinkedList {
    private DNode head, tail;
    private int size;

    public DLinkedList() {
        head = new DNode(0, null, null);
        tail = new DNode(0, null, null);
        size = 0;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public DNode getHead() {
        return head;
    }

    public void setHead(DNode head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public DNode getTail() {
        return tail;
    }

    public void setTail(DNode tail) {
        this.tail = tail;
    }

    public void addFirstDouble(int value){
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



    public int getIndexElement(int index){
        DNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp.getElement();

    }

    public DNode getIndexNode(int index){
        DNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();

        }
        return temp;
    }

    public void setList(int index, DNode node){
        DNode temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        temp.setNext(node);
        node.setPrev(temp);
    }


    public void addLastDouble(int value){
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

    public String afficherListe(){
        DNode temp = head;
        String liste="";
        while (temp != null){
            liste+=temp.getElement() + " - ";
            temp = temp.getNext();
        }
        return liste;
    }

}
