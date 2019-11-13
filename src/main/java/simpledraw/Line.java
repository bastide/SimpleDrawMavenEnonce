package simpledraw;

/**
 * A Segement of a line, that extends between two points
 * @author Rémi Bastide
 * @version 1.0
 */

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.Point;

public class Line
	extends Shape {
	private Point myStart;
	private Point myEnd;

	/**
	 * Construct a line
	 * @param start The starting point
	 * @param end   The end point
	 **/
	public Line(Point start, Point end) {
		myStart = start;
		myEnd = end;
	}

	public void draw(Graphics2D g) {
		g.setColor(
			isSelected() ?
			Color.red :
			Color.black
			);
		g.drawLine(myStart.x, myStart.y, myEnd.x, myEnd.y);
	}

	public void translateBy(int dx, int dy) {
		myStart.translate(dx, dy);
		myEnd.translate(dx, dy);
	}

	public boolean isPickedBy(Point p) {
		return Line.segmentIsPickedBy(myStart, myEnd, p);
	}

	/**
	 * A Utility function that determines whether a point is in a segment.
	 * @param A     The starting point of the segment
	 * @param B     The end point of the segment
	 * @param C     The point to test
	 * @return      true if C in AB, false otherwise
	 **/
	public static boolean segmentIsPickedBy(Point A, Point B, Point C) {
		double a, b;
		double distance; // Distance from C to Line AB
		double dx, dy; // Coordinates of projection of C on AB
		double lambda;

		if (A.x != B.x) {
			// Calculate the equation y = ax + b of line AB
			a = (B.y - A.y) / (double) (B.x - A.x);
			b = (A.y * B.x - B.y * A.x) / (double) (B.x - A.x);
			// D = Projection of C on AB
			dx = (C.x - a * (b - C.y)) / (1 + a * a);
			dy = (a * C.x + b + a * a * C.y) / (1 + a * a);
			distance = C.distance(dx, dy);
			// or : distance = Math.abs( b - C.y + a * C.x ) / Math.sqrt( 1 + a * a);
			lambda = (dx - A.x) / (double) (B.x - A.x);
		} else {
			distance = Math.abs(C.x - A.x);
			lambda = (C.y - A.y) / (double) (B.y - A.y);
		}
		return (distance <= 2) && (lambda >= 0) && (lambda <= 1);
	}
}
