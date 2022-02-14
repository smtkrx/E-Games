public class ESportsEventArray{

	private static class GamePlayers {
	    private String playersName;               
	    private int points;
	    
	    public GamePlayers(String playersName, int points,int c) {//Constructor Method for GamePlayers
	      this.playersName = playersName;
	      this.points = points;
	    }
	    public String getPlayersName() {
	    	return playersName; 
	    	}
	    public int getPoints() {
	    	return points; 
	    	}
	} 
  protected String GameName;
  protected GamePlayers[] players ;
  protected int playersSize=0;
  protected int MaxSize;
  protected int bas, son, size; 
  protected int queue[]; 
  
 public void enQueue(String name, int data) 
  {  
      if (size == son) { 
          System.out.printf(name+": "+data+", "); 
          return; 
      } 
      else { 
          queue[son] = data; 
          son++; 
      } 
      return; 
  } 
 public void deQueue() 
  { 
      if (bas == son) { 
          System.out.printf(""); 
          return; 
      }  
      else { 
          for (int i = 0; i < son - 1; i++) { 
              queue[i] = queue[i + 1]; 
          } 
          if (son < size) 
              queue[son] = 0; 
          son--; 
      } 
      return; 
  } 
 public void writeQueue(String name, int data) 
  { 
      int i; 
      if (bas == son) { 
          System.out.printf(name+": "+data+", "); 
          return; 
      } 
      for (i = bas; i < son; i++) { 
          System.out.printf(players[i].getPlayersName()+" %d <-- ", queue[i]); 
      } 
      return; 
  } 

 public void firstQueue(String name, int data) 
  { 
      if (bas == son) { 
          System.out.printf(name+": "+data+", "); 
          return; 
      } 
      System.out.printf("\nFirst Element is: %d", queue[bas]); 
      return; 
  } 
  public ESportsEventArray(String GameName, int max_no) {  //Constructor Method for the ESportsEventArray
	  this.GameName = GameName; 
	  MaxSize = max_no ;
	  players = new GamePlayers[max_no];
  }
  
  //The method used to reach
  public String getGameName() {
	  return GameName ;
	  }
  
  public int getNumberOfStudents() { 
	  return playersSize ;
	  }
  
  public void printClass() { 
	  for (int i=0 ; i<playersSize ; i++) 
			  System.out.println(players[i].getPlayersName()+" : "+players[i].getPoints()) ;
	  
  }
  
  //Players Update Method
  public boolean add_student(String name, int grade) {
	  
	  if (playersSize<MaxSize) {
		  GamePlayers temp = new GamePlayers(name, grade, 5) ;
		  players[playersSize] = temp ; 
		  playersSize ++ ;
		  return true;
	  } else
		  return false ;
	  	  
  }
  //Players Remove Method
  public boolean remove_student(String name) {
	  
	  int i ;
	  for (i=0 ; i<playersSize ; i++) {
		  if (players[i].getPlayersName() == name) {
			  for (int j=i ; j<playersSize-1 ; j++) 
				  players[j] = players[j+1] ;
			  playersSize -- ;
			  return true;
		  } 
	  }
	  return false ;
  }
 //Players Find Method
  public void find_students (int a, int b) {
	  int i, curr_grade ;
	  for (i=0 ; i<playersSize ; i++) {
		  curr_grade =players[i].getPoints() ;
		  if (curr_grade>=a && curr_grade<b)
			  System.out.println(players[i].getPlayersName()) ;
		  			  
	  }
  }
  public void getMaxValue(int[] numbers){
	  int maxValue = numbers[0];
	  int second = numbers[0];
	  int j=0;
	  String tmp = null;
	  String scnd =null;
	  for(int i=1;i < numbers.length;i++){
	    if(numbers[i] > maxValue ){
		  maxValue = numbers[i];
		  tmp=players[i].getPlayersName();
		}
	  }
	  while(numbers[j]<maxValue){
		  second = numbers[j];
		  scnd=players[j].getPlayersName();
		  j++;
	  }
	  System.out.println("The WINNER is :"+tmp) ;
	  System.out.println("The SECOND is :"+scnd) ;
  }
}	