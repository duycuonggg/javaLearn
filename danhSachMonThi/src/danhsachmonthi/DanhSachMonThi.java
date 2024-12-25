
package danhsachmonthi;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class monThi implements Comparable<monThi>{
    private String maMon, tenMon, hinhThucThi;
    
    public monThi(){
        
    }
    
    public monThi(String maMon, String tenMon, String hinhThucThi){
        this.maMon = maMon;
        this.tenMon = tenMon;
        this.hinhThucThi = hinhThucThi;
    }
    
    public String getMaMon(){
        return this.maMon;
    }
    
    @Override
    public String toString(){
        return this.maMon + " " + this.tenMon + " " + this.hinhThucThi;
    }
    
    @Override
    public int compareTo(monThi other){
        return this.maMon.compareTo(other.getMaMon());
    }
}
public class DanhSachMonThi {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("src\\MONHOC.in"));
        int n = Integer.parseInt(sc.nextLine());
        ArrayList<monThi> list = new ArrayList<>();
        for(int i = 0; i < n; i++){
            String maMon = sc.nextLine();
            String tenMon = sc.nextLine();
            String hinhThucThi = sc.nextLine();
            list.add(new monThi (maMon, tenMon, hinhThucThi));
        }
        Collections.sort(list);
        for(monThi e : list){
            System.out.println(e);
        }
    }
    
}
