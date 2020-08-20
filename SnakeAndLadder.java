import java.util.Random;
class SnakeAndLadder{
   private static Random random = new Random();
	public static void main(String[] args){
		int playerPosition = 10;
		int dieOutput = randomGenerator(6);
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
			System.out.println(playerPosition);
	}
	private static int randomGenerator(int n){
		int result  = random.nextInt(n)+1;	
		return result;
	}
}
