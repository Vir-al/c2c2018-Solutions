import java.util.*;
import static java.lang.Math.sqrt;
import static java.lang.Math.abs;

public class Point {

	public double x;
	public double y;

	public static Point ORIGIN = new Point();

	Point(){
		this.x = 0;
		this.y = 0;
	}

	Point(double x, double y){
		this.x = x;
		this.y = y;
	}

	public double euclideanDistanceTo(Point p){
		return Math.sqrt( ((this.x - p.x) * (this.x - p.x)) + ((this.y - p.y) * (this.y - p.y)) );
	}

	public double manhattanDistanceto(Point p){
		return Math.abs(this.x - p.x) + Math.abs(this.y - p.y);
	}

	public static Point midpoint(Point a, Point b){
		double xM = ( a.x + b.x )/ 2;
		double yM = ( a.y + b.y )/ 2;
		return new Point(xM,yM);
	}

}

class demo {
	public static void main(String[] args) {
		Point pt = new Point(3.0,5.6);
		System.out.println("Point : " + pt.x + " , " + pt.y);
		double manhatDist = Point.ORIGIN.manhattanDistanceto(pt);
		double euclidDist = Point.ORIGIN.euclideanDistanceTo(pt);
		System.out.println("Manhattan Distance from origin : " + manhatDist);
		System.out.println("Euclidean Distance from origin : " + euclidDist);
		
	}

}