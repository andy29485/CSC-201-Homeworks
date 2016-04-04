//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.layout.Pane;
import javafx.animation.AnimationTimer;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.KeyCode;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import java.util.*;

public class GamePane extends Pane {
  private List<Astroid> astroids;
  private Switcher      s;
  private Player        p;
  private int           lives;
  private int           level;
  private long          score;
  private long          lastFire;
  private long          nanoNow;
  private boolean       canFire;
  private Text          info;

  public GamePane(Switcher s) {
    super();
    this.setStyle("-fx-background-color: #000000");


    Font font = Font.font("Monospaced", 13);

    this.lastFire = 0;
    this.nanoNow  = 0;
    this.canFire  = true;
    this.s        = s;
    this.p        = new Player();
    this.astroids = new ArrayList<Astroid>();
    this.lives    = 4;
    this.level    = 0;
    this.score    = 0;
    this.info     = new Text(AstroidsDriver.PaneSwitcher.SIZE_X-300, 22, "");

    p.add(this);
    this.getChildren().add(info);

    info.setFont(font);
    info.setText(String.format("Level%6d, Score:%,19d", level, score));
    info.setStyle("-fx-stroke: #FFFFFF");

    new AnimationTimer() {
      public void handle(long now) {
        nanoNow = now;
        if(!canFire &&
          (now > lastFire+350000000l) || p.getBullets().size() == 0) {
            canFire  = true;
            lastFire = now;
        }
        info.setText(String.format("Lives %d | Level %d | Score:%,d",
                                   lives, level, score));
        if(astroids.size() == 0) {
          score += 100 * level;
          level++;
          for(int i=0; i<=level; i++) {//make `level+1` astroids at the start
            Astroid tmp = new Astroid();
            astroids.add(tmp);
            tmp.add(GamePane.this);
          }
        }
        if(lives <= 0) {
          ScoresPane.save(score);
          GamePane.this.s.switchTo("scores");
        }
        for(int i=0; i<astroids.size(); i++) {
          Astroid a = astroids.get(i);
          a.move();

          if(a.checkCollision(p)) {
            p.reset();
            lives--;
            for(Astroid tmp : astroids) {
              while(tmp.checkCollision(p))
                tmp.move();
            }
          }

          for(int j=0; j<p.getBullets().size(); j++) {
            Bullet b = p.getBullets().get(j);
            if(a.checkCollision(b)) {
              GamePane.this.getChildren().remove(b.getShape());
              GamePane.this.getChildren().remove(a.getShape());
              astroids.remove(i);
              p.getBullets().remove(j);
              i--;
              j--;

              Astroid[] tmp = a.destroy();
              score += a.getScore();

              if(tmp != null) {
                for(Astroid tmp_a : tmp) {
                  astroids.add(tmp_a);
                  tmp_a.add(GamePane.this);
                }
              }
            }
          }
        }
        p.move(GamePane.this);
      }
    }.start();
  }

  public void onKeyPress(KeyEvent event) {
    double moveStep = .9;
    double maxSpeed = 10;
    double dy = p.getdy();
    double dx = p.getdx();
    if(event.getCode() == KeyCode.UP) {
      dy += Math.sin(p.getAngle())*moveStep/Math.abs(Math.abs(dy)>.7 ? dy : 1);
      dx += Math.cos(p.getAngle())*moveStep/Math.abs(Math.abs(dx)>.7 ? dx : 1);
    }
    if(event.getCode() == KeyCode.DOWN) {
      dy -= Math.sin(p.getAngle())*moveStep/Math.abs(Math.abs(dy)>.7 ? dy : 1);
      dx -= Math.cos(p.getAngle())*moveStep/Math.abs(Math.abs(dx)>.7 ? dx : 1);
    }
    if(event.getCode() == KeyCode.LEFT) {
      p.setAngle(p.getAngle()/Math.PI*180-13);
    }
    if(event.getCode() == KeyCode.RIGHT) {
      p.setAngle(p.getAngle()/Math.PI*180+13);
    }
    if(event.getCode() == KeyCode.SPACE && canFire) {
      p.shoot(GamePane.this);
      lastFire = nanoNow;
      canFire  = false;
    }
    if(dy > -1*maxSpeed && dy < maxSpeed &&
       dx > -1*maxSpeed && dx < maxSpeed) {
      p.setdy(dy);
      p.setdx(dx);
    }
  }
}
