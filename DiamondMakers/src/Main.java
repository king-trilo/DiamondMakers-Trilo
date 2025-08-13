import kareltherobot.*;

public class Main implements Directions {
  public static void main(String[] args) {
    World.setVisible(true);// allows us to see the run
    World.setSize(12,12);
    World.setDelay(6);

    // The line below creates a Robot that we will refer to as r.  
    // Find out what the numbers and direction do!
    Robot r = new Robot(3,5,East,50);
		
    // examples of commands you can invoke on a Robot
    r.move();// move one step in the direction it is facing
    r.turnLeft();
    r.putBeeper();
    r.move();
  //zig zag pattern
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();
  //one movement
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();
  //side length #1
  r.turnLeft();
  //movement for side length #2
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.putBeeper();
  r.move();
  r.turnLeft();r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.putBeeper();
  r.move();
  r.turnLeft();r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.putBeeper();
  r.move();
  r.turnLeft();r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.putBeeper();
  //end of side length #2
  //move to start side length #3
  r.turnLeft();
  r.move();
  r.turnLeft();
  r.move();
  r.putBeeper();
  //moved to side length #3
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
// xxxxxxxxxxxx
  r.turnLeft();
  r.move();
  r.putBeeper();
  //moved
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
    r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();  r.move();
  //end of side length #3
  //move to start side length #4
  r.turnLeft();
  r.move();
  r.putBeeper();
  //moved to side length #4
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  
  //end of side length #4
  //start to fill in the diamond
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  // filling in the diamond
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.move();
  r.putBeeper();r.move();
  r.putBeeper();r.move();
  r.putBeeper();r.move();
  r.putBeeper();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.move();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.move();
  r.move();
  r.putBeeper();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.move();
  r.putBeeper();
  r.move();
  r.move();
  r.putBeeper();
  r.move();
  r.putBeeper();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.move();
  r.move();
  r.move();
  r.move();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.turnLeft();
  r.turnLeft();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.move();
  r.putBeeper();
  r.move();
  r.move();
  r.putBeeper();
  r.move();
  r.putBeeper();
  r.turnLeft();
  r.move();
  r.turnLeft();
  r.move();
  r.putBeeper();
  r.move();
  r.move();
  r.putBeeper();
r.move();
r.move();
r.move();
r.move();
r.move();
r.turnLeft();
r.turnLeft();
r.turnLeft();
r.move();
r.move();
r.move();
r.move();
r.turnLeft();
r.turnLeft();

  
}
}