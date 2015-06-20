import java.util.ArrayList;

public class List {
	int i;
	public int size(){
		return size();
		}
	
	public void addElement(Integer i){
		int b = new Integer(i);
		}
	
	public Integer getElement(int i){
		return Integer.valueOf(i);
		}

	public static void main(String[] args){
		List list = new List();
		list.addElement(7);
		list.addElement(6);
		list.addElement(4);
		list.addElement(3);
		System.out.println();
		}


public class ListItem extends List{
	private Integer value;
	public Integer getValue(){
		return value;
	}
	public void setValue(ListItem i){
		i = new ListItem();
	}
	public void setNext(){
		next = new ListItem();
	}
	public ListItem getNext(){
		return next;
	}

	private ListItem head;
	private ListItem next;

	public void add(ListItem i){
		ListItem item = new ListItem();
		item.setValue(i);
			if(head==null)
				head = item;
				else{
					ListItem pointer = head;
					if (head != null)
						while(pointer.getNext() != null){
							pointer=pointer.getNext();
							}
							pointer=pointer.setNext(item);
				}
		}
	
	}
}
