import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(853, 480, 1); 
        prepare();
    }

    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Rocket rocket = new Rocket();
        addObject(rocket,418,410);
        Alien alien = new Alien();
        addObject(alien,170,186);
        Alien alien2 = new Alien();
        addObject(alien2,227,186);
        Alien alien3 = new Alien();
        addObject(alien3,304,187);
        Alien alien4 = new Alien();
        addObject(alien4,369,187);
        Alien alien5 = new Alien();
        addObject(alien5,431,182);
        Alien alien6 = new Alien();
        addObject(alien6,530,187);
        Alien alien7 = new Alien();
        addObject(alien7,599,183);
        Alien alien8 = new Alien();
        addObject(alien8,662,182);
        Alien alien9 = new Alien();
        addObject(alien9,668,243);
        Alien alien10 = new Alien();
        addObject(alien10,596,246);
        Alien alien11 = new Alien();
        addObject(alien11,534,245);
        Alien alien12 = new Alien();
        addObject(alien12,432,247);
        Alien alien13 = new Alien();
        addObject(alien13,368,248);
        Alien alien14 = new Alien();
        addObject(alien14,294,249);
        Alien alien15 = new Alien();
        addObject(alien15,233,249);
        Alien alien16 = new Alien();
        addObject(alien16,165,246);
        rocket_wreck rocket_wreck = new rocket_wreck();
        addObject(rocket_wreck,174,334);
        rocket_wreck rocket_wreck2 = new rocket_wreck();
        addObject(rocket_wreck2,292,333);
        rocket_wreck rocket_wreck3 = new rocket_wreck();
        addObject(rocket_wreck3,413,334);
        rocket_wreck rocket_wreck4 = new rocket_wreck();
        addObject(rocket_wreck4,543,332);
        rocket_wreck rocket_wreck5 = new rocket_wreck();
        addObject(rocket_wreck5,660,335);
    }
}
