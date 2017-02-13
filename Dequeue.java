
public class Dequeue <T> implements DequeInterface <T>{
	private DLNode firstNode;
	private DLNode lastNode;
	
	public Dequeue(){
		firstNode = null;
		lastNode = null;
	}
	
	public void addToBack(T newEntry){
		DLNode newNode = new DLNode(lastNode, newEntry, null);
		if(isEmpty()){
			firstNode = newNode;
		}
		else{
			lastNode.setNextNode(newNode);
		}
		lastNode = newNode;
	}
	
	public void addToFront(T newEntry){
		DLNode newNode = new DLNode(null, newEntry, firstNode);
		if(isEmpty())
			lastNode = newNode;
		else 
			firstNode.setPreviousNode(newNode);
	}
	
	public T removeFront()
	{
	T front = getFront(); // Might throw EmptyQueueException
	assert firstNode != null;
	firstNode = firstNode.getNextNode();
	if (firstNode == null)
	lastNode = null;
	else
	firstNode.setPreviousNode(null);
	return front;
	}
	
	public T removeBack()
	{
	T back = getBack(); // Might throw EmptyQueueException;
	assert lastNode != null;
	lastNode = lastNode.getPreviousNode();
	if (lastNode == null)
	firstNode = null;
	else
	lastNode.setNextNode(null);
	return back;
	}
	
	
	
	
	
	
	
	private class DLNode{
		private T data;
		private DLNode next;
		private DLNode previous;
		
		public DLNode(Dequeue<T>.DLNode lastNode, T newEntry, Object object) {
			// TODO Auto-generated constructor stub
		}
		@SuppressWarnings("unused")
		public T getData() {
			return data;
		}
		@SuppressWarnings("unused")
		public void setData(T data) {
			this.data = data;
		}
		@SuppressWarnings("unused")
		public DLNode getNext() {
			return next;
		}
		@SuppressWarnings("unused")
		public void setNext(DLNode next) {
			this.next = next;
		}
		@SuppressWarnings("unused")
		public DLNode getPrevious() {
			return previous;
		}
		@SuppressWarnings("unused")
		public void setPrevious(DLNode previous) {
			this.previous = previous;
		}
		
	}
	

}
