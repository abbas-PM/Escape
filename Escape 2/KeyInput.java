//Importing
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {
  
  private Handler handler;//Instance of the handler 
  public static boolean [] keyDown = new boolean[4];//Boolean array
  
  //Constructor
  public KeyInput(Handler handler){
    this.handler = handler;  
    
    //Set the boolean values in the array to false
    keyDown[0] = false; 
    keyDown[1] = false; 
    keyDown[2] = false; 
    keyDown[3] = false; 
  }
  //Key Pressed method
  public void keyPressed(KeyEvent evt) {
    int c = evt.getKeyCode();
    
    //Figuring out which object is the player
    for(int i = 0; i < handler.object.size();i++){
      GameObject tempObject = handler.object.get(i); 
      
      if(tempObject.getId() == ID.Player){
        //Key events for player 
        if(c == KeyEvent.VK_W || c == KeyEvent.VK_UP){ tempObject.setVelY(-3); keyDown[0] = true;}
        if(c == KeyEvent.VK_S || c == KeyEvent.VK_DOWN){ tempObject.setVelY(3); keyDown[1] = true;}
        if(c == KeyEvent.VK_D || c == KeyEvent.VK_RIGHT){ tempObject.setVelX(3); keyDown[2] = true;}
        if(c == KeyEvent.VK_A || c == KeyEvent.VK_LEFT){ tempObject.setVelX(-3);  keyDown[3] = true;}
      }
    }
    //If the player hits escape, exit the game
    if(c == KeyEvent.VK_ESCAPE) System.exit(0);
  }
  //Key Released method
  public void keyReleased(KeyEvent evt) {
    int c = evt.getKeyCode();
    
    //Figuring out which object is the player
    for(int i = 0; i < handler.object.size();i++){
      GameObject tempObject = handler.object.get(i); 
      
      if(tempObject.getId() == ID.Player){
        //Which keys are being released 
        if(c == KeyEvent.VK_W || c == KeyEvent.VK_UP) keyDown[0] = false;  
        if(c == KeyEvent.VK_S || c == KeyEvent.VK_DOWN) keyDown[1] = false;  
        if(c == KeyEvent.VK_D || c == KeyEvent.VK_RIGHT) keyDown[2] = false;  
        if(c == KeyEvent.VK_A || c == KeyEvent.VK_LEFT) keyDown[3] = false;  
        
        //vertical movement
        if(keyDown[0] == false && keyDown[1] == false) tempObject.setVelY(0);
        //horizontal movement
        if(keyDown[2] == false && keyDown[3] == false) tempObject.setVelX(0);
      }
    }
  }
//Empty KeyTyped method
  public void keyTyped(KeyEvent evt) {}
}
