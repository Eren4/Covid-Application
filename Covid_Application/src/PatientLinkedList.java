public class PatientLinkedList {
private Node root;

public PatientLinkedList() {
	this.root = null;
}

public boolean isEmpty() {
	return (this.root == null);
}

public boolean insert_at_front(Patient a) {
	Node inserted = new Node(a);
	if(isEmpty()) {
		this.root = inserted;
		return true;
	}
	else {
		inserted.setNext(this.root);
		this.root = inserted;
		return true;
	}
}

public boolean insert_at_last(Patient a) {
	Node inserted = new Node(a);
	if(isEmpty()) {
		this.root = inserted;
		return true;
	}
    Node last = this.root;
    while(last.getNext() != null) 
    	last = last.getNext();
    last.setNext(inserted);
	return true;
}

public void output_list() {
	Node temp = this.root;
	while(temp != null) {
		System.out.println(temp.getData().toString());
		temp = temp.getNext();
	}
}

public boolean deleteFromLast() {
	if(isEmpty())
		return false;
	
	Node last = this.root;
    while(last.getNext() != null) 
    	last = last.getNext();
    
    Node prev = this.root;
    while(prev.getNext() != last)
    	prev = prev.getNext();
    prev.setNext(null);
    
    return true;
}

public boolean containsTC(String tc_no) {
	Node temp = this.root;
	while(temp != null && !temp.getData().getTc_number().equals(tc_no))
		temp = temp.getNext();
	if(temp != null)
		return true;
	else
		return false;
}

public boolean containsPassword(String temp_password) {
	Node temp = this.root;
	while(temp != null && temp.getData().getPassword().equals(temp_password))
		temp = temp.getNext();
	if(temp != null)
		return true;
	else
		return false;
}

public int countIstanbul() {
	int count = 0;
	Node current = this.root;
	while(current != null) {
		if(current.getData().getCity().equals("Istanbul")) {
			count++;
		    current = current.getNext();
		}
		else
			current = current.getNext();
	}
	return count;
}

public int countAnkara() {
	int count = 0;
	Node current = this.root;
	while(current != null) {
		if(current.getData().getCity().equals("Ankara")) {
			count++;
		    current =current.getNext();
		}
		else
			current = current.getNext();
	}
	return count;
}

public int countIzmir() {
	int count = 0;
	Node current = this.root;
	while(current != null) {
		if(current.getData().getCity().equals("Izmir")) {
			count++;
		    current = current.getNext();
		}
		else
		    current = current.getNext();
	}
	return count;
}

public Patient getLast() {
	if(isEmpty())
		return null;
	
	Node current = this.root;
	while(current.getNext() != null) 
		current = current.getNext();
	return current.getData();
}
}
