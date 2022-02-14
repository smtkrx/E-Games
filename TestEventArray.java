import java.util.Random;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections; 

public class TestEventArray {
    public static void main(String[] args) 
    { 
    	Random r=new Random(); //random class
  	  int a,b,c = 0;
  	  String[] names = {"Samet", "Eren", "Ahmet", "Mehmet", "Fatih", "Cagri", "Zeynep", "Reyhan", "Kubilay", "Burak"} ;
  	  int[]    points = {0,0,0,0,0,0,0,0,0,0};
  	  for(int i=0;i<10;i++) {
  		  a=r.nextInt(100);
  		  points[i]=a;
  	  }
  	
  	  boolean  is_array = false ;
  	  	  ESportsEventArray Arr = new ESportsEventArray("Data Structures",10) ;
  	      System.out.printf("\nFortnite Games with 10 players:\n\n"); 
  		  for (int i=0 ; i<10 ; i++) {
  			Arr.enQueue(names[i], points[i]);} //Queue insert function available in other class
  	    System.out.printf("\n\nMonday First Tour: ");
  	    
		  for (int i=0 ; i<5 ; i++) {
		Arr.writeQueue(names[(int)(Math.random()*5)], points[i]);}  //To print the queue block on the screen.

        Arr.deQueue(); //According to the scenario to remove elements from the queue.  	
  	    System.out.printf("\n\nTuesday and Second Tour: ");
		  for (int i=0 ; i<4 ; i++) {
			Arr.writeQueue(names[(int)(Math.random()*4)], points[i]);}

	        Arr.deQueue();
	        Arr.deQueue();

	   System.out.printf("\n\nWednesday and Third Tour: ");
        for(int i=0; i<2;i++) {
        	Arr.writeQueue(names[(int)(Math.random()*2)], points[i]);} 
        
        Arr.deQueue();
        System.out.printf("\n\nThursday and The Winner is: ");
        for(int i=0; i<1;i++) {
        	Arr.writeQueue(names[(int)(Math.random()*5)], points[i]);} 
        System.out.printf("\n\n"); 
        //As far as I understood the assignment, I did my best.
    } 
} 
