import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Random;
import java.util.logging.*;
import javax.sound.sampled.*;
import javax.swing.*;

public class Board extends JPanel implements ActionListener{
    
    private Timer timer;   
    private Map m;
    private Player p;
    private boolean win=false;
    private String message=" ";
    private Font font=new Font("Serif",Font.BOLD,48);
    
    
    public Board(){
        m=new Map();
        p=new Player();
        addKeyListener(new Al());
       setFocusable(true);
    timer = new Timer(100, this);
    timer.start();
    }
  
   
    @Override
    public void actionPerformed(ActionEvent e){
        if(m.getMap(p.getTileX(), p.getTileY()).equals("f")){
         message="winner"; 
         win=true;
        }        
      repaint();     
    }
    
    public void paint(Graphics g){
                                 
     super.paint(g);
    
     if(!win){
     for(int y=0;y<14;y++)
     {
       for(int x=0;x<14;x++)
       {
           if(m.getMap(x, y).equals("f"))
           {g.drawImage(m.getFinish(), x*32, y*32, null);}
         if(m.getMap(x, y).equals("g"))
         {
           g.drawImage(m.getGrass(), x*32, y*32,null);
         }
          if(m.getMap(x, y).equals("w"))
         {
           g.drawImage(m.getWall(), x*32, y*32,null);
         }
       } 
     }
           
           g.drawImage(p.getPlayer(), p.getTileX()*32, p.getTileY()*32, null);
            
     }
     
     else{         
     g.setColor(Color.ORANGE);
     g.setFont(font);
     g.drawString(message, 150, 200);
     }
    }
    
      class Al extends KeyAdapter{
         
          public void keyPressed(KeyEvent e){
          
              int keycode=e.getKeyCode();
              if(keycode==KeyEvent.VK_UP)
              {
                  if(!m.getMap(p.getTileX(),p.getTileY()-1).equals("w"))
                p.move( 0,-1);
              }
              if(keycode==KeyEvent.VK_DOWN)
              {
                 if(!m.getMap(p.getTileX(),p.getTileY()+1).equals("w"))
                p.move( 0,1);
              }
              if(keycode==KeyEvent.VK_LEFT)
              {
                 if(!m.getMap(p.getTileX()-1,p.getTileY()).equals("w"))
                p.move( -1,0);
              }
              if(keycode==KeyEvent.VK_RIGHT)
              {
                 if(!m.getMap(p.getTileX()+1,p.getTileY()).equals("w"))
                p.move(1,0);
              }
           
          }
          
          public void keyReleased(KeyEvent e){
          
          }
          public void keyTyped(KeyEvent e){
          }
      }   
      
}
