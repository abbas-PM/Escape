//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.Rectangle;

public class Enemy extends GameObject {
  
  //Enemy Constructor
  public Enemy(int x, int y, ID id){
    super(x,y,id);//Parent class is GameObject  
  }
  
  //Empty tick method (Enemy doesnt move)
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    
    //Creating Enemy
    g.setColor(Color.RED);
    g.fillRect((int)x,(int)y,20,20);
  }
  //Enemy hitbox
  public Rectangle getBounds(){
    return new Rectangle((int)x,(int)y,20,20);
  }
}
