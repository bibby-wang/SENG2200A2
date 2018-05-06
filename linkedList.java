// The University of Newcastle
// School of Electrical Engineering and Computer Science
// SENG2200 Programming Languages & Paradigms
// Semester 1, 2018
// Programming Assignment 2
// Due Sunday, 06 May 2018
// Author: Binbin Wang
// Modified by: Binbin Wang
// Student No: 3214157
public class LinkedList<E> {
	private int size;          // number of nodes
	private Node<E> sentinel = new Node<>();       // sentinel node
	private Node<E> head = new Node<>();       //head node
	
//Constructors
	public LinkedList() {
		size=0;
	}
	
	public int getSize(){
		return size;
	}
	
//add a polygon
	public LinkedList(E newData){
		Node<E> newNode = new Node<>();//new node
		newNode.setData(newData);//set data to new Node		
		newNode.setPrevious(head); //link the new node to tail (Previous->tail)
		newNode.setNext(head);	//link the new Node to tail (Next->head)
		head.setNext(newNode);//old tail Next->new node
		head.setPrevious(newNode);//head Previous->new node
		size++;
	}
	
	//added before the head point
	public void append(E newData){
		
		Node<E> newNode = new Node<>();//new node
		newNode.setData(newData);//set data to new Node
		newNode.setPrevious(head.getPrevious()); //link the new node to tail (Previous->tail)
		newNode.setNext(head);	//link the new Node to tail (Next->head)
		head.getPrevious().setNext(newNode);//old tail Next->new node
		head.setPrevious(newNode);//head Previous->new node


		size++;
	}
	//added behind head point
	public void prepend(E newData){
		

		Node<E> newNode = new Node<>();//new node
		newNode.setData(newData);//set data to new Node
		newNode.setPrevious(head); //link the new node to tail (Previous->tail)
		newNode.setNext(head.getNext());	//link the new Node to tail (Next->head)
		head.getNext().setPrevious(newNode);//old tail Next->new node
		head.setNext(newNode);//head Previous->new node


		size++;
	}
	

	
	public String toString(){
		String str="";
		int count=size;
		sentinel = head;
		while(sentinel.getNext()!=head){
			
			str+=sentinel.getNext().getData().toString()+"\n";
			sentinel=sentinel.getNext();
			count--;
		}
		return str;
	}

}