
package khaibaolopthisinh;

import java.util.Scanner;

class thiSinh{
    private String hoTen, ngaySinh;
    private float mon1, mon2, mon3;
    
    public void inPut(Scanner sc){
        this.hoTen = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.mon1 = sc.nextFloat();
        this.mon2 = sc.nextFloat();
        this.mon3 =  sc.nextFloat();
    }
    
    public void outPut(){
        String[] birth = this.ngaySinh.split("/");
        String ans = String.format("%02d/%02d/%s", Integer.parseInt(birth[0]), Integer.parseInt(birth[1]), birth[2]);
        float tongDiem = this.mon1 + this.mon2 + this.mon3;
        System.out.printf("%s %s %.1f", this.hoTen, ans, tongDiem);
    }
}
public class KhaiBaoLopThiSinh {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    
        thiSinh a = new thiSinh();
        a.inPut(sc);
        a.outPut();
    }
    
}
