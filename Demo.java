// Demo.java
public class Demo {
    public static void main(String[] args) {
        // Testing Point class
        Point p1 = new Point(1.5f, 2.5f);
        System.out.println("Point: " + p1);

        // Testing MovablePoint class
        MovablePoint mp1 = new MovablePoint(1.0f, 1.0f, 0.5f, 0.5f);
        System.out.println("Before move: " + mp1);
        mp1.move();
        System.out.println("After move: " + mp1);
    }
}

