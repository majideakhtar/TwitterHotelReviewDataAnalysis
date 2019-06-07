/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ftppackage;

/**
 *
 * @author comp
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.LineNumberReader;

public class Testingggg {
    
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("finaltweetsforan.txt"));
        try {
            String line = br.readLine();
            String aa;
            while (line != null) {
                if(line.contains("sandeep3962")) {                 
                
               // System.out.println("yes");
                    System.out.println(line);
                } else if (line.contains("sandeep3963")) {
                  //System.out.println("yes2");
                   System.out.println(line);
                }               
                line = br.readLine();
            }       
        } finally {
            br.close();
        }
    }
} 
      