import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Circle is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the circle's bounding rectangle.
 */

public class Circle extends Shape {
    
	private int diameter; /*  The diameter of the circle  */

	private int maxDiameter; /*  The maximum diameter of the circle  */
	
	private int minDiameter; /*  The minimum diameter of the circle  */
	
    /**
     * Creates a circle.
     * Sets the maximum and minimum of the circle
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param diameter The diameter of the circle.
     * @param colour The line colour or fill colour.
     * @param isFilled True if the circle is filled with colour, false if opaque.
     */
    public Circle (int insertionTime, int x, int y, int vx, int vy, int diameter, Color colour, boolean isFilled, boolean pulse) {
    	super (insertionTime, x, y, vx, vy, colour, isFilled, pulse);
    	setHeight(diameter);
    	setWidth(diameter);
    	maxDiameter = diameter + 150;
    	minDiameter = diameter;
    }
    
    /**
     * Method to convert a circle to a string.
     */
    public String toString () {
    	String result = "This is a circle\n";
    	result += super.toString ();
    	result += "Its diameter is " + this.diameter + "\n";
    	result += "Pulsing? : " + this.pulse + "\n";
    	return result;
    }
    
    /**
     * @param Resets the diameter.
     */
    public void setHeight (int diameter) {
    	this.diameter = diameter;
    }
    
    /**
     * @return The diameter of the circle.
     */
    public void setWidth(int diameter) {
    	this.diameter = diameter;
    }

    /**
     * @return The width of the circle
     */
 	public int getWidth() {
		return diameter;
	}

 	/**
 	 * @return The height of the circle
 	 */
 	public int getHeight() {
		return diameter;
	}
    
 	/**
 	 * Sets the size of the circle
 	 */
 	public void setSize() {		  
 		 /*  If the diameter is less than the maximum diameter of the circle  */
 		if (diameter < maxDiameter) {
 			/*  Increment the value of diameter by 1  */
	 		diameter ++;
	 	}	
 		else {
 			/*  Resets the diameter back to its default/minimum value  */
 			diameter = minDiameter;
 		} 
 	}
 	
    /**
     * Draw the circle on the screen.
     * @param g The graphics object of the scene component.
     */
    public void draw (GraphicsContext g) {
    	g.setFill( colour );
    	g.setStroke( colour );
    	if (isFilled) {
    		g.fillOval( xPos, yPos, diameter, diameter );
    	} 
    	else {
    		g.strokeOval( xPos, yPos, diameter, diameter );
	    }
    }
}
