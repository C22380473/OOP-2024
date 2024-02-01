package ie.tudublin;

import processing.core.PApplet;

public class MyFirstProcessing extends PApplet
{

	public void settings()
	{
		size(500, 500);
	}

	public void setup() {
		
		
	}
	
	public void draw()
	{
		background(225,0,0);
		//stroke(0, 255, 0);
		//line(10, 10, 100, 100); // x1, y1, x2, y2
		fill(255,255,0);
		circle(250, 280, 400);
		//fill(255,255,204);
		//rect(400, 300, 50, 100); // x, y, w, h
		fill(128,230,252);
		triangle(50, 400, 250, 70, 430, 400);
		fill(227,227,227);
		ellipse(246, 250, 190, 100); // cx, cy
		fill(0,0,0);
		circle(245, 250, 70);


		
	
	}
}
