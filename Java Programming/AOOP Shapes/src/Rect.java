
import javafx.scene.paint.Color;
import javafx.scene.canvas.GraphicsContext;

/**
 *
 * Rect is an Rect shape that can be drawn to the screen, either
 * filled with colour or opaque.
 * Its position is determined by the upper left corner of the
 * Rect's bounding rectangle
 */
public class Rect extends ClosedShape {

	private int width, height; /*  The width and height of the rectangle (major and minor axis)  */
	private int maxWidth, minWidth; /*  The maximum and minimum width of the rectangle  */
	private int maxHeight, minHeight; /*  The maximum and minimum height of the rectangle  */
	
	/**
	 * Creates a Rect.
	 * Sets the minimum and maximum width and height of the polygon
	 * @param x The display component's x position.
	 * @param y The display component's y position.
	 * @param vx The display component's x velocity.
	 * @param vy The display component's y velocity.
	 * @param width The width of the Rect (in pixels).
	 * @param height The height of the Rect (in pixels).
	 * @param colour The line colour or fill colour.
	 * @param isFilled True if the Rect is filled with colour, false if opaque.
	 */
	public Rect (int insertionTime, int x, int y, int vx, int vy, int width, int height, Color colour, boolean isFilled, boolean pulse) {
		super (insertionTime, x, y, vx, vy, colour, isFilled, pulse);
		setWidth(width);
		setHeight(height);
		
		maxWidth = width + 150;
		minWidth = width;
		
		maxHeight = height + 150;
		minHeight = height;
	}

	/**
     * Method to convert an Rect to a string.
     */
    public String toString () {
    	String result = "This is an Rect\n";
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
 	 * @return The width of the Rect.
 	 */
 	public int getWidth () {
		return this.width;
	}

 	/**
 	 * @return The height of the Rect.
 	 */
 	public int getHeight () {
		return this.height;
	}

 	/**
 	 * Sets the size of the rectangle
 	 */
 	public void setSize() {
 		/*  If the width is less than the maximum height and the height is less than the maximum height  */
 		if (width < maxWidth && height < maxHeight) {
 			/*  Increments the width and height of the polygon by 1  */
	 		width ++;
	 		height ++;
	 	}	
 		else {
 			/*  Resets the width of the height to its default/ minimum size */
 			width = minWidth;
 			height = minHeight;
 		} 
 	}
 	
 	/**
 	 * Draw the Rect.
 	 * @param g The graphics object of the drawable component.
 	 */
	public void draw (GraphicsContext g) {
		g.setFill (colour);
		g.setStroke( colour );
		if (isFilled) {
			g.fillRect( xPos, yPos, width, height );
		} 
		else {
			g.strokeRect( xPos, yPos, width, height );
		}
	}
}
