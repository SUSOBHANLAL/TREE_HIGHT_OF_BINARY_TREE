package hhightofbinarytree;
class node{
	int key;
	node left;
	node right;
	node(int key){
		this.key= key;
		left= null;
		right= null;
	}
}
public class susobhan {
	public static void main(String args[]) {
		node root = new node(12);
		root.left= new node(11);
		root.right= new node(13);
		root.left.left= new node(15);
		root.left.right= new node(17);
		root.left.left.left=new node(11);
		root.left.left.right=new node(15);
		root.left.left.right.left=new node(15);
		root.left.left.right.right=new node(15);
		System.out.print("the hight of thrs tree:   "+hightnode(root));
		
	}
		
		static int hightnode(node root) {
			if(root == null) {
				return 0;
			}
			else 
			{
				return Math.max(hightnode(root.left), hightnode(root.right))+1;
			}
		}
	

}
