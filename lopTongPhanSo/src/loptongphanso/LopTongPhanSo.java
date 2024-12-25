
package loptongphanso;

import java.util.Scanner;

class tongPhanSo{
    private long tuSo;
    private long mauSo;
    
    public tongPhanSo(long tuSo, long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
        rutGon();
    }
    
    public tongPhanSo  cong(tongPhanSo ps){
        long tuMoi = (this.tuSo * ps.mauSo) + (ps.tuSo * this.mauSo);
        long mauMoi = this.mauSo * ps.mauSo;
        return new tongPhanSo(tuMoi, mauMoi);
    }
    
    public void rutGon(){
        long uscln = gcd(tuSo, mauSo);
        tuSo /= uscln;
        mauSo /= uscln;
    }
    
    public long gcd(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public void hien(){
        System.out.println(tuSo + "/" + mauSo);
    }
}
public class LopTongPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuP = sc.nextInt();
        long mauP = sc.nextInt();
        tongPhanSo P = new tongPhanSo(tuP, mauP);
        long tuQ = sc.nextInt();
        long mauQ = sc.nextInt();
        tongPhanSo Q = new tongPhanSo(tuQ, mauQ);
        tongPhanSo tong = P.cong(Q);
        tong.hien();
    }
    
}
