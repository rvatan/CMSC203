package lab4;

/**
 * The purpose of this class is to model a television
 * @author Ramiz & date: 2/25/2020
 *
 */

public class Television {
	//The MANUFACTURER field indicates the brand name
	private final String MANUFACTURER;
	// The SCREEN_SIZE field indicates the size of screen 
	private final int SCREEN_SIZE;
	//The powerOn field will be true when power is on
	//It will be false when power is off
	public boolean powerOn;
	//The channel field indicates the station the TV is on
	private int channel;
	//The volume indicates the loudness of the TV
	private int volume;
	
	/**
	 * This constructor takes in brand and screen size parameters
	 * and sets powerOn, volume, and channel fields
	 * to certain initial values
	 * @param brand this parameter indicates the manufacturer
	 * @param size this parameter indicate the screen size 
	 */
	
	public Television(String brand, int size) {
		this.MANUFACTURER=brand;
		this.SCREEN_SIZE=size;
		powerOn = false;
		volume = 20;
		channel = 2;
	}
	
	/**
	 * This method accepts a value in channel field 
	 * @param station this parameter gets assigned to
	 * channel field
	 */
	
	public void setChannel(int station) {
		this.channel=station;
	}
	
	/**
	 * This method switched the power on and off
	 */
	
	public void power() {
		powerOn =! powerOn;
	}
	
	/**
	 * This method increases the volume by 1
	 */
	
	public void increaseVolume() {
		volume += 1;
	}
	
	/**
	 * This method decreases the volume by 1 
	 */
	
	public void decreaseVolume() {
		volume -= 1;
	}
	
	/**
	 * This method accesses the channel field
	 * @return it returns the channel field 
	 */
	
	public int getChannel() {
		return channel;
	}
	
	/**
	 * This method accesses the volume field 
	 * @return it returns the volume field 
	 */
	
	public int getVolume() {
		return volume;
	}
	
	/**
	 * This method accesses the manufacturer field 
	 * @return it returns the manufacturer field
	 */
	
	public String getManufacturer() {
		return MANUFACTURER;
	}
	
	/**
	 * This method accesses the screen_size field 
	 * @return it returns the screen-size field 
	 */
	
	public int getScreenSize() {
		return SCREEN_SIZE;
	}
	
}
