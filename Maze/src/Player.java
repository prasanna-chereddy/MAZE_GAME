import java.awt.Image;
import java.util.*;
import javax.swing.*;

public class Player {
    
    private int tileX,tileY;
    private Image player;
    
    public Player(){
     
        ImageIcon  img=new ImageIcon("C:\\Users\\prasannachereddy\\Desktop\\smilemaze.jpg");
        player=img.getImage();
     tileX=1;
     tileY=1;
    }
    
    public Image getPlayer(){ return player;}
   
    public int getTileX(){  return tileX;}
    public int getTileY(){ return tileY; } 
    
    public void move(int tx,int ty){
    
      tileX+=tx;
      tileY+=ty;
    }
    
}
