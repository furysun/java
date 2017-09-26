package com.company.start.interfaceEx;

public class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;

    public MovableCircle(int x, int y, int xSpeed, int ySpeed) {
        center = new MovablePoint(x,y,xSpeed,ySpeed);
    }

    @Override
    public void moveUp() {
        center.y -= center.ySpeed;
    }

    @Override
    public void moveDown() {
        center.y += center.ySpeed;
    }

    @Override
    public void moveLeft() {
        center.x -= center.xSpeed;
    }

    @Override
    public void moveRight() {
        center.x += center.xSpeed;

    }

    @Override
    public String toString() {
        return "MovableCircle{" +
                "radius=" + radius +
                ", center=" + center +
                '}';
    }
}
