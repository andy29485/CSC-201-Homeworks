package unit_01.problem_04;

// Name: Andriy Zasypkin
// Date: 2016-01-13
// Unit: 01
// Problem: 04

/*
 * Description: - Consider yourself driving with 60 miles/hour in a city that
 * has only grid like streets, and your GPS is broken. - With (x,y) as the
 * coordinates of the car, and the initial position (0,0). - At each
 * intersection, the only directions available are: North, South, East or West -
 * The GPS is broken, and it chooses the direction randomly at each
 * intersection, which happens every 5 minutes - The assumption is that the car
 * has the same speed at all times, including when it changes direction and
 * turns. - Write a program that calculates the distance from the initial point
 * to the location point of the driver after one hour of driving.
 *
 * Assumptions - distance between the 2 points is calculated using miles
 *
 * Pseudocode: 1. input: - speed(mph) - end time(min) - intersection time(min)
 * 2. declare variables - x(int) = 0 - y(int) = 0 - mpi(miles per intersection -
 * double) = (speed)/60*(intersection time) - intersections(int) = (end
 * time)/(intersection time) 3. loop <intersections> times: - ramdomly choose a
 * direction - add/subtract 1 to/from x/y 4. calc distance - distance(double) =
 * sqrt(x*x + y*y) - Note since the inital position was (0,0) no need to force
 * the computer to subtract 0 from x/y before squaring 5. print results - end
 * location - and distance
 */
import java.io.IOException;

public class Main {
  public static void main(String[] args) throws IOException {
    double dSpeed = 60; // speed of car in mph
    int nEndTime = 60; // time of trip in min
    int nIntTime = 5; // time per intersection in min
    int nPosX = 0; // speed of car in mph
    int nPosY = 0; // speed of car in mph
    double dMPI = dSpeed / 60 * nIntTime; // number of miles in an intersection
    int nInts = nEndTime / nIntTime; // #of intersections car will pass
                                     // during specified time

    // simulate a drive:
    // randomly choose one of 4 directions and change x/y cordinates acordingly
    for(int i = 0; i < nInts; i++) {
      switch((int) (Math.random() * 4)) {
        case (0):// North
          nPosY++;
          break;
        case (1):// South
          nPosY--;
          break;
        case (2):// East
          nPosX++;
          break;
        case (3):// West
          nPosX--;
          break;
      }
    }

    // calculate displacement of car at the end
    double dDistance = Math.sqrt(nPosX * nPosX + nPosY * nPosY) * dMPI;

    // print the requested output
    System.out.printf("Car endded at: (%d, %d), distance: %f miles\n", nPosX,
        nPosY, dDistance);
    System.exit(0);
  }
}
