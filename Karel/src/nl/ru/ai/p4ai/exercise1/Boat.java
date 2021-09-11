// Dawid Dudek s1074780
//Omar Qaterge s1056565

package nl.ru.ai.p4ai.exercise1;

import static nl.ru.ai.karel.Karel.*;

public class Boat {

  public static void main(String[] args) {
      speed(30);

      navigate();

      turnLeft();
      DiagLine();
      turnRight();
      DiagLine();

      floor();
      base();
      pole();
  }

    private static void pole() {
      turnRight();
      turnRight();
      step();
      step();
      step();
      step();
      turnRight();
      step();

      sb();
      sb();
      sb();
      sb();
    }

  private static void sb() {
    step();
    putBall();
  }

  private static void base() {
      turnLeft();
      step();
      turnLeft();
      sb();
      turnRight();
      step();
      turnLeft();
      sb();
      sb();
      sb();
      sb();
      sb();
      sb();
      sb();
      turnLeft();
      step();
      turnRight();
      sb();
    }

    private static void floor() {
      turnRight();
      turnRight();
      putBall();
      sb();
      sb();
      sb();
      sb();
      sb();
      sb();
      sb();
      sb();
      sb();
      step();
    }

    private static void DiagLine() {
      putBall();
      step();
      turnRight();
      step();
      turnLeft();

        putBall();
        step();
        turnRight();
        step();
        turnLeft();

        putBall();
        step();
        turnRight();
        step();
        turnLeft();

        putBall();
        step();
        turnRight();
        step();
        turnLeft();

        putBall();
        step();
        turnRight();
        step();
        turnLeft();

    }

    private static void navigate() {
      step();
      step();
      step();
      turnRight();
      step();
      step();
    }
}
