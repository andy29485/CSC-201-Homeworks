//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.layout.Pane;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;

public class ScoresPane extends Pane {
  public static final String SCORE_FILE = "scores.db";

  public ScoresPane(Switcher s) {
    super();
  }

  public static void save(long score) {
    List<Score> scores = load();

    if(scores.size() < 10 || scores.get(scores.size()-1).score < score) {
      //TODO - get name
      String name = "TODO";
      long   date = System.currentTimeMillis();

      int i = scores.size();
      while(scores.get(--i).score < score);//TODO- may need fixing

      Score tmp = new Score();
      tmp.name  = name;
      tmp.date  = date;
      tmp.score = score;

      scores.add(i+1, tmp);

      try {
        RandomAccessFile raf = new RandomAccessFile(SCORE_FILE, "rw");
        for(i=0; i<(scores.size()<10 ? scores.size() : 10); i++) {
          raf.writeLong(scores.get(i).score);
          raf.writeLong(scores.get(i).date);
          raf.writeChars(scores.get(i).name+"\n");
        }
        raf.close();
      } catch(Exception e) {}
    }
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
