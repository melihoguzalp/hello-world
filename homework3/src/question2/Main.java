package question2;

public class Main {

	public static void main(String[] args) {

		

		
		 String element = "Melih"; 
		 String element2 ="Melike";
		 String element3 = "Oðuz";
		 String element4 = "Alp";
		 String element5 = "Furkan";
		 
		 DoublyLinkedList<String> doublyLinkedList = new DoublyLinkedList<>();
		
		 doublyLinkedList.insert(doublyLinkedList.gethead(),element);
		 doublyLinkedList.insert(doublyLinkedList.gethead(),element2);
		 doublyLinkedList.insert(doublyLinkedList.gethead(),element3);
		 doublyLinkedList.insert(doublyLinkedList.gethead(),element4);
		 doublyLinkedList.insert(doublyLinkedList.gethead(),element5);


		
		
		 System.out.println("Size of list :" + doublyLinkedList.getsize());
		 doublyLinkedList.delete(element2);
		 System.out.println("Size of list after delete processing :" + doublyLinkedList.getsize());
		 doublyLinkedList.print();
		 
		 
		 

	
	}

}
