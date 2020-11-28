package model;

public class Shape {

    //upper left corner of the shape
    private int xCoord;
    private int yCoord;

    private ShapeColor color;

    private Orientation orientation;

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
        color = ShapeColor.randomColor();
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

    public ShapeColor getColor() {
        return color;
    }

    public void setColor(ShapeColor color) {
        this.color = color;
    }

    public Orientation getOrientation() {
        return orientation;
    }

    public void setOrientation(Orientation orientation) {
        this.orientation = orientation;
    }

    public char[][] getShapeArray() {
        return shapeArray;
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
    //standard clockwise rotation of 2d char array without y coord correction
    //need to take care about y coord correction in some other place
    public void rotate() {
        int currentX = 0;
        int currentY = 0;
        char[][] rotated = new char[shapeArray[0].length][shapeArray.length];
        for(int i = 0; i < shapeArray[0].length; i++){
            currentY = 0;
            for(int j = shapeArray.length-1; j >= 0; j--){
                rotated[currentX][currentY] = shapeArray[j][i];
                currentY++;
            }
            currentX++;
        }
        shapeArray = rotated;
    }

    //TODO to be implemented
    public void speedup() {

    }
}
