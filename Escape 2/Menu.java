//Importing
import java.awt.event.MouseAdapter; 
import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.Color; 
import java.awt.Font;

public class Menu extends MouseAdapter {
  
  private Project project;//Creating an instance of Project 
  private Handler handler;//Creating an instance of Handler 
  
  //Constructor
  public Menu(Project project, Handler handler){
    this.project = project; 
    this.handler = handler; 
  }
  
  //Mouse Pressed method
  public void mousePressed(MouseEvent e){
    //Creating x and y variables to follow mouse movements
    int mx = e.getX();
    int my = e.getY(); 
    
    //If the game is in the menu
    if(project.gameState == Project.STATE.Menu){
      
      //Play button
      if(mouseOver(mx, my,475,150,200,64)){
        project.gameState = Project.STATE.Game;//Start the game 
        Project.level = 1;//Start at level 1 
      }
      
      //Help button
      else if(mouseOver(mx, my,475,250,200,64)){
        project.gameState = Project.STATE.Help;//Put the game in the menu 
      }
      
      //Quit button
      else if(mouseOver(mx, my,475,350,200,64)){
        System.exit(0);//Exit the game
      }
    }
    //Back button for help
    else if(project.gameState == Project.STATE.Help){
      if(mouseOver(mx, my,475,650,200,64)){
        project.gameState = Project.STATE.Menu;
        return;
      }
    }
    //Back button after dying
    else if(project.gameState == Project.STATE.End){
      if(mouseOver(mx, my,475,450,200,64)){
        project.gameState = Project.STATE.Menu;//Set the game back to menu
        HUD.levelCounter = 1;//Reset the level counter 
        return;
      }
    }
    //Back button after winning
    else if(project.gameState == Project.STATE.Won){
      if(mouseOver(mx, my,475,450,200,64)){
        project.gameState = Project.STATE.Menu;//Set the game back to menu
        HUD.levelCounter = 1;//Reset the level counter  
        return;
      }
    }
  }
  //Empty Mouse Released method
  public void mouseReleased(MouseEvent e){}
  
  //Method used to see if the mouse is in a rectangle box
  private boolean mouseOver(int mx, int my,int x, int y, int width, int height){
    //If the mouse is in the box in terms of the width
    if(mx > x && mx < (x + width)){
      //If the mouse is in the box is terns of the height
      if(my > y && my <(y + height)){
        return true;//Return true
      }else return false;//If not return false 
    }else return false;//If not return false 
  }
  
  //Empty tick method
  public void tick(){}
  
