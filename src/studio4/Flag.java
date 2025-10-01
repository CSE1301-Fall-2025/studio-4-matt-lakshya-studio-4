package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(142, 219, 245);
		StdDraw.setXscale(0, 22);
		StdDraw.setYscale(0, 16);
		StdDraw.filledRectangle(0, 0, 22, 5);
		StdDraw.setPenColor(255, 0, 0);
		StdDraw.filledEllipse(11, 7, 2, 2);
		StdDraw.setPenColor(237, 175, 123);
		StdDraw.filledEllipse(11, 10, 1, 1);
		StdDraw.setPenColor(0,0,0);
		StdDraw.setPenRadius(0.01);
		StdDraw.point(10.5, 10);
		StdDraw.point(11.5, 10);
		StdDraw.setPenColor(0,0,0);
		StdDraw.filledRectangle(11, 9.5, 0.6, 0.05);
		StdDraw.setPenRadius(0.001);
		
		StdDraw.setPenColor(230,137,39);
		double length = 3;
		double height = 7;
		double[] x = {11, Math.cos(Math.PI / 3) * length + 11, Math.cos(Math.PI / 6) * length + 11};
   		double[] y = {height, Math.sin(Math.PI / 3) * length + height, Math.sin(Math.PI / 6) * length + height};
   		StdDraw.filledPolygon(x, y);
		StdDraw.polygon(x, y);

		StdDraw.setPenColor(142, 155, 245);
		StdDraw.filledCircle(Math.cos(Math.PI / 4) * 3.5 + 11, Math.sin(Math.PI / 4) * 3.5 + height, 1);
	}
}