public class PatientBST {
private TreeNode root;

public PatientBST() {
	this.root = null;
	insert(50);
	insert(25);
	insert(75);
	insert(10);
	insert(40);
	insert(60);
	insert(90);
}

public void refresh() {
	this.root = null;
	insert(50);
	insert(25);
	insert(75);
	insert(10);
	insert(40);
	insert(60);
	insert(90);
}

public boolean insert(Patient addedPatient) {
	TreeNode addedNode = new TreeNode(addedPatient.getAge());
	if(isEmpty()) {
		this.root = addedNode;
		return true;
	}
	else {
		TreeNode parent = null;
		TreeNode current = this.root;
		while(current != null) {
			if(addedNode.getData() < current.getData()) {
				parent = current;
				current = current.getLeft();
			}
			else if(addedNode.getData() > current.getData()) {
				parent = current;
				current = current.getRight();
			}
			else
				return false;
		}
		if(addedNode.getData() < parent.getData())
			parent.setLeft(addedNode);
		else
			parent.setRight(addedNode);
		return true;
	}
}

public boolean insert(int i) {
	TreeNode addedNode = new TreeNode(i);
	if(isEmpty()) {
		this.root = addedNode;
		return true;
	}
	else {
		TreeNode parent = null;
		TreeNode current = this.root;
		while(current != null) {
			if(addedNode.getData() < current.getData()) {
				parent = current;
				current = current.getLeft();
			}
			else if(addedNode.getData() > current.getData()) {
				parent = current;
				current = current.getRight();
			}
			else
				return false;
		}
		if(addedNode.getData() < parent.getData())
			parent.setLeft(addedNode);
		else
			parent.setRight(addedNode);
		return true;
	}
}

public boolean hasLeft(int key) {
	TreeNode current = this.root;
	while(current.getData() != key) {
		if(current.getData() > key)
			current = current.getLeft();
		else
			current = current.getRight();	
	}
	if(current.getLeft() != null)
		return true;
	else
		return false;
}

public boolean hasRight(int key) {
	TreeNode current = this.root;
	while(current.getData() != key) {
		if(current.getData() > key)
			current = current.getLeft();
		else
			current = current.getRight();
	}
	if(current.getRight() != null)
		return true;
	else
		return false;
}

public void inOrder_recursion(TreeNode root) {
	if(root == null)
		return;
	inOrder_recursion(root.getLeft());
	System.out.print(root.getData() + " ");
	inOrder_recursion(root.getRight());
}

public boolean isEmpty() {
	return (this.root == null);
}

public TreeNode getRoot() {
	return root;
}

public void setRoot(TreeNode root) {
	this.root = root;
}

}
