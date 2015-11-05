//Implemented by Benjamin Nicholes

public class Queue{
	private int[] arr;
	private int rear = -1;
	
	public Queue( int maxSize ){		
		arr = new int[ maxSize ];
	}
	
	public int Size(){		
		return ( rear + 1 );
	}
	
	public boolean Empty(){		
		return ( rear == -1 );
	}
	
	public void Enqueue( int item ){		
		arr[ ++rear ] = item;
	}
	
	public int Dequeue() {		
		int item = arr[ 0 ];		
		for( int i = 0; i < rear; i++ ){			
			arr[ i ] = arr[ i + 1 ];
		}		
		rear--;		
		return item;
	}

}
