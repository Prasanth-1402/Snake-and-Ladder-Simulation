import java.util.Random;
class SnakeAndLadder{
	public static void main(String[] args){
		int playerPosition = 0;
		Random random = new Random();
		int dieRoll  = random.nextInt(6)+1;
		System.out.println(dieRoll);	
	}
}
