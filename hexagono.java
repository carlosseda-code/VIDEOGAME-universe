import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class giro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class hexagono extends Actor
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
       public hexagono(int rad)
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
        if(isTouching(giro.class))
        {
            mundo.pts.incrementar(3);
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            return;
        }
        if(r==29)
        {
            mundo.removeObject(this);
            return;
        }
    }
    else
    {
       t=t+0.010;
        a=wi*t+0.5*ac*t*t;
        
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(isTouching(giro.class))
        {
            mundo.pts.incrementar(3);
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            return;
        }
        if(r==29)
        {
            mundo.removeObject(this);
            return;
        }
    }
    }    
}
