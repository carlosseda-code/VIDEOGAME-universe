import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class circulo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class circulorojito extends Actor
{
    /**
     * Act - do whatever the circulo wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage img;
    int radio;
    Game mundo;
     int x=255;
    int tr=-5;
    protected void addedToWorld(World w)
    {
        mundo=(Game)w;
    }
    public circulorojito(int rad)
    {
       radio=rad;
       img=new GreenfootImage(radio*2,radio*2);
       img.setColor(new Color(192,57,43));
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
    }
    public void redimensionar()
    {
      
        img=new GreenfootImage(radio*2,radio*2);
       img.setColor(new Color(192,57,43));
        img.drawOval(0,0,radio*2,radio*2);
        setImage(img);
        
        
    }
    public void act() 
    {
         //img.setTransparency(x);
        radio--;
         if(radio==300)
       {
           mundo.addObject(new circulorojito(450),400,300);
           int x=Greenfoot.getRandomNumber(4);
           if(x==0)
           mundo.addObject(new triangulo(450),-500,100);
           if(x==1)
           mundo.addObject(new triangulo(450),900,100);
           if(x==2)
           mundo.addObject(new triangulo(450),-300,100);
           int y=Greenfoot.getRandomNumber(2);
           if(y==1)
           mundo.addObject(new verde(550),-10,100);
           int z=Greenfoot.getRandomNumber(30);
           if(z==2)
           mundo.addObject(new hexagono(500),-10,100);
           mundo.removeObject(this);
           return;
        }
        redimensionar();
    }    
}







