
package khaibaolopsinhvien;

import java.util.Scanner;

class sinhVien{
    private String maSV, hoTen, lop, ngaySinh;
    private float gpa;
    
    public sinhVien(){
        this.maSV = "B20DCCN001";
        this.hoTen = "";
        this.lop = "";
        this.ngaySinh = "";
        this.gpa = 0.0f;
    }
    
    public void inPut(Scanner sc){
        this.hoTen = sc.nextLine();
        this.lop = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.gpa = sc.nextFloat();
        sc.nextLine();
    }
    
    public void outPut(){
        String[] birth = ngaySinh.split("/");
        String ans = String.format("%02d/%02d/%s", Integer.parseInt(birth[0]), Integer.parseInt(birth[1]), birth[2]);
        System.out.printf("%s %s %s %s %.2f",  maSV, this.hoTen, this.lop, ans, this.gpa);
    }
}
public class KhaiBaoLopSinhVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sinhVien sv = new sinhVien();
        sv.inPut(sc);
        sv.outPut();
    }
    
}
