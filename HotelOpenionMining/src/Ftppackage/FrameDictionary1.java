package Ftppackage;
import java.io.*;
import java.util.*;
public class FrameDictionary1 {
    public String posDictionaryString = "";
    public String negDictionaryString = "";
    public ArrayList<String> posElements = new ArrayList<String>();
    public ArrayList<String> negElements = new ArrayList<String>();
    
    public String clearedString = "";
    
    public ArrayList<String> posNegElementsAssociation = new ArrayList<String>();
    public ArrayList<String> negPosElementsAssociation = new ArrayList<String>();
    public ArrayList<String> posPosElementsAssociation = new ArrayList<String>();
    public ArrayList<String> negNegElementsAssociation = new ArrayList<String>();
    public String getPositiveDictionaryString(String category){
     try{
         posDictionaryString = "";
     FileInputStream fis = new FileInputStream(category+"/pos.txt");
     byte bb[] = new byte[fis.available()];
     fis.read(bb);
     fis.close();
     posDictionaryString = new String(bb);
     }catch(Exception e){
         System.out.println(e);
     }    
        return posDictionaryString;
    }   
    
    //////////////////
    
    public String getNegetiveDictionaryString(String category){
     try{
     negDictionaryString = "";    
     FileInputStream fis = new FileInputStream(category+"/neg.txt");
     byte bb[] = new byte[fis.available()];
     fis.read(bb);
     fis.close();
     negDictionaryString = new String(bb);
     }catch(Exception e){
         System.out.println(e);
     }    
        return negDictionaryString;
    }   
    ///////////////////////////    
    public ArrayList<String> getPosElements(String category){
        posElements.clear();
        try{        
        FileInputStream fis = new FileInputStream(category+"/pos.txt");
        byte bb[] = new byte[fis.available()];
        fis.read(bb);
        fis.close();
        String wholeString = new String(bb);
        wholeString = wholeString.trim();
        StringTokenizer st = new StringTokenizer(wholeString,"\r\n");
        while(st.hasMoreTokens()){
          posElements.add(st.nextToken());
        }
        }catch(Exception e){
            System.out.println(e+" in pos elements");
        }
        return posElements;
    }
    /////////////////////////
    public ArrayList<String> getNegElements(String category){
        negElements.clear();
        try{        
        FileInputStream fis = new FileInputStream(category+"/neg.txt");
        byte bb[] = new byte[fis.available()];
        fis.read(bb);
        fis.close();
        String wholeString = new String(bb);
        wholeString = wholeString.trim();
        StringTokenizer st = new StringTokenizer(wholeString,"\r\n");
        while(st.hasMoreTokens()){
          negElements.add(st.nextToken());
        }
        }catch(Exception e){
            System.out.println(e+" in neg elements");
        }
        return negElements;
    }
    public ArrayList<String> getPosNegAssociations(String category){
        posNegElementsAssociation.clear();
        ArrayList<String> posElements = new ArrayList<String>();
        posElements.clear();
        ArrayList<String> negElements = new ArrayList<String>();
        negElements.clear();
        String cate = category;
        try{
        posElements = this.getPosElements(cate);
        negElements = this.getNegElements(cate);
        for(int i=0;i<posElements.size();i++){
            String posItem = posElements.get(i);
            for(int j=0;j<negElements.size();j++){
                String negItem = negElements.get(j);
                posNegElementsAssociation.add(posItem+" "+negItem);
            }
        }
        }catch(Exception e){
            System.out.println(e);
        }
        return posNegElementsAssociation;
    }
    ///////////////////
    public ArrayList<String> getNegPosAssociations(String category){
        negPosElementsAssociation.clear();
        ArrayList<String> posElements = new ArrayList<String>();
        posElements.clear();
        ArrayList<String> negElements = new ArrayList<String>();
        negElements.clear();
        String cate = category;
        try{
        posElements = this.getPosElements(cate);
        negElements = this.getNegElements(cate);
        for(int i=0;i<negElements.size();i++){
            String negItem = negElements.get(i);
            for(int j=0;j<posElements.size();j++){
                String posItem = posElements.get(j);
                negPosElementsAssociation.add(negItem+" "+posItem);
            }
        }
        }catch(Exception e){
            System.out.println(e+" in negPos elements");
        }
        return negPosElementsAssociation;
    }
    ////////////////////
    public ArrayList<String> getPosPosAssociations(String category){
        negNegElementsAssociation.clear();
        ArrayList<String> negElements = new ArrayList<String>();
        negElements.clear();        
        String cate = category;
        try{
        negElements = this.getPosElements(cate);
        
        for(int i=0;i<negElements.size();i++){
            String negItem = negElements.get(i);
            for(int j=0;j<negElements.size();j++){
                String neg1Item = negElements.get(j);
                negNegElementsAssociation.add(negItem+" "+neg1Item);
            }
        }
        }catch(Exception e){
            System.out.println(e+" in negPos elements");
        }
        return negNegElementsAssociation;
    }
    ///////////////////
    public ArrayList<String> getNegNegAssociations(String category){
        negPosElementsAssociation.clear();
        ArrayList<String> posElements = new ArrayList<String>();
        posElements.clear();        
        String cate = category;
        try{
        posElements = this.getNegElements(cate);
        
        for(int i=0;i<posElements.size();i++){
            String posItem = posElements.get(i);
            for(int j=0;j<posElements.size();j++){
                String pos1Item = posElements.get(j);
                negPosElementsAssociation.add(posItem+" "+pos1Item);
            }
        }
        }catch(Exception e){
            System.out.println(e+" in negPos elements");
        }
        return negPosElementsAssociation;
    }
    public String cleanedTweet(String tweet){
        clearedString = tweet;
        ArrayList<String> toClearWords = new ArrayList<String>();
        toClearWords.clear();
        try{
        FileInputStream fis = new FileInputStream("cleanitems.txt");
        byte bb[] = new byte[fis.available()];
        fis.read(bb);
        fis.close();
        String wholeString = new String(bb);
        wholeString = wholeString.trim();
        StringTokenizer st = new StringTokenizer(wholeString,"\r\n");
        while(st.hasMoreTokens()){
          toClearWords.add(st.nextToken());
        }
        for(int i=0;i<toClearWords.size();i++){
            String toClear = toClearWords.get(i);
            clearedString = clearedString.replace(toClear,"");
        }
        
        }catch(Exception e){
            System.out.println(e+" in cleaned one");
        }
        
        return clearedString;
    }

    ArrayList<String> getPositiveDictionaryString(ArrayList<String> friendtweets) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<String> getNegetiveDictionaryString(ArrayList<String> friendtweets) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ArrayList<String> getPosNegAssociations(ArrayList<String> friendtweets) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
