//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.layout.VBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.control.Button;
import javafx.geometry.Pos;

public class MenuPane extends FlowPane {
  public MenuPane(Switcher s) {
    super();

    VBox vb = new VBox();

    Button playButton   = new Button();
    playButton.setText("Play");
    playButton.setOnAction(e -> s.switchTo("game"));

    Button scoresButton = new Button();
    scoresButton.setText("Scores");
    scoresButton.setOnAction(e -> s.switchTo("scores"));

    Button exitButton   = new Button();
    exitButton.setText("Exit");
    exitButton.setOnAction(e -> System.exit(0));

    vb.getChildren().add(playButton);
    vb.getChildren().add(scoresButton);
    vb.getChildren().add(exitButton);
    vb.setAlignment(Pos.CENTER);

    this.getChildren().add(vb);
    this.setAlignment(Pos.CENTER);
  }
}
