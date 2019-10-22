import greenfoot.*;  // (World, Actor, GreenfootImage, and Greenfoot)
import java.util.ArrayList;
public class animator extends Actor
{
    protected static final int ESTE =0;
    protected static final int OESTE =2;
    private static GreenfootImage[] images=null;
    private GreenfootImage fotograma;
    private int currentImage =0;
    public int retardo=0;
    private static ArrayList<String> names;
    private static ArrayList<GreenfootImage[]> imgs;
    int t=0;
    int indice;
    Integer orientacionInicial,orientacion=ESTE;
   
    public animator(String basename, String suffix, int noOfImages)
    {
        
        if(names==null)
        {names=new ArrayList<String>();
         imgs=new ArrayList<GreenfootImage[]>();
        }
        if(!names.contains(basename))
        {      
           
          images = new GreenfootImage[noOfImages];
          for(int i=0; i < noOfImages; i++) {
             images[i] = new GreenfootImage(basename + i + suffix);
          }
         setImage(images[currentImage]);
         names.add(basename);
         imgs.add(images);
         indice=imgs.size()-1;
         
        }
        else
        {
          indice=names.indexOf(basename);  
        }
       

    }
  
    public animator(String basename, String suffix, int noOfImages,int ori)
    {
        if(images!=null)return;
        images = new GreenfootImage[noOfImages];
        for(int i=0; i < noOfImages; i++) {
            images[i] = new GreenfootImage(basename + i + suffix);
        }
        orientacion=ori;
        if(orientacion==ESTE)
            fotograma=images[currentImage];
        if(orientacion==OESTE)  
           {fotograma=new GreenfootImage(images[currentImage]);
            fotograma.mirrorHorizontally();
           } 
        setImage(fotograma);

    }
    
    public void direction(int sentido)
    {
      orientacion=sentido;
    }
    public int current()
    {
     return currentImage;    
    }
    public int count()
    {
     return images.length;   
    }
    public boolean isEnd()
    {
        return current()==count()-1;
    }
    public void play() 
    {
        images=imgs.get(indice);
        t++;
        if(t<retardo)return;
        t=0;
        currentImage = (currentImage + 1) % images.length;
     
          if(orientacion==ESTE)
            fotograma=images[currentImage];
          if(orientacion==OESTE)  
           {fotograma=new GreenfootImage(images[currentImage]);
            fotograma.mirrorHorizontally();
           } 
     
        setImage(fotograma);
    }
    public void playReverse() 
    {
        images=imgs.get(indice);
        t++;
        if(t<retardo)return;
        t=0;
        currentImage = currentImage -1;
        if(currentImage<0)currentImage= images.length-1;
          if(orientacion==ESTE)
            fotograma=images[currentImage];
          if(orientacion==OESTE)  
           {fotograma=new GreenfootImage(images[currentImage]);
            fotograma.mirrorHorizontally();
           } 
     
        setImage(fotograma);
    }
}