package arraylist;
import java.util.LinkedList;
public class linkedlist_collection_class {
	public static void main(String[]args) {
		LinkedList<Integer>list=new LinkedList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		System.out.println("The linkedlist is "+list);  //Display the code
		System.out.println("The size of the LL is "+list.size()); //To know the size of the given linkedlist
		
		//To get the Given Size
		System.out.println("Lets get the elementin index number value 1 is --> "+list.get(1));
		
		//Lets update the 1st number
		list.add(0,5);
		System.out.println("The updated linkedlist is "+list);
		
		//IN COLLECTION CLASS ARRAY LIST AND LINKEDLIST CODES ARE TOTALLY SAME.
		
	}
	
	
	
	

}
