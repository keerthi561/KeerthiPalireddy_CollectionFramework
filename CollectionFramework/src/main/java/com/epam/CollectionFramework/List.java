package com.epam.CollectionFramework;

public class List {
	public Node head;

    public List() {
        this.head = null;
    }

    public Node insertNode(int nodeData) {
        Node nn = new Node(nodeData);
        Node temp = head;
        
    	if (head == null) {
    		head = nn;
    		return head;
    	}
    	
    	while(temp.next != null) {
    		temp = temp.next;
    	}
    	temp.next = nn;
    	return head;
    }

	@Override
	public String toString() {
		return "List [head=" + head + "]";
	} 
}
