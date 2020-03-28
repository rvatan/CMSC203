package PropertyManagement;

/**
 * Here is the ManagementCompany class that deals with methods that 
 * relate to both the Plot and Property classes 
 * @author Ramiz Vatan
 * Date: 03/26/2020
 */

public class ManagementCompany extends java.lang.Object {
	
	//The necessary fields for the managementCompany class
	private final int MAX_PROPERTY = 5;
	private double mgmFeePer;
	private String name;
	private Property [] properties;
	private String taxID;
	private final int MGMT_WIDTH = 10;
	private final int MGMT_DEPTH = 10;
	private Plot plot;
	
	/**
	 * no-argument constructor that passes default field values
	 */
	
	public ManagementCompany() {
		this.name = "";
		this.taxID = "";
		this.mgmFeePer = 0;
		this.plot.setX(0);
		this.plot = new Plot();
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * Parametrized constructor that passes parameter values to its fields
	 * @param name
	 * @param taxID
	 * @param mgmFeePer
	 */
	
	public ManagementCompany(String name, String taxID, double mgmFeePer){
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(0,0,MGMT_WIDTH,MGMT_DEPTH);
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * Parametrized constructor that passes parameter values to its fields
	 * @param name
	 * @param taxID
	 * @param mgmFeePer
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 */
	
	public ManagementCompany(String name, String taxID, double mgmFeePer, int x, int y, int width, int depth) {
		this.name = name;
		this.taxID = taxID;
		this.mgmFeePer = mgmFeePer;
		this.plot = new Plot(x,y,width,depth);
		this.properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * Copy Constructor that creates new ManagementCompany object based on 
	 * another same type object's fields 
	 * @param otherCompany
	 */
	
	public ManagementCompany(ManagementCompany otherCompany) {
		this.name = otherCompany.name;
		this.taxID = otherCompany.taxID;
		this.mgmFeePer = otherCompany.mgmFeePer;
		this.plot = new Plot(otherCompany.plot);
		properties = new Property[MAX_PROPERTY];
	}
	
	/**
	 * getter method that returns the plot instance 
	 * @return plot instance
	 */
	
	public Plot getPlot(){
		return plot;
	}
	
	/**
	 * getter method that returns the name of the management company
	 * @return name of management company 
	 */
	
	public String getName() {
		return name;
	}
	

	/**
	 * getter method that returns the properties array size
	 * @return properties array size
	 */
	
	public int getMAX_PROPERTY() {
		return MAX_PROPERTY;
	}
	
	/**
	 * A method that adds a property to the properties managed
	 * and returns conditional results
	 * @param property
	 * @return conditional values
	 */
	
	public int addProperty(Property property){
		if(property == null) {
			return -2;
		}
		if(!plot.encompasses(property.getPlot())){
			return -3;
		}
		for (int i=0;i<properties.length;i++) {
			if (properties[i]!=null && i<MAX_PROPERTY-1) {
				if(properties[i].getPlot().overlaps(property.getPlot())) {
					return -4;
				}
			}
			else if(properties[i]!=null && i>=MAX_PROPERTY-1) {
				return -1;
			}
			else {
				properties[i]=property;
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * A method that create a property object and adds it to the properties managed
	 * and returns conditional results
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @return
	 */
	
	public int addProperty(String propertyName, String city, double rent, String owner) {
		Property p = new Property(propertyName,city,rent,owner);  
		if(p == null) {
			return -2;
		}
		if(!plot.encompasses(p.getPlot())){
			return -3;
		}
		for (int i=0;i<properties.length;i++) {
			if (properties[i]!=null && i<MAX_PROPERTY-1) {
				if(properties[i].getPlot().overlaps(p.getPlot())) {
					return -4;
				}
			}
			else if(properties[i]!=null && i>=MAX_PROPERTY-1) {
				return -1;
			}
			else {
				properties[i]=p;
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * A method that create a property object and adds it to the properties managed
	 * and returns conditional results
	 * @param name
	 * @param city
	 * @param rent
	 * @param owner
	 * @param x
	 * @param y
	 * @param width
	 * @param depth
	 * @return
	 */
	
	public int addProperty(String name, String city, double rent,
			String owner, int x, int y, int width, int depth) {
		Property p = new Property(name, city, rent, owner, x, y, width, depth);
	
		if(p == null) {
			return -2;
		}
		if(!plot.encompasses(p.getPlot())){
			return -3;
		}
		for (int i=0;i<properties.length;i++) {
			if (properties[i]!=null && i<MAX_PROPERTY-1) {
				if(properties[i].getPlot().overlaps(p.getPlot())) {
					return -4;
				}
			}
			else if(properties[i]!=null && i>=MAX_PROPERTY-1) {
				return -1;
			}
			else {
				properties[i]=p;
				return i;
			}
		}
		return -1;
	}
	
	/**
	 * A Method that find the total rent of all the properties
	 * @return total rent
	 */
	
	public double totalRent() {
		double totalRent = 0;
		for (int i=0;i<properties.length;i++) {
			if(properties[i]==null) {
				break;
			}
			else {
				totalRent += properties[i].getRentAmount();
			}
		}
		return totalRent;
	}
	
	/**
	 * A method that finds the maximum rent amount out of all properties and returns it 
	 * @return maximum rent amount 
	 */
	
	public double maxRentProp() {
		return properties[maxRentPropertyIndex()].getRentAmount();
	}
	
	/**
	 * A method that finds the index of the property that has the maximum rent amount
	 * @return the index of such property
	 */
	
	public int maxRentPropertyIndex() {
		int propIndex = 0;
		double maxRentProperty = 0;
		for(int i=0;i<properties.length;i++) {
			if (properties[i]==null) {
				break;
			}
			if (properties[i].getRentAmount()>maxRentProperty) {
				maxRentProperty = properties[i].getRentAmount();
				propIndex = i;
			}
		}
		return propIndex;
	}
	
	/**
	 * A method that takes the index of a property and returns its information
	 * @param i
	 * @return information regarding a property at index i
	 */
	
	public String displayPropertyAtIndex(int i) {
		String output = properties[i].toString();
		return output;
	}
	
	/**
	 * A toString method that displays the information of all properties along with the 
	 * information of the management company
	 */
	
	public String toString(){
		String output = "";
		for (int i=0; i<MAX_PROPERTY;i++) {
			if(properties[i]==null){
				break;
			}
			output += properties[i].toString()+"\n";
		}
		return "List of the properties for "+name+", taxID: "+taxID+
				"\n___________________________________\n"+output+"\n"
						+ "___________________________________\ntotal "
						+ "management Fee: "+(totalRent()*mgmFeePer/100);
	}
}
