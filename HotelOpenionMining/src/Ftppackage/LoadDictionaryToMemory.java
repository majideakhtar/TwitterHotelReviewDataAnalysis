
package Ftppackage;

import java.io.FileInputStream;
import java.util.*;


public class LoadDictionaryToMemory {
    
    ArrayList<String> posDictionary = new ArrayList<String>();
    ArrayList<String> negDictionary = new ArrayList<String>();
    
    ArrayList<String> mixPNDictionary = new ArrayList<String>();
    ArrayList<String> mixNPDictionary = new ArrayList<String>();
    ArrayList<String> mixPPDictionary = new ArrayList<String>();
    ArrayList<String> mixNNDictionary = new ArrayList<String>();
    
    String posDictionaryString = new String();
    String negDictionaryString = new String();
    
    public ArrayList<String> getPositiveDictionaryElements(String category){
    posDictionary.clear();
    try{
    FileInputStream fis = new FileInputStream(category+"/pos.txt");
    byte bb[] = new byte[fis.available()];
    fis.read(bb);
    fis.close();
    String wholeString = new String(bb);
    
    wholeString = wholeString.trim();
    StringTokenizer st = new StringTokenizer(wholeString , "\r\n");
    while(st.hasMoreTokens()){
      posDictionary.add(st.nextToken());
    }
    }catch(Exception e){
     System.out.println(e);   
    }  
    return posDictionary;
    }
    
    public ArrayList<String> getNegetiveDictionaryElements(String category){
    negDictionary.clear();
    try{
    FileInputStream fis = new FileInputStream(category+"/neg.txt");
    byte bb[] = new byte[fis.available()];
    fis.read(bb);
    String wholeString = new String(bb);
    fis.close();
    wholeString = wholeString.trim();
    StringTokenizer st = new StringTokenizer(wholeString , "\r\n");
    while(st.hasMoreTokens()){
      negDictionary.add(st.nextToken());
    }
    }catch(Exception e){
     System.out.println(e);   
    }  
    return negDictionary;
    }
    
    public ArrayList<String> getMixDictionaryPNElements(String category){
    posDictionary.clear();
    negDictionary.clear();
    mixPNDictionary.clear();
    try{
    FileInputStream fisP = new FileInputStream(category+"/pos.txt");
    byte bbP[] = new byte[fisP.available()];
    fisP.read(bbP);
    String wholeStringP = new String(bbP);
    fisP.close();
    wholeStringP = wholeStringP.trim();
    StringTokenizer stP = new StringTokenizer(wholeStringP , "\r\n");
    while(stP.hasMoreTokens()){
      posDictionary.add(stP.nextToken());
    }    
        
    FileInputStream fisN = new FileInputStream(category+"/neg.txt");
    byte bbN[] = new byte[fisN.available()];
    fisN.read(bbN);
    String wholeStringN = new String(bbN);
    fisN.close();
    wholeStringN = wholeStringN.trim();
    StringTokenizer stN = new StringTokenizer(wholeStringN , "\r\n");
    while(stN.hasMoreTokens()){
      negDictionary.add(stN.nextToken());
    }
    
    for(int i=0;i<posDictionary.size();i++){
        String posWord = posDictionary.get(i);
        for(int j=0;j<negDictionary.size();j++){
            String negWord = negDictionary.get(j);
            String actAssociation = posWord+" "+negWord;
           // System.out.println(actAssociation);
            mixPNDictionary.add(actAssociation);
        }
    }
    }catch(Exception e){
     System.out.println(e);   
    }  
    return mixPNDictionary;
    }
    
    public ArrayList<String> getMixDictionaryNPElements(String category){
    posDictionary.clear();
    negDictionary.clear();
    mixNPDictionary.clear();
    try{
    FileInputStream fisP = new FileInputStream(category+"/neg.txt");
    byte bbP[] = new byte[fisP.available()];
    fisP.read(bbP);
    String wholeStringP = new String(bbP);
    fisP.close();
    wholeStringP = wholeStringP.trim();
    StringTokenizer stP = new StringTokenizer(wholeStringP , "\r\n");
    while(stP.hasMoreTokens()){
      negDictionary.add(stP.nextToken());
    }    
        
    FileInputStream fisN = new FileInputStream(category+"/pos.txt");
    byte bbN[] = new byte[fisN.available()];
    fisN.read(bbN);
    String wholeStringN = new String(bbN);
    fisN.close();
    wholeStringN = wholeStringN.trim();
    StringTokenizer stN = new StringTokenizer(wholeStringN , "\r\n");
    while(stN.hasMoreTokens()){
      posDictionary.add(stN.nextToken());
    }
    
    for(int i=0;i<negDictionary.size();i++){
        String posWord = negDictionary.get(i);
        for(int j=0;j<posDictionary.size();j++){
            String negWord = posDictionary.get(j);
            String actAssociation = posWord+" "+negWord;
            //System.out.println(actAssociation);
            mixNPDictionary.add(actAssociation);
        }
    }
    }catch(Exception e){
     System.out.println(e);   
    }  
    return mixNPDictionary;
    }
    
