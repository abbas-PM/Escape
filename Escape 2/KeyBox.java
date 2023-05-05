//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;
import java.applet.*;
import java.awt.*;

public class KeyBox extends GameObject {
  
  //Constructor
  public KeyBox(int x, int y, ID id){
    super(x,y,id);//Parent Class is Game Object  
  }
  
  //Empty tick method (object dosent move)
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    g.setColor(new Color(255,204,0));//Set the color
    g.fillRect((int)x,(int)y,20,20);//Fill the rectangle 
    
    //Create a graphics varaible
    Graphics2D g2d = (Graphics2D)g;
    
    g.setColor(Color.black);//Set the color
    g2d.setFont(new Font("Times New Roman", Font.PLAIN, 15));//Set the font
    g2d.drawString("K", x + 5, y + 15);//Draw text
    
    g.setColor(new Color(51,153,255));//Set the color
    g.drawRect((int)x,(int)y,19,19);//Draw the outline 
  }
  //Hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,19,19);
  }  
}
