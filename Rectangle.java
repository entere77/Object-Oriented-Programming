public class Rectangle extends Shape {
    private Point p1;
    private Point p2;

    public Rectangle(Point p1, Point p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Rectangle(int x1, int y1, int x2, int y2){
        this.p1 = new Point(x1,y1);
        this.p2 = new Point(x2,y2);
    }

    public double getArea(){
        if(Math.abs(p1.getX()) >= Math.abs(p2.getX())){
            if(Math.abs(p1.getY()) >= Math.abs(p2.getY())){
                return (p1.getX()-p2.getX())*(p1.getY()-p2.getY());
            }

            else{
                return (p1.getX()-p2.getX())*(p2.getY()-p1.getY());
            }
        }

        else{
            if(Math.abs(p1.getY()) >= Math.abs(p2.getY())){
                return (p2.getX()-p1.getX())*(p1.getY()-p2.getY());
            }

            else{
                return (p2.getX()-p1.getX())*(p2.getY()-p1.getY());
            }
        }
    }

    public double getPerimeter(){
        if(Math.abs(p1.getX()) >= Math.abs(p2.getX())){
            if(Math.abs(p1.getY()) >= Math.abs(p2.getY())){
                return (p1.getX()-p2.getX())*2 + (p1.getY()-p2.getY())*2;
            }

            else{
                return (p1.getX()-p2.getX())*2 + (p2.getY()-p1.getY())*2;
            }
        }

        else{
            if(Math.abs(p1.getY()) >= Math.abs(p2.getY())){
                return (p2.getX()-p1.getX())*2 + (p1.getY()-p2.getY())*2;
            }

            else{
                return (p2.getX()-p1.getX())*2 + (p2.getY()-p1.getY())*2;
            }
        }

    }

    public String toString(){
        return "Rectangle:" + "\n" +
                "p1: " + p1 + "\n" +
                "p2: " + p2;
    }
}
