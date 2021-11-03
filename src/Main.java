
public class Main {
    public static void main(String[] args)
    {
        PigDice dice = new PigDice();
		
		//Test roll and toString
		for(int i = 0; i < 10; i++) {
			dice.roll();
			System.out.println(dice);
		}
		
		//Test sum
		System.out.println("Sum of last roll: " + dice.getSum());
		//Test rolledSnakeEyes
		System.out.println("Last roll is snake eyes: " + dice.rolledSnakeEyes());
		//Test rolledDoubles
		System.out.println("Last roll is doubles: " + dice.rolledDoubles());
    }
}