  //Render method
  public void render(Graphics g){
    
    //If the game is in the menu
    if(project.gameState == Project.STATE.Menu){
      
      //Create some fonts
      Font font = new Font("Ariel", 1, 50);
      Font font2 = new Font("Times New Roman", 1, 30);
      
      g.setColor(Color.white);//Set the colr
      g.setFont(font);//Set the font
      //Draw the title and options you can choose
      g.drawString("Escape 2", 470, 50);
      g.drawString("Play", 517, 200);
      g.drawString("Help", 517, 300);
      g.drawString("Quit", 517, 400);
      
      g.setFont(font2);//Set the font
      g.drawString("Created by Abbas Peer Mohammed", 5, 860);//Drawing my name
      
      //Drawing the four rectangles
      g.setColor(Color.white);
      g.drawRect(475,350,200,64);
      g.drawRect(475,250,200,64);
      g.drawRect(475,150,200,64);
    }
    
    //If the game is in the help state
    else if(project.gameState == Project.STATE.Help){
      
      //Create some fonts
      Font font = new Font("Ariel", 1, 50);
      Font font2 = new Font("IMPACT", Font.PLAIN, 35);
      Font font3 = new Font("Times New Roman", 1, 15);
      
      //Drawing the Help text on top
      g.setColor(Color.white);
      g.setFont(font);
      g.drawString("Help", 510, 50);
      
      //Used to go back to the main menu
      g.drawString("Back", 517, 700);
      g.drawRect(475,650,200,64);
      
      //Information about the characters
      g.setFont(font2);
      g.drawString("Characters:", 20, 85);
      
      //Filling the rectangles
      g.fillRect(20,100,60,85);
      g.fillRect(220,100,60,85);
      g.fillRect(420,100,60,85);
      
      //Rectangle to talk about the player
      g.setColor(Color.green);
      g.drawRect(20,100,60,85);
      g.drawLine(20,165,80,165);
      g.fillRect(40,125,20,20);
      
      //Drawing the Player Text
      g.setFont(font3);
      g.setColor(Color.black);
      g.drawString("Player",30,180);
      
      //Info about the player
      g.setColor(Color.white);
      g.drawString("Character",20,200);
      g.drawString("you control",18,215);
      
      //Rectangle to talk about the enemy
      g.setColor(Color.red);
      g.drawRect(220,100,60,85);
      g.drawLine(220,165,280,165);
      g.fillRect(240,125,20,20);
      
      //Drawing the enemy text
      g.setFont(font3);
      g.setColor(Color.black);
      g.drawString("Enemy",227,180);
      
      //Info about the enemy
      g.setColor(Color.white);
      g.drawString("Avoid enemy",210,200);
      g.drawString("and their eyesight",200,215);
      
      //Rectangle to talk about the boss
      g.setColor(new Color(255,204,0));
      g.drawRect(420,100,60,85);
      g.drawLine(420,165,480,165);
      
      //Drawing the Boss text
      g.setFont(font3);
      g.setColor(Color.black);
      g.drawString("Boss",433,180);
      
      //Info about the Boss
      g.setColor(Color.white);
      g.drawString("Boss known",415,200);
      g.drawString("for chasing intruders",390,215);
      
      //Drawing a question mark
      g.setColor(Color.black);
      g.setFont(new Font("Times New Roman", 1, 32));
      g.drawString("?",442,140);
      
      //Info about boxes you can pick up
      g.setFont(font2);
      g.setColor(Color.white);
      g.drawString("Boxes:", 20, 285);
      
      //Filling the rectangles
      g.fillRect(20,300,60,85);
      g.fillRect(220,300,60,85);
      g.fillRect(420,300,60,85);
      
      //Rectangle for power box
      g.setColor(new Color(197,139,231));
      g.drawRect(20,300,60,85);
      g.drawLine(20,365,80,365);
      
      //Drawing the Power text
      g.setFont(font3);
      g.setColor(Color.black);
      g.drawString("Power",30,380);
      
      //Info about powerbox
      g.setColor(Color.white);
      g.drawString("Turns you invisible",7,400);
      g.drawString("enemies cant see you",5,415);
      
      //Drawing out the power box
      g.setColor(new Color(197,139,231));
      g.fillRect(40,325,20,20);
      g.setColor(new Color(51,153,255));
      g.drawRect(40,325,19,19);
      g.setColor(Color.black);
      g.drawString("P", 45, 340);
      
      //Rectangle used for health box
      g.setColor(Color.green);
      g.drawRect(220,300,60,85);
      g.drawLine(220,365,280,365);
      g.fillRect(240,325,20,20);
      
      //Drawing out the Health text
      g.setFont(font3);
      g.setColor(Color.black);
      g.drawString("Health",227,380);
      
      //Info for healthbox
      g.setColor(Color.white);
      g.drawString("Used to",227,400);
      g.drawString("restore health",212,415);
      
      //Drawing the healthbox
      g.setColor(new Color(51,153,255));
      g.drawRect(240,325,19,19);
      g.setColor(Color.black);
      g.drawString("H", 243, 340);
      
      //Rectangle used for keybox
      g.setColor(new Color(255,204,0));
      g.drawRect(420,300,60,85);
      g.drawLine(420,365,480,365);
      g.fillRect(440,325,20,20);
      
      //Drawing the key text
      g.setFont(font3);
      g.setColor(Color.black);
      g.drawString("Key",435,380);
      
      //Info for keybox
      g.setColor(Color.white);
      g.drawString("Collect 5 keys",414,400);
      g.drawString("in the final level",408,415);
      
      //Drawing out the keybox
      g.setColor(new Color(51,153,255));
      g.drawRect(440,325,19,19);
      g.setColor(Color.black);
      g.drawString("K", 443, 340);
      
      //Drawing an important note
      g.setColor(Color.white);
      g.setFont(font2);
      g.drawString("Note:", 20,460);
      
      //Useful information about boxes
      g.setFont(font3);
      g.drawString("You can not pick up the health or key box if your invisible", 100,455);
      
      //Drawing Story
      g.setFont(font2);
      g.drawString("Story:", 570,165);  
      
      //Story of the game
      g.setFont(font3);
      g.drawString("An evil unknown entity is attempting to take over the human race!", 570,190);
      g.drawString("The U.S government has sent you to the depths of their chambers to plant", 570,215);
      g.drawString("a bomb and annihilate this threat. You have planted the bomb and are now.",570,240);
      g.drawString("planning your escape. You are almost out of this hell hole, but there is a group of the unknown",570,265);
      g.drawString("entities in your way, you have to escape without being caught and before the bomb blows!",570,290);
      
      //Info on the game rules
      g.setFont(font2);
      g.drawString("Game Rules:", 570, 340);
      
      //Rectangle for flagpole
      g.setColor(Color.white);
      g.fillRect(570,355,60,85);
      
      //Drawing the flagpole
      g.setColor(Color.black);
      g.drawRect(570,355,60,85);
      g.drawLine(570,420,630,420);
      g.drawLine(590,390,590,410);
      
      //Used to draw flag on flagpole
      int [] flagX = {590,590,610}; 
      int [] flagY = {390,370,390};
      
      g.setColor(Color.yellow);
      g.fillPolygon(flagX,flagY,3);//Drawing the flagpole
      //Drawing the outline for the flagpole
      g.setColor(Color.black);
      g.drawPolygon(flagX,flagY,3);
      
      //Drawing the FlagPole text
      g.setFont(font3);
      g.setColor(Color.black);
      g.drawString("FlagPole",572,435);
      
      //Info about flagpole
      g.setFont(font3);
      g.setColor(Color.white);
      g.drawString("To win the game",550,460);
      g.drawString("you must reach the flag pole",520,475);
      g.drawString("on each level.",550,490);
      
      //Info about the timer
      g.drawString("There is a timer, if the timer hits zero, you lose the game.",720,390);
      g.setFont(new Font("Ariel", Font.PLAIN, 20));
      g.drawString("00:21",870,412);
      
      //Info about health bar
      g.setFont(font3);
      g.drawString("There is a health system, you lose health if you get spotted by an enemy.", 700,440);
      
      //Drawing the health box
      g.setColor(Color.green);
      g.fillRect(825,450,200,32);
      g.setColor(Color.white);
      g.drawRect(825,450,200,32);
      
      //Drawing the HEALTH text
      g.setColor(Color.black);
      g.setFont(new Font("TIMES NEW ROMAN", Font.PLAIN, 25));
      g.drawString("HEALTH" ,875,475);
      
      //Drawing a note
      g.setColor(Color.white);
      g.setFont(font2);
      g.drawString("Note:", 720,530);
      
      //Info about how to move
      g.setFont(font3);
      g.drawString("Use W to move up",800,530);
      g.drawString("S to move down",800,550);
      g.drawString("A to move left",800,570);
      g.drawString("D to move right.",800,590);
    }
    
    //If the game is over
    else if(project.gameState == Project.STATE.End){
      
      //Going through the linked list
      for(int i = 0; i < handler.object.size();i++){
        
        //Creating a TempObject
        GameObject tempObject = handler.object.get(i);
        
        if(tempObject.getId() == ID.Enemy||tempObject.getId() == ID.Walls||tempObject.getId() == ID.Walls2||
           tempObject.getId() == ID.FlagPole||tempObject.getId() == ID.Player||tempObject.getId() == ID.EnemySight||tempObject.getId() == ID.EnemySight2||tempObject.getId() == ID.EnemySight3||tempObject.getId() == ID.PowerBox||tempObject.getId() == ID.HealthBox||tempObject.getId() == ID.KeyBox||tempObject.getId() == ID.KeyWall||tempObject.getId() == ID.FinalBoss){
          handler.removeObject(handler.object.get(i));//Removes object from the list
          i--;//Lower index to make sure nothing is skipped 
        }
      }
      //Creating some fonts
      Font font = new Font("Ariel", 1, 50);
      Font font2 = new Font("Ariel", 1, 30);
      
      //Drawing the game over 
      g.setColor(Color.red);
      g.setFont(font);
      g.drawString("GAME OVER!", 430, 50);
      
      //Button to go back to menu
      g.setColor(Color.white);
      g.setFont(font2);
      g.drawString("Back to menu", 480, 490);
      g.drawRect(475,450,200,64);
    }
    
    //If the game is won
    else if(project.gameState == Project.STATE.Won){
      
      //Going through the linked list
      for(int i = 0; i < handler.object.size();i++){
        
        //Creating a TempObject
        GameObject tempObject = handler.object.get(i);
        
        if(tempObject.getId() == ID.Enemy||tempObject.getId() == ID.Walls||tempObject.getId() == ID.Walls2||
           tempObject.getId() == ID.FlagPole||tempObject.getId() == ID.Player||tempObject.getId() == ID.EnemySight||tempObject.getId() == ID.EnemySight2||tempObject.getId() == ID.EnemySight3||tempObject.getId() == ID.PowerBox||tempObject.getId() == ID.HealthBox||tempObject.getId() == ID.KeyBox||tempObject.getId() == ID.KeyWall||tempObject.getId() == ID.FinalBoss){
          handler.removeObject(handler.object.get(i));//Removes object from the list
          i--;//Lower index to make sure nothing is skipped 
        }
      }
      //Creating some fonts
      Font font = new Font("Ariel", 1, 50);
      Font font2 = new Font("Ariel", 1, 30);
      Font font3 = new Font("Ariel",1,40);
      
      ///Drawing congratulations text
      g.setColor(Color.green);
      g.setFont(font);
      g.drawString("Congratulations!", 410, 50);
      g.setFont(font3);
      g.drawString("You Escaped", 472, 100);
      g.setFont(font2);
      g.drawString("Thanks for Playing", 465, 350);
      
      //Button to go back to menu
      g.setColor(Color.white);
      g.setFont(font2);
      g.drawString("Back to menu", 480, 490);
      g.drawRect(475,450,200,64); 
    }
  } 
}
