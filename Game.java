import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Game here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Game extends World
{
   score pts=new score();
   score time=new score();
     GreenfootSound sonido;
    circulo rojo;
    int t;
    reverse reversa=new reverse();
    freeze congelado=new freeze();
    speed up=new speed();
    public Game()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 600, 1,false); 
        addObject(pts,80,50);
        rojo=new circulo(350);
        //circle=new circulo
        rojo.cambiarColor(255,0,0);
        addObject(new circulorojito(450),400,300);
        addObject(new circulorojito(400),400,300);
        addObject(new circulorojito(350),400,300);
        addObject(new circulorojo(300),400,300);
        //addObject(rojo,400,300);
        addObject(new circulo(250),400,300);
        addObject(new circulo(200),400,300);
        addObject(new circulo(150),400,300);
        addObject(new circulo(100),400,300);
        addObject(new circulo(50),400,300);
        addObject(new circulo(31),400,300);
        addObject(new giro(),300,300);
        addObject(new holee(),400,300);
        addObject(new Level1(),680,60);
        time.titulo("");
        addObject(time,80,30);
        //setPaintOrder(giro.class,animator.class,circulo.class,circulito.class,circulorojo.class,circulito.class,verde.class,triangulo.class,hexagono.class);
         sonido= new GreenfootSound("orbi.wav");
    }
    public void act()
    {
         sonido.play();
         t++;
         if(t==40)
         time.incrementar(1);
         if(t==80)
         time.incrementar(1);
         if(t==120)
         {
             time.incrementar(1);
             t=0;
         }
         if(pts.cuenta()>=0 && pts.cuenta()<=9)
         {
             addObject(new Level1(),680,60);
            }
            if(pts.cuenta()>=10 && pts.cuenta()<=19)
         {
             addObject(new level2(),680,60);
            }
            if(pts.cuenta()>=20)
         {
             addObject(new level3(),680,60);
            }
         if(pts.cuenta()>=10 && pts.cuenta()<=12)
         {
             addObject(reversa,390,55);
             
         }
         if(time.cuenta()==17)
         addObject(up,390,55);
         if(time.cuenta()==19)
         removeObject(up);
         if(pts.cuenta()==14)
         {
             removeObject(reversa);
         }
          if(pts.cuenta()==25)
         {
             addObject(congelado,390,55);
         }
         if(pts.cuenta()==30)
         {
             removeObject(congelado);
         }
    }
}





