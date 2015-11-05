//Implemented by Benjamin Nicholes

public class StackAdapter implements QueueInterface {
		
	Stack stack;
	
	public StackAdapter(Stack stack){
		this.stack = stack;
	}
	
	public int Size(){
		return stack.getSize();
	}
	
	public boolean Empty(){
		return stack.isEmpty();
	}
	
	public void Enqueue(int value){
		stack.push(value);
	}
	
	public int Dequeue(){
		return stack.pop();
	}

}
