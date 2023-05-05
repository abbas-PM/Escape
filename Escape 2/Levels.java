public class Levels {
  
  private Project project;//Create an instance of Project
  private Handler handler;//Create an instance of Handler 
  
  //Level Constructor
  public Levels(Project project, Handler handler){
    this.project = project; 
    this.handler = handler; 
  }
  
  //Tick method
  public void tick(){
    
    //Used to draw enemy line sight, different because hitboxes need to be constantly added and removed, also the 
    //reason why a different variable was used here, than for the rest of the objects.
    
    //Level 1 EnemySights
    if(HUD.levelCounter == 1){
      
      //Chaning dimensions of EnemySight 
      EnemySight.eWidth = 19; 
      EnemySight.eHeight = 152; 
      
      EnemySight2.eWidth2 = 19; 
      EnemySight2.eHeight2 = 400; 
      
      //First pattern
      if(EnemySight.pattern == false){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(300,468,ID.EnemySight));
        handler.addObject(new EnemySight2(600,50,ID.EnemySight2));
        handler.addObject(new EnemySight(900,468,ID.EnemySight));
      }
      
      //Second Pattern
      else if(EnemySight.pattern == true){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(300,300,ID.EnemySight));
        handler.addObject(new EnemySight2(600,468,ID.EnemySight2));
        handler.addObject(new EnemySight(900,300,ID.EnemySight));
      }
    }
    //Level 2 EnemySights
    if(HUD.levelCounter == 2){
      
      EnemySight.eHeight = 200;//Chaning dimensions of EnemySight
      
      //First pattern
      if(EnemySight.pattern == false){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(300,125,ID.EnemySight));
        handler.addObject(new EnemySight(600,125,ID.EnemySight));
        handler.addObject(new EnemySight(900,125,ID.EnemySight));
        
        handler.addObject(new EnemySight(300,400,ID.EnemySight));
        handler.addObject(new EnemySight(450,400,ID.EnemySight));
        
        handler.addObject(new EnemySight(300,675,ID.EnemySight));
        handler.addObject(new EnemySight(450,675,ID.EnemySight));
        handler.addObject(new EnemySight(600,675,ID.EnemySight));
        handler.addObject(new EnemySight(750,675,ID.EnemySight));
        handler.addObject(new EnemySight(900,675,ID.EnemySight));
      }
      //Second Pattern
      else if(EnemySight.pattern == true){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(450,125,ID.EnemySight));
        handler.addObject(new EnemySight(750,125,ID.EnemySight));
        
        handler.addObject(new EnemySight(600,400,ID.EnemySight));
        handler.addObject(new EnemySight(750,400,ID.EnemySight));
        handler.addObject(new EnemySight(900,400,ID.EnemySight));
      }  
    }
    //Level 3 EnemySights
    if(HUD.levelCounter == 3){
      
      EnemySight.eHeight = 225;//Chaning dimensions of EnemySight 
      
      //First Pattern
      if(EnemySight.patternCounter == 1){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(200,725,ID.EnemySight));
        handler.addObject(new EnemySight(600,725,ID.EnemySight)); 
        handler.addObject(new EnemySight(1000,425,ID.EnemySight));
        handler.addObject(new EnemySight(400,125,ID.EnemySight)); 
        handler.addObject(new EnemySight(600,125,ID.EnemySight));
        handler.addObject(new EnemySight(800,125,ID.EnemySight));
        handler.addObject(new EnemySight(1000,125,ID.EnemySight));
      }
      //Second Pattern
      if(EnemySight.patternCounter == 2){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(600,725,ID.EnemySight));
        handler.addObject(new EnemySight(1000,725,ID.EnemySight)); 
        handler.addObject(new EnemySight(800,425,ID.EnemySight));
        handler.addObject(new EnemySight(200,125,ID.EnemySight)); 
        handler.addObject(new EnemySight(600,125,ID.EnemySight));
        handler.addObject(new EnemySight(800,125,ID.EnemySight));
        handler.addObject(new EnemySight(1000,125,ID.EnemySight));
      }
      //Third Pattern
      if(EnemySight.patternCounter == 3){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(400,725,ID.EnemySight)); 
        handler.addObject(new EnemySight(200,425,ID.EnemySight));
        handler.addObject(new EnemySight(400,425,ID.EnemySight));
        handler.addObject(new EnemySight(200,125,ID.EnemySight)); 
        handler.addObject(new EnemySight(400,125,ID.EnemySight));
        handler.addObject(new EnemySight(800,125,ID.EnemySight));
        handler.addObject(new EnemySight(1000,125,ID.EnemySight));
      }
      //Fourth Pattern
      if(EnemySight.patternCounter == 4){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(800,725,ID.EnemySight)); 
        handler.addObject(new EnemySight(600,425,ID.EnemySight));
        handler.addObject(new EnemySight(200,125,ID.EnemySight)); 
        handler.addObject(new EnemySight(400,125,ID.EnemySight));
        handler.addObject(new EnemySight(600,125,ID.EnemySight));
        handler.addObject(new EnemySight(1000,125,ID.EnemySight));
      }
      //Fifth Pattern
      if(EnemySight.patternCounter == 5){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(200,725,ID.EnemySight));
        handler.addObject(new EnemySight(400,725,ID.EnemySight)); 
        handler.addObject(new EnemySight(600,725,ID.EnemySight)); 
        handler.addObject(new EnemySight(800,725,ID.EnemySight)); 
        handler.addObject(new EnemySight(1000,725,ID.EnemySight));
        handler.addObject(new EnemySight(200,425,ID.EnemySight));
        handler.addObject(new EnemySight(400,425,ID.EnemySight));
        handler.addObject(new EnemySight(200,125,ID.EnemySight)); 
        handler.addObject(new EnemySight(400,125,ID.EnemySight));
        handler.addObject(new EnemySight(600,125,ID.EnemySight));
        handler.addObject(new EnemySight(800,125,ID.EnemySight));
      } 
    }
    //Level 4 EnemySights
    if(HUD.levelCounter == 4){
      
      //Chaning dimensions of EnemySight 
      EnemySight.eWidth = 180; 
      EnemySight.eHeight = 19; 
      
      EnemySight2.eWidth2 = 19; 
      EnemySight2.eHeight2 = 106; 
      
      //First Pattern
      if(EnemySight.pattern == false){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(95,250,ID.EnemySight));
        handler.addObject(new EnemySight(95,650,ID.EnemySight));
        handler.addObject(new EnemySight(370,450,ID.EnemySight));
        handler.addObject(new EnemySight3(1005,390,ID.EnemySight3));
        handler.addObject(new EnemySight3(625,665,ID.EnemySight3));
        handler.addObject(new EnemySight2(810,220,ID.EnemySight2));
        handler.addObject(new EnemySight2(860,220,ID.EnemySight2));
        handler.addObject(new EnemySight2(910,220,ID.EnemySight2));
        handler.addObject(new EnemySight2(810,475,ID.EnemySight2));
        handler.addObject(new EnemySight2(860,475,ID.EnemySight2));
        handler.addObject(new EnemySight2(910,475,ID.EnemySight2));
        handler.addObject(new EnemySight2(810,770,ID.EnemySight2));
        handler.addObject(new EnemySight2(860,770,ID.EnemySight2));
        handler.addObject(new EnemySight2(910,770,ID.EnemySight2));
      }
      //Second Pattern
      if(EnemySight.pattern == true){
        SightRemover();//Removing previous object
        //Add new EnemySight for this pattern
        handler.addObject(new EnemySight(75,450,ID.EnemySight));
        handler.addObject(new EnemySight(350,250,ID.EnemySight));
        handler.addObject(new EnemySight(350,650,ID.EnemySight));
      }
    }
    //Used to remove key wall in Lvl 5
    if(HUD.levelCounter == 5){
      
      //Removing wall once all keys have been obtained
      if(HUD.keyCounter == 5){
        KeyWallRemover();
      }
    }
    //Creating level 1
    if(Project.level == 1){
      
      //Changing the dimensions of the wall
      Walls.WallWidth = 75;
      Walls.WallHeight = 250; 
      
      //Changing FlagPole coordinates
      FlagPole.LineY = 850;
      FlagPole.LineY2 = 870; 
      
      //Adding the player
      handler.addObject(new Player(0,890,ID.Player, handler));
      
      //Setting the time limit
      Project.minute = 2; 
      Project.doubleSecond = 0; 
      Project.second = 0; 
      
      //Lvl 1 Enemies
      handler.addObject(new Enemy(300,450,ID.Enemy));
      handler.addObject(new Enemy(600,450,ID.Enemy));
      handler.addObject(new Enemy(900,450,ID.Enemy));
      
      //Lvl 1 Walls
      handler.addObject(new Walls(278,50,ID.Walls));
      handler.addObject(new Walls(278,620,ID.Walls));
      handler.addObject(new Walls(878,50,ID.Walls));
      handler.addObject(new Walls(878,620,ID.Walls));
      
      //Lvl 1 PowerBox
      handler.addObject(new PowerBox(300,400,ID.PowerBox));
      handler.addObject(new PowerBox(600,620,ID.PowerBox));
      
      //Lvl 1 FlagPole
      handler.addObject(new FlagPole(1150,850,ID.FlagPole));
      
      //Set level back to zero, so it dosent keep on adding objects
      Project.level = 0;
    }
    
    //Creating level 2
    if(Project.level == 2){
      
      Remover();//Removing previous objects
      
      //Setting Player X and Y coordinates
      handler.object.get(0).setX(10);
      handler.object.get(0).setY(362);
      
      //Changing Walls width and height
      Walls.WallWidth = 620;
      Walls.WallHeight = 75; 
      
      //Lvl 2 Enemies
      handler.addObject(new Enemy(300,125,ID.Enemy));
      handler.addObject(new Enemy(450,125,ID.Enemy));
      handler.addObject(new Enemy(600,125,ID.Enemy));
      handler.addObject(new Enemy(750,125,ID.Enemy));
      handler.addObject(new Enemy(900,125,ID.Enemy));
      handler.addObject(new Enemy(300,400,ID.Enemy));
      handler.addObject(new Enemy(450,400,ID.Enemy));
      handler.addObject(new Enemy(600,400,ID.Enemy));
      handler.addObject(new Enemy(750,400,ID.Enemy));
      handler.addObject(new Enemy(900,400,ID.Enemy));
      handler.addObject(new Enemy(300,675,ID.Enemy));
      handler.addObject(new Enemy(450,675,ID.Enemy));
      handler.addObject(new Enemy(600,675,ID.Enemy));
      handler.addObject(new Enemy(750,675,ID.Enemy));
      handler.addObject(new Enemy(900,675,ID.Enemy));
      
      //Lvl 2 Walls
      handler.addObject(new Walls(300,50,ID.Walls));
      handler.addObject(new Walls(300,325,ID.Walls));
      handler.addObject(new Walls(300,600,ID.Walls));
      
      //Lvl 2 PowerBox
      handler.addObject(new PowerBox(600,200,ID.PowerBox));
      handler.addObject(new PowerBox(450,475,ID.PowerBox));
      handler.addObject(new PowerBox(750,475,ID.PowerBox));
      handler.addObject(new PowerBox(600,830,ID.PowerBox));
      handler.addObject(new PowerBox(580,850,ID.PowerBox));
      handler.addObject(new PowerBox(620,850,ID.PowerBox));
      
      //Lvl 2 HealthBox
      handler.addObject(new HealthBox(750,200,ID.HealthBox));
      handler.addObject(new HealthBox(600,475,ID.HealthBox));
      handler.addObject(new HealthBox(900,700,ID.HealthBox));
      handler.addObject(new HealthBox(750,775,ID.HealthBox));
      handler.addObject(new HealthBox(900,850,ID.HealthBox));
      
      //Lvl 2 FlagPole
      handler.addObject(new FlagPole(1150,850,ID.FlagPole));
      
      //Set level back to zero, so it dosent keep on adding objects
      Project.level = 0;
    }
    
    //Creating level 3
    if(Project.level == 3){
      
      Remover();//Removing previous objects
      
      //Setting Player X and Y coordinates
      handler.object.get(0).setX(10);
      handler.object.get(0).setY(Project.HEIGHT + 50);
      
      //Changing Walls width and height
      Walls.WallWidth = 1100;
      Walls.WallHeight = 75; 
      
      //Lvl 3 Enemies
      handler.addObject(new Enemy(200,725,ID.Enemy));
      handler.addObject(new Enemy(400,725,ID.Enemy));
      handler.addObject(new Enemy(600,725,ID.Enemy));
      handler.addObject(new Enemy(800,725,ID.Enemy));
      handler.addObject(new Enemy(1000,725,ID.Enemy));
      handler.addObject(new Enemy(200,425,ID.Enemy));
      handler.addObject(new Enemy(400,425,ID.Enemy));
      handler.addObject(new Enemy(600,425,ID.Enemy));
      handler.addObject(new Enemy(800,425,ID.Enemy));
      handler.addObject(new Enemy(1000,425,ID.Enemy));
      handler.addObject(new Enemy(200,125,ID.Enemy));
      handler.addObject(new Enemy(400,125,ID.Enemy));
      handler.addObject(new Enemy(600,125,ID.Enemy));
      handler.addObject(new Enemy(800,125,ID.Enemy));
      handler.addObject(new Enemy(1000,125,ID.Enemy));
      
      //Lvl 3 Walls
      handler.addObject(new Walls(0,650,ID.Walls));
      handler.addObject(new Walls(100,350,ID.Walls));
      handler.addObject(new Walls(0,50,ID.Walls));
      
      //Lvl 3 PowerBox
      handler.addObject(new PowerBox(100,215,ID.PowerBox));
      
      //Lvl 3 HealthBox
      handler.addObject(new HealthBox(300,165,ID.HealthBox));
      handler.addObject(new HealthBox(300,265,ID.HealthBox));
      
      //Changing FlagPole coordinates
      FlagPole.LineY = FlagPole.LineY - 775;
      FlagPole.LineY2 = FlagPole.LineY2 - 775; 
      
      //Lvl 3 FlagPole
      handler.addObject(new FlagPole(1150,15,ID.FlagPole));
      
      //Set level back to zero, so it dosent keep on adding objects
      Project.level = 0;
    }
    
    //Creating level 4
    if(Project.level == 4){
      
      Remover();//Removing previous objects
      
      //Setting Player X and Y coordinates
      handler.object.get(0).setX(0);
      handler.object.get(0).setY(60); 
      
      //Changing Walls width and height
      Walls.WallWidth = 75;
      Walls.WallHeight = 700; 
      
      //Lvl 4 Walls
      handler.addObject(new Walls(0,200,ID.Walls));
      handler.addObject(new Walls(275,50,ID.Walls));
      handler.addObject(new Walls(550,200,ID.Walls));
      handler.addObject(new Walls(1125,50,ID.Walls));
      
      handler.addObject(new Walls2(744,50,ID.Walls2));
      handler.addObject(new Walls2(625,325,ID.Walls2));
      handler.addObject(new Walls2(744,600,ID.Walls2));
      
      //Lvl 4 Enemies
      handler.addObject(new Enemy(75,250,ID.Enemy));
      handler.addObject(new Enemy(255,450,ID.Enemy));
      handler.addObject(new Enemy(75,650,ID.Enemy));
      handler.addObject(new Enemy(530,250,ID.Enemy));
      handler.addObject(new Enemy(350,450,ID.Enemy));
      handler.addObject(new Enemy(530,650,ID.Enemy));
      handler.addObject(new Enemy(810,200,ID.Enemy));
      handler.addObject(new Enemy(860,200,ID.Enemy));
      handler.addObject(new Enemy(910,200,ID.Enemy));
      handler.addObject(new Enemy(1005,390,ID.Enemy));
      handler.addObject(new Enemy(810,580,ID.Enemy));
      handler.addObject(new Enemy(860,580,ID.Enemy));
      handler.addObject(new Enemy(910,580,ID.Enemy));
      handler.addObject(new Enemy(725,665,ID.Enemy));
      handler.addObject(new Enemy(810,750,ID.Enemy));
      handler.addObject(new Enemy(860,750,ID.Enemy));
      handler.addObject(new Enemy(910,750,ID.Enemy));
      
      //Lvl 4 PowerBox
      handler.addObject(new PowerBox(0,60,ID.PowerBox));
      handler.addObject(new PowerBox(835,200,ID.PowerBox));
      handler.addObject(new PowerBox(835,580,ID.PowerBox));
      handler.addObject(new PowerBox(835,750,ID.PowerBox));
      
      //Lvl 4 HealthBox
      handler.addObject(new HealthBox(0,180,ID.HealthBox));
      handler.addObject(new HealthBox(885,200,ID.HealthBox));
      handler.addObject(new HealthBox(885,580,ID.HealthBox));
      handler.addObject(new HealthBox(885,750,ID.HealthBox));
      
      //Changing FlagPole coordinates
      FlagPole.LineY = 850;
      FlagPole.LineY2 = 870; 
      
      //Lvl 4 FlagPole
      handler.addObject(new FlagPole(1150,850,ID.FlagPole));
      
      //Set level back to zero, so it dosent keep on adding objects
      Project.level = 0;
    }
    
    //Creating level 5
    if(Project.level == 5){
      
      Remover();//Removing previous objects
      
      //Setting Player X and Y coordinates
      handler.object.get(0).setX(Project.WIDTH/2);
      handler.object.get(0).setY(50); 
      
      //Changing Walls width and height
      Walls.WallWidth = 200;
      Walls.WallHeight = 110; 
      
      //Lvl 5 Walls
      handler.addObject(new Walls(1000,250,ID.Walls));
      handler.addObject(new Walls(1000,550,ID.Walls));
      
      //Lvl 5 PowerBox
      handler.addObject(new PowerBox(Project.WIDTH/2,300,ID.PowerBox));
      handler.addObject(new PowerBox(Project.WIDTH/2 + 110,475,ID.PowerBox));
      handler.addObject(new PowerBox(Project.WIDTH/2 - 110,475,ID.PowerBox));
      
      //Lvl 5 HealthBox
      handler.addObject(new HealthBox(Project.WIDTH/2,100,ID.HealthBox));
      handler.addObject(new HealthBox(0,50,ID.HealthBox));
      handler.addObject(new HealthBox(0,850,ID.HealthBox));
      
      //Lvl 5 KeyBox
      handler.addObject(new KeyBox(0,475,ID.KeyBox));
      handler.addObject(new KeyBox(Project.WIDTH/2,850,ID.KeyBox));
      handler.addObject(new KeyBox(1173,850,ID.KeyBox));
      handler.addObject(new KeyBox(1173,50,ID.KeyBox));
      handler.addObject(new KeyBox(Project.WIDTH/2,650,ID.KeyBox));
      
      //Lvl 5 KeyWall
      handler.addObject(new KeyWall(1000,360,ID.KeyWall));
      
      //Changing FlagPole coordinates
      FlagPole.LineY = 530;
      FlagPole.LineY2 = 550;
      
      //Lvl 5 FlagPole
      handler.addObject(new FlagPole(1150,530,ID.FlagPole));
      
      //Adding the final boss
      handler.addObject(new FinalBoss(Project.WIDTH/2 - 70,400,ID.FinalBoss,handler));
      
      //Set level back to zero, so it dosent keep on adding objects
      Project.level = 0;
    }
  }
