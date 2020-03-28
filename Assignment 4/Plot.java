package PropertyManagement;

/**
 * Here is the Plot class that sets the locations of the 
 * properties that should be encompassed and not overlapped
 * @author Ramiz Vatan
 * Date: 03/24/2020
 */

public class Plot extends java.lang.Object {
	
	// Fields to represent the x and y coordinates 
	private int x;
	private int y;
	
	//Fields to represent the width and depth of property plot
	private int width;
	private int depth;
	
	/**
	 * no-arg constructor Plot 
	 */
	
	public Plot() {
		this.x = 0;
		this.y = 0;
		this.width = 1;
		this.depth = 1;
	}
	
	/**
	 * Copy Constructor Plot to pass the original fields to it
	 * @param p object instance of type Plot
	 */
	
	public Plot(Plot p) {
		this.x = p.x;
		this.y = p.y;
		this.width = p.width;
		this.depth = p.depth;
	}
	
	/**
	 * A parametrized constructor Plot to pass fields to
	 * @param x x coordinate
	 * @param y y coordinate
	 * @param width width of the plot
	 * @param depth depth of the plot
	 */
	
	public Plot(int x, int y, int width, int depth) {
		this.x = x;
		this.y = y;
		this.width = width;
		this.depth = depth;
	}
	
	/**
	 * Getter method to return x
	 * @return x coordinate
	 */
	
	public int getX() {
		return x;
	}
	
	/**
	 * Getter method to return y 
	 * @return y coordinate
	 */
	
	public int getY() {
		return y;
	}
	
	/**
	 * getter method to return width 
	 * @return plot width
	 */
	
	public int getWidth() {
		return width;
	}
	
	/**
	 * getter method to return depth 
	 * @return plot depth
	 */
	
	public int getDepth() {
		return depth;
	}
	
	/**
	 * setter method to assign x
	 * @param x x coordinate
	 */
	
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * setter method to assign y
	 * @param y y coordinate
	 */
	
	public void setY(int y) {
		this.y = y;
	}
	
	/**
	 * setter method to assign width
	 * @param width plot width
	 */
	
	public void setWidth(int width) {
		this.width = width;
	}
	
	/**
	 * setter method to assign depth
	 * @param depth plot depth
	 */
	
	public void setDepth(int depth) {
		this.depth = depth;
	}
	
	/**
	 * toString method to return the resulting print in console 
	 */
	
	public String toString() {
		return "Upper left: ("+x+","+y+"); Width: "+width+" Depth: "+depth;
				
	}
	
	/**
	 * This is a method that determines if a new plot overlaps a current one
	 * It takes a plot object instance as its single parameter 
	 * @param plot
	 * @return It returns true if the new plot overlaps the current one. 
	 * If it doesn't, then it returns false.
	 */
	
	public boolean overlaps(Plot plot) {
		//setting the bottom right corner x and y coordinates of new plot 
		double currentRightX = x + width;
		double currentBottomY = y + depth;
		//setting the bottom right corner x and y coordinates of current plot  
		double newRightX = plot.x+plot.width;
		double newBottomY = plot.y+ plot.depth;
		//initializing the return type variable
		boolean overlap = false;
		//checking if the new plot overlaps the current at top left corner
		if (plot.y<this.y && this.y<newBottomY && plot.x<this.x && this.x<newRightX){
			overlap = true;
		}
		//checking if the new plot overlaps the current at the top right corner 
		if (plot.y<this.y && this.y<newBottomY &&
				this.x<plot.x && plot.x<currentRightX) {
			overlap = true;
		}
		//checking if the new plot overlaps the current at the bottom left corner 
		if (this.y<plot.y && plot.y<currentBottomY && plot.x<this.x && this.x<newRightX) {
			overlap = true;
		}
		//checking if the new plot overlaps the current at the bottom right corner
		if (this.y<plot.y && plot.y<currentBottomY && this.x<plot.x && plot.x<currentRightX) {
			overlap = true;
		}
		if (plot.x>=x && newRightX<=currentRightX && plot.y>=y && newBottomY<=currentBottomY) {
			overlap = true;
		}
		if (plot.x<=x && newRightX>=currentRightX && plot.y<=y && newBottomY>=currentBottomY) {
			overlap = true;
		}
		return overlap;
	}
	
	/**
	 * This is a method that returns true if the new plot is entirely 
	 * encompassed by the current plot at hand. If not, then it returns false.
	 * @param plot it accepts a plot object instance of type Plot
	 * @return it returns true or false as mentioned before 
	 */
	
	public boolean encompasses(Plot plot) {
		//initializing the return type variable
		boolean encompass = false;
		//setting the bottom right corner x and y coordinates of new plot 
		double currentRightX = x + width;
		double currentBottomY = y + depth;
		//setting the bottom right corner x and y coordinates of current plot  
		double newRightX = plot.getX()+plot.getWidth();
		double newBottomY = plot.getY() + plot.getDepth();
		//checking if the current plot contains the new plot instance at all sides 
		if (this.x<=plot.getX() && plot.getX()<=currentRightX && this.y<=plot.getY() && plot.getY()<=currentBottomY 
				&& this.x<=currentRightX && newRightX<=currentRightX
				&& this.y<=newBottomY && newBottomY<=currentBottomY) {
			encompass = true;
		}
		return encompass;
	}
}
