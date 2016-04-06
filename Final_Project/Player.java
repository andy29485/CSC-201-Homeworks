//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.layout.Pane;
import javafx.scene.shape.*;
import java.util.*;

public class Player extends GameObject {
  private List<Bullet> bullets;

  public Player() {
    super();
    this.bullets = new ArrayList<Bullet>();
    for(Shape tmp : this.getShapes())
        ((Polygon)tmp).getPoints().addAll(new Double[]{0.0, 0.0,
                                                       20.0, 5.0,
                                                       0.0, 10.0,
                                                       6.0, 5.0 });
    this.setX(AstroidsDriver.SIZE_X/2);
    this.setY(AstroidsDriver.SIZE_Y/2);
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

  public void reset() {
    this.setX(AstroidsDriver.SIZE_X/2);
    this.setY(AstroidsDriver.SIZE_Y/2);
    this.setdx(0);
    this.setdy(0);
    this.setAngle(0);
  }

  public void move(Pane p) {
    super.move();

    for(int i=0; i< bullets.size(); i++) {
      Bullet b = bullets.get(i);
      if(b.isDone()) {
        b.remove(p);
        this.bullets.remove(b);
        i--;
      }
      else
        b.move();
    }
  }
}
