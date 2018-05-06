// The University of Newcastle
// School of Electrical Engineering and Computer Science
// SENG2200 Programming Languages & Paradigms
// Semester 1, 2018
// Programming Assignment 2
// Due Sunday, 06 May 2018
// Author: Binbin Wang
// Modified by: Binbin Wang
// Student No: 3214157







public class Node<T> {
	
	private T data;
	private Node<T> next;
	private Node<T> previous;


	public Node() {
		data = null;
		this.previous = this;
		this.next = this;
	}	
	
	public Node(T newData, Node<T> preNode, Node<T> nextNode){
		this.data = newData;
		this.previous = preNode;
		this.next = nextNode;
	}



	public void setData(T newData){
		this.data = newData;
	}

	public T getData(){
		return data;
	}

	public void setNext(Node<T> newNext){
		this.next = newNext;
	}

	public Node<T> getNext(){
		return next;
	}

	public void setPrevious(Node<T> newPrevious){
		this.previous = newPrevious;
	}

	public Node<T> getPrevious(){
		return previous;
	}	

}