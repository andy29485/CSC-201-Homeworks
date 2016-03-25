//Name:    Andriy Zasypkin
//Date:    2016-03-24
//Unit:    05
//Problem: 02

/* Description:
 *   Write a program that displays a string "Welcome to Java" around the circle,
 *     as shown below. You need to display each character in the right location
 *     with appropriate rotation using a loop.
 *   - Create a class named Characters extends Application.
 *   - Create a new pane.
 *   - Create an object of Font class and define font features as bold,
 *     Times New Roman, regular and size of 35.
 *   - Create a string of "Welcome to Java"
 *   - Create a for loop to scan through each character of "Welcome to Java"
 *     string.
 *   - Inside the for loop, create an instance of Text on the given
 *     coordinates containing the given characters by use constructor
 *     of Text(double x, double y, java.lang.String text)
 *   - Use setFont( ) and setRotate( ) methods of Text class to define
 *     characters and their rotated positions
 *   - text instance to the pane by using getChildren().add() method
 *   - Create a scene with a specific size
 *   - Set title to "Characters around circle" and display the stage
 *   - The output should look like the screen below.
 *   - Provide appropriate Java comments
 *
 * Assumptions:
 *   - Characters will not be the name of the main class
 *   - Java comments just means "comment your code" - not javadoc
 *   - Since both bold and regular were specified as font fetures, I'll assume
 *     that the second(regular) overwrites the first(bold)
 *
 * Pseudocode:
 *   1. The description is basically pseudocode
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;


public class U5_Problem2 extends Application {
  public void start(Stage stage) {
    //set title
    stage.setTitle("Characters around circle");

    //create pane and string to display
    String strCircular = "Welcome to Java";
    Pane root = new Pane();

    //set the size of the panel
    final int SIZE_X = 300;
    final int SIZE_Y = 300;

    //no suitable constructor found for Font(String,FontPosture,double)
    //Font font = new Font("Times New Roman", FontPosture.REGULAR, 35.);
    //javafx is stupid - I should not have to do this in this way
    //See assumptions on why regular was used
    Font font = Font.font("Times New Roman", FontPosture.REGULAR, 35);

    for(int i=0; i<strCircular.length(); i++) {
      String c = strCircular.substring(i, i+1);//extract single letter as string

      //Use trig to figure out location of each char
      double angle = 2.0*i*Math.PI/strCircular.length();
      double tmpX  = SIZE_Y/3 * Math.cos(angle) + SIZE_X/2;//use trig to offset
      double tmpY  = SIZE_Y/3 * Math.sin(angle) + SIZE_Y/2;// from origin

      //Create text for each char in string(location, text, font, rotation)
      Text tmp = new Text(tmpX, tmpY, c);
      tmp.setFont(font);
      tmp.setRotate(90+angle*180/Math.PI);//some use radians, some use degrees
                                          //  the 90 is to ensure that the first
                                          //  letter is sideways

      //System.out.printf("(%5.2f, %5.2f) %d deg \"%s\"\n",
      //                  tmp.getX(), tmp.getY(), tmp.getRotate(), c);

      //add letter to pane
      root.getChildren().add(tmp);
    }

    //add pane to stage
    stage.setScene(new Scene(root, SIZE_X, SIZE_Y));

    //make stage(window) apprear
    stage.show();
  }

  //No need for main method - it runs from automatically - however
  public static void main(String... args) {
    launch(args);
  }
}
