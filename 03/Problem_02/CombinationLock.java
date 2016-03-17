//Name:    Andriy Zasypkin
//Date:    2016-02-10
//Unit:    03
//Problem: 02

import java.io.BufferedReader;

public class CombinationLock {
  private int nPosition1;
  private int nPosition2;
  private int nPosition3;
  private int bCurrentPosition;//README explains more, but simple version:
                               //  - first 2 bits will be indicated unlocked
                               //  - other 6 will contain current number

  public CombinationLock() {
    this.nPosition1       = 0;
    this.nPosition2       = 0;
    this.nPosition3       = 0;
    this.bCurrentPosition = 0;
  }

  public CombinationLock(int num1, int num2, int num3) {
    this.nPosition1       = num1;
    this.nPosition2       = num2;
    this.nPosition3       = num3;
    this.bCurrentPosition = 0;
  }

  //README
  // on some of these line I'm doing some fun math, here's an explination:
  // there is a 3 step process going on:
  //  1. bCurrentPosition&63
  //    * extract the current number that the dial points to (range [0, 39])
  //  2. [-+]nPositions+40
  //    * shift dial over by nPositions ends up in range [0, 39]
  //    * example 11 shift left(-) 31
  //      * (11 - 31 + 40)%40 -> (-20 + 40)%40 -> 20%40 -> 20
  //    * example 31 shift right(+) 20
  //      * (31 + 20 + 40)%40 -> ( 51 + 40)%40 -> 91%40 -> 11
  //  3. | {128,64,192}
  //    * add on the current unlock thing
  //      * first a simple key:
  //         * 0 -> nothing unlocked
  //         * 1 -> first position unlocked
  //         * 2 -> second position unlocked
  //         * 3 -> third position unlocked(lock is fully unlocked)
  //      * now, the key cannot be stored directly as the bits that are used for
  //         0-3 are in use, so the 0-3 needs to be shifted before being added
  //         on to bCurrentPosition
  //      * so 0-3 become
  //         * 0 << 6 =   0
  //         * 1 << 6 =  64
  //         * 2 << 6 = 128
  //         * 3 << 6 = 192
  //      * the or(|) part adds on the bits to the current number
  //        * '+' could have also been used
  //
  // This line
  //   `(bCurrentPosition&192) == `
  // allows me to extract and deturmin the current pregress of the unlock
  //  (see other fun math thing explination step/part 3)

  public void resetDial() {
    bCurrentPosition = 0;
  }

  public boolean openLock(int num1, int num2, int num3) {
    //not that I need to use 'this' here... but for whatever reason, I shall
    this.resetDial();
    this.turnRight(num1);
    this.turnLeft(num2);
    this.turnRight(num3);
    return (bCurrentPosition&192) == 192;
  }

  //not sure why these are needed, but they were required
  public void setPosition1(int nPosition1) {
    this.nPosition1 = nPosition1;
  }

  public int getPosition1() {
    return this.nPosition1;
  }

  public void setPosition2(int nPosition2) {
    this.nPosition2 = nPosition2;
  }

  public int getPosition2() {
    return this.nPosition2;
  }

  public void setPosition3(int nPosition3) {
    this.nPosition3 = nPosition3;
  }

  public int getPosition3() {
    return this.nPosition3;
  }

  public void turnLeft(int nPositions) {
    if((bCurrentPosition&192) == 64) { //second turn
      bCurrentPosition = (byte)(((bCurrentPosition&63)-nPositions+40)%40 | 128);
      if((bCurrentPosition&63) != nPosition2) //wrong number
        this.resetDial();
    }
    else { //they messed up...
      this.resetDial();
    }
  }

  public void turnRight(int nPositions) {
    if((bCurrentPosition&192) == 0) { //first turn
      bCurrentPosition = (byte)(((bCurrentPosition&63)+nPositions+40)%40 |  64);
      if((bCurrentPosition&63) != nPosition1) //wrong number
        this.resetDial();
    }
    else if((bCurrentPosition&192) == 128) { //third turn
      bCurrentPosition = (byte)(((bCurrentPosition&63)+nPositions+40)%40 | 192);
      if((bCurrentPosition&63) != nPosition3) //wrong number
        this.resetDial();
    }
    else { //they messed up...
      this.resetDial();
    }
  }
}
