//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;
import java.applet.*;
import java.awt.*;

public class PowerBox extends GameObject {
  
  //Constructor
  public PowerBox(int x, int y, ID id){
    super(x,y,id);//GameObject is Parent Class  
  }
  
  //Empty Tick method (object dosent move)
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    g.setColor(new Color(197,139,231));//Set the color
    g.fillRect((int)x,(int)y,20,20);//Fill the rectangle 
    
    //Create a graphics variable
    Graphics2D g2d = (Graphics2D)g;
    g.setColor(Color.black);//Set the color
    g2d.setFont(new Font("Times New Roman", Font.PLAIN, 15));//Set the font
    g2d.drawString("P", x + 5, y + 15);//Draw text
    
    //Outline rectangle
    g.setColor(new Color(51,153,255));
    g.drawRect((int)x,(int)y,19,19); 
  }
  
  //Hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,19,19);
  }
}
