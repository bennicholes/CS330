//Benjamin Nicholes
//10/23/15
import java.util.Iterator;
import java.util.ArrayList;


public class Test {
	public static void main(String[] args) {
		Tree tree = new Tree();
		ArrayList<String> vector = new ArrayList<String>();
		String output;
		Node currentNode;
		
		// add tree
		tree.insert("balls");
		tree.insert("star");
		tree.insert("ruffles");
		tree.insert("candles");
		tree.insert("ruffles");
		
		// test tree
		TreeIterator treeIterator = new TreeIterator(tree);
		System.out.println("Binary tree:");
		while(treeIterator.hasNext()){
			currentNode = (Node) treeIterator.next();
			System.out.println(currentNode.getDecoration());
		}
		System.out.println("\n");
		
		// add vector
		vector.add("balls");
		vector.add("star");
		vector.add("ruffles");
		vector.add("candles");
		vector.add("ruffles");
		
		// test vector
		Iterator<String> ArrayListItr = vector.iterator();
		System.out.println("Vector:");
		while (ArrayListItr.hasNext()) {
			output = (String) ArrayListItr.next(); 
			System.out.println(output);
		}
		System.out.println("\n");
	}
}