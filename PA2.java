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
		System.out.println("=========GET DATA FILE============");
		String fileName=args[0];
		MyPolygons<Polygon> myPolygons = new MyPolygons<>();
		try{
			
			Scanner inputStream = new Scanner (new File (fileName));//get the database name 
			String dataStr=null;
			int i=0;
			//get the all data by each line
			while (inputStream.hasNextLine ())
			{i++;
				dataStr = inputStream.nextLine ();
				//check the empty line
	System.out.println(i+"=========test get point data============");
				Polygon newPolygon =new Polygon();
				//String dataStr="P 6 2 2 4 6 11 8 7 4 9 1 5 1";
				newPolygon.setPoints(dataStr);
	
				myPolygons.append(newPolygon);

				
			}
			inputStream.close ();	
			
			
		}catch(Exception erro){
			System.out.println(erro.toString());	
		}
	
		
		
		System.out.println("========ouput datas=============");

		System.out.println(myPolygons.outPutString());		
		
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("=====================");
		System.out.println("=====================");
		
		
		System.out.println("=====================");
			
		
   }
   

   
}










