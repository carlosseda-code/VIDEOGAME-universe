import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class giro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class triangulo extends Actor
{
    /**
     * Act - do whatever the giro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int xc,yc,xp,yp,dx,dy,r,c,radio;
    double wi,ac=0,a,ai,b,t;
        Game mundo;
    protected void addedToWorld(World w)
    {
        mundo=(Game)w;
        xc=400;
        yc=300;
        xp=getX();
        yp=getY();
        ai=Math.atan2(yp-yc,xp-xc);
        wi=5;
    }
       public triangulo(int rad)
       {
           r=rad;
           
        }
    public void act() 
    {
         if(mundo.pts.cuenta()<20 && mundo.pts.cuenta()>25)
         {
        t=t+0.010;
        //a=wi*t+0.5*ac*t*t;
        a=0;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        
        if(r==29)
        {
            mundo.removeObject(this);
            return;
        }
           if(isTouching(giro.class))
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
                       mundo.sonido.stop();
        }
    }
    if(mundo.time.cuenta()>=0 && mundo.time.cuenta()<=16)
    {
         t=t+0.008;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(r==29)
        {
            mundo.removeObject(this);
            return;
        }
           if(isTouching(giro.class))
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
        }
    }
    if(mundo.time.cuenta()>=17 && mundo.time.cuenta()<=30)
    {
         t=t+0.010;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(r==29)
        {
            mundo.removeObject(this);
            return;
        }
           if(isTouching(giro.class))
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
                       mundo.sonido.stop();
        }
    }
    if(mundo.pts.cuenta()>25)
    {
         t=t+0.010;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(r==29)
        {
            mundo.removeObject(this);
            return;
        }
           if(isTouching(giro.class))
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
                      mundo.sonido.stop();
        }
    }
    }    
}
