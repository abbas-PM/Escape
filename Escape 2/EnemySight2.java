//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;
import java.applet.*;
import java.awt.*;

public class EnemySight2 extends GameObject{
  
  //EnemySight size
  public static int eWidth2 = 19; 
  public static int eHeight2 = 400;
  
  //Constructor
  public EnemySight2(int x, int y, ID id){
    super(x,y,id);//Parent class is Gameobject  
  }
  //Tick method
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    
    //Creating a graphics variable
    Graphics2D g2d = (Graphics2D)g;
    
    //Creating Enemy
    g.setColor(Color.red);
    g2d.drawRect((int)x,(int)y,eWidth2,eHeight2);
  }
  
  //Enemy hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,eWidth2,eHeight2);
  }
}
