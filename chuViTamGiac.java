

import java.util.Scanner;
import static java.lang.Math.*;

class Point{
    private double x;
    private double y;
    
    public Point(){
    
    }
    
    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }
    
    public Point(Point p){
        this.x = p.x;
        this.y = p.y;
    }
    
    public double getX(){
        return this.x;
    }
    
    public double getY(){
        return this.y;
    }
    
    public double distance(Point secondPoint){
        return sqrt(pow(this.x - secondPoint.x, 2) + pow(this.y - secondPoint.y, 2));
    }
    
    public double distance(Point p1, Point p2){
        return sqrt(pow(p2.x - p1.x, 2) + pow(p2.y - p1.y, 2));
    }
    
    @Override
    public String toString(){
        return x + " " + y;
    }
    
}
public class chuViTamGiac {
    
    public static boolean kiemTra(double a, double b, double c){
        return a + b > c && a + c > b && b + c > a;
    }
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-- > 0){
                double x1 = sc.nextDouble();
                double y1 = sc.nextDouble();
                double x2 = sc.nextDouble();
                double y2 = sc.nextDouble();
                double x3 = sc.nextDouble();
                double y3 = sc.nextDouble();
                
                Point p1 = new Point(x1, y1);
                Point p2 = new Point(x2, y2);
                Point p3 = new Point(x3, y3);
                
                double a = p1.distance(p1, p2);
                double b = p2.distance(p2, p3);
                double c = p3.distance(p3, p1);
                
                if(kiemTra(a, b, c)){
                    double chuVi = a + b + c;
                    System.out.printf("%.3f\n", chuVi);
                }
                else{
                    System.out.println("INVALID");
                }
            }
        }
    }
}