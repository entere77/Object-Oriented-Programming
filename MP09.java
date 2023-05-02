import java.awt.Point;

class Rectangle{
    static final int WIDTH = 50;
    static final int HEIGHT = 50;
    private Point upperLeft = new Point();
    private Point lowerRight = new Point();

    public Rectangle(Point uL){
        upperLeft = uL;
        lowerRight = new Point((int)uL.getX()+WIDTH,(int)uL.getY()+HEIGHT);
    }

    public Rectangle(Point uL, Point lR){
        this.upperLeft = uL;
        this.lowerRight = lR;
    }

    public void translate(int x, int y){
        upperLeft.translate(x,y);
        lowerRight.translate(x,y);
    }

    public String toString(){ return  "UL: " + upperLeft + ", LR: " + lowerRight; }
}

class Block1{
    private Rectangle[] rectangles = new Rectangle[4];

    public Block1(Point p){
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x+Rectangle.WIDTH,p.y));
        rectangles[2] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(p.x+Rectangle.WIDTH,p.y+Rectangle.HEIGHT));
    }

     public Block1(int x, int y){
        Point p = new Point(x,y);
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x+Rectangle.WIDTH,p.y));
        rectangles[2] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(p.x+Rectangle.WIDTH,p.y+Rectangle.HEIGHT));
     }

    public void translate(int x, int y){
        rectangles[0].translate(x,y);
        rectangles[1].translate(x,y);
        rectangles[2].translate(x,y);
        rectangles[3].translate(x,y);
    }

    public String toString(){
        return rectangles[0].toString() + "\n" + rectangles[1].toString() + "\n" + rectangles[2].toString() + "\n" + rectangles[3].toString();
    }
}

class Block2{
    private Rectangle[] rectangles = new Rectangle[4];

    public Block2(Point p){
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT));
        rectangles[2] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT*2));
        rectangles[3] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT*3));
    }

    public Block2(int x, int y){
        Point p = new Point(x,y);
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT));
        rectangles[2] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT*2));
        rectangles[3] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT*3));
    }

    public void translate(int x, int y){
        rectangles[0].translate(x,y);
        rectangles[1].translate(x,y);
        rectangles[2].translate(x,y);
        rectangles[3].translate(x,y);
    }

    public String toString(){
        return rectangles[0].toString() + "\n" + rectangles[1].toString() + "\n" + rectangles[2].toString() + "\n" + rectangles[3].toString();
    }
}

class Block3{
    private Rectangle[] rectangles = new Rectangle[4];

    public Block3(Point p){
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT));
        rectangles[2] = new Rectangle(new Point(p.x+Rectangle.WIDTH,p.y+Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(p.x+Rectangle.WIDTH*2,p.y+Rectangle.HEIGHT));
    }

    public Block3(int x, int y){
        Point p = new Point(x,y);
        rectangles[0] = new Rectangle(p);
        rectangles[1] = new Rectangle(new Point(p.x,p.y+Rectangle.HEIGHT));
        rectangles[2] = new Rectangle(new Point(p.x+Rectangle.WIDTH,p.y+Rectangle.HEIGHT));
        rectangles[3] = new Rectangle(new Point(p.x+Rectangle.WIDTH*2,p.y+Rectangle.HEIGHT));
    }

    public void translate(int x, int y){
        rectangles[0].translate(x,y);
        rectangles[1].translate(x,y);
        rectangles[2].translate(x,y);
        rectangles[3].translate(x,y);
    }

    public String toString(){
        return rectangles[0].toString() + "\n" + rectangles[1].toString() + "\n" + rectangles[2].toString() + "\n" + rectangles[3].toString();
    }
}

public class MP09 {
    public static void main(String[] args){
        Block1 b1 = new Block1(10, 10);
        Block2 b2 = new Block2(10,10);
        Block3 b3 = new Block3(10,10);

        // Block1 출력
        System.out.println("b1");
        System.out.println(b1);
        b1.translate(10, -10);
        System.out.println("transelate시킨 b1");
        System.out.println(b1);
        System.out.println("\n");

        //Block2 출력
        System.out.println("b2");
        System.out.println(b2);
        b2.translate(10, -10);
        System.out.println("transelate시킨  b2");
        System.out.println(b2);
        System.out.println("\n");

        //Block3 출력
        System.out.println("b3");
        System.out.println(b3);
        b3.translate(10, -10);
        System.out.println("transelate시킨  b3");
        System.out.println(b3);
    }
}