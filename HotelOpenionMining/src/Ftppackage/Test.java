package Ftppackage;
import java.io.*;
import java.util.*;
import java.util.ArrayList;
public class Test {
    public static void main(String []args){
        try{        
        FileInputStream fis = new FileInputStream("wholetweets.txt");        
        fis.mark(10);
        byte bb[] = new byte[fis.available()];
        fis.read(bb);
        fis.close();
        
        System.out.println(new String(bb));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
