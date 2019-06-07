/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ftppackage;
import com.orsonpdf.Stream;
import java.util.*;
/**
 *
 * @author comp
 */
public class asdfasdf {
    public static void main(String[] args) {
  
  Set<String> hashSet = new HashSet<>();
  Set<Object> hashSet2 = new HashSet<>();
  hashSet.add("1");
  hashSet.add("2");
  hashSet.add("4") ;
  hashSet2.add("1");
  hashSet2.add("3");
  hashSet2.add("5");
  Set<Object> temp=new HashSet<>();
  temp.addAll(hashSet2);
  hashSet2.removeAll(hashSet); // remove common elements
  hashSet.removeAll(temp);// remove common elements 
  hashSet2.addAll(hashSet); // add unique values sets
  System.out.println(hashSet2);
}
}
