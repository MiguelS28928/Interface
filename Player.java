package ArcadeMachine;



public class Player {
	private int Token = 20;
	
	public Player(int Token) {
		
		this.Token = Token;
		
	}
	
	public void insertCoin( Coinable coinable) {
		

	    
		Token--;
	    	
	
		if (!coinable.insertCoin()) {
		
			Token++;
			
			System.out.println("Token refunded");
		}
		System.out.println("Token count : " + Token);
		
	}
	
}

