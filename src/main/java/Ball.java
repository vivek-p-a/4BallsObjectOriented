import processing.core.PApplet;

public class Ball {
    private int xCoordinate;
    private int yCoordinate;
    private int horizontalMovementRate;
    private int size;
    private PApplet sketch;

    public Ball(PApplet sketch, int xCoordinate, int yCoordinate, int horizontalMovementRate, int size) {
        this.xCoordinate = xCoordinate;
        this.yCoordinate = yCoordinate;
        this.horizontalMovementRate = horizontalMovementRate;
        this.size = size;
        this.sketch = sketch;
    }

    public void move() {
        sketch.ellipse(xCoordinate, yCoordinate, size, size);
        xCoordinate += horizontalMovementRate;
    }
}
