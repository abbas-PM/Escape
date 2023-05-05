//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;

public class KeyWall extends GameObject {
  
  //Constructor
  public KeyWall(int x, int y, ID id){
    super(x,y,id);//Parent class is GameObject  
  }
  //Empty tick method (object dosent move)
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    g.setColor(new Color(255,204,0));//Set the color
    g.fillRect((int)x,(int)y,15,190);//Fill the rectangle  
  }
  //Wall Hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,15,190);
  }  
}
