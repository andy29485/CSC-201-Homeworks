//Name:    Andriy Zasypkin
//Date:    2016-03-24
//Unit:    05
//Problem: 03

/* Description:
 *   Write a program that displays four cards randomly selected from a deck of
 *     52 if the Refresh button is clicked, shown below. The card image files
 *     are named 1.png, 2.png … 52.png and stored in the image/card directory.
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
 *   - Create a Button and labeled with “Refresh”
 *   - Create and register an event handler.
 *   - To handle event: once the button is clicked, call shuffle() method to
 *     shuffle the cards, then clear previous images by using
 *     getChildren.clear() method, and use add() to add four card images.
 *   - Create a new BorderPane to set up layout for the images and button.
 *   - Create a scene with a specific size.
 *   - Set title to “Shuffling cards” and display the stage.
 *   - The output should look like the screen below.
 *   - Provide appropriate Java comments.
 *
 * Assumptions:
 *   - //TODO
 *
 * Pseudocode:
 *   1. //TODO
 */

public class U5_Problem3 {
  public static void main(String[] args) {
    //TODO
    System.exit(0);
  }
}
