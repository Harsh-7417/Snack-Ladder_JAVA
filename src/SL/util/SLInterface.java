package SL.util;

public interface SLInterface {

	public void Display();
	public int getDice(int DiceRoll);
	public int getUser(int userPos,int userRoll,int snakeArray[],int ladderArray[]);
	public int getComp(int compPos,int compRoll,int snakeArray[],int ladderArray[]);
	public String StartGame();
}
