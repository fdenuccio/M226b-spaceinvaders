import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class health here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class health extends Actor
{
    /**
     * Act - do whatever the health wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public static int currentHealth = 2;
    public void act() 
    {
        // remove 1 health
        if (InvaderBullet.damage==1)
        {
            getWorld().removeObject(this);
            InvaderBullet.damage=0;
            currentHealth = currentHealth - 1;
        }
    }
}
