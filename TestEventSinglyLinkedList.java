	import java.util.Random;
public class TestEventSinglyLinkedList {
		 public static void main(String[] args) {
			 ESportsEventSinglyLinkedList list = new ESportsEventSinglyLinkedList();
			 System.out.println("Fortnite Games with 5 players:\n");
			 

			 for(int i=0;i<5;i++) {
				 list.enQueue((int)(Math.random()*100)); //Queue insert function available in other class for 5 people.
				 }
			 System.out.print("Monday First Tour: \n"); //2 people were eliminated in this tour.
			  
			 list.printQueue(); //To print the queue block on the screen.
			 list.deQueue();//According to the scenario to remove elements from the queue.
			 System.out.print("Tuesday and Second Tour: "); //
			 
			 list.printQueue();
			 list.deQueue(); //According to the scenario to remove elements from the queue.
			 list.deQueue(); //According to the scenario to remove elements from the queue.
			 System.out.print("Wednesday and Third Tour: ");
			 list.printQueue();
			 list.deQueue();
			 System.out.printf("Thursday and The Winner is: %d\n", list.firstElement());
			 //As far as I understood the assignment, I did my best.
}
}