//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.application.Application;
import javafx.scene.input.KeyEvent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.event.*;

public class AstroidsDriver extends Application {
  public static final int SIZE_X = 700;
  public static final int SIZE_Y = 700;

  private static Stage mainStage;
  private static Scene menu;
  private static Scene game;
  private static Scene scores;

  public void start(Stage stage) {
    stage.setTitle("Astroids");
    mainStage = stage;

    PaneSwitcher ps = new PaneSwitcher();

    GamePane g_pane = new GamePane(ps);

    menu   = new Scene(new MenuPane(ps), SIZE_X, SIZE_Y);
    game   = new Scene(g_pane, SIZE_X, SIZE_Y);
    scores = new Scene(new ScoresPane(ps), SIZE_X, SIZE_Y);

    game.setOnKeyPressed(new EventHandler<KeyEvent>() {
      @Override
      public void handle(KeyEvent event) {
        g_pane.onKeyPress(event);
      }
    });
    game.setOnKeyReleased(new EventHandler<KeyEvent>() {
        @Override
        public void handle(KeyEvent event) {
          g_pane.onKeyRelease(event);
        }
      });

    ps.switchTo("menu");

    stage.show();
  }

  static class PaneSwitcher implements Switcher {
    public void switchTo(String pane) {
      if(pane.equalsIgnoreCase("menu"))
        mainStage.setScene(menu);
      else if(pane.equalsIgnoreCase("game"))
        mainStage.setScene(game);
      else if(pane.equalsIgnoreCase("scores"))
        mainStage.setScene(scores);
    }
  }
}
