package PropertyManagement;

/**
 * Here is the Property class that deals with information 
 * regarding the properties under management
 * @author Ramiz Vatan 
 * Date: 03/25/2020
 */

public class Property extends java.lang.Object {
	//These are the fields necessary for this property class
	private String city;
	private String owner;
	private String propertyName;
	private double rentAmount;
	private Plot plot;
	
	/**
	 * no-argument Property constructor with default attribute values 
	 */
	
	public Property() {
		this.city = "";
		this.owner = "";
		this.propertyName = "";
		this.rentAmount = 0;
		this.plot = new Plot();
	}
	
	/**
	 * copy constructor Property that passes information of original object
	 * @param p object instance p of type Property
	 */
	
	public Property (Property p) {
		this.city = p.city;
		this.owner = p.getOwner();
		this.owner = p.owner;
	    this.propertyName = p.propertyName;
	    this.rentAmount = p.rentAmount;
	    this.plot = new Plot(p.plot);
	}
	
	/**
	 * Parametrized constructor that passes new field information
	 * @param propertyName 
	 * @param city
	 * @param rentAmount
	 * @param owner
	 */
	
	public Property(String propertyName, String city, double rentAmount, String owner) {
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot();
	}
	
	/**
	 * Parametrized constructor Property to pass information to along 
	 * with x, y, width, and depth values
	 * @param propertyName
	 * @param city
	 * @param rentAmount
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	
	public Property(String propertyName, String city, double rentAmount, String owner, 
			int x, int y, int width, int depth) {
		plot = new Plot();
		this.propertyName = propertyName;
		this.city = city;
		this.owner = owner;
		this.rentAmount = rentAmount;
		this.plot = new Plot(x, y, width, depth);
	}
	
	/**
	 * getter method that return variable city
	 * @return city
	 */
	
	public String getCity(){
		return city;
	}
	
	/**
	 * getter method that returns variable owner
	 * @return owner
	 */
	
	public String getOwner() {
		return owner;
	}
	
	/**
	 * getter method that returns propertyName
	 * @return propertyName
	 */
	
	public String getPropertyName() {
		return propertyName;
	}
	
	/**
	 * getter method that returns rentAmount
	 * @return rentAmount
	 */
	
	public double getRentAmount() {
		return rentAmount;
	}
	
	/**
	 * A setPlot method that sets plot values & returns plot instance 
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return plot
	 */
	
	public Plot setPlot(int x, int y, int width, int depth){
		this.plot.setX(x);
		this.plot.setY(y);
		this.plot.setWidth(width);
		this.plot.setDepth(depth);
		return plot;
	}
	
	
	public Plot getPlot() {
		return plot;
	}
	
	/**
	 * setter method that assigns city variable
	 * @param city
	 */
	
	public void setCity(String city) {
		this.city = city;
	}
	
	/**
	 * setter method that assigns owner variable
	 * @param owner
	 */
	
	public void setOwner(String owner) {
		this.owner = owner;
	}
	
	/**
	 * setter method that assigns propertyName variable
	 * @param propertyName
	 */
	
	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}
	
	/**
	 * setter method that assigns rentAmount variable
	 * @param rentAmount
	 */
	
	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}
	
	public String toString() {
		return "Property Name: "+propertyName+"\n Located in "
				+city+"\n Belonging to: "+owner+"\n Rent Amount: "
				+rentAmount;
	}
}
