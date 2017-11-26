
public class testBST {
	public static void main(String[] args) {
		BST<String> bst = new BST<>() ; 
		bst.insert(10, "10");
		bst.insert(5, "5");
		bst.insert(22, "22");
		bst.insert(2, "2");
		bst.insert(4, "4");
		bst.insert(6, "6");
		bst.insert(50, "50");
		System.out.println(bst.isLeaf(2));
	}
}
