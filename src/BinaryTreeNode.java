
public class BinaryTreeNode {
	
	public int data;
	public BinaryTreeNode leftTree;
	public BinaryTreeNode rightTree;
	
	public BinaryTreeNode(int data,BinaryTreeNode leftNode,BinaryTreeNode rightTree){
		
		this.data=data;
		this.leftTree=leftNode;
		this.rightTree=rightTree;
		
	}

	public int getData() {
		return data;
	}
	public void setData(int data) {
		this.data = data;
	}
	public BinaryTreeNode getLeftTree() {
		return leftTree;
	}
	public void setLeftTree(BinaryTreeNode leftTree) {
		this.leftTree = leftTree;
	}
	public BinaryTreeNode getRightTree() {
		return rightTree;
	}
	public void setRightTree(BinaryTreeNode rightTree) {
		this.rightTree = rightTree;
	}
	
	

}
