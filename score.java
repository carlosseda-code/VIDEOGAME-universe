import greenfoot.*;

public class score extends Actor
{
    GreenfootImage im;
    String t="";
    int c,w,h;
    Color color=new Color(255,255,255);
    public score()
    {   
        w=100;
        h=30;
        im=new GreenfootImage(w,h);
        dibujar();
    }
    public void titulo(String s)
    {
      t=s;
      dibujar();
    }
    public void incrementar(int n)
    {
      c+=n;
      dibujar();
    }
    public void decrementar(int n)
    {
      c-=n;
      dibujar();
    }
    public void reiniciar(int n)
    {
     c=n;
     dibujar();
    }
    public int cuenta()
    {
     return c;   
    }
    public void cambiarColor(int r,int g,int b)
    {

       color=new Color(r,g,b);
       dibujar();

      
    }
    public void dibujar()
    {
     im.clear();
     im.setColor(new Color(255,255,255,10));
     im.fillRect(0,0,w,h);
     im.setFont(new Font("System",true,false,26));
     im.setColor(color);
     im.drawString(t+" "+c,10,20);
     setImage(im);
    }

}
