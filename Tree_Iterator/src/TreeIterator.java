//Benjamin Nicholes
//10/23/15
import java.util.Iterator;
import java.util.Stack;

public class TreeIterator implements Iterator{
	Tree tree;
	Stack<Node> nodeStack;
	
	public TreeIterator(Tree tree){
		Node temp; 
		this.tree = tree;
		temp = tree.root;
		this.nodeStack = new Stack<Node>();
		
		// get left nodes
		while(temp != null){
			nodeStack.push(temp);
			temp = temp.left; 
		}
	}
	
	public boolean hasNext() {
		return !(nodeStack.isEmpty()); 
	}
	
	public Object next(){
		if(hasNext()){
			Node currentNode = nodeStack.pop();
			Node temp = currentNode; 
			
			if(temp.right != null){
				temp = temp.right;
				while(temp != null){
					nodeStack.push(temp);
					temp = temp.left; 
				}
			}
			// return next node
			return currentNode; 
		}
		// otherwise no node
		return null; 
	}
}

