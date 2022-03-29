
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 * Polygon is a shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of
 * the shape's bounding rectangle.
 */

public class Polygon extends ClosedShape {
	
	private int width, height; /*  The width and height of the polygon  */
	private int minWidth, maxWidth; /*  The minimum and maximum width of the polygon  */
	private int minHeight, maxHeight; /*  The minimum and maximum height of the polygon  */
	
    /**
     * Creates a polygon shape.
     * Sets the minimum and maximum width/ height of the polygon
     * @param x The display component's x position.
     * @param y The display component's y position.
     * @param vx The display component's x velocity.
     * @param vy The display component's y velocity.
     * @param width The width of the polygon shape (in pixels).
     * @param height The height of the polygon shape (in pixels).
     * @param colour The line colour or fill colour.
     * @param isFilled True if the polygon shape is filled with colour, false if opaque.
     */
    public Polygon (int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled, boolean pulse) {
    	super (insertionTime, x, y, vx, vy, colour, isFilled, pulse);
    	setWidth(width);
    	setHeight(height);
    	
    	maxWidth = width + 150;
		minWidth = width;
		
		maxHeight = height + 150;
		minHeight = height;
    }
    
    /**
     * Method to convert a polygon to a string.
     */
    public String toString () {
    	String result = "This is a polygon shape\n";
    	result += super.toString ();
    	result += "Its width is " + this.width + " and its height is " + this.height + "\n";
    	return result;
    }
    
    /**
	 * @param width Resets the width.
	 */
 	public void setWidth (int width) {
		this.width = width;
	}

 	/**
 	 * @param height Resets the height.
 	 */
 	public void setHeight (int height) {
		this.height = height;
	}
    
    /**
     * @return The width of the polygon
     */
 	
    public int getWidth() {
		return width;
	}

 	/**
 	 * @return The height of the polygon
 	 */
    
 	public int getHeight() {
		return height;
	}
 	

 	/**
 	 * Sets the size of the polygon
 	 */
 	public void setSize() {
 		/*  If the width is less than the maximum height and the height is less than the maximum height  */
 		if (width < maxWidth && height < maxHeight) {
 			/*  Increment the width and height of the polygon  */
	 		width ++;
	 		height++;
	 	}	
 		else {
 			/*  Resets the width and height of the polygon  */
 			width = minWidth;
 			height = minHeight;
 		} 
 	}

    /**
     * Draw the polygon object on the screen.
     * @param g The graphics object of the scene component.
     */
    public void draw (GraphicsContext g) {
    	g.setFill( colour );
    	g.setStroke( colour );
    	if (isFilled) {
    		g.fillPolygon(new double[]{xPos, xPos + width, xPos + width}, new double[] {yPos, yPos, yPos + height}, 3);
    	} 
    	else {
    		g.strokePolygon(new double[]{xPos, xPos + width, xPos + width}, new double[] {yPos, yPos, yPos + height}, 3);
	    }
    }
}
