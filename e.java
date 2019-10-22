import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class e here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class e extends Actor
{
    /**
     * Act - do whatever the e wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int x=255;
    int tr=-5;
    public void act() 
    {
       getImage().setTransparency(x);
       x+=tr;
       if(x==0 || x==255)
       tr=tr*-1;
       return;
    }    
}
