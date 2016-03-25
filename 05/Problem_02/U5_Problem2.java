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
 *
 * Pseudocode:
 *   1. The description is basically pseudocode
 */


import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.text.Text
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class U5_Problem2 {
  public void start(Stage stage) {
    //set title
    stage.setTitle("Characters around circle");

    String strCircular = "Welcome to Java";

    //Create panels
    StackPane root = new StackPane();

    //add text to panel
    root1.getChildren().add(b1);

    //add panel to stage
    stage.setScene(new Scene(root, 300, 200));

    //make stage(window) apprear
    stage.show();
  }

  //No need for main method - it runs from automatically - however
  public static void main(String... args) {
    launch(args);
  }
}
