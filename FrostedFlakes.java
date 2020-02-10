
public class FrostedFlakes extends Cereal{
	public FrostedFlakes() {
		name = "Frosted Flakes";
		price = 2.99;
		
	}
	public void prepare() {
		System.out.println("Preparing the Frosted Flakes\n" + 
				"    - Gather the grain\n" + 
				"    - Shape into flakes\n" + 
				"    - Sprinkle with frosting");
	}
}
