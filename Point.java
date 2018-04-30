// The University of Newcastle
// School of Electrical Engineering and Computer Science
// SENG2200 Programming Languages & Paradigms
// Semester 1, 2018
// Programming Assignment 2
// Due Sunday, 06 May 2018
// Author: Binbin Wang
// Modified by: Binbin Wang
// Student No: 3214157
public class Point {

	private double x,y;//the point x y
	public Point(){
	}	
	public Point(double inputX,double inputY){
        x=inputX;
		y=inputY;
	}

    public void setPoint(double inputX,double inputY){
        x=inputX;
		y=inputY;
    }
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	public String toString(){
		
		String strX=String.format("%4.2f",x);
		String strY=String.format("%5.2f",y);
		return "("+strX+","+strY+")";
	}
	//distanceOrigin()
	


	
	
	
}