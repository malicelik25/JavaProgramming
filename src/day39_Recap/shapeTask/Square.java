package day39_Recap.shapeTask;

public class Square extends Shape {

    private double side;

    public Square(double side) {//constructor
        super("Square");
        setSide(side);//if we assign with the 'set' it is going to check the additions(conditions)
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        if (side <= 0) {
            System.err.println("Side can not be 0 or negative");
            System.exit(1);
        }
        this.side = side;
    }

    @Override
    public double area() {
        return side * side;
    }

    @Override
    public double perimeter() {
        return side * 4;
    }

    @Override
    public String toString() {
        return "Square{" +
                "side=" + side +
                ", area=" + area() +
                ", perimeter=" + perimeter() +
                '}';
    }
}
/*
Square extends Shape:
	variables:
		side;

	Encapsulate the field

	Add a constructor to set the filed

	area(): side * side
	perimeter(): side * 4
	toString(): side, area, perimeter
 */