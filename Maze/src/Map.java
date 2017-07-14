import java.io.*;
 import java.util.*;
 import javax.swing.*;
import java.awt.*;
         
public class Map {
    private Scanner m;
    private String Map[]=new String[14];
    private Image grass,wall,finish,background;
    
    public Map(){
        
     ImageIcon img=new ImageIcon("C:\\Users\\prasannachereddy\\Desktop\\mazegrass.jpg");
      grass=img.getImage();
      img=new ImageIcon("C:\\Users\\prasannachereddy\\Desktop\\stonemaze.png");
      wall=img.getImage();
      img=new ImageIcon("C:\\Users\\prasannachereddy\\Desktop\\samplefinishmaze.png");
      finish=img.getImage();
      img=new ImageIcon("C:\\Users\\prasannachereddy\\Desktop\\newhomemaze1.jpg");
      background=img.getImage();
     openFile();
     readFile();
     closeFile();
    
    }
    public Image getBackground(){ return background;}
    public Image getFinish(){
    return finish;
    }
    
    public Image getGrass()   {return grass;}
    public Image getWall()    {return wall;}
    
    public String getMap(int x, int y)
    {
      String index=Map[y].substring(x,x+1);
      return index;
    }
    
    public void openFile(){
     
        try{
         m=new Scanner(new File("C:\\Users\\prasannachereddy\\Documents\\NetBeansProjects\\Maze\\Map.txt"));
        }catch(Exception e)
        { System.out.println("error loading in file");}
    
    }
    
    public void readFile(){
     while(m.hasNext()){
      for(int i=0;i<14;i++)
      {
        Map[i]=m.next();
      }
     }
    }
    
    public void closeFile(){
      m.close();
    }
}
