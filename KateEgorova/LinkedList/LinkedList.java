package numList;

public class LinkedList{
	private Node head;
	
	public LinkedList(){
		this.head = null;
	}
	
	public void add(int value){
		Node node = new Node();
		node.setValue(value);
		node.setNext(head);
		head = node;
		
	} 
	
	public Node find (int i){
		return find (head, i);
		
	}

	private Node find (Node node, int i) {
		if (head == null)return null;
		if (head.getValue() == i)return head;
		return find(node.getNext(), i);
		
	}
	
	public void delete(int i){
		Node element = find(i);
		if (element != null){
			Node predecessor = findPredecessor(i);
			if(predecessor != null){
				predecessor.setNext(element.getNext());
			} else {
				head = element.getNext();
			}
			element = null;
		}
		
		}

	private Node findPredecessor(int i) {
		return findPredecessor(head, i);
	}

	private Node findPredecessor(Node node, int i) {
		if(node == null || node.getNext() == null) return null;
		if(node.getNext().getValue() == i)return node;
		
		return findPredecessor(node.getNext(), i);
	}


	public String toString1() {//toString1 и toString2 чтобы отличать от обычного toString
		return toString2(head);
	   }
	
	public String toString2(Node node) {
		if (node == null) {
		    return "";
		} else {
		    return node.getValue() + " " + toString2(node.getNext());
		}
	   }
}

class Node{
	 
	    private int value;
	    private Node next;
	     
	    public int getValue() {
	        return this.value;
	    }
	     
	    public void setValue(int value) {
	        this.value = value;
	    }
	     
	    public void setNext(Node next) {
	        this.next = next;
	    }
	     
	    public Node getNext() {
	        return this.next;
	    }

	}

	
