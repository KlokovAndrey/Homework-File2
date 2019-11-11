package com.file2.mypoint;

import static java.lang.Math.sqrt;

public class MyPoint {
    private int x=0;
    private int y=0;

    public MyPoint() {
    }

    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int[] getXY(){
        int [] arr = new int[2];
        arr[0]=this.x;
        arr[1]=this.y;
        return arr;
    }

    public void setXY(int x, int y){
        this.x=x;
        this.y=y;
    }

    @Override
    public String toString() {
        return "(" +
                 x +
                y +
                ')';
    }

    public double distance(int x, int y){
        return sqrt((x-this.x)*(x-this.x)+(y-this.y)*(y-this.y));
    }

    public double distance(MyPoint another){
        return sqrt((another.x-this.x)*(another.x-this.x)+(another.y-this.y)*(another.y-this.y));
    }

    public double distance(){
        return sqrt((this.x)*(this.x)+(this.y)*(this.y));
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyPoint myPoint = (MyPoint) o;
        return x == myPoint.x &&
                y == myPoint.y;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31*result + x;
        result = 31*result + y;
        return result;
    }
}
