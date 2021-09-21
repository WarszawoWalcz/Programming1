package nl.ru.ai.p4ai.exercise2;

import static nl.ru.ai.karel.Karel.*;

public class Mondriaan
{
  public static void main(String[] args)
  {
    speed(20);
    while(true){
      makeMondriaan(1, random(0,30), random(0,15));
    }
  }

  private static void makeMondriaan(int numOfRectangles, int randPosition_X,int randPosition_Y) {
    randomLocation(randPosition_X,randPosition_Y);

    while(numOfRectangles > 0){
      if (randPosition_X != 30) {
        if (randPosition_Y != 15) {
          drawRectangle(random(1, 30 - randPosition_X), random(1, 15 - randPosition_Y), randPosition_X, randPosition_Y);
        }
        else {
          drawRectangle15(random(1,30 - randPosition_X), (16 - random(1,15)), randPosition_X, randPosition_Y);
        }
      }
      else {
        if (randPosition_Y != 15) {
          drawRectangle30(random(1, 31 - randPosition_X), random(1, 15 - randPosition_Y), randPosition_X, randPosition_Y);
        }
        else {
          drawRectangle30_15(random(1,31 - randPosition_X), (16 - random(1,15)), randPosition_X, randPosition_Y);
        }

      }

      numOfRectangles--;
    }
  }

  //Case of Karel being (30,15)
  private static void drawRectangle30_15(int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
    turnLeft();
    turnLeft();
    drawLine(lineLength_X);
    turnLeft();
    drawLine(lineLength_Y);
    turnLeft();
    drawLine(lineLength_X);
    turnLeft();
    drawLine(lineLength_Y);
    goback30_15(lineLength_X, lineLength_Y);
    resetToOrigin30_15(lineLength_X, lineLength_Y, randPosition_X, randPosition_Y);
  }

  private static void resetToOrigin30_15(int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
    walk(randPosition_Y - lineLength_Y);
    turnRight();
    walk(randPosition_X - lineLength_X);
    turnRight();
  }

  private static void goback30_15(int lineLength_X, int lineLength_Y){
    turnLeft();
    walk(lineLength_X);
    turnLeft();
    walk(lineLength_Y);
  }
  //Case of Karel being (30,random !15)
  private static void drawRectangle30(int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
    turnLeft();
    turnLeft();
    drawLine(lineLength_X);
    turnRight();
    drawLine(lineLength_Y);
    turnRight();
    drawLine(lineLength_X);
    turnRight();
    drawLine(lineLength_Y);
    goback30(lineLength_X,lineLength_Y, randPosition_X, randPosition_Y);
    resetToOrigin30(lineLength_X, lineLength_Y, randPosition_X, randPosition_Y);
  }

  private static void resetToOrigin30(int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
    //walk(randPosition_Y - lineLength_Y);
    walk(randPosition_Y);
    turnRight();
    walk(randPosition_X - lineLength_X);
    turnRight();
  }

  private static void goback30(int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
  turnRight();
  walk(lineLength_X);
  turnLeft();
}
  //Case of Karel being (random !30, 15)
  private static void drawRectangle15( int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
    drawLine(lineLength_X);
    turnRight();
    drawLine(lineLength_Y);
    turnRight();
    drawLine(lineLength_X);
    turnRight();
    drawLine(lineLength_Y);
    goback15(lineLength_X,lineLength_Y);
    resetToOrigin15(lineLength_X, lineLength_Y, randPosition_X, randPosition_Y);
  }
  private static void goback15(int lineLength_X, int lineLength_Y) {
    turnRight();
    turnRight();
    walk(lineLength_Y);
  }


  private static void resetToOrigin15(int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
    walk(randPosition_Y - lineLength_Y);
    turnRight();
    walk(randPosition_X);
    turnRight();
  }

  private static void randomLocation(int randPosition_X, int randPosition_Y) {
    turnRight();
    walk(randPosition_X);
    turnLeft();
    walk(randPosition_Y);
    turnRight();
    //directionCheck(randPosition_X, randPosition_Y);
  }

  private static void directionCheck(int randPosition_X, int randPosition_Y) {
    if (randPosition_Y == 15){
      //rotate_RR();
    }
    if (randPosition_X == 30){

    }
  }

  private static void rotate_RR() {
    turnRight();
    turnRight();
  }

  private static void walk(int numOfSteps) {
    while (numOfSteps>0){
      step();
      numOfSteps--;
    }
  }

  private static void drawRectangle(int lineLength_X, int lineLength_Y, int randPosition_X, int randPosition_Y) {
    drawLine(lineLength_X);
    turnLeft();
    drawLine(lineLength_Y);
    turnLeft();
    drawLine(lineLength_X);
    turnLeft();
    drawLine(lineLength_Y);
    resetToOriginNormal(lineLength_X, lineLength_Y, randPosition_X, randPosition_Y);
  }

  private static void resetToOriginNormal(int lineLength_x, int lineLength_y, int randPosition_x, int randPosition_y) {
    walk(randPosition_y);
    turnRight();
    walk(randPosition_x);
    turnRight();
  }

  private static void drawLine(int length) {
    while(length>0){
      if(!onBall()) {
        putBall();
      }
      else {
        step();
        length--;
      }
    }
  }
}
