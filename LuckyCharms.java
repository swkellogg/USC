
public class LuckyCharms extends Cereal{
	public LuckyCharms() {
		name = "Lucky Charms";
		price = 1.55;
	}
	
	public void prepare() {
		System.out.println("Preparing the Lucky Charms\n" + 
				"    - Gather the grain\n" + 
				"    - Shape into circles\n" + 
				"    - Create marshmellow shapes\n" + 
				"    - Mix circles and marshmellows");
	}
}
