package Ftppackage;
import javax.swing.*; 
public class ProgressBarExample extends JFrame{    
JProgressBar jb;    
int i=0,num=0;     
ProgressBarExample(){    
jb=new JProgressBar(0,2000);    
jb.setBounds(100,50,150,30);         
jb.setValue(0);    
jb.setStringPainted(true);    
add(jb);    
setSize(350,250);    
setLayout(null);    
}    
public void iterate(){    
while(i<=1000){    
  jb.setValue(i);    
  i=i+20;    
  try{
       
      Thread.sleep(300);
  }catch(Exception e){
      System.out.println(e);
  }    
}    
}    
public static void main(String[] args) {    
    ProgressBarExample m=new ProgressBarExample();    
    m.setVisible(true);    
    m.iterate();    
}    
}  