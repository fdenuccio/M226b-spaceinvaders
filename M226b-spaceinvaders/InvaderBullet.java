import greenfoot.*;

/**
 * Write a description of class InvaderBullet here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class InvaderBullet extends Actor
{   
    private int speed;
    static int damage = 0;
    
    /**
     * InvaderBullet Constructor
     *
     */
    public InvaderBullet()
    {
        speed = 8;
    }

    /**
     * Method checkCollision
     *
     */

    private boolean checkCollision()
    {
        // bullet ob bullet hit detection
        if (getOneIntersectingObject (ShipBullet.class) != null)
        {
            getWorld().removeObject(getOneIntersectingObject (ShipBullet.class));
            getWorld().removeObject(this);
            return true;
        }
        // barrier hit detection
        if (getOneIntersectingObject (Barrier.class) != null)
        {
            getWorld().removeObject(getOneIntersectingObject (Barrier.class));
            getWorld().removeObject(this);
            return true;
        } 
        // player hit & death detection
        else if (getOneIntersectingObject (Ship.class) != null)
        {
            Greenfoot.playSound("hit.wav");
            damage = 1;
            if (health.currentHealth == 0){
                getWorld().removeObject(getOneIntersectingObject (Ship.class));
                getWorld().removeObjects(getWorld().getObjects(health.class));
                getWorld().gameOver(false);
                damage = 0;
                health.currentHealth = 2;
            }
            getWorld().removeObject(this);
            return true;
        }
        return false;
    }

    /**
     * Act - do whatever the InvaderBullet wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // delete if out of screen
        if (getY() >= getWorld().getHeight()-5)
        {
            getWorld().removeObject(this);
        }
        else
        {
            for (int i = 0; i < speed; i ++)
            {
                // bullet movement & speed
                setLocation(getX(), getY() + 1);
                if (checkCollision())
                {
                    break;
                }
            }
        }
        
    }    

    /**
     * Method getWorld
     *
     * @return getworld
     */
    public InvasionWorld getWorld()
    {
        // Return the world that this actor lives in
        return (InvasionWorld)(super.getWorld());
    }
}
