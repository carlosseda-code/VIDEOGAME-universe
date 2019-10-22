import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    GreenfootSound sonido;
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new u(),370,150);
        addObject(new e(),400,350);
        addObject(new circulito(150),400,300);
        addObject(new girito(),250,300);
        setPaintOrder(u.class,e.class,girito.class,circulito.class);
         //sonido= new GreenfootSound("imitation.wav");
    }
    public void act()
    {
          // sonido.play();
        if(Greenfoot.isKeyDown("Enter"))
           {
               //sonido.stop();
               Greenfoot.setWorld(new MyWorld2());
           }
    }
}

