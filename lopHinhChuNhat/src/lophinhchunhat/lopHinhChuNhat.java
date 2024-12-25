
package lophinhchunhat;

import java.util.Scanner;

class Rectange{
    private double width;
    private double height;
    private String color;

    public Rectange(){
     
    }

    public Rectange(double width, double height, String color){
        this.width = width;
        this.height = height;
        this.color = color;
    }

    public double getWidth(){
        return  this.width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double getHeight(){
        return this.height;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public String getColor(){
        return this.color.substring(0, 1).toUpperCase() + this.color.substring(1).toLowerCase();
    }

    public void setColor(String color){
        this.color = color;
    }
    
    public double findArea(){
        return  this.width * this.height;
    }
    
    public double findPerimeter(){
        return (this.width + this.height) * 2;
    }
    
    public void out(){
        System.out.printf("%d %d %s", (int)this.findPerimeter(), (int)this.findArea(), this.getColor());
    }


}
public class lopHinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        String c = sc.next();
        if(a <= 0 || b <= 0){
            System.out.println("INVALID");
        }
        else{
            Rectange d = new Rectange(a, b, c);
            d.out();
        }
    }

}
