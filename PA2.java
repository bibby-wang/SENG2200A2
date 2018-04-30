// The University of Newcastle
// School of Electrical Engineering and Computer Science
// SENG2200 Programming Languages & Paradigms
// Semester 1, 2018
// Programming Assignment 2
// Due Sunday, 06 May 2018
// Author: Binbin Wang
// Modified by: Binbin Wang
// Student No: 3214157
import java.io.*;
import java.util.*;


public class PA2 {
   public static void main(String[] args) {
		
		System.out.println("==========START==========");
		System.out.println("=====================");

		
		System.out.println("=========test point============");
		Point p1= new Point(1,8.335);
		Point p2= new Point(1.5,333.335);
		Point p3= new Point(3.3,333.335);
		Point p4= new Point(4.889,333.335);
		
		System.out.println(p1.getX());
		System.out.println(p2.toString());		

		System.out.println("=========test node============");
		MyPolygons<Point> myP = new MyPolygons<>();		
		myP.append(p1);
		myP.append(p2);
		myP.append(p3);
		myP.append(p4);
		
		System.out.println("==="+myP.get());
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("=====================");
		
		
		System.out.println("=====================");
		
		
		
		
		
		
		
   }
}