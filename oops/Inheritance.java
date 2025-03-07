
class Shape {

    String color;

    public void area() {
        System.out.println("Display area:");
    }
}

class Triangle extends Shape {

    public void area(double b, double h) {
        System.out.println(1.0 / 2.0 * b * h);
    }
}

class EquilateralTriangle extends Triangle{
    public void area(int b, int h) {
        System.out.println("Equilateral triangle:");
        System.out.println((1.0 / 2 * b * h));
    }
}

class Circle extends Shape{
    public void area(int r){
        System.out.println("Circle Area:");
        System.out.println((3.14)*r*r);
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.color = "red";
        System.out.println(t1.color);
        t1.area();
        t1.area(2.0,5.0);

        EquilateralTriangle t2 = new EquilateralTriangle();
        t2.area();
        t2.area(10,5);

        Circle c1=new Circle();
        c1.area();
        c1.area(4);
    }
}
