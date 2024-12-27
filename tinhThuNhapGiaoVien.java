

import java.util.Scanner;

class thuNhap{
    private String maGach, hoTen;
    private double luongCoBan;
    
    public thuNhap(){

    }
    
    public thuNhap(String maGach, String hoTen, double luongCoBan){
        this.maGach = maGach;
        this.hoTen = hoTen;
        this.luongCoBan = luongCoBan;     
    }
    
    public void inPut(Scanner sc){
        this.maGach = sc.nextLine();
        this.hoTen = sc.nextLine();
        this.luongCoBan = sc.nextDouble();
    }
    
    public void outPut(){
        String chucVu = this.maGach.substring(0, 2);
        int heSo = Integer.parseInt(this.maGach.substring(2));
        double phuCap = 0;
        if(chucVu.equals("HT")){
            phuCap = 2000000;
        }
        else if(chucVu.equals("HP")){
            phuCap = 900000;
        }
        else if(chucVu.equals("GV")){
            phuCap = 500000;
        }
        double thuNhap = this.luongCoBan * heSo + phuCap;
        System.out.printf("%s %s %d %.0f %.0f", this.maGach, this.hoTen, heSo, phuCap, thuNhap);
    }
}
public class tinhThuNhapGiaoVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        thuNhap tn = new thuNhap();
        tn.inPut(sc);
        tn.outPut();
    }
    
}