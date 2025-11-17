/**
 * Class to define a rectangle
 * @author Michael Chen
 * @version 1.0.0
 */

public class Rectangle {
    private double width; 
    private double length;

    /**
     * Create a rectangle with custom width and length 4
     * @param width Width of the rectangle
     */
    public Rectangle(double length) {
        this.width = 8;
        this.length = length;
    }

    /**
     * Create a rectangle with width 8 and length 4
     */
    public Rectangle() {
        this.width = 8;
        this.length = 4;
    }

    /**
     * Create a rectangle with custom width and length
     * @param width Width of the rectangle
     * @param length Length of the rectangle
     */
    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

    /**
     * Get width of the rectangle
     * @return Width of the rectangle
     */
    public double getWidth() {
        return this.width;
    }

    /**
     * Get length of the rectangle
     * @return Length of the rectangle
     */
    public double getLength() {
        return this.length;
    }
}
