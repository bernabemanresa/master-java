package com.bernabe.flowControl;

public class BucleLabels {

  public static void main(String[] args) {

    for (int i = 0; i < 5; i++) {
      // Skip 2
      if (i == 2) {
        continue;
      }
      System.out.print("i = " + i + " ");
    }
    // i = 0 i = 1 i = 3 i = 4

    System.out.println(" ");

    bucle1:
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == 2) {
          // jump to bucle1
          continue bucle1;
        }
        System.out.print("[i = " + i + ", j=" + j + "] ");
      }
    }
    // [i = 0, j=0] [i = 0, j=1] [i = 0, j=2] [i = 1, j=0] [i = 1, j=1] [i = 1, j=2] [i = 3, j=0] [i = 3, j=1] [i = 3, j=2] [i = 4, j=0] [i = 4, j=1] [i = 4, j=2]

    System.out.println(" ");

    bucle2:
    for (int i = 0; i < 5; i++) {
      for (int j = 0; j < 3; j++) {
        if (i == 2) {
          // break in bucle2
          break bucle2;
        }
        System.out.print("[i = " + i + ", j=" + j + "] ");
      }
    }
    //[i = 0, j=0] [i = 0, j=1] [i = 0, j=2] [i = 1, j=0] [i = 1, j=1] [i = 1, j=2]

    System.out.println(" ");

    week:
    for (int dayOfTheWeek = 1; dayOfTheWeek <= 7; dayOfTheWeek++) {
      int hour = 1;
      while (hour <= 8) {
        if (dayOfTheWeek == 6 || dayOfTheWeek == 7) {
          System.out.println("Resting day =  " + dayOfTheWeek);
          continue week;
        }
        System.out.println("Working day  = " + dayOfTheWeek + "  hour = " + hour);
        hour++;
      }
    }

    /*
    Working day  = 1  hour = 1
        Working day  = 1  hour = 2
        Working day  = 1  hour = 3
        Working day  = 1  hour = 4
        Working day  = 1  hour = 5
        Working day  = 1  hour = 6
        Working day  = 1  hour = 7
        Working day  = 1  hour = 8
        Working day  = 2  hour = 1
        Working day  = 2  hour = 2
        Working day  = 2  hour = 3
        Working day  = 2  hour = 4
        Working day  = 2  hour = 5
        Working day  = 2  hour = 6
        Working day  = 2  hour = 7
        Working day  = 2  hour = 8
        Working day  = 3  hour = 1
        Working day  = 3  hour = 2
        Working day  = 3  hour = 3
        Working day  = 3  hour = 4
        Working day  = 3  hour = 5
        Working day  = 3  hour = 6
        Working day  = 3  hour = 7
        Working day  = 3  hour = 8
        Working day  = 4  hour = 1
        Working day  = 4  hour = 2
        Working day  = 4  hour = 3
        Working day  = 4  hour = 4
        Working day  = 4  hour = 5
        Working day  = 4  hour = 6
        Working day  = 4  hour = 7
        Working day  = 4  hour = 8
        Working day  = 5  hour = 1
        Working day  = 5  hour = 2
        Working day  = 5  hour = 3
        Working day  = 5  hour = 4
        Working day  = 5  hour = 5
        Working day  = 5  hour = 6
        Working day  = 5  hour = 7
        Working day  = 5  hour = 8
        Resting day =  6
        Resting day =  7
     */

  }
}
