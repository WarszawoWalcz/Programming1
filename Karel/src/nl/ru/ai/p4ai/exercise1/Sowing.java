// Dawid Dudek s1074780
//Omar Qaterge s1056565

package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class Sowing
{

  public static void main(String[] args)
  {
    speed(5);
    while(true) {
      layBall();
      rotateR();
      if(inFrontOfWall()) {
        while (true){
          turnRight();
        }
      }
      rotateStepR();
      layBall();
      rotateL();
      }
    }

  private static void rotateStepR() {
    step();
    turnRight();
  }


  private static void layBall() {
    while (!inFrontOfWall()) {
      putBall();
      step();
    }
  }


  private static void rotateL() {
    putBall();
    turnLeft();
    step();
    turnLeft();
  }

  private static void rotateR() {
    putBall();
    turnRight();
  }

}
