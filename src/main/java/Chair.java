/**
 * Class to define a chair
 * @author Michael Chen
 * @version 1.0.0
 */

public class Chair {
    private int legs; 
    private String material;

    /**
     * Create a Chair with custom legs and wood material
     * @param legs legs of the Chair
     */
    public Chair(int legs) {
        this.legs = legs;
        this.material = "wood";
    }

    /**
     * Create a Chair with 4 legs and wood material
     */
    public Chair() {
        this.legs = 4;
        this.material = "wood";
    }

    /**
     * Create a Chair with custom legs and material     * @param legs legs of the Chair
     * @param material material of the Chair
     */
    public Chair(int legs, String material) {
        this.legs = legs;
        this.material = material;
    }

    /**
     * Get legs of the Chair
     * @return legs of the Chair
     */
    public int getLegs() {
        return this.legs;
    }

    /**
     * Get material of the Chair
     * @return material of the Chair
     */
    public String getMaterial() {
        return this.material;
    }
}
