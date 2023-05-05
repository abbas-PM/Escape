//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;
import java.applet.*;
import java.awt.*;

public class EnemySight extends GameObject {
  
  public static int eWidth = 19;//Width of the eyesight 
  public static int eHeight = 152;//Height of the eyesight 
  public static int patternCounter = 0;//Pattern counter used for level 3
  
  public static boolean pattern = false;//Boolean value used for all the levels
  
  //EnemySight Constructor
  public EnemySight(int x, int y, ID id){
    super(x,y,id);//Parent class is GameObject   
  }
  //Tick method
  public void tick(){
    
    //Enemy's sight pattern used for level 1,2,4
    if(Project.second % 2 != 0) pattern = true; 
    if(Project.second % 2 == 0) pattern = false;
    
    //Enemy's sight pattern used for level 3
    if(Project.second == 1 || Project.second == 6) patternCounter = 5;
    if(Project.second == 2 || Project.second == 7) patternCounter = 4;
    if(Project.second == 3 || Project.second == 8) patternCounter = 3;
    if(Project.second == 4 || Project.second == 9) patternCounter = 2;
    if(Project.second == 5 || Project.second == 0) patternCounter = 1;
  }
  //Render method
  public void render(Graphics g){
    
    //Creating a graphics variable
    Graphics2D g2d = (Graphics2D)g;
    
    //Creating Enemy
    g.setColor(Color.red);
    g2d.drawRect((int)x,(int)y,eWidth,eHeight); 
  }
  //Enemy hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,eWidth,eHeight);
  }
}




