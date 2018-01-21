//program on deleting the tree//

class Tree
{
	int data;
	Tree left,right;
	public Tree(int item)
	{
		data=item;
		left=null;
		right=null;
	}	
}
class BinaryTreeDelete
{
	Tree root;
	public void deleteTree(Tree node)
	{	
		if(node==null)
		return;
		deleteTree(node.left);
		deleteTree(node.right);
		System.out.println("deleted node is"+node.data);
		node=null;
	}
	public static void main(String args[])
	{
		BinaryTreeDelete btree=new BinaryTreeDelete();
		btree.root=new Tree(1);
		btree.root.left=new Tree(2);
		btree.root.right=new Tree(3);
		btree.root.left.left=new Tree(4);
		btree.root.left.right= new Tree(5);
		btree.deleteTree(btree.root);
		btree.root=null
		System.out.println("tree deleted");
	}
}
