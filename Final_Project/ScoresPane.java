//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Button;
import java.io.RandomAccessFile;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScoresPane extends GridPane {
  public static final String SCORE_FILE = "scores.db";

  public ScoresPane(Switcher s) {
    super();
    //TODO - table(name score date) (button)?
    //if name empty: set name as text box and add save button
    //when button pushed, save and refresh table

    this.setHgap(30);

    this.add(new Label("Top Scores"), 0, 0);
    this.add(new Label("Name"),  0, 1);
    this.add(new Label("Score"), 1, 1);
    this.add(new Label("Date"),  2, 1);

    List<Score> scores = load();
    int i = 1;

    for(Score score : scores) {
      i++;
      if(score.name.length()>0)
        this.add(new Label(score.name),  0, i);
      else {
        TextField tmpf = new TextField();
        tmpf.setPromptText("Enter Name");
        this.add(tmpf,  0, i);

        int j = i;

        Button tmpb = new Button();
        tmpb.setText("Save");
        tmpb.setOnAction(e -> { score.name = tmpf.getText();
                                this.getChildren().remove(tmpb);
                                this.getChildren().remove(tmpf);
                                this.add(new Label(score.name),  0, j);
                                save(scores);});
        this.add(tmpb,  3, i);
      }
      this.add(new Label(String.format("%,d", score.score)), 1, i);
      this.add(new Label(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(
          new Date(score.date))),  2, i);
    }

  }

  public static void save(long score) {
    List<Score> scores = load();

    if(scores.size() < 10 || scores.get(scores.size()-1).score < score) {
      //TODO - get name
      String name = "";
      long   date = System.currentTimeMillis();

      int i = scores.size();
      while(--i>=0 && scores.get(i).score < score);

      Score tmp = new Score();
      tmp.name  = name;
      tmp.date  = date;
      tmp.score = score;

      scores.add(i+1, tmp);

      save(scores);
    }
  }

  public static void save(List<Score> scores) {
    try {
      RandomAccessFile raf = new RandomAccessFile(SCORE_FILE, "rw");
      for(int i=0; i<(scores.size()<10 ? scores.size() : 10); i++) {
        raf.writeLong(scores.get(i).score);
        raf.writeLong(scores.get(i).date);
        raf.writeChars(scores.get(i).name+"\n");
      }
      raf.close();
    } catch(Exception e) {}
  }

  public static List<Score> load() {
    List<Score> scores = new ArrayList<Score>();
    java.io.File f = new java.io.File(SCORE_FILE);

    if(f.exists() && !f.isDirectory()) {//return empty list if file !exist
      try {
        RandomAccessFile raf = new RandomAccessFile(SCORE_FILE, "r");
        while(raf.getFilePointer() < raf.length()) {
          Score tmp = new Score();
          tmp.score = raf.readLong();
          tmp.date  = raf.readLong();
          tmp.name  = raf.readLine();
          scores.add(tmp);
        }
        raf.close();
      } catch(Exception e) {}
    }

    return scores;
  }

  public static class Score {
    public String name;
    public long   score;
    public long   date;
  }
}
