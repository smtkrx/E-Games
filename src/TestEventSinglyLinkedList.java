	import java.util.Random;
public class TestEventSinglyLinkedList {
		 public static void main(String[] args) {
			 ESportsEventSinglyLinkedList list = new ESportsEventSinglyLinkedList();
			 System.out.println("Fortnite Games with 5 players:\n");
			 System.out.print("Monday First Tour: \n");

			 for(int i=0;i<5;i++) {
				 list.enQueue((int)(Math.random()*100)); //Queue insert function available in other class for 5 people.
				 }
			 list.deQueue(); //According to the scenario to remove elements from the queue.
			 list.printQueue(); //To print the queue block on the screen.
			 
			 System.out.print("Tuesday and Second Tour: ");
			 list.deQueue(); //According to the scenario to remove elements from the queue.
			 list.deQueue(); //According to the scenario to remove elements from the queue.
			 list.printQueue();
			 
			 System.out.print("Wednesday and Third Tour: ");
			 list.deQueue();
			 list.printQueue();
			 
			 System.out.printf("Thursday and The Winner is: %d\n", list.firstElement());
			 //As far as I understood the assignment, I did my best.
}
}