//Removes objects from previous level
  private void Remover(){
    
    //Goes through object list
    for(int i = 0; i < handler.object.size();i++){
      
      //Set temporary object
      GameObject tempObject = handler.object.get(i);
      
      //Checks if tempObject is an enemy, wall or flagpole
      if(tempObject.getId() == ID.Enemy||tempObject.getId() == ID.EnemySight||tempObject.getId() == ID.Walls||tempObject.getId() == ID.Walls2||tempObject.getId() == ID.FlagPole||tempObject.getId() == ID.EnemySight2||tempObject.getId() == ID.EnemySight3||tempObject.getId() == ID.PowerBox||tempObject.getId() == ID.HealthBox||tempObject.getId() == ID.KeyBox||tempObject.getId() == ID.KeyWall||tempObject.getId() == ID.FinalBoss){
        handler.removeObject(handler.object.get(i));//Removes object from the list
        i--;//Lower index to make sure nothing is skipped 
      } 
    } 
  }
  //Used to remove EnemySights
  private void SightRemover(){
    
    //Goes through object list
    for(int i = 0; i < handler.object.size();i++){
      
      //Set temporary object
      GameObject tempObject = handler.object.get(i);
      
      //If temp object is an EnemySight
      if(tempObject.getId() == ID.EnemySight||tempObject.getId() == ID.EnemySight2||tempObject.getId() == ID.EnemySight3){
        handler.removeObject(handler.object.get(i));//Removes object from the list
        i--;//Lower index to make sure nothing is skipped 
      }
    }
  }
  //Used to remove the KeyWall
  private void KeyWallRemover(){
    
    //Goes through object list
    for(int i = 0; i < handler.object.size();i++){
      
      //Set temporary object
      GameObject tempObject = handler.object.get(i);
      
      //If temp object is the KeyWall
      if(tempObject.getId() == ID.KeyWall){
        handler.removeObject(handler.object.get(i));//Removes object from the list
      }
    }  
  } 
}
