
public class Node {
private Node next;
private Patient data;

public Node() {
	this.next = null;
	this.data = null;
}

public Node(Patient new_data) {
	this.data = new_data;
	this.next = null;
}

public Node(Patient new_data, Node new_next) {
	this.data = new_data;
	this.next = new_next;
}

public Node getNext() {
	return next;
}

public void setNext(Node next) {
	this.next = next;
}

public Patient getData() {
	return data;
}

public void setData(Patient data) {
	this.data = data;
}


}
