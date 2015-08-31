public class LinkedListTest {
 
    public static void main(String[] args) {
        linkedList lList = new linkedList();
        lList.add("4");
        lList.add("8");
        lList.add("15");
        lList.add("16");
        lList.add("23");
        lList.add("42");
 
        System.out.println("Linkedlist: " + lList);
        System.out.println("Size: " + lList.size());
        System.out.println("Third element: " + lList.get(3));
        System.out.println("Remove third element: " + lList.remove(3));
        System.out.println("New third element: " + lList.get(3));
        System.out.println("New size: " + lList.size());
        System.out.println("New linkedlist: " + lList);
    }
}
 
class linkedList {
    private Node head;
    private int listCount;

    public linkedList() {
        head = new Node(null);
        listCount = 0;
    }
 
    public void add(Object data)
    {
        Node temp = new Node(data);
        Node current = head;
        while (current.getNext() != null) {
            current = current.getNext();
        }
        current.setNext(temp);
        listCount++;
    }
 
    public void add(Object data, int index)
    {
        Node temp = new Node(data);
        Node current = head;
        
        for (int i = 1; i < index && current.getNext() != null; i++) {
            current = current.getNext();
        }
        temp.setNext(current.getNext());
        current.setNext(temp);
        listCount++;
    }
 
    public Object get(int index)
    {
        if (index <= 0)
            return null;
        Node current = head.getNext();
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return null;
            current = current.getNext();
        }
        return current.getData();
    }
 
    public boolean remove(int index)
    {
        if (index < 1 || index > size())
            return false;
        Node current = head;
        for (int i = 1; i < index; i++) {
            if (current.getNext() == null)
                return false;
            current = current.getNext();
        }
        current.setNext(current.getNext().getNext());
        listCount--;
        return true;
    }
 
    public int size()
    {
        return listCount;
    }
 
    public String toString() {
        Node current = head.getNext();
        String output = "";
        while (current != null) {
            output += "[" + current.getData().toString() + "]";
            current = current.getNext();
        }
        return output;
    }
 
    private class Node {
        Node next;
        Object data;
        public Node(Object dataValue) {
            next = null;
            data = dataValue;
        }
        
        public Node(Object dataValue, Node nextValue) {
            next = nextValue;
            data = dataValue;
        }
 
        public Object getData() {
            return data;
        }
 
        public void setData(Object dataValue) {
            data = dataValue;
        }
 
        public Node getNext() {
            return next;
        }
 
        public void setNext(Node nextValue) {
            next = nextValue;
        }
    }
}
