package ArcadeMachine;



public class TestMachine {
	public static void main(String[] args) {
	
		ArcadeMachine arcadeMachine = new ArcadeMachine();
		Player player = new Player (20);

		player.insertCoin(arcadeMachine);
		player.insertCoin(arcadeMachine);
		player.insertCoin(arcadeMachine);
		player.insertCoin(arcadeMachine);
		player.insertCoin(arcadeMachine);
		player.insertCoin(arcadeMachine);
		player.insertCoin(arcadeMachine);
	
		}

}
