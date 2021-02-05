/**
 * 
 * @author Nijel Felder
 *
 */
public class BikeStore {
	
	/**
	 * 
	 * @param It creates and displays the name of the different bikes
	 * @return the null
	 */
	public Bike createBike(String type) {
		if(type.equals("tricycle")) {
			return new Tricycle();
		}else if(type.equals("strider")) {
			return new Strider();
		}else if(type.equals("kids bike")) {
			return new KidsBike();
		}
		
		return null;
	}

	/**
	 * 
	 * @param creates the methods later created in the bike class
	 * @return the bike
	 */
	public Bike orderBike(String type) {
		Bike bike = createBike(type);
		
		bike.createFrame();
		bike.addWheels();
		bike.addPedals();
		bike.getPrice();
		
		return bike;

	}
	
}
	
