interface Flyanimal{ 
	void fly(); 
} 


class Insect { 
	int legnum=6; 
} 
class Bird { 
	 int legnum=2; 
	 int egg(){return 1;}; 
} 


class Ant extends Insect implements Flyanimal { 
	 public void fly(){ 
		System.out.println("Ant can fly"); 
	 } 
} 

class Pigeon extends Bird implements Flyanimal { 
	 public void fly(){ 
		System.out.println("pigeon can fly"); 
	 } 
	 public int egg(){ 
		return 99; 
	 } 
} 


public class InterfaceDemo{ 
	 public static void main(String args[]){ 
		 Ant a=new Ant(); 
		 a.fly(); 
		 System.out.println("Ant's legs are"+ a.legnum); 
		 Pigeon p= new Pigeon(); 
		 p.fly(); 
		System.out.println(p.egg()); 
	 } 
} 