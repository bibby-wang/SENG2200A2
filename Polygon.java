// The University of Newcastle
// School of Electrical Engineering and Computer Science
// SENG2200 Programming Languages & Paradigms
// Semester 1, 2018
// Programming Assignment 2
// Due Sunday, 06 May 2018
// Author: Binbin Wang
// Modified by: Binbin Wang
// Student No: 3214157


public class Polygon extends PlanarShape implements ComparePolygons{
	
	private Point[] points;
	private double area_value;
	
	//????????????????????????
	
	public int compareTo(Polygon comparePoly){
/*	*/	
		//p>o,p<o
		if (area_value*1.005<comparePoly.area()){
			return -1;
		}
		else if(area_value*0.995>comparePoly.area()){
			return 1;
		}
	
		return 0;
	
			
	}
	//private Point [] pints=new Point[];
	public double area(){
		return area_value;
	}
	
	public void setPoints(String data){
		
		String[] pointsData=data.split(" ");
		if (pointsData[0].equals("P")){
			
			//get the number of ponits
			int pointNum = Integer.parseInt(pointsData[1]);
			
			//make points Array
			points = new Point[pointNum+1];

			for(int i=0; i<points.length-1; i++){
				
				//get x y point value
				
				double x=Double.parseDouble(pointsData[i+2]);
				double y=Double.parseDouble(pointsData[i+3]);
				
				//set point in to Array
				points[i]=new Point(x,y);
							
			}
			//set the end point is the firsr
			points[pointNum]=points[0];
			
			//calculate the area of polygon
			for (int i=0; i < points.length-1;i++)
			{
				area_value=area_value+(points[i+1].getX() + points[i].getX()) * ( points[i+1].getY() - points[i].getY());
			}
			if (area_value < 0)
			{	
				area_value *= -0.5;
			}else{
				area_value *= 0.5;
			}
			
			
			
			
			
		}
	}
//toString
	public String toString(){
		String outPutString;
		outPutString="POLY = [";
		for (int i = 0; i < points.length-2; i++) {
			
			outPutString+=points[i].toString();
			outPutString+=",";
			
		} 
		
		outPutString+=points[points.length-1].toString()+"]: ";
		//format area_value
		outPutString+=String.format("%5.2f",area_value);
		return outPutString;
	}
	
	

//您的Polygon类应包含一个 toString() 方法，该方法允许将Polygon对象转换为POLY = [point0 ... pointn-1]：area_value形式的字符串，并且这将使用与PA1相同的区域格式。	
	
	
}