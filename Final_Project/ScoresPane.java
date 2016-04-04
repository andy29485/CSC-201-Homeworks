//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.layout.Pane;
import java.util.List;
import java.util.ArrayList;

public class ScoresPane extends Pane {
  public static final String SCORE_FILE = "scores.db"

  public ScoresPane(Switcher s) {
    super();
  }

  public static void save(long score) {
    //TODO - get name
    //TODO - get date
    String name = "";
    long   date = 0;

    //TODO - load scores

    //TODO - insert score into scores

    //TODO - save scores
  }

  public static List<Score> load() {
    //TODO
  }

  public Score {
    public String name;
    public long   score;
    public long   date;
  }
}
