

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

class sapXep implements Comparable<sapXep>{
    private int gio, phut, giay;
    
    public sapXep(){
        
    }
    
    public sapXep(int gio, int phut, int giay){
        this.gio = gio;
        this.phut = phut;
        this.giay = giay;
    }
    
    public int getGio(){
        return gio;
    }
    
    public int getPhut(){
        return phut;
    }
    
    public int getGiay(){
        return  giay;
    }
    
    @Override
    public String toString(){
        return gio + " " + phut + " " + giay;
    }
    
    @Override
    public int compareTo(sapXep other){
        int a = gio * 3600 + phut * 60 + giay;
        int b = other.getGio() * 3600 + other.getPhut() * 60 + other.getGiay();
        return a - b;
    }
}
public class sapXepThoiGian {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        ArrayList<sapXep> list = new ArrayList<>();
        while(t-- > 0){
            int gio = sc.nextInt();
            int phut = sc.nextInt();
            int giay = sc.nextInt();
            list.add(new sapXep(gio, phut, giay));
        }
        Collections.sort(list);
        for(sapXep x : list){
            System.out.println(x);
        }
    }
    
}