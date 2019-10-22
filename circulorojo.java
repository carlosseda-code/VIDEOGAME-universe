import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circulorojo extends Actor
{
    /**
     * Act - do whatever the circulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    int radio;
    Game mundo;
    protected void addedToWorld(World w)
    {
        mundo=(Game)w;
    }
    public circulorojo(int rad)
    {
       radio=rad;
       img=new GreenfootImage(radio*2,radio*2);
       img.setColor(new Color(255,0,0));
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
    }
    public void redimensionar()
    {
      
        img=new GreenfootImage(radio*2,radio*2);
       img.setColor(new Color(255,0,0));
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
        
        
    }
    public void act() 
    {
         radio--;
         if(radio==250)
       {
           mundo.addObject(new circulorojo(300),400,300);
           mundo.addObject(new circulo(249),getX(),getY());
           mundo.removeObject(this);
           return;
        }
        redimensionar();
    }    
}


