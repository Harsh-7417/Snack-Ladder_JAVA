package SL.util;

import java.util.Scanner;

public class SLImpl implements SLInterface {

	int compPos = 1, userPos = 1, compRoll = 1, userRoll = 1, diceRoll = 0;
	int counter = 100;
	int itr = -1;
	@Override
	public void Display() {
		// TODO Auto-generated method stub
		
		System.out
				.println("=============================Start Game====================================");
		while (counter > 0) 
		{
			
			if ((counter % 10 == 0) && (counter != 100))
			{
				if (itr == -1) {
					counter -= 9;
					itr = 1;
				} 
				else 
				{
					System.out.print(counter + "\t");
					counter -= 10;
					itr = -1;
				}
				if (counter != 0) {
					System.out.print("\n" + counter + "\t");
				}
			} 
			else
			
				System.out.print(counter + "\t");
				counter += itr;
			
		}

		System.out.println();
		System.out.println("=============================================================================");
		StartGame();
		System.out.println();

	}

	@Override
	public int getDice(int DiceRoll) {
		// TODO Auto-generated method stub
		int move=0;
		DiceRoll=(int) ((Math.random()*6)+1);
		move=DiceRoll;
		return move;
	}

	@Override
	public int getUser(int userPos, int userRoll, int[] snakeArray,
			int[] ladderArray) {
		// TODO Auto-generated method stub
		
		if(userPos==snakeArray[0]){
			userPos=98;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(userPos==snakeArray[1]){
			userPos=95;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(userPos==snakeArray[2]){
			userPos=93;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(userPos==snakeArray[3]){
			userPos=87;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(userPos==snakeArray[4]){
			userPos=64;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(userPos==snakeArray[5]){
			userPos=62;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(userPos==snakeArray[6]){
			userPos=54;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(userPos==snakeArray[7]){
			userPos=17;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[0]){
			userPos=80;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[1]){
			userPos=71;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[2]){
			userPos=51;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[3]){
			userPos=28;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[4]){
			userPos=21;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[5]){
			userPos=9;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[6]){
			userPos=4;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(userPos==ladderArray[7]){
			userPos=1;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		
		if(userPos<0 || userPos>112){
			System.out.println("Invalid Move...!");
		}
		else if(userPos>100){
			userPos-=userRoll;
			System.out.println("Move Back");
		}
		else if(userPos==100)
		{
			System.out.println("User Won the Game...!");
		}
		
		return userPos;
	}

	@Override
	public int getComp(int compPos, int compRoll, int[] snakeArray,
			int[] ladderArray) {
		// TODO Auto-generated method stub
		if(compPos==snakeArray[0]){
			compPos=98;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(compPos==snakeArray[1]){
			compPos=95;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(compPos==snakeArray[2]){
			compPos=93;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(compPos==snakeArray[3]){
			compPos=87;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(compPos==snakeArray[4]){
			compPos=64;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(compPos==snakeArray[5]){
			compPos=62;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(compPos==snakeArray[6]){
			compPos=54;
			System.out.println("ohhh......ur bitten by snake...!");
		}
		else if(compPos==snakeArray[7]){
			compPos=17;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[0]){
			compPos=80;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[1]){
			compPos=71;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[2]){
			compPos=51;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[3]){
			compPos=28;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[4]){
			compPos=21;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[5]){
			compPos=9;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[6]){
			compPos=4;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		else if(compPos==ladderArray[7]){
			compPos=1;
			System.out.println("Wow......you got a ladder...! Go Up....!");
		}
		
		if(compPos<0 || compPos>112){
			System.out.println("Invalid Move...!");
		}
		else if(compPos>100){
			compPos-=compRoll;
			System.out.println("Move Back");
		}
		else if(compPos==100)
		{
			System.out.println("Computer Won the Game...!");
		}
		
		return compPos;
	}

	@Override
	public String StartGame() {
		// TODO Auto-generated method stub
		String again="";
		
		do
		{
			int snakeArray[]=new int[8];
			
			snakeArray[0]= 98;
			snakeArray[1]=95;
			snakeArray[2]=93;
			snakeArray[3]=87;
			snakeArray[4]=64;
			snakeArray[5]=62;
			snakeArray[6]=54;
			snakeArray[7]=17;
			
			for(int i=0;i<8;i++){
				System.out.println("snakeArray====>"+snakeArray[i]);
			}
			System.out.println();
			int ladderArray[]=new int[8];
			
			ladderArray[0]=80;
			ladderArray[1]=71;
			ladderArray[2]=51;
			ladderArray[3]=28;
			ladderArray[4]=21;
			ladderArray[5]=9;
			ladderArray[6]=4;
			ladderArray[7]=1;
			
			for(int i=0;i<8;i++){
				System.out.println("ladderArray====>"+ladderArray[i]);
			}
			
			userRoll=getDice(diceRoll);
			compRoll=getDice(diceRoll);
			System.out.println("User Roll:"+userRoll);
			System.out.println("Comp Roll:"+compRoll);
			
			userPos+=userRoll;
			compPos+=compRoll;
			
			userPos=getUser(userPos, userRoll, snakeArray,ladderArray);
			compPos=getComp(compPos,compRoll, snakeArray, ladderArray);
			
			System.out.println("User Position:"+userPos);
			System.out.println("Computer Position:"+compPos);
			Scanner scr=new Scanner(System.in);
			
			if(compPos==100 || userPos==100){
				System.out.println("Do you want to Continue...?");
				again=scr.nextLine();
				StartGame();
			}
			else
			{
				System.out.println("Do you want to Continue...?");
				again=scr.nextLine();
				StartGame();
			}
			
		}while(again=="y" || again=="Y");
		return again;
	}

}
