// MovablePoint.java
public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    // Default constructor
    public MovablePoint() {
    }

    // Constructor with parameters
    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y); // Calls the constructor of Point
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Getter and Setter for xSpeed
    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    // Getter and Setter for ySpeed
    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Method to set both xSpeed and ySpeed
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    // Method to get both xSpeed and ySpeed as an array
    public float[] getSpeed() {
        return new float[]{xSpeed, ySpeed};
    }

    // toString method
    @Override
    public String toString() {
        return super.toString() + ", speed=(" + xSpeed + ", " + ySpeed + ")";
    }

    // move method to update x and y based on speed
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
