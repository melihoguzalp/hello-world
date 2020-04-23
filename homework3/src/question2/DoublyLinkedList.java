package question2;

	public class DoublyLinkedList<T> {
	

	private Node<T> head;
	private boolean isempty;
	private int size;
	
	
	Node<T> nodes = new Node<T>();
	
	
	public DoublyLinkedList(){
		isempty = true;
		size = 0;
	}
	
	
	public Node<T> gethead(){
		return head;	
	}
	
	public int getsize(){
		return size;
	}
	
	
	public void insert(Node<T> node, T value){
		
		if(node == head && node == null){
			
			head = new Node<T>();
			head.value = value;
			size++;
			
		}
		else{
			
			if(node.next == null){
				
				node.next = new Node<T>();
				node.next.value = value;
				node.next.previous = node;
				size++;
			}
			
			else{
				
				insert(node.next, value);
			}
		}
	}
	
	public void delete(T value){
		
		if(head == null){
			
			return;
		}
		
		else{
			
			if(head.value == value){
				
				Node<T> temp;
				temp = head;
				head = temp.next;
				temp.previous = null;
				temp.next = null;
				
				size--;
			}
		}
		
		delete(head,value);
	}
	
	
	
	private void delete(Node<T> current, T value){
		
		if(current == null){
			return;
		}
		else{
			
			if(current.next.value == value && current.next.next!=null){
				
				Node<T> temp;
				temp = current.next;
				temp.previous = null;
				current.next = current.next.next;
				temp.next = null;
				current.next.previous = current;
				size--;
				return;
				
			}
			
			else if(current.next.value == value && current.next.next == null){
				
				current.next.previous = null;
				current.next = null;
				
			}
			
			delete(current.next,value);
		}
	}
	
	
	
	public void print(){
		
		print(head);
	}
	
	private void print(Node<T> current) {
		
		if(current == null){
			return;
		}
		else{
			
			System.out.println(current.value);
			print(current.next);
		}	
	}
}
