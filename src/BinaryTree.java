
public class BinaryTree {
	
	BinaryTreeNode root;
	
	public void insert(int data){
		
		root=insert(root,data);
		
	}
	
	public BinaryTreeNode insert(BinaryTreeNode node, int data){
		
		if(node == null){
			
			node=new BinaryTreeNode(data,null,null);
			
		}else{
			
			if(data <= node.getData()){
				node.leftTree=insert(node.getLeftTree(),data);
				System.out.println("Insert Left"+data);

			}else{
				
				node.rightTree=insert(node.getRightTree(),data);
				System.out.println("Insert Right"+data);
			}
		}
		
		return node;
		
	}
	
	
	public static void main(String args[]){
		
		BinaryTree bt=new BinaryTree();
		bt.insert(10);
		bt.insert(20);
		bt.insert(30);
		bt.insert(40);
		bt.insert(5);
		bt.insert(50);
		
		System.out.println("Done");
		
		bt.printPostorder();
		
		bt.printInorder();
		
		System.out.println("Size of "+bt.size());
		
		boolean b=bt.lookUp(20);
		
		//System.out.println(b);
		
		System.out.println("Min Val"+bt.minimumValue());
		System.out.println("Max Val"+bt.maximunValue());
		
        bt.mirror();
		
		

		
	}
	
	public boolean sameTree(BinaryTreeNode first, BinaryTreeNode second){
		
		if(first==null && second == null) return true;
		
		if(first.data== second.data && sameTree(first.leftTree, second.leftTree) && sameTree(first.rightTree, second.rightTree))
		{
			return true;	
		}else{
			
			return false;
		}
	}
	
	public int size (){
		
		return size(root);
	}
	
	public int minimumValue()
	{
		return minimumValue(root);
	}
	
	public int maximunValue()
	{
		return maximumValue(root);
	}
	
	
	
	private int maximumValue(BinaryTreeNode node) {
		
		BinaryTreeNode current=node;
		
		while(current.rightTree !=null){
			
			current=current.rightTree;
			
		}
		
		
		return current.data;
	}

	private void printPostorder() { 
		
		printPostorder(root);
	}
	
	private void mirror(){
		mirror(root);
	}
	
	private void mirror(BinaryTreeNode node) {
		
		if(node !=null){
			
			mirror(node.leftTree);
			mirror(node.rightTree);
			
			BinaryTreeNode temp=node.rightTree;
			BinaryTreeNode right=node.leftTree;
			BinaryTreeNode left=temp;
			
			
			
			
		}
		
	}

	private int minimumValue(BinaryTreeNode node) {
		// TODO Auto-generated method stub
		BinaryTreeNode current=node;
		
		while(current.leftTree !=null){
			
			current=current.leftTree;
		}
		
		return current.data;
		
		
		
		
	}

	public boolean lookUp(int data){
		return lookup(root,data);
	}
	
	private boolean lookup(BinaryTreeNode node,int data) {
		

		if(node == null) return false;
		
		if(node.data == data){
			
			return true;
		}
		
	
		
		if( data > node.data  ){
			
			System.out.println("looking at right"+data);
			return lookup(node.rightTree,data);
			
		}else {
			
			return lookup(node.leftTree,data);
			
		}
		
		
		
	
		
	}
	
	public void printInorder(){
		
		printInorder(root);
		
	}
	
	private  void printInorder(BinaryTreeNode node){
		
		System.out.println("In Order");
		
		if(node ==null) return;
		
	
		
		printInorder(node.leftTree);
		System.out.println(node.data);
		printInorder(node.leftTree);
		
		
		
	}
	

	private void printPostorder(BinaryTreeNode node) { 
		
		  if (node == null) return;

		  // first recur on both subtrees 
		  printPostorder(node.leftTree); 
		  printPostorder(node.rightTree);

		  // then deal with the node 
		 System.out.print(node.data + "  "); 
		} 
		 
	
	private int size(BinaryTreeNode node){
		
		if(node == null) {
			
			return 0;
		}
		else{
			
			return size(node.leftTree)+size(node.rightTree)+1;
		}
		
		
		
	}

}
