//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;
import java.applet.*;
import java.awt.*;

//Class made only for level 4
public class Walls2 extends GameObject {
  
  //Walls width and height
  public static int WallWidth2 = 380; 
  public static int WallHeight2 = 150; 
  
  //Constructor
  public Walls2(int x,int y, ID id){
    super(x,y,id);//GameObject is parent class
  }
  
  //Empty tick method
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    
    //Creating Wall 2
    g.setColor(new Color(0,102,0));
    g.fillRect((int)x,(int)y,WallWidth2,WallHeight2);
    
    //Graphics variable
    Graphics2D g2d = (Graphics2D)g;
    
    //Outlining the walls
    g.setColor(Color.black);
    g2d.draw(getBounds()); 
  }
  
  //Creating Wall 2 hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,WallWidth2,WallHeight2);
  }
  
}



