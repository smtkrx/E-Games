import java.util.Random;

public class Test {
	public static void main(String[] args) {
		
		PriorityQueue pq=new PriorityQueue(); //Class variable is defined.
		Random rnd=new Random(); //Scores were randomly assigned.
		//10 players are added.
		pq.insert("FortNite", "Samet",rnd.nextInt(100));
		pq.insert("FortNite", "Eren",rnd.nextInt(100));
		pq.insert("FortNite", "Zeynep",rnd.nextInt(100));
		pq.insert("FortNite", "Ahmet",rnd.nextInt(100));
		pq.insert("FortNite", "Mehmet",rnd.nextInt(100));
		pq.insert("FortNite", "Cemal",rnd.nextInt(100));
		pq.insert("FortNite", "Ayse",rnd.nextInt(100));
		pq.insert("FortNite", "Fatma",rnd.nextInt(100));
		pq.insert("FortNite", "Hayriye",rnd.nextInt(100));
		pq.insert("FortNite", "Asli",rnd.nextInt(100));

		
		pq.list();//Players and informations are listed...
		pq.maxNode(); //Winner of the game...
		
		//I couldn't set the list correctly, I struggled for days and did my best.Thanks.
		
		
}
}