    //
    
    public ArrayList<String> getMixDictionaryPPElements(String category){
    posDictionary.clear();
    negDictionary.clear();
    mixPPDictionary.clear();
    try{
    FileInputStream fisP = new FileInputStream(category+"/pos.txt");
    byte bbP[] = new byte[fisP.available()];
    fisP.read(bbP);
    String wholeStringP = new String(bbP);
    fisP.close();
    wholeStringP = wholeStringP.trim();
    StringTokenizer stP = new StringTokenizer(wholeStringP , "\r\n");
    while(stP.hasMoreTokens()){
      posDictionary.add(stP.nextToken());
    }    
        
    FileInputStream fisN = new FileInputStream(category+"/pos.txt");
    byte bbN[] = new byte[fisN.available()];
    fisN.read(bbN);
    String wholeStringN = new String(bbN);
    fisN.close();
    wholeStringN = wholeStringN.trim();
    StringTokenizer stN = new StringTokenizer(wholeStringN , "\r\n");
    while(stN.hasMoreTokens()){
      negDictionary.add(stN.nextToken());
    }
    
    for(int i=0;i<posDictionary.size();i++){
        String posWord = posDictionary.get(i);
        for(int j=0;j<negDictionary.size();j++){
            String negWord = negDictionary.get(j);
            String actAssociation = posWord+" "+negWord;
            //System.out.println(actAssociation);
            mixPPDictionary.add(actAssociation);
        }
    }
    }catch(Exception e){
     System.out.println(e);   
    }  
    return mixPPDictionary;
    }
    
    //
    
    public ArrayList<String> getMixDictionaryNNElements(String category){
    posDictionary.clear();
    negDictionary.clear();
    mixNNDictionary.clear();
    try{
    FileInputStream fisP = new FileInputStream(category+"/neg.txt");
    byte bbP[] = new byte[fisP.available()];
    fisP.read(bbP);
    String wholeStringP = new String(bbP);
    fisP.close();
    wholeStringP = wholeStringP.trim();
    StringTokenizer stP = new StringTokenizer(wholeStringP , "\r\n");
    while(stP.hasMoreTokens()){
      posDictionary.add(stP.nextToken());
    }    
        
    FileInputStream fisN = new FileInputStream(category+"/neg.txt");
    byte bbN[] = new byte[fisN.available()];
    fisN.read(bbN);
    String wholeStringN = new String(bbN);
    fisN.close();
    wholeStringN = wholeStringN.trim();
    StringTokenizer stN = new StringTokenizer(wholeStringN , "\r\n");
    while(stN.hasMoreTokens()){
      negDictionary.add(stN.nextToken());
    }
    
    for(int i=0;i<posDictionary.size();i++){
        String posWord = posDictionary.get(i);
        for(int j=0;j<negDictionary.size();j++){
            String negWord = negDictionary.get(j);
            String actAssociation = posWord+" "+negWord;
            //System.out.println(actAssociation);
            mixNNDictionary.add(actAssociation);
        }
    }
    }catch(Exception e){
     System.out.println(e);   
    }  
    return mixNNDictionary;
    }
    
    //
    public String getPostitiveDictinaryString(String category){
        posDictionaryString = "";
        try{
            FileInputStream fis = new FileInputStream(category+"/pos.txt");
            byte bb[] = new byte[fis.available()];
            fis.read(bb);
            fis.close();
            posDictionaryString = new String(bb);
            //posDictionaryString = posDictionaryString.trim();
        }catch(Exception e){
            System.out.println(e);
        }
        return posDictionaryString;
    }
    public String getNegetiveDictinaryString(String category){
        negDictionaryString = "";
        try{
            FileInputStream fis = new FileInputStream(category+"/neg.txt");
            byte bb[] = new byte[fis.available()];
            fis.read(bb);
            fis.close();
            negDictionaryString = new String(bb);
            //negDictionaryString = negDictionaryString.trim();
        }catch(Exception e){
            System.out.println(e);
        }
        return negDictionaryString;
    }
}
