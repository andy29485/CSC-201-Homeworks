//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project


import javafx.scene.shape.*;
import javafx.scene.paint.Color;
import javafx.scene.layout.Pane;

public abstract class GameObject {
  private   double x;
  private   double y;
  private   double dx;
  private   double dy;
  protected Shape  shape;

  public GameObject() {
    this.x     = 0;
    this.y     = 0;
    this.dx    = 0;
    this.dy    = 0;
    this.shape = new Polygon();

    this.shape.setStroke(Color.WHITE);
    this.shape.setFill(Color.TRANSPARENT);
  }

  public GameObject(double x, double y, double dx, double dy, Shape shape) {
    this.x     = x;
    this.y     = y;
    this.dx    = dx;
    this.dy    = dy;
    this.shape = shape;

    this.shape.setStroke(Color.WHITE);
    this.shape.setFill(Color.TRANSPARENT);
  }

  public void add(Pane p) {
    p.getChildren().add(this.shape);
  }

  public void move() {
    double frameX = AstroidsDriver.PaneSwitcher.SIZE_X;
    double frameY = AstroidsDriver.PaneSwitcher.SIZE_Y;

    this.x += this.dx;
    this.y += this.dy;

    if(this.x < 0) {
      this.x += frameX;
    }
    else if(this.x > frameX) {
      this.x -= frameX;
    }

    if(this.y < 0) {
      this.y += frameY;
    }
    else if(this.y > frameY) {
      this.y -= frameY;
    }

    shape.setLayoutX(this.x);
    shape.setLayoutY(this.y);
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getX() {
    return this.x;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getY() {
    return this.y;
  }

  public void setdy(double dy) {
    this.dy = dy;
  }

  public double getdy() {
    return this.dy;
  }

  public void setdx(double dx) {
    this.dx = dx;
  }

  public double getdx() {
    return this.dx;
  }

  public Shape getShape() {
    return shape;
  }

  public boolean checkCollision(GameObject obj) {
    Shape a = this.shape;
    Shape b = obj.getShape();
    return a.getBoundsInParent().intersects(b.getBoundsInParent());
  }
}
