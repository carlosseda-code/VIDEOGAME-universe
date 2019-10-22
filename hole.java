import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class hole here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hole extends animator
{
    /**
     * Act - do whatever the hole wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public hole()
    {
        super("e",".png",12);
        retardo=3;
    }
    public void act() 
    {
       play();
    }    
}
