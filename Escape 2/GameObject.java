//Importing
import java.awt.Graphics; 
import java.awt.Rectangle;

public abstract class GameObject {
  
  //Protected variables used in classes that inherit from this one
  protected float x, y;//Location of an object 
  protected ID id;//What type of object they are 
  protected float velX, velY;//How fast they move 
  
  //Constructor
  public GameObject(float x, float y, ID id){
    //All classes that inherit from this one must have these variables in their constructor
    this.x = x; 
    this.y = y; 
    this.id = id; 
  }
  
  //All classes that inherit from this one must have these methods
  public abstract void tick();//Tick method 
  public abstract void render(Graphics g);//Render method
  public abstract Rectangle getBounds();//HitBox method 
  
  //SetX method
  public void setX(float x){
    this.x = x;  
  }
  //SetY method
  public void setY(float y){
    this.y = y; 
  }
  //GetX method
  public float getX(){
    return x; 
  }
  //GetY method
  public float getY(){
    return y;  
  }
  //SetID method
  public void setID(ID id){
    this.id = id;  
  }
  //GetID method
  public ID getId(){
    return id; 
  }
  //SetVelX method
  public void setVelX(float velX){
    this.velX = velX; 
  }
  //SetVelY method
  public void setVelY(float velY){
    this.velY = velY; 
  }
  //GetVelX method
  public float getVelX(){
    return velX; 
  }
  //GetVelY method
  public float getVelY(){
    return velY; 
  }
}
