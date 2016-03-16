//Benjamin Nicholes
//10/23/15
public class Node {

	Node left;
	Node right;
	String decoration;
	
	public Node(){
		this.left = null;
		this.right = null;
		this.decoration = "";
	}
	
	public Node(Node left, Node right, String decoration) {
		this.left = left;
		this.right = right;
		this.decoration = decoration;
	}
	
	public String getDecoration() {
		return this.decoration;
	}
}
