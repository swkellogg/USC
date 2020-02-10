
public class FruitLoops extends Cereal{
	public FruitLoops() {
		name = "Fruit Loops";
		price = 1.89;
		
	}
	public void prepare() {
		System.out.println("Preparing the Fruit Loops\n" + 
				"    - Gather the grain\n" + 
				"    - Shape into circles\n" + 
				"    - Randomly color circles\n" + 
				"    - Let circles dry");
	}
}
