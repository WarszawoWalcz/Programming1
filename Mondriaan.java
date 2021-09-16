package nl.ru.ai.p4ai.exercise2;

import static nl.ru.ai.karel.Karel.*;

public class Mondriaan
{
  public static void main(String[] args)
  {
    speed(25);
    makeMondriaan(1, random(0,30), random(0,15));

  }

  private static void makeMondriaan(int numOfRectangles, int randPosition_X,int randPosition_Y) {
    randomLocation(randPosition_X,randPosition_Y);

    while(numOfRectangles > 0){

      drawRectangle(random(1,30-randPosition_X), random(1,15-randPosition_X), randPosition_X, randPosition_Y);
      resetToOrigin();
      numOfRectangles--;
    }
  }



  private static void resetToOrigin() {

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
  }

  private static void drawLine(int length) {
    while(length>0){
      putBall();
      step();
      length--;
    }
  }

}



















//  public static void main(String[] args)
//  {
//    speed(5);
//    makeMondriaan(random(0,15),random(0,30));
//  }
//
//  private static void makeMondriaan(int y, int x) {
//    position(y,x);
//    drawRectangle(random(1,15-y), random(1,30-x));
//    toOrigin(15-y,30-x);
//  }
//
//  private static void toOrigin(int y, int x) {
//    steps(x);
//    turnLeft();
//    steps(y);
//    turnLeft();
//    steps(30);
//    turnLeft();
//    steps(15);
//    turnLeft();
//    turnLeft();
//  }
//
//  private static void drawRectangle(int y, int x) {
//
//    drawLine(x);
//    drawLine(y);
//    drawLine(x);
//    drawLine(y);
//  }
//
//  private static void drawLine(int stepsToTake) {
//    while (stepsToTake>0){
//      while(onBall()){
//        step();
//      }
//      putBall();
//      step();
//      stepsToTake--;
//    }
//    turnLeft();
//  }
//
//  private static void position(int y, int x) {
//    steps(y);
//    turnRight();
//    steps(x);
//  }
//
//  private static void steps(int numOfSteps) {
//    while (numOfSteps>0){
//      step();
//      numOfSteps--;
//    }
//  }
//}

