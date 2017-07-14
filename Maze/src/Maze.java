import java.io.*;
import java.util.*;
import java.util.logging.*;
import javax.sound.sampled.*;
import javax.swing.*;
import sun.audio.*;

public class Maze {
    public static void main(String[] args) {
        new Maze();
    }
    public Maze(){
      
        JFrame f=new JFrame();
        f.setTitle("MAZE GAME");
        f.add(new Board());
        f.setSize(464,485);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
            
}
