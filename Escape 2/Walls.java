//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;

public class Walls extends GameObject {
  
  //Walls width and height
  public static int WallWidth = 0; 
  public static int WallHeight = 0; 
  
  //Constructor
  public Walls(int x,int y, ID id){
    super(x,y,id);//GameObject is parent class
  }
  
  //Empty tick method
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    
    //Creating Wall
    g.setColor(new Color(0,102,0));
    g.fillRect((int)x,(int)y,WallWidth,WallHeight);  
  }
  
  //Creating Wall hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,WallWidth,WallHeight);
  }
  
}
