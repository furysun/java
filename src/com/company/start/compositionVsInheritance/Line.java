package com.company.start.compositionVsInheritance;

public class Line {
    private Point begin;
    private Point end;

    public Line(Point begin, Point end) {
        this.begin = begin;
        this.end = end;
    }

    public Line(int beginX, int beginY, int endX, int endY) {
        begin = new Point(beginX, beginY);
        end = new Point(endX, endY);
    }

    public Point getBegin() {
        return begin;
    }

    public void setBegin(Point begin) {
        this.begin = begin;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }


    public void setBeginX(Point beginX) {
        this.begin = beginX;
    }


    public void setEndX(Point endX) {
        this.end = endX;
    }

    public void setBeginY(Point beginY) {
        this.begin = beginY;
    }


    public void setEndY(Point endY) {
        this.end = endY;
    }

    public void setBeginXY(Point beginX, Point beginY) {
        this.begin = beginX;
        this.begin = beginY;
    }

    public void setEndXY(Point endX, Point endY) {
        this.end = endX;
        this.end = endY;
    }
    public int getLenght(){
        return (int) Math.sqrt( begin.getX()*end.getX() + begin.getY()*end.getY());
    }
    public double getGradient(){
        return Math.atan2(begin.getY(),begin.getX());
    }
}
