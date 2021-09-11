// Dawid Dudek s1074780
//Omar Qaterge s1056565

package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class Church
{

  public static void main(String[] args)
  {
    map("church.map");
    speed(50);
    while(!inFrontOfWall()) {
      step();
    }
    turnRight();
    while(true) {
      step();
      turnLeft();
        if(inFrontOfWall()) {
          turnRight();
          if(inFrontOfWall()) {
            turnRight();
            if(inFrontOfWall()) {
              turnRight();
          }
        }
      }
    }

  }

}
