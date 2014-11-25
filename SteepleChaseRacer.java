/**
 * A SteepleChaseRacer is a Racer that can jump over hurdles of any height.
 * 
 * @author Jack Navin-Weinstein
 * @version Tuesday 25 November
 *
 */
public class SteepleChaseRacer extends Racer {
	
	//TODO Subclasses do not inherit any constructors from their superclass
	//Consequently, you will need to provide a compatible constructor
	
   public SteepleChaseRacer(int y){
      super(y);
   }
	/**
	 * Re-implement the method to allow for jumping hurdles of any height
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
      turnRight();
   for(int k = 1; k <= n; k++){
      move();
   }
   turnLeft();
	}

}
