import java.util.Random;
/**
 * The space station moves diagonally from upper-left to lower right on the
 * canvas. It is green on the first orbit (the first time it moves on the diagonal), 
 * yellow on the second orbit, and red thereafter, until a new refueling operation
 * begins.
 * 
 * @author Computer Science Department
 * @version September 2006
 */

public class SpaceStation
{
    private Diamond spaceStation;
    private Canvas canvas;
    private int initXPosition; // where to start the shuttle (a random x-coordinate
                               // in the canvas boundary
    private int initYPosition; // the initial y-coordinate is always sero
    private int xDistance;     // the distance to move in the x direction
    private int yDistance;     // the distance to move in the y direction
    private int orbitCount;    // the number of orbits completed, used for color change control
    private Random r;          // a random number generator
  
    /**
     * Creates a space shuttle as a Diamond object at a random position at the top of
     * the simulation window. Once the space station is initialized, it should begin
     * to orbit.
     * 
     * @param canvas -- the canvas on which to render the space station
     */
    public SpaceStation(Canvas simCanvas)
    {
        canvas = simCanvas;
        spaceStation = new Diamond(simCanvas);
        spaceStation.changeSize(50,80);
        r = new Random();

       /** TO DO: Complete the initialization of the spaceStation:
         * set its initXPosition to a random integer between 0 and the width of the canvas - 100
         * set its initYPosition so that its upper vertex is at the canvas upper border
         * move it to its (initXPosition, initYPosition)
         * set its color to "green"
         * make it visible
         */
    }

    /**      
     * Handle orbiting details:
     * (1) move the space station, if it is within canvas boundaries
     * (2) begin another orbit at a lower starting point, if space station reaches the 
     * right side of the canvas. Do this by computing new initXPosition and initYPosition
     * and then by moving there
     * (2a) update orbitCount
     * (2b) if space station completed 1 orbit, change its color to "yellow"
     * (2c) if space station completed 2 orbits, change its color to "red"
     * 
     * TO DO: Write the body of this method.
     */
    public void moveSmallDistance()
    {
    }
    
   /**
     * The fuel cell has docked, so:
     * (1) change color back to "green"
     * (2) wait 3 seconds
     * 
     * TO DO: Write the body of this method.
     */
    public void reFuel()
    {
    }
  
    /**
     * Set the orbiting speed according to 'B', 'I', or 'A'.
     * You can experiment with xDistance and yDistance for this.
     *
     * TO DO: Write the body of this method.
     */
    public void setSpeed(char newSpeed)
    {
    }

    /**
     * @return xPosition -- the current x-coordinate of the space station
     * TO DO: Rewrite the body of this method.
     */
    public int getXPosition()
    {
        return 0;
    }

    /**
     * @return yPosition -- the current y-coordinate of the space station
     * TO DO: Rewrite the body of this method.
     */
    public int getYPosition()
    {
        return 0;
    }
}
