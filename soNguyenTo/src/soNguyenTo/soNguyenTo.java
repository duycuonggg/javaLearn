
package main;

import java.util.*;

//sang so nguyen to
public class soNguyenTo {
    public static boolean prime[] = new boolean[1000007];
    public static void sang(){
        Arrays.fill(prime, true);
        prime[0] = false;
        prime[1] = false;
        for(int i = 2; i < (int)Math.sqrt(100000); i++){
            if(prime[i]){
                for(int j = i * i; j <= 100000; j += i){
                    prime[j] = false;
                }
            }
        }
    }
    public static void main(String[] args) {
        sang();
        for(int i = 0; i <= 1000; i++){
            if(prime[i]){
                System.out.print(i + " ");
            }
        }
        
    }
}
