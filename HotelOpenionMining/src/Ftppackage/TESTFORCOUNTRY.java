/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ftppackage;

import java.util.Locale;


public class TESTFORCOUNTRY {
    
    
    public static void main(String []args){
       Locale currentLocale = Locale.getDefault();
       
System.out.println( currentLocale.getCountry()); 
System.out.println(currentLocale);

System.out.println(currentLocale.getDisplayLanguage());
System.out.println(currentLocale.getDisplayCountry());
 
System.out.println(currentLocale.getLanguage());
System.out.println(currentLocale.getCountry());
 
System.out.println(System.getProperty("user.country"));
System.out.println(System.getProperty("user.language"));
    }
    
}
