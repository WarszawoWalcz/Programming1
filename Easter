package nl.ru.ai.easter;

import java.util.Scanner;

public class  Easter {

  static boolean isLeapYear(int year) {
    if (year % 100 == 0) {
      if (year % 400 == 0) {
        return true;
      }
    } else {
      if (year % 4 == 0) {
        return true;
      }
    }
    return false;
  }

  static int numberOfDaysInMonth(int year, Month month) {
    if(month == Month.FEBRUARY){
      if(isLeapYear(year)){
        return 29;
      }else{
        return 28;
      }
    }
    switch(month){
      case APRIL:
      case JUNE:
      case SEPTEMBER:
      case NOVEMBER:
        return 30;
      default:
        return 31;
    }
  }

  static Month easterMonth(int year) {
    // implement this function
    return Month.JANUARY;
  }

  static int easterDay(int year) {
    // implement this function
    return 0;
  }

  static int dayNumberInYear(int day, Month month, int year) {
    // implement this function
    return 0;
  }

  static Month monthInYearOfDayNumber(int dayNumber, int year) {
    // implement this function
    return Month.JANUARY;
  }

  static int dayInMonthOfDayNumber(int dayNumber, int year) {
    // implement this function
    return 0;
  }

  static void showHolyDays(int year) {
    // implement this function
  }

  public static void main(String[] arguments) {
    isLeapYear(2021);
    System.out.println(numberOfDaysInMonth(2021, Month.JANUARY));
  }

}
