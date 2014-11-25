/**
*  It lets you pick up the beepers much quicker anf jump right and left.
*
*  @author Jack Navin-Weinstein
*  @version Thursday, 6 Novemeber
*/

import edu.fcps.karel2.Display;
import edu.fcps.karel2.Robot;

public class Racer extends Athlete 
   {
    public Racer (int y)
     {
       super(1, y, Display.EAST, Display.INFINITY);
     }
     
    public void jumpRight()
      {
       turnLeft();
       move();
       turnRight();
       move();
       turnRight();
       move();
       turnLeft();
      }
      
    public void jumpLeft()
      {
       turnRight();
       move();
       turnLeft();
       move();
       turnLeft();
       move();
       turnRight();
      }
      
    public void sprint(int n)
      {
         for(int k = 1; k <= n; k++)
           move();
      }
      
    public void put(int n)
      {
       for(int k = 1; k <= n; k++)
            putBeeper();
      }
      
    public void pick(int n)
      {
       for(int k = 1; k <= n; k++)
            pickBeeper();
      }
      
    public void shuttle(int spaces, int beepers)
      {
       move();
       jumpRight();
       sprint(spaces);
       pick(beepers);
       turnAround();
       sprint(spaces);
       jumpLeft();
       move();
       put(beepers);
       turnAround();
      }
      
      public void runTheRace() {
          shuttle(2, 7);
          shuttle(4, 5);
          shuttle(6, 3);
          move();
     }
    
    }
   

// consult the Karel API to determine what constructors and methods this class should implement


