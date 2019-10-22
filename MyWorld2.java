import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld2 extends World
{
      GreenfootSound sonido;
    /**
     * Constructor for objects of class MyWorld2.
     * 
     */
    public MyWorld2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1); 
        addObject(new dont(),400,200);
        addObject(new sucked(),400,260);
        addObject(new t(),260,330);
        addObject(new avoid(),260,380);
        addObject(new collect(),500,380);
        addObject(new v(),460,330);
        addObject(new h(),520,330);
        addObject(new spacet(),400,500);
        addObject(new circulito(150),400,300);
        addObject(new girito(),250,300);
         //sonido= new GreenfootSound("orbi.wav");
    }
     MyWorld mundo;
    protected void addedToWorld(World w)
    {
        mundo=(MyWorld)w;
    }
    public void act()
    {
       //sonido.play();
        if(Greenfoot.isKeyDown("Space"))
      {
           //mundo.sonido.stop();
          Greenfoot.setWorld(new Game());  
          //sonido.stop();
      }
    }
}


