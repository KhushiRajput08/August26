import java.util.*;
public class PrintAllStrings {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter the names ");
    String str[]= new String[4];
     for(int i=0;i<str.length;i++){
        str[i]=sc.next();
     }
      for(String m:str){
        System.out.println(m);
      }
}
    
}
