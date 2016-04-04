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
  private static Stage mainStage;

  public void start(Stage stage) {
    stage.setTitle("Astroids");
    mainStage = stage;

    PaneSwitcher ps = new PaneSwitcher();

    ps.switchTo("menu");

    stage.show();
  }

  static class PaneSwitcher implements Switcher {
    public static final int SIZE_X = 500;
    public static final int SIZE_Y = 500;

    public void switchTo(String pane) {
      if(pane.equalsIgnoreCase("menu"))
        mainStage.setScene(new Scene(new MenuPane(this), SIZE_X, SIZE_Y));
      else if(pane.equalsIgnoreCase("game")) {
        GamePane game = new GamePane(this);
        Scene tmp = new Scene(game, SIZE_X, SIZE_Y);
        tmp.setOnKeyPressed(new EventHandler<KeyEvent>() {
          @Override
          public void handle(KeyEvent event) {
            game.onKeyPress(event);
          }
        });
        mainStage.setScene(tmp);
      }
      else if(pane.equalsIgnoreCase("scores"))
        mainStage.setScene(new Scene(new ScoresPane(this), SIZE_X, SIZE_Y));
    }
  }
}
