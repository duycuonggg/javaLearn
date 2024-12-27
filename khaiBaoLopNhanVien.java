


import java.util.Scanner;

class nhanVien{
    private String maNhanVien, hoTen, gioiTinh, ngaySinh, diaChi, maSoThue, ngayKiHopDong;
    
    public nhanVien(){
        this.maNhanVien = "00001";
        this.hoTen = "";
        this.gioiTinh = "";
        this.ngaySinh = "";
        this.diaChi = "";
        this.maSoThue = "";
        this.ngayKiHopDong = "";
    }
        
    public void inPut(Scanner sc){
        this.hoTen = sc.nextLine();
        this.gioiTinh = sc.nextLine();
        this.ngaySinh = sc.nextLine();
        this.diaChi = sc.nextLine();
        this.maSoThue = sc.nextLine();
        this.ngayKiHopDong = sc.nextLine();
    }
    
    public void outPut(){
        String[] birth = ngaySinh.split("/");
        String ans = String.format("%02d/%02d/%s", Integer.parseInt(birth[0]), Integer.parseInt(birth[1]),birth[2]);
        String[] sign = ngayKiHopDong.split("/");
        String end = String.format("%02d/%02d/%s", Integer.parseInt(sign[0]), Integer.parseInt(sign[1]), sign[2]);
        System.out.printf("%s %s %s %s %s %s %s", maNhanVien, this.hoTen, this.gioiTinh, ans, this.diaChi, this.maSoThue, end);
    }
}
public class khaiBaoLopNhanVien {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        nhanVien nv = new nhanVien();        
        nv.inPut(sc);
        nv.outPut();
    }
}