import processing.core.PApplet;
public class Processing extends PApplet {
    private int movementSpeed = 1;
    public static final int WIDTH = 640;
    public static final int HEIGHT = 640;
    private Ball ball, ball2XSpeed, ball3XSpeed, ball4XSpeed ;
    public static void main(String[] args) {
        PApplet.main("Processing", args);
    }

    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }
    public void setup(){
        ball = new Ball(this,15,HEIGHT/5, movementSpeed,30);
        ball2XSpeed = new Ball(this,15,2 * HEIGHT/5, 2 * movementSpeed,30);
        ball3XSpeed = new Ball(this,15,3 * HEIGHT/5, 3 * movementSpeed,30);
        ball4XSpeed = new Ball(this,15,4 * HEIGHT/5, 4 * movementSpeed,30);
    }

    public void draw() {
        ball.move();
        ball2XSpeed.move();
        ball3XSpeed.move();
        ball4XSpeed.move();
    }
}
