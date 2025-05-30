package assignment9;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Food {

	public static final double FOOD_SIZE = 0.02;
	private double x, y;
	
	/**
	 * Creates a new Food at a random location
	 */
	public Food() {
		x=Math.random();
        y=Math.random();
	}
	
	/**
	 * Draws the Food
	 */
	public void draw() {
		StdDraw.setPenColor(Color.RED);
        StdDraw.filledCircle(x, y, FOOD_SIZE);
	}
	
	
	//public void setPosition(double x, double y) {
    //    this.x=x;
    //    this.y=y;
    //}
	
	public double getx() {
        return x;
    }
	public double gety() {
		return y;
    }
	
}
