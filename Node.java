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
	//元素类型为int的节点
	private T data;
	private Node<T> next;
	private Node<T> previous;


	//定义构造器
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



	//更改元素数值
	public void setData(T newData){
		this.data = newData;
	}
	//读取元素数值
	public T getData(){
		return data;
	}
	
	//更改元素的指向
	public void setNext(Node<T> newNext){
		this.next = newNext;
	}
	
	//读取元素的指向
	public Node<T> getNext(){
		return next;
	}
	
	
	//更改元素的指向
	public void setPrevious(Node<T> newPrevious){
		this.previous = newPrevious;
	}
	
	//读取元素的指向
	public Node<T> getPrevious(){
		return previous;
	}	

}