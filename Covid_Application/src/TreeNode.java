
public class TreeNode {
private int age;
private TreeNode right, left;

public TreeNode(int newAge) {
	this.age = newAge;
	this.right = null;
	this.left = null;
}

public int getData() {
	return age;
}

public void setData(int data) {
	this.age = data;
}

public TreeNode getRight() {
	return right;
}

public void setRight(TreeNode right) {
	this.right = right;
}

public TreeNode getLeft() {
	return left;
}

public void setLeft(TreeNode left) {
	this.left = left;
}


}
