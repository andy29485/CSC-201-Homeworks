//Name:    Andriy Zasypkin
//Date:    2016-04-03
//Final Project

import javafx.scene.shape.*;

public class Astroid extends GameObject {
  private int    size;
  private double angle;
  private double dangle;

  public Astroid() {
    super(Math.random()*(AstroidsDriver.PaneSwitcher.SIZE_X-50)+10,
          Math.random()*(AstroidsDriver.PaneSwitcher.SIZE_Y-50)+10,
          Math.random()*6-3, Math.random()*6-3, new Polygon());

    this.size   = 5;
    this.angle  = 0;
    this.dangle = Math.random()*4-2;

    Double[] points = new Double[this.size*4];
    for(int i=0; i<points.length/2; i++) {
      double angle  = i*Math.PI*4.0/points.length;
      points[i*2]   = Math.cos(angle)*(Math.random()*5+3)*this.size+30;
      points[i*2+1] = Math.sin(angle)*(Math.random()*5+3)*this.size+30;
    }
    ((Polygon)(this.shape)).getPoints().addAll(points);
  }

  public Astroid(int size) {
    super(Math.random()*(AstroidsDriver.PaneSwitcher.SIZE_X-50)+10,
          Math.random()*(AstroidsDriver.PaneSwitcher.SIZE_Y-50)+10,
          Math.random()*6-3, Math.random()*6-3, new Polygon());

    this.size = size;
    this.angle  = 0;
    this.dangle = Math.random()*4-2;

    Double[] points = new Double[this.size*4];
    for(int i=0; i<points.length/2; i++) {
      double angle  = i*Math.PI*4.0/points.length;
      points[i*2]   = Math.cos(angle)*(Math.random()*5+3)*this.size+30;
      points[i*2+1] = Math.sin(angle)*(Math.random()*5+3)*this.size+30;
    }
    ((Polygon)(this.shape)).getPoints().addAll(points);
  }

  public Astroid(double x, double y, int size) {
    super(x, y, Math.random()*6-3, Math.random()*6-3, new Polygon());

    this.size = size;
    this.angle  = 0;
    this.dangle = Math.random()*4-2;

    Double[] points = new Double[this.size*4];
    for(int i=0; i<points.length/2; i++) {
      double angle  = i*Math.PI*4.0/points.length;
      points[i*2]   = Math.cos(angle)*(Math.random()*5+3)*this.size+30;
      points[i*2+1] = Math.sin(angle)*(Math.random()*5+3)*this.size+30;
    }
    ((Polygon)(this.shape)).getPoints().addAll(points);
  }

  public Astroid[] destroy() {
    if(this.size < 3)
      return new Astroid[0];

    Astroid[] debris = new Astroid[2];
    debris[0] = new Astroid(this.getX(), this.getY(), this.size-1);
    debris[1] = new Astroid(this.getX(), this.getY(), this.size-1);

    return debris;
  }

  public int getScore() {
    return this.size * 10;
  }

  @Override
  public void move() {
    super.move();
    this.angle += this.dangle;
    this.shape.setRotate(this.angle);
  }
}
