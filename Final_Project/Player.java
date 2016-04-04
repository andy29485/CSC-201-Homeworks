//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import java.util.*;

public class Player extends GameObject {
  private List<Bullet> bullets;
  private double       angle;

  public Player() {
    super();
    this.bullets = new ArrayList<Bullet>();
    ((Polygon)(this.shape)).getPoints().addAll(new Double[]{0.0, 0.0,
                                                            20.0, 5.0,
                                                            0.0, 10.0,
                                                            6.0, 5.0 });
    this.setX(AstroidsDriver.PaneSwitcher.SIZE_X/2);
    this.setY(AstroidsDriver.PaneSwitcher.SIZE_Y/2);
    this.angle = 0;
  }

  public void shoot(Pane p) {
    Bullet b = new Bullet(this.getX()+Math.cos(this.getAngle())*10-Math.sin(this.getAngle())*5,
                          this.getY()+Math.sin(this.getAngle())*10+Math.cos(this.getAngle())*5,
                          this.getAngle());
    b.add(p);
    bullets.add(b);
  }

  public List<Bullet> getBullets() {
    return bullets;
  }

  public void setAngle(double angle) {
    this.angle = angle;

    while(this.angle > 360)
      this.angle -= 360;
    while(this.angle < 0)
      this.angle += 360;
  }

  public double getAngle() {
    return this.angle*Math.PI/180;
  }

  public void reset() {
    this.setX(AstroidsDriver.PaneSwitcher.SIZE_X/2);
    this.setY(AstroidsDriver.PaneSwitcher.SIZE_Y/2);
    this.angle = 0;
  }

  public void move(Pane p) {
    this.shape.setRotate(this.angle);

    super.move();

    for(int i=0; i< bullets.size(); i++) {
      Bullet b = bullets.get(i);
      if(b.isDone()) {
        p.getChildren().remove(b.getShape());
        this.bullets.remove(b);
        i--;
      }
      else
        b.move();
    }
  }
}
