import java.util.Random;
class SnakeAndLadder{
   private static Random random = new Random();
	public static void main(String[] args){
		int playerPosition = 0,dieRollCount=0;
		while(playerPosition<100){
			int dieOutput = randomGenerator(6);
			dieRollCount++;
        	System.out.println(playerPosition+" is the position and die gives "+dieOutput);
			int snakeLadderPositions = randomGenerator(3);
			if(snakeLadderPositions==3){
				playerPosition -= dieOutput;
				System.out.println("HISSSSSSS"); 
				}
			else if(snakeLadderPositions==2){
      	   playerPosition += dieOutput;
				System.out.println("TADAAAAAAA !! Lets Climb");
			}
			else{
				System.out.println("Staying at the same Position safely!");
			}
			if(playerPosition>100){
				 playerPosition -= dieOutput;
				 System.out.println("!!---Crossing 100 So Re-Roll the Dice---!!");
			}
			System.out.println("Now player is at : "+playerPosition);
		}
      System.out.println("Dice Rolled for  : "+dieRollCount+" times ");		
	}
	private static int randomGenerator(int n){
		int result  = random.nextInt(n)+1;	
		return result;
	}
}
