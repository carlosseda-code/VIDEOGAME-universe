import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class holee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class holee extends animator
{
    /**
     * Act - do whatever the holee wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public holee()
    {
        super("i",".png",16);
        retardo=3;
    }
    public void act() 
    {
       play();
    }    
}
