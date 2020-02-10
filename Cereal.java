
abstract class Cereal {
	public String name;
	public Double price;
	
	public abstract void prepare();
	
	public void boxCereal() {
		System.out.println("Putting fun pictures of " + name + " on a box");
		System.out.println("Pouring the " + name + " into the box");
	}
	
	public void priceCereal() {
		System.out.println("Putting price tas of $" + price + " on the " + name + "box");
	}
}
