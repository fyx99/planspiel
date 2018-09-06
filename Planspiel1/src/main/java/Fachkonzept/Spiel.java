package Fachkonzept;

public class Spiel {
	
	int round = 1;

	public Spiel() {
		// TODO Auto-generated constructor stub
	}

	public int getRound() {
		return round;
	}

	public void setRound(int round) {
		this.round = round;
	}

	public void newRound() {
		round++;
	}

	public void newRound(int n) {
		round = round + n;
	}
	
	

}
