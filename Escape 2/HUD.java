//Importing
import java.awt.Color; 
import java.awt.Graphics; 
import java.awt.*;

public class HUD {
  
  public static float HEALTH = 100;//Used for health 
  public static int levelCounter = 1;//Used to track which level the player is in 
  public static int deathCounter = 0;//Used to track number of player deaths 
  public static int keyCounter = 0;//Used to track number of keys player has 
  
  //Tick method
  public void tick(){
    HEALTH = Project.restrict(HEALTH,0,100);//Restrict the health between 0 and 100
  }
  
  //Render method
  public void render(Graphics g){
    //Used for making the health bar
    g.setColor(Color.gray);//Set the color
    g.fillRect(500,5,200,32);//Fill the rectangle
    g.setColor(Color.getHSBColor( (1f * HEALTH) / 360, 1f, 1f));//Set the color
    g.fillRect(500,5,(int)HEALTH * 2,32);//Fill the rectanngle
    g.setColor(Color.white);//Set the color
    g.drawRect(500,5,200,32);//Draw a rectangle
    
    //Box to seperate HUD to the top
    g.drawLine(0,0,0,50);
    g.drawLine(0,50,Project.WIDTH,50);
    g.drawLine(Project.WIDTH-8,0,Project.WIDTH-8,50);
    
    //Writing HEALTH on the health bar
    g.setColor(Color.black);
    g.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 25));
    g.drawString("HEALTH" ,(Project.WIDTH/2 - 47),28);
    
    g.setFont(new Font("Ariel", Font.PLAIN, 20));//Setting the font
    
    g.setColor(new Color(51,153,255));//Setting the color
    //Drawing the invisible timer
    g.drawString("Time Left:" ,1020,40);
    g.setColor(new Color(197,139,231));
    g.drawString("Invisibility:" ,1020,20);
    
    g.setColor(Color.white);//Setting the color
    g.drawString("Level: " + levelCounter ,10,20);//Drawing what level you are on
    g.drawString("Deaths: " + deathCounter ,10,40);//Drawing how many deaths have occured
    
    //If the timer is less than 30 seconds
    if(Project.minute == 0 && Project.doubleSecond <= 2){
      g.setColor(Color.red);//Set the color to red 
      g.drawString("0" + Project.minute + ":" + Project.doubleSecond + Project.second, 420,30);//Draw the timer
    }else{
      //If its higher than 3 seconds
      g.setColor(Color.white);//Set the color to white 
      g.drawString("0" + Project.minute + ":" + Project.doubleSecond + Project.second, 420,30);//Draw the timer
    }
    
    g.setColor(new Color(197,139,231));//Set the color
    //If the invisbile timeris less than 10
    if(Project.invisibleTimer < 10){
      g.drawString("00" + ":" + "0" + Project.invisibleTimer ,1130,40);//Add a zero
    }else{
      //If not, then draw one less zero
      g.drawString("00" + ":" + Project.invisibleTimer ,1130,40); 
    }
    g.setColor(new Color(51,153,255));//Set the color
    //If the power up is false
    if(Project.invisible == false){
      g.drawString("Off" ,1150,20);//Draw Off 
    }else{g.drawString("On" ,1150,20);}//If its on, draw On
    
    //If the player has reaced level 5
    if(levelCounter == 5){
      g.setColor(new Color(255,204,0));//Set the color
      g.drawString("Keys Collected: " + keyCounter + "/5" ,710,30);//Draw the number of keys collected
    }
  }
}
