package Ftppackage;
import java.util.ArrayList;
import java.util.List;


public class SetOperationDemo {

    public static void main(String[] args) {
        List<String> setOne = new ArrayList<String>() {{
            add("A");
            add("B");
            add("C");
            add("D");
            add("E");
        }};
        List<String> setTwo = new ArrayList<String>() {{
            add("D");
            add("E");
            add("F");
            add("G");
        }};

        System.out.println("Set A           : " + setOne);
        System.out.println("Set B           : " + setTwo);
        List<String> base = new ArrayList<String>(setOne);
        base.retainAll(setTwo);
        System.out.println("Intersection A+B: " + base);
        base = new ArrayList<String>(setOne);
        base.removeAll(setTwo);
        System.out.println("Subtraction  A-B: " + base);
        base = new ArrayList<String>(setTwo);
        base.removeAll(setOne);
        System.out.println("Subtraction  B-A: " + base);
        base = new ArrayList<String>(setOne);
        base.addAll(setTwo);
        System.out.println("Union A union B : " + base);
        
        
       ArrayList<String> a = new ArrayList<String>();
       ArrayList<String> b = new ArrayList<String>();
       a.clear();
       b.clear();
       a.add("11 2");
       a.add("2");
       a.add("3");
       a.add("4");
       a.add("5");
       
       b.add("2");
       b.add("3");
       b.add("4");
      
       ArrayList<String> c = new ArrayList<>(a);
       c.removeAll(b);
        System.out.println("array"+c);
    }
}