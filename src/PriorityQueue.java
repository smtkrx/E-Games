import java.util.Random; //Added the random class for using.
public class PriorityQueue {	
     static ESportsTournament head ; 
     static ESportsTournament tail;
     int size=0;
     //Create the constructor method.
public PriorityQueue(){ 
    this.head=null;
    this.tail=null; 
}
//To check if the list is empty.
public boolean isEmpty(){
    return head == tail;
}      
//Game Name, Player name, rank, and score were created.
public void insert(String GameName,String name,int point){ 

	ESportsTournament tmp = new ESportsTournament(GameName,name,point,null,null); //
     tmp.GameName=GameName; 
     tmp.siradaki=null; 

     if(head==null){ 
         head=tail=tmp;
         head.onceki=null;
     }
     else{ 
         tail.siradaki=tmp;
         tmp.onceki=tail;
         tail=tmp;
}   
     size++; 
}
//The function I wrote to remove it from the list.
void dequeue() {
    if (this.head == null) 
        return; 
    ESportsTournament temp = this.head; 
    this.head = this.head.siradaki; 
    if (this.head == null) 
        this.tail = null; 
}
public void maxNode() {
	String name = null;
	ESportsTournament current = head; //Appointed to the top of the list to follow the list.

    int a;
    if(head == null) {  
        System.out.println("List is empty"); 
    }  
    else {  
        a = head.getPoint(); //Equalized to the head of the list.
        while(current != null){        
             if(a < current.getPoint() ) {  
            	 name=current.getName(); //The name of the highest value is assigned
                 a = current.getPoint(); //The point of the highest value is assigned         
             } 
             current = current.siradaki; 
        }  
     System.out.println("The WINNER of the game:"+name+" "+a+" Points"); //Winner of the game...
    }
    } 
public void list(){
	ESportsTournament game=head;
	System.out.println("Game Name:"+game.getGameName()+"\n");
      if(size==0){
          System.out.println("Ýs Empty");
      }else {
    	  ESportsTournament tmp=head;
    	  Random r = new Random(); //A random variable was created for the random variable.
     while(tmp !=tail.getNext()){
    	 double rank = 0.75*tmp.getRank()+ 0.25*(int)r.nextInt(100); //Processes were done as described in the homework
         tmp.setRank(rank);
         System.out.println("Player Name: "+tmp.getName()+", Player's Rank: "+tmp.getRank()+", Player's Point: "+tmp.getPoint()
         +", Play Times: "+tmp.getNum_play());
       tmp= tmp.getNext();
     }
      System.out.println();
  }
}

}