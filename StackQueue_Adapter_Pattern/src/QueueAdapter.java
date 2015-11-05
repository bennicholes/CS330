//Implemented by Benjamin Nicholes

public class QueueAdapter extends Stack{
	
	Queue queue;
	
	public QueueAdapter(Queue queue){
		this.queue = queue;
	}
	
	public int getSize(){
		return queue.Size();
	}
	
	public boolean isEmpty(){
		return queue.Empty();
	}
	
	public int pop(){
		return queue.Dequeue();
	}
	
	public void push(int value){
		queue.Enqueue(value);
	}
}
