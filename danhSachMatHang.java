

import java.util.Scanner;
import java.util.Collections;
import java.util.ArrayList;


class matHang implements Comparable<matHang>{
    public static int soMa = 1;
    private String ma, ten, donViTinh;
    private int giaMua, giaBan, loiNhuan;
   
    
    public matHang(){
        
    }
    
    public matHang(String ma, String ten, String donViTinh, int giaMua, int giaBan){
        this.ma = "MH" + String.format("%03d", soMa++);
        this.ten = ten;
        this.donViTinh = donViTinh;
        this.giaMua = giaMua;
        this.giaBan = giaBan;
    }
    
    public int getGiaMua(){
        return giaMua;
    }
    
    public int getGiaBan(){
        return giaBan;
    }
    
    public int loiNhuan(){
        return giaBan - giaMua;
    }
    
    @Override
    public String toString(){
        return ma + " " + ten + " " + donViTinh + " " + giaMua + " " + giaBan + " " + loiNhuan();
    }
    
    @Override
    public int compareTo(matHang other){
        int a = giaBan - giaMua;
        int b = other.getGiaBan() - other.getGiaMua();
        return b - a;
    }
}
public class danhSachMatHang {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<matHang> list = new ArrayList<>();
        while(t-- > 0){
            String ma = sc.nextLine();
            String ten = sc.nextLine();
            String donViTinh = sc.nextLine();
            int giaMua = sc.nextInt();
            int giaBan = sc.nextInt();
            list.add(new matHang(ma, ten, donViTinh, giaMua, giaBan));
        }
        Collections.sort(list);
        for(matHang x : list){
            System.out.println(x);
        }
    }
    
}