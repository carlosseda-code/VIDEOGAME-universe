import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class giro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class girito extends Actor
{
    /**
     * Act - do whatever the giro wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    int xc,yc,xp,yp,dx,dy,r,c;
    double wi,ac=0,a,ai,b,t;
        
    protected void addedToWorld(World w)
    {
        getImage().setTransparency(100);
        xc=400;
        yc=300;
        r=150;
        xp=getX();
        yp=getY();
        ai=Math.atan2(yp-yc,xp-xc);
        wi=5;
    }
        public void act() 
    {
        getImage().setTransparency(100);
        t=t+0.013;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
    }    
}
