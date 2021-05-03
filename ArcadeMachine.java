package ArcadeMachine;



public class ArcadeMachine implements Coinable, Start  {
	int tokens;

	
	public ArcadeMachine() {
		this.tokens = 20;
	}
	
	public boolean insertCoin() {

		
		if (this.tokens > 0 ) {	
			this.startgame();
			return true;
		}
	
			System.out.println("Return Token");
			return false;
	
	}

	public void startgame() {
		this.tokens--;
		System.out.println("Token accepted");
		System.out.println("Game Start!");
	}
	
}

