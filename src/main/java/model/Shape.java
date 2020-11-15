package model;

public class Shape {

    //upper left corner of the shape
    private int xCoord;
    private int yCoord;

    //down right corner of the shape
    private int x2Coord;
    private int y2Coord;

    private int width;
    private int height;

    private boolean groundTouched;

    private char[][] shapeArray;

    public Shape(int yCoord, char[][] shapeArray) {
        this.yCoord = yCoord;
        xCoord = 0;
        this.shapeArray = shapeArray;
        width = shapeArray[0].length;
        height = shapeArray.length;
        y2Coord = yCoord + (width - 1);
    }

    public int getxCoord() {
        return xCoord;
    }

    public int getyCoord() {
        return yCoord;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public boolean isGroundTouched() {
        return groundTouched;
    }

    //TODO to be implemented
    public void move(Direction direction) {
        yCoord += 1;
        y2Coord += 1;
    }

    //TODO to be implemented
    public void rotate() {

    }

    //TODO to be implemented
    public void speedup() {

    }
}
