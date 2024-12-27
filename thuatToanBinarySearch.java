
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;
import java.util.Scanner;

public class thuatToanBinarySearch {
    // binarySearch bang vong lap
    public static boolean binarySearch(int a[], int n,int x){
        int left = 0, right = -1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == x) return true;
            else if(a[mid] < x) left = mid + 1;
            else right = mid - 1;
        }
        return false;
    }
    
    //binarySearch bang de qui
    public static boolean binarySearch1(int a[], int l, int r,  int x){
        if(l >  r) return false;
        int m =  (l  + r)  / 2;
        if(a[m] ==  x) return true;
        else if(a[m] < x) return binarySearch1(a, l, m -  1, x);
        else return binarySearch1(a, m + 1, r, x);
    }
    
    public static int firstPosition(int a[], int n, int x){
        int res = -1;
        int left = 0, right = n -  1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(a[mid] == x){
                res = mid;
                right = mid - 1;
            }
            else if(a[mid] > x) right = mid + 1;
            else right = mid - 1;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =  sc.nextInt();
        int[] a  = new int[n];
        for(int i =  0; i < n; i++){
            a[i] = sc.nextInt();
        }
        System.out.println(firstPosition(a, n, 2));
        
       
    }    
}

 