import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circulito extends Actor
{
    /**
     * Act - do whatever the circulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    int radio;

    Color miColor;

    public circulito(int rad)
    {
       radio=rad;
       img=new GreenfootImage(radio*2,radio*2);
       miColor=new Color(63,73,73);
       img.setColor(miColor);
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
    }
    public void act() 
    {
       
    }    
}