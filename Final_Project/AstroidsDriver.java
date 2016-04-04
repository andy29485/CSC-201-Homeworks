//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.Pane;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.*;

public class AstroidsDriver extends Application {
  private static Pane  menu;
  private static Pane  game;
  private static Pane  scores;
  private static Stage mainStage;

  public void start(Stage stage) {
    stage.setTitle("Astroids");
    mainStage = stage;

    PaneSwitcher ps = new PaneSwitcher();

    menu   = new MenuPane(ps);
    game   = new GamePane(ps);
    scores = new ScoresPane(ps);

    ps.switchTo("menu");

    stage.show();
  }

  static class PaneSwitcher implements Switcher {
    public static final int SIZE_X = 500;
    public static final int SIZE_Y = 500;

    public void switchTo(String pane) {
      if(pane.equalsIgnoreCase("menu"))
        mainStage.setScene(new Scene(menu, SIZE_X, SIZE_Y));
      else if(pane.equalsIgnoreCase("game")) {
        game = new GamePane(this);
        Scene tmp = new Scene(game, SIZE_X, SIZE_Y);
        tmp.setOnKeyPressed(new EventHandler<KeyEvent>() {
          @Override
          public void handle(KeyEvent event) {
            ((GamePane)game).onKeyPress(event);
          }
        });
        mainStage.setScene(tmp);
      }
      else if(pane.equalsIgnoreCase("scores"))
        mainStage.setScene(new Scene(scores, SIZE_X, SIZE_Y));
    }
  }
}
