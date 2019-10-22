import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circulo extends Actor
{
    /**
     * Act - do whatever the circulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    int radio;
    Game mundo;
    Color miColor;
    protected void addedToWorld(World w)
    {
        mundo=(Game)w;
    }
    public circulo(int rad)
    {
       radio=rad;
       img=new GreenfootImage(radio*2,radio*2);
       miColor=new Color(128,128,128);
       img.setColor(miColor);
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
    }
    public void cambiarColor(int r,int v,int a)
    {
        img.clear();
        miColor=new Color(r,v,a);
        img.setColor(miColor);
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
    }
    public void redimensionar()
    {
      
        img=new GreenfootImage(radio*2,radio*2);
       img.setColor(miColor);
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
        
        
    }
    public void act() 
    {
        radio--;
         //if(radio==250)
       //{
         //  mundo.addObject(mundo.rojo,400,300);
           //mundo.addObject(new circulo(250),400,300);
           //mundo.removeObject(this);
           //return;
        //}
        if(radio==30)
        {
            getWorld().removeObject(this);
            return;
        }
        redimensionar();
    }    
}

