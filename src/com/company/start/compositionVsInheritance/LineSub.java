package com.company.start.compositionVsInheritance;

public class LineSub extends Point {
    Point end;

    public LineSub(int x, int y) {
        super(x, y);
    }

    public LineSub (int beginX, int beginY, int endX, int endY) {
        super(beginX, beginY);
        this.end = new Point(endX, endY);
    }
    public LineSub (Point begin, Point end) {
        super(begin.getX(), begin.getY());
        this.end = end;
    }

    public Point getEnd() {
        return end;
    }

    public void setEnd(Point end) {
        this.end = end;
    }




}
