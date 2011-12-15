package local.apps;

public class LightBoard {

	private Light[][] lights;
	
	private boolean isWinner;
	private boolean isLoser;
	private boolean isStarted;
	
	public LightBoard(){
		lights = new Light[20][20];
		isWinner = false;
		isLoser = false;
		isStarted = false;
	}
	
	public void startGame(){
		isStarted = true;
		isLoser = false;
		isWinner = false;
	}
	
	public void winGame(){
		isWinner = true;
		isLoser = false;
		isStarted = false;
	}
	
	public void loseGame(){
		isLoser = true;
		isWinner = false;
		isStarted = false;
	}
}
