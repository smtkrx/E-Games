public class ESportsTournament{
	String GameName;
	private String name;
	private int point;
	ESportsTournament onceki;
	ESportsTournament siradaki;
	int num_play;
	double rank;
	int sayac;
	
	//Create the constructor method
	public ESportsTournament(String GameName,String name,int point,ESportsTournament onceki,ESportsTournament siradaki) { 
		this.GameName=GameName;
		this.name=name;
		this.point=point;
		this.onceki=onceki;
		this.siradaki=siradaki;
		this.rank=rank;
	}
	public String getGameName() { //To get the names of Game
		return GameName;
	}
	public String getName() { //To get the names entered.
		return name;
	}
	public int getPoint() { //To get the score
		return point;
	}
	public double getRank() { //To get the rank
		return rank;
	}
	public int getNum_play() { //To get the number of plays.
		sayac++;
		return num_play=10;
	}
	public void setRank(double rk) { //To change the rank.
		this.rank=rk;
	}
	public void setNum_play(int np) { //To change the number of plays.
		this.num_play=np;
	}
	public ESportsTournament getNext() { //to get the next of elements
		return siradaki;
	}
	public ESportsTournament getPrev() { //to get the prev of elements
		return onceki;
	}
}
