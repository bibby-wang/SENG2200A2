// The University of Newcastle
// School of Electrical Engineering and Computer Science
// SENG2200 Programming Languages & Paradigms
// Semester 1, 2018
// Programming Assignment 2
// Due Sunday, 06 May 2018
// Author: Binbin Wang
// Modified by: Binbin Wang
// Student No: 3214157
public class LinkedList<T> {
	private int size;          // 表中元素的数量
	private Node<T> sentinel = new Node<>();       // 哨兵节点
	private Node<T> head = new Node<>();       //头节点
	
//Constructors
	public LinkedList() {
		head=null;
		sentinel=null;
		size=0;
	}
	
	public int getSize(){
		return size;
	}
	
//add a polygon
	public LinkedList(T newData){
		//head.setData(newData);
		//size++;
	}
	
	//added before the head point
	public void append(T newData){
		
		Node<T> newNode = new Node<>();//new node
		newNode.setData(newData);//set data to new Node
		newNode.setPrevious(head.getPrevious()); //link the new node to tail (Previous->tail)
		newNode.setNext(head);	//link the new Node to tail (Next->head)
		head.getPrevious().setNext(newNode);//old tail Next->new node
		head.setPrevious(newNode);//head Previous->new node


		size++;
	}
	//added behind head point
	public void prepend(T newData){
		

		Node<T> newNode = new Node<>();//new node
		newNode.setData(newData);//set data to new Node
		newNode.setPrevious(head); //link the new node to tail (Previous->tail)
		newNode.setNext(head.getNext());	//link the new Node to tail (Next->head)
		head.getNext().setPrevious(newNode);//old tail Next->new node
		head.setNext(newNode);//head Previous->new node


		size++;
	}
	
	
	private Node getFromHead(){
		return;
	}

	
	
	public String outPutString(){
		String outPutString="";
		int count=size;
		sentinel = head;
		while(sentinel.getNext()!=head){
			
			outPutString+=sentinel.getNext().getData().toString();
			sentinel=sentinel.getNext();
			count--;
		}
		return outPutString;
	}

}