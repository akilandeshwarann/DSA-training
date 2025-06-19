import java.util.*;
class Sample{
    String s="Akil";
    void reversed(){
        String a="";
        for(int i=s.length()-1;i>=0;i--){
            a+=s.charAt(i);
        }
        System.out.println(a);
    }
}
public class Main{
    public static void main(String args[]){
        Sample s1=new Sample();
        s1.reversed();
    }
}
