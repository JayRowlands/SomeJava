import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

public class Square extends ClosedShape {
   
	private int side; /*  The side of the square  */
	private int minSide; /*  The minimum side of the square  */
	private int maxSide; /*  The maximum side of the square  */
	
    /**
     * Creates a square.
     * Sets the maximum and minimum side of the square
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param side The side of the circle.
     * @param colour The line colour or fill colour.
     * @param isFilled True if the square is filled with colour, false if opaque.
     */
    public Square (int insertionTime, int x, int y, int vx, int vy, int side, Color colour, boolean isFilled, boolean pulse) {
    	super (insertionTime, x, y, vx, vy, colour, isFilled, pulse);
    	setWidth(side);
    	setHeight(side);
    	
    	maxSide = side + 150;
		minSide = side;
    }
    
    /**
     * Method to convert a square to a string.
     */
    public String toString () {
    	String result = "This is a square\n";
    	result += super.toString ();
	result += "Its side is " + this.side + "\n";
    	return result;
    }
    
    /**
	 * @param width Resets the width.
	 */
 	public void setWidth (int width) {
		this.side = width;
	}

 	/**
 	 * @param height Resets the height.
 	 */
 	public void setHeight (int height) {
		this.side = height;
	}
 	
    /**
     * @return The side of the square
     */
 	public int getWidth() {
		return side;
	}
 	
 	public int getHeight() {
 		return side;
 	}
    
 	/**
 	 * Sets the size of the square
 	 */
 	public void setSize() {
 		/*  If the diameter is less than the maximum diameter of the circle  */
 		if (side < maxSide) {
 			/*  Increments the side of the square by 1  */
	 		side ++;
	 	}	
 		else {
 			/*  Resets the side of the square back to its default/ minimum size  */
 			side = minSide;
 		} 
 	}

    /**
     * Draw the square on the screen.
     * @param g The graphics object of the scene component.
     */
    public void draw (GraphicsContext g) {
    	g.setFill( colour );
    	g.setStroke( colour );
    	if (isFilled) {
    		g.fillRect( xPos, yPos, side, side );
    	} 
    	else {
    		g.strokeRect( xPos, yPos, side, side );
	    }
    }
}

