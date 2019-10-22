import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ex here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ex extends animator
{
    /**
     * Act - do whatever the ex wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public ex()
    {
        super("er",".png",24);
        retardo=1;
        
    }
    public void act() 
    {
        play();
        if(isEnd())
        {
            getWorld().removeObject(this);
            return;
        }
    }    
}
