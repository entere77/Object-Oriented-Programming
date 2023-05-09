public class Circle extends Shape {
    private Point center;
    private int radius;

    public Circle(Point p, int r){
        this.center = p;
        this.radius = r;
    }

    public Circle(int x, int y, int r){
        this.center = new Point(x,y);
        this.radius = r;
    }

    public double getArea(){
        return Math.PI * radius * radius;
    }

    public double getPerimeter(){
        return 2 * Math.PI * radius;
    }

    public String toString(){
        return "Circle:" + "\n" +
                "center: " + center + "\n" +
                "radius: " + radius;
    }
}
