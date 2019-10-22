import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.util.List;
/**
 * Write a description of class giro here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class giro extends Actor
{
    int xc,yc,xp,yp,dx,dy,r,c,s=0,d=0;
    double wi,ac=0,a,ai,b,t;
        Game mundo;
    protected void addedToWorld(World w)
    {
        mundo=(Game)w;
        xc=400;
        yc=300;
        r=100;
        xp=getX();
        yp=getY();
        ai=Math.atan2(yp-yc,xp-xc);
        wi=5;
    }
        public void act() 
  {
        if(mundo.time.cuenta()>=0 && mundo.time.cuenta()<=16)
    {
        String tecla;
        tecla= Greenfoot.getKey(); 
        t=t+0.009;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(tecla!=null && tecla.equals("space"))
        {
            r=r+50;
            List<circulo>lista=mundo.getObjects(circulo.class);
            int ty=100;
            for(circulo x:lista)
            { 
               //mundo.showText(""+x.radio+ " "+r,400,ty);
               ty+=50;
               if(x.radio==r)
               {
                   x.cambiarColor(255,255,255);
               }
               else
               {
                x.cambiarColor(128,128,128);
               }
            }
        }
        if(r==29)
        {
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
        if(r>=250)
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
    }
            if(mundo.time.cuenta()>=17 && mundo.time.cuenta()<=30)
    {
        String tecla;
        tecla= Greenfoot.getKey(); 
        t=t+0.013;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(tecla!=null && tecla.equals("space"))
        {
            r=r+50;
            List<circulo>lista=mundo.getObjects(circulo.class);
            int ty=100;
            for(circulo x:lista)
            { 
               //mundo.showText(""+x.radio+ " "+r,400,ty);
               ty+=50;
               if(x.radio==r)
               {
                   x.cambiarColor(255,255,255);
               }
               else
               {
                x.cambiarColor(128,128,128);
               }
            }
        }
        if(r==29)
        {
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
        if(r>=250)
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
    }  
    if(mundo.pts.cuenta()>=10 && mundo.pts.cuenta()<=14)
    {
            if(s==0)
        {
            ai=b; 
            t=0;
            s=1;
        }
        String tecla;
        tecla= Greenfoot.getKey(); 
        t=t+0.009;
        a=wi*t+0.5*ac*t*t;
        b=ai-a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(tecla!=null && tecla.equals("space"))
        {
            r=r+50;
            List<circulo>lista=mundo.getObjects(circulo.class);
            int ty=100;
            for(circulo x:lista)
            { 
               //mundo.showText(""+x.radio+ " "+r,400,ty);
               ty+=50;
               if(x.radio==r)
               {x.cambiarColor(255,255,255);
            
               }
               else
               {
                x.cambiarColor(128,128,128);
               }
            }
        }
        if(r==29)
        {
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
        if(r>=250)
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
    }  
       if(mundo.pts.cuenta()>=15 && mundo.pts.cuenta()<=19)
    {
        String tecla;
         tecla= Greenfoot.getKey(); 
         t=t+0.015;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(tecla!=null && tecla.equals("space"))
        {
            r=r+50;
            List<circulo>lista=mundo.getObjects(circulo.class);
            int ty=100;
            for(circulo x:lista)
            { 
               //mundo.showText(""+x.radio+ " "+r,400,ty);
               ty+=50;
               if(x.radio==r)
               {x.cambiarColor(255,255,255);
            
               }
               else
               {
                x.cambiarColor(128,128,128);
               }
            }
        }
        if(r==29)
        {
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
        if(r>=250)
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
    }  
    if(mundo.pts.cuenta()>=20)
        {
        String tecla;
         tecla= Greenfoot.getKey(); 
         t=t+0.013;
        a=wi*t+0.5*ac*t*t;
        b=ai+a;
        dx=(int)(r*Math.cos(b));
        dy=(int)(r*Math.sin(b));
        setLocation(xc+dx,yc+dy);
        //mundo.showText(""+r,400,100);
        r--;
        if(tecla!=null && tecla.equals("space"))
        {
            r=r+50;
            List<circulo>lista=mundo.getObjects(circulo.class);
            int ty=100;
            for(circulo x:lista)
            { 
               //mundo.showText(""+x.radio+ " "+r,400,ty);
               ty+=50;
               if(x.radio==r)
               {x.cambiarColor(255,255,255);
            
               }
               else
               {
                x.cambiarColor(128,128,128);
                }
            }
        }
        if(r==29)
        {
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        }
        if(r>=250)
        {
            mundo.addObject(new ex(),getX(),getY());
            mundo.removeObject(this);
            Greenfoot.setWorld(new GameOver());
            mundo.sonido.stop();
            return;
        } 
    }  
  }
}
