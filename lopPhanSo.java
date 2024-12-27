
import java.util.Scanner;

class phanSo{
    private long tuSo;
    private long mauSo;
    
    public phanSo(long tuSo, long mauSo){
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    
    public void rutGon(){
        long ucln = UCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }
    
    public long UCLN(long a, long b){
        while(b != 0){
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    
    public void hienThi(){
        System.out.println(tuSo + "/" + mauSo);
    }
    
    
}
public class lopPhanSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tuSo = sc.nextLong();
        long mauSo = sc.nextLong();
        phanSo PhanSo = new phanSo(tuSo, mauSo);
        PhanSo.rutGon();
        PhanSo.hienThi();
    }
}