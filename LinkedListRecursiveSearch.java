package SS;

class LinkedListRecursiveSearch<E> {
	private Node<E> head;
	
	private class Node<E>{
		E data;
		Node<E> next;
		
		public Node(E data){
			this.data = data;
			this.next = null;
		}
	}
	
	public LinkedListRecursiveSearch() {
		this.head = null;
	}
	
	
	public void addNodeRecursive(E data) {
		 if (head == null) {
			 head = new Node<>(data);
		 } else {
			 addNodeToTailRecursive(data, head);
		 }
		}
		private void addNodeToTailRecursive(E data, Node<E> current) {
		 if (current.next == null) {
		 // If the next node is null, create a new node and link it to current.next.
			 current.next = new Node<>(data);
		 } else {
		 // Continue the recursion with the next node.
		 	addNodeToTailRecursive(data, current.next);
		 }
		}


	
	public boolean searchForValue(E data) {
			
			return searchForTheValue(data, head ) ;
			
		}
		
		private boolean searchForTheValue(E data, Node<E> current) {
			 if (current.data == data) {
			 // If the next node is null, create a new node and link it to current.next.
			 return true;
			 		}
			 else if (current.next == null) {
			 	 return false;
			 }
			 else {
			 // Continue the recursion with the next node.
			 	return searchForTheValue(data, current.next);
			 }
		}
		
	
	public static void main(String[] args) {
		LinkedListRecursiveSearch<Integer> list = new LinkedListRecursiveSearch<Integer>();
		
		list.addNodeRecursive(1);
		list.addNodeRecursive(2);
		list.addNodeRecursive(3);
		list.addNodeRecursive(4);
		list.addNodeRecursive(5);
		list.addNodeRecursive(6);
		list.addNodeRecursive(7);
		list.addNodeRecursive(8);
		
		int searchValue = 5;
		boolean found = list.searchForValue(searchValue);
		
		if(found) {
			System.out.println("The number " + searchValue + " was found in the linked list.");
		}else {
			System.out.println("The number " + searchValue + " was not found in the linked list.");
		}
		
		
	}
		
}

