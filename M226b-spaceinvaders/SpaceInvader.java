import greenfoot.*;

/**
 * Write a description of class SpaceInvader here.
 * 
 * @author (John Henry) 
 * @version (1)
 */
public class SpaceInvader extends Actor
{
    // Add your action code here.
    private int type;
    private boolean form;
    private int speed;
    private int layer;
    private int column;
    private int timer ;
    private int level ;
    private int reloadTime;
    private int reloadCounter;
    private int explosion;

    /**
     * SpaceInvader Constructor
     *
     */
    public SpaceInvader()
    {
        this(1,1,1);
    }

    /**
     * SpaceInvader Constructor
     *
     * @param invaderType A parameter
     * @param invaderLayer A parameter
     * @param invaderColumn A parameter
     */
    public SpaceInvader(int invaderType, int invaderLayer, int invaderColumn)
    {
        type = invaderType;
        form = true;
        speed= 20;
        layer = invaderLayer;
        column = invaderColumn;
        timer = 1;
        level = 0;
        reloadTime=50;
        reloadCounter = 0;
        explosion = 0;
    }

    /**
     * Method dropDown
     * Deops the invader if level = invader level
     */
    public void dropDown()
    {
        // spaceInvader downward movement
        if (level <getWorld().getInvaderLevel())
        {
            level++;

            speed *= -1;
            setLocation(getX(), getY() + getImage().getHeight());
        }
    }

    /**
     * Method checkGameOver
     *
     */
    private void checkGameOver()
    {
        // game over if space invaders reach bottom edge
        if (getY() >= getWorld().getHeight()/2 + getWorld().getHeight()/3 + getWorld().getHeight()/10)
        {
            getWorld().gameOver(false);
        }
    }

    /**
     * Method fire
     *
     */
    public void fire()
    {
        // shoot function
        if (reloadCounter == 0 && explosion == 0)
        {
            if (this != null)
            {
                InvaderBullet invaderBullet = new InvaderBullet();   
                getWorld().addObject(invaderBullet, getX(), getY() + getImage().getHeight()/2);
                
                reloadCounter = reloadTime;
            }
        }
    }

    /**
     * Act - do whatever the SpaceInvader wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */

    public void act() 
    {
        if (reloadCounter > 0)
        {
            reloadCounter--;
        }
        timer ++;

        // sideward movement
        if (timer % getWorld().getTimerSpeed() == 0)
        {
            dropDown();
            setLocation(getX() + speed, getY());
        }
        checkGameOver();
    }

    /**
     * Method getWorld
     *
     * @return The return value
     */
    public InvasionWorld getWorld()
    {
        return (InvasionWorld)(super.getWorld());
    }

    public int getColumn()
    {
        return column;
    }

    public int getLayer()
    {
        return layer;
    }

    /**
     * Method setSpeed
     *
     * @param newSpeed A parameter
     */
    public void setSpeed(int newSpeed)
    {
        speed = newSpeed;
    }

    /**
     * Method getSpeed
     *
     * @return The return value
     */
    public int getSpeed()
    {
        return speed;
    }

}
