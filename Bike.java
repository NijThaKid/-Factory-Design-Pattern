
/**
 * 
 * @author Nijel Felder
 *
 */
public class Bike {
	
	protected String name;
	protected Double price;
	protected int numWheels;
	protected boolean hasPedals;
	protected boolean hasTrainingWheels;
	
	/**
	 * @param sets the price and states the pedals and training wheels being true
	 */
	public void createBike() {
	price = 0.00;
	boolean hasPedals = true;
	boolean hasTrainingWheels = true;
	}
	
	/**
	 * Retrieves assembling name of bike frame
	 * @param Displaying the the frame
	 */
	public void createFrame() {
		System.out.println("Assembling " + name + "Frame");
	}
	
	/**
	 * Retrieves if it has wheels or training wheels; also the num of wheels
	 * @param It displays the bike has wheels, the number of wheels, and if the certain bike has training wheels
	 */
	public void addWheels() {
		if(numWheels < 0) {
			System.out.println("there are no wheels ");
		} else if(numWheels > 0) {
			System.out.println("Adding " + numWheels + " wheel(s)");
		}
			if(hasTrainingWheels) {
			System.out.println("Adding training wheels ");
		} else {
		}
	}
	
	/**
	 * Retrieves and displays if the bike has pedals or not
	 * @param Displays if the bike has pedals
	 */
	public void addPedals() {
		if(hasPedals) {
			System.out.println("Adding pedals");
		} else {
		}
	}
	
	/**
	 * Retrieves the bike's price
	 * @return the price of the bike
	 */
	public double getPrice() {
		System.out.println("Price: $" + price);
		return price;
		
	}

}
