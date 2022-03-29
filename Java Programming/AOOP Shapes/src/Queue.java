import java.util.NoSuchElementException;

/**
 * 
 * A class that implements a queue.  
 * The queue uses a linked list constructed by LinkedListElements.  However, the queue must be general and allow
 * setting of any type of Object. 
 *
 */

public class Queue {

	private QueueElement head;
	private QueueElement tail;
	
	/**
	 * Constructs an empty Queue.
	 */
	public Queue () {
	  
		head = null;
		tail = null;
	}
	
	/**
	 * Determines if the queue is empty
	 * @return true or false
	 */
	public boolean isEmpty () {
	 
	    return ((head == null) && (tail == null));
	}
	
	/**
	 * Peeks the top value of the queue
	 * @return the element at the front of the queue
	 * @throws NoSuchElementException
	 */
	public Object peek () throws NoSuchElementException {
		
		if (isEmpty()) throw new NoSuchElementException("Queue Empty"); /*  Throw an exception if the queue is empty  */
		
		return head.getElement();
	}
	
	/**
	 * Removes the first element on the queue
	 * @throws NoSuchElementException
	 */
	public void dequeue () throws NoSuchElementException {
	    
		if (isEmpty()) throw new NoSuchElementException(); /*  Throw an exception if the queue is empty  */
		
		QueueElement rHead = head;
		head = rHead.getNext();
		
		/*  If head does not exist  */
		if (head == null) {
			/*  Remove tail  */
			tail = null;
		}
	}
	
	/**
	 * Puts an element on the back of the queue
	 * @param element An object to be added to the queue
	 */
	public void enqueue (Object element) { 
	    
		QueueElement newElement = new QueueElement(element, null);
		
		/*  Checks if the queue is empty  */
		if (isEmpty()) {
			/*  Adds the QueueElement to the head and tail of the queue  */
			head = newElement;
			tail = newElement;
		}
		else {
			/*  Adds the new Element to the tail of the queue  */
			tail.setNext(newElement);
			newElement.setNext(null);
			tail = newElement;
		}
	}
	
	/**
	 * Method to print the full contents of the queue in order from head to tail.
	 * @throws NoSuchElementException
	 */
	public void print () {
		try {
			if (isEmpty()) throw new NoSuchElementException("The queue is empty");
			QueueElement pHead = head;
	        while (pHead != tail.getNext() )
	        {
	            System.out.println(pHead.getElement());
	            pHead= pHead.getNext();
	        }
	        System.out.println();        
	    }
		catch (NoSuchElementException e) {
			System.out.println("The queue is empty.");
		}
	}
}
