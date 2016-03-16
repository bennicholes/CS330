//Benjamin Nicholes
//10/23/15
public class Tree{

	Node root;
	int numLeft;
	int numRight;
	
	public Tree(){
		this.root = null; 
	}
	
	public void insert(String description){
		root = insertHelper(root, description);
	}
	
	private Node insertHelper(Node node, String description){

		// empty
		if (node == null){
			return new Node(null, null, description);
		}

		else {
			int numLeftNodes = getSize(node.left);
			int numRightNodes = getSize(node.right);
			
			// check left
			if(numLeftNodes <= numRightNodes) {
				node.left = insertHelper(node.left, description);
			}
			else{ 
				node.right = insertHelper(node.right, description);
			}
		}
		
		return node;
	}
	
	public int getSize(Node node){
		if (node == null){
			return 0; 
		}
		
		numLeft = getSize(node.left);
		numRight = getSize(node.right);
		return (1 + numLeft + numRight); 
	}
	
}
