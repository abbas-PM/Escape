//Importing
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.geom.*; 

public class Window extends Canvas{
  
  //Creating sprites
  public static Image image1;
  public static Image image2;
  
  //Constructor
  public Window(int width, int height, String title, Project project) {
    
    JFrame frame = new JFrame(title);//Setting Jframe
    
    //Creating size of the window
    frame.setPreferredSize(new Dimension(width, height));
    frame.setMaximumSize(new Dimension(width, height));
    frame.setMinimumSize(new Dimension(width, height));
    
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//Can close when pressing X
    frame.setResizable(false);//Cant resize the window
    frame.setLocationRelativeTo(null);//Set to null
    frame.add(project);//Add the project to the frame
    frame.setVisible(true);//Set to true
    project.start();//Start  
    
    //Sprites used for the final boss
    image1 = Toolkit.getDefaultToolkit ().getImage ("FinalBossLeft.gif");
    image2 = Toolkit.getDefaultToolkit ().getImage ("FinalBossRight.gif");
    
  }
}
