package unit_05.problem_01;

// Name: Andriy Zasypkin
// Date: 2016-03-24
// Unit: 05
// Problem: 01

/*
 * Description: - Create two stages in a program - Create a pane using FlowPane
 * in each stage - Add three buttons to each pane - Directions - Create a class
 * named FlowPaneDemo extends Application - user interface using FlowPane - Add
 * the instances of 3 Buttons to pane1 created by FlowPane and other 3 instances
 * of Buttons using FlowPane to pane2 - scene1 for pane1 with a specific size -
 * scene2 for pane2 with a different size - Set different titles to two stages
 * and display two stages - The output should look like the screen below(see
 * problems) - Provide appropriate Java comments
 *
 * Assumptions: - Buttons will only print that they were clicked - when clicked
 * - Sperate object, but same class will need to be used for the stages - Java
 * comments just means "comment your code" - not javadoc - The picture states
 * that the title is SampleFlowPanel - It was low quality - FlowPaneDemo will
 * not be the name of the main class - Global assignment directions overwrite
 * specific assignment directions unless explicetly specified
 *
 * Pseudocode: 1. in the start method: 1.1 create a second stage and two panes
 * 1.2 set titles for the stages 1.3 create 6 buttons 1.4 set button titles and
 * actions(print) 1.5 add buttons to pane 1.6 create scenes from panes and add
 * scenes to stages 1.7 show both stages
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class U5_Problem1 extends Application {
  @Override
  public void start(Stage stage1) {
    // create another stage(window)
    Stage stage2 = new Stage();

    // set titles for both stages
    stage1.setTitle("SampleFlowPanel");
    stage2.setTitle("SampleFlowPanel");

    // Create panels
    FlowPane root1 = new FlowPane();
    FlowPane root2 = new FlowPane();

    // Create button objs
    Button b1 = new Button();
    Button b2 = new Button();
    Button b3 = new Button();
    Button b4 = new Button();
    Button b5 = new Button();
    Button b6 = new Button();

    // Set button names and actions(using lambda)
    b1.setText("Button 1");
    b1.setOnAction(event -> System.out.println("b1 pressed"));
    b2.setText("Button 2");
    b2.setOnAction(event -> System.out.println("b2 pressed"));
    b3.setText("Button 3");
    b3.setOnAction(event -> System.out.println("b3 pressed"));
    b4.setText("Button 4");
    b4.setOnAction(event -> System.out.println("b4 pressed"));
    b5.setText("Button 5");
    b5.setOnAction(event -> System.out.println("b5 pressed"));
    b6.setText("Button 6");
    b6.setOnAction(event -> System.out.println("b6 pressed"));

    // add buttons to respective panels
    root1.getChildren().add(b1);
    root1.getChildren().add(b2);
    root1.getChildren().add(b3);
    root2.getChildren().add(b4);
    root2.getChildren().add(b5);
    root2.getChildren().add(b6);

    // add panels to respective stages
    stage1.setScene(new Scene(root1, 300, 200));
    stage2.setScene(new Scene(root2, 100, 200));

    // make stages(windows) apprear
    stage1.show();
    stage2.show();
  }

  // No need for main method - it runs from automatically - however
  public static void main(String... args) {
    launch(args);
  }
}
