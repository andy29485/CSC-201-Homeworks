//Name:    Andriy Zasypkin
//Date:    2016-03-24
//Unit:    05
//Problem: 03

/* Description:
 *   Write a program that displays four cards randomly selected from a deck of
 *     52 if the Refresh button is clicked, shown below. The card image files
 *     are named 1.png, 2.png ... 52.png and stored in the image/card directory.
 *     All four cards are distinct and selected randomly. The card files are
 *     provided in Blackboard.
 *   Hint: You can select random cards by storing the numbers 1-52 to an array
 *     list, perform a random shuffle learned in Section 11.12, and use the
 *     first four numbers in the array list as the file names for the image.
 *     The other way is to use the static shuffle method in the
 *     java.util.Collections class, for example:
 *     java.util.Collections.shuffle(list) where list is an array list.
 *   - Create a class named CardRefreshButton extends Application.
 *   - Create a new array list, then use a for loop and add() method to add 52
 *     cards to the list.
 *   - Revoke shuffle() method for the list to shuffle the cards.
 *   - Create an instance of HBox and add four card images by using
 *     getChildren().add() method. Make sure specify image file path and use
 *     array list’s get() method to get four card image files.
 *   - Create a Button and labeled with "Refresh"
 *   - Create and register an event handler.
 *   - To handle event: once the button is clicked, call shuffle() method to
 *     shuffle the cards, then clear previous images by using
 *     getChildren.clear() method, and use add() to add four card images.
 *   - Create a new BorderPane to set up layout for the images and button.
 *   - Create a scene with a specific size.
 *   - Set title to "Shuffling cards" and display the stage.
 *   - The output should look like the screen below.
 *   - Provide appropriate Java comments.
 *
 * Assumptions:
 *   - Java comments just means "comment your code" - not javadoc
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


public class U5_Problem3 extends Application {
  public void start(Stage stage) {
    //set title
    stage.setTitle("Shuffling cards");

    //create pane and string to display
    Pane root = new Pane();

    //set the size of the panel
    final int SIZE_X = 300;
    final int SIZE_Y = 300;

    //TODO

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
