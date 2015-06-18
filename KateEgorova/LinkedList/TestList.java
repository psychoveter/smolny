package numList;


import numList.LinkedList;

public class TestList {
	
		
	public static void main(String[] args){
		 
		
		LinkedList list = new LinkedList();
		
		list.add(3);
		list.add(4);
		list.add(23);
		list.add(16);
		list.add(335);
		
		
		System.out.println(list.toString1());
		
		list.delete(3);
		
		System.out.println(list.toString1());
	
		}
	
}
