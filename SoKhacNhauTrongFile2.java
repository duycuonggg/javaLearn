

import java.io.FileNotFoundException;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.FileInputStream;

public class SoKhacNhauTrongFile2 {

    public static void main(String[] args) throws FileNotFoundException, IOException{
        DataInputStream doc = new DataInputStream(new FileInputStream("DATA.IN"));
        int[] dd = new int[1000];
        for(int i = 0; i < 100000; i++){
            dd[doc.readInt()]++;
        }
        for(int i = 0; i < dd.length; i++){
            if(dd[i] > 0){
                System.out.println(i + " " + dd[i]);
            }
        }
    }
}
