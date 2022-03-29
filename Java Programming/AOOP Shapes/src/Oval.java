import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * Oval is an oval shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of the
 * oval's bounding rectangle
 */
public class Oval extends ClosedShape {
	
	private int width, height; /*  The width and height of the oval (major and minor axis)  */
	
	private int minWidth, maxWidth; /*  The minimum and maximum width of the oval  */
	
	private int minHeight, maxHeight; /*  The minimum and maximum height of the oval  */
	
	/**
	 * Creates an oval.
	 * Sets the maximum and minimum height/ width of the oval
	 * @param x The display component's x position.
	 * @param y The display component's y position.
	 * @param vx The display component's x velocity.
	 * @param vy The display component's y velocity.
	 * @param width The width of the oval (in pixels).
	 * @param height The height of the oval (in pixels).
	 * @param colour The line colour or fill colour.
	 * @param isFilled True if the oval is filled with colour, false if opaque.
	 */
	public Oval (int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled, boolean pulse) {
		super (insertionTime, x, y, vx, vy, colour, isFilled, pulse);
		setWidth(width);
		setHeight(height);
		
		maxWidth = width + 150;
		minWidth = width;
		
		maxHeight = height + 150;
		minHeight = height;
	}

	/**
     * Method to convert an oval to a string.
     */
    public String toString () {
    	String result = "This is an oval\n";
    	result += super.toString ();
	result += "Its width is " + this.width + "\n";
	result += "its height is " + this.height + "\n";
	result+= "Pulsing? : " + this.pulse + "\n"; 
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
 	 * @return The width of the oval.
 	 */
 	public int getWidth () {
		return this.width;
	}

 	/**
 	 * @return The height of the oval.
 	 */
 	public int getHeight () {
		return this.height;
	}

 	/**
 	 * Sets the size of the oval
 	 */
 	public void setSize() {
 		/*  If the width is less than the maximum height and the height is less than the maximum height  */
 		if (width < maxWidth && height < maxHeight) {
 			/*  Increment the width and height of the oval by 1  */
	 		width ++;
	 		height ++;
	 	}	
 		else {
 			/*  Resets the width and height of the oval to it's default/ minimum size  */
 			width = minWidth;
 			height = minHeight;
 		} 
 	}
 	
 	/**
 	 * Draw the oval.
 	 * @param g The graphics object of the drawable component.
 	 */
	public void draw (GraphicsContext g) {
		g.setFill (colour);
		g.setStroke( colour );
		if (isFilled) {
			g.fillOval( xPos, yPos, width, height );
		} 
		else {
			g.strokeOval( xPos, yPos, width, height );
		}
	}
}
