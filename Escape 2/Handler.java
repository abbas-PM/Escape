//Importing
import java.awt.Graphics; 
import java.util.LinkedList; 

public class Handler {
  
  //Creating a linked list made of objects
  LinkedList<GameObject> object = new LinkedList<GameObject>(); 
  
  //Tick method
  public void tick(){
    //Checks how many objects are on the screen currently
    for(int i = 0; i < object.size();i++){
      //Sets temp object to what object is in the linked list at i
      GameObject tempObject = object.get(i);
      
      //Update the game object
      tempObject.tick(); 
    }
  }
  
  //Render method
  public void render(Graphics g){
    //Checks how many objects are on the screen currently
    for(int i = 0; i < object.size(); i++){
      //Sets temp object to what object is in the linked list at i
      GameObject tempObject = object.get(i); 
      
      //rendering the object
      tempObject.render(g);
    }
  }
  
  //Adding object to list
  public void addObject(GameObject object){
    this.object.add(object); 
  }
  
  //Removing objects from the list
  public void removeObject(GameObject object){
    this.object.remove(object);
  }
}