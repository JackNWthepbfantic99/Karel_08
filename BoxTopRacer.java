/**
 * A BoxTopRacer is a Racer that can jump over hurdles of any width.
 * 
 * @author Jack Navin-Weinstein
 * @version Tuesday 25 November
 *
 */
public class BoxTopRacer extends Racer {
   public BoxTopRacer(int y) {
   super(y);
   }
   
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
	
	/**
	 * Re-implement the method to allow for jumping hurdles of any width
	 */
	@Override
	public void jumpRight(){
		turnLeft();
      int n = 0;
   while(!rightIsClear()){
      move();
      n++;
   }
   turnRight();
   move();
   while(!rightIsClear()){
      move();
   }
   turnRight();
   for(int k = 1; k <= n; k++){
      move();
   }
   turnLeft();
	}

}
