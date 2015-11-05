//Implemented by Benjamin Nicholes
public class TestAdapter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack stackOne = new Stack(5);
		Queue queueOne = new Queue(5);
		boolean isEmpty;
		int size;

				// Tests check for empty, enqueue, check size, check if empty, dequeue, check size, then check if empty 
				// Tests for assignment 1
				System.out.println("Assignment 1: Stack to Queue \n");
				StackAdapter stackAsQueue = new StackAdapter(stackOne);
				isEmpty = stackAsQueue.Empty();
				System.out.println("Empty: "+isEmpty);
				stackAsQueue.Enqueue(5);
				stackAsQueue.Enqueue(6);
				stackAsQueue.Enqueue(7);
				size = stackAsQueue.Size();
				System.out.println("Size: " + size);
				isEmpty = stackAsQueue.Empty();
				System.out.println("Empty: "+ isEmpty);
				stackAsQueue.Dequeue();
				size = stackAsQueue.Size();
				System.out.println("Size: " + size);
				stackAsQueue.Dequeue();
				size = stackAsQueue.Size();
				System.out.println("Size: " + size);
				stackAsQueue.Dequeue();
				size = stackAsQueue.Size();
				System.out.println("Size: " + size);
				isEmpty = stackAsQueue.Empty();
				System.out.println("Empty: "+ isEmpty);
				System.out.println("\n");
				
				// Tests check for empty, enqueue, check size, check if empty, dequeue, check size, then check if empty 
				// Tests for assignment 2
				System.out.println("Assignment 2: Queue to Stack \n");
				QueueAdapter queueAsStack = new QueueAdapter(queueOne);
				isEmpty = queueAsStack.isEmpty();
				System.out.println("Empty: "+isEmpty);
				queueAsStack.push(5);
				queueAsStack.push(6);
				queueAsStack.push(7);
				queueAsStack.push(8);
				size = queueAsStack.getSize();
				System.out.println("Size: " + size);
				isEmpty = queueAsStack.isEmpty();
				System.out.println("Empty: "+isEmpty);
				queueAsStack.pop();
				size = queueAsStack.getSize();
				System.out.println("Size: " + size);
				queueAsStack.pop();
				size = queueAsStack.getSize();
				System.out.println("Size: " + size);
				queueAsStack.pop();
				size = queueAsStack.getSize();
				System.out.println("Size: " + size);
				queueAsStack.pop();
				size = queueAsStack.getSize();
				System.out.println("Size: " + size);
				isEmpty = queueAsStack.isEmpty();
				System.out.println("Empty: "+isEmpty);
				
			}
	
	Queue queueOne = new Queue(5);
	

}

