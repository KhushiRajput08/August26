import java.util.*;
public class SpecificElement {
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    System.out.println("ENTER A 5 NUMBERS");
    int[]arr= new int[5];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
System.out.println("ENTER A NUMBER TO SEARCH");
int num=sc.nextInt();

 for(int i=0;i<arr.length;i++){
    if(arr[i]==num){
System.out.println("found");
return;
    }
 }

    System.out.println("not found");
}
}
