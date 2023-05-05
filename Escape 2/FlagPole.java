//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;
import java.applet.*;
import java.awt.*;

public class FlagPole extends GameObject{
  
  //Used to change flagpoles coordinates in different levels
  public static int LineX = 1150; 
  public static int LineY = 850; 
  public static int LineY2 = 870;
  
  //Used to draw flag on flagpole
  int [] flagX = {1150,1150,1170}; 
  int [] flagY = {LineY,LineY - 20,LineY};
  
  //Flagpole constructor
  public FlagPole(int x, int y, ID id){
    super(x,y,id);//Parent Class is GameObject 
  }
  
  //Empty tick method (object doesnt move)
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    
    //Creating a graphics variable
    Graphics2D g2d = (Graphics2D)g;
    
    //Creating Flagpole
    g.setColor(Color.yellow);
    g2d.drawLine(LineX,LineY,LineX,LineY2);
    g2d.fillPolygon(flagX,flagY,3);
  }
  
  //Flagpole hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x - 5,(int)y - 24,30,110);
  }
  
}
