import java.util.*;
class CountPositiveNegative {

public static void main(String[]args){
 Scanner sc=new Scanner(System.in);
 System.out.println("Enter a number");
 int arr[]= new int[6];
int PositiveCount =0;
int NegativeCount=0;
 for(int i=0;i<arr.length;i++){
    arr[i]=sc.nextInt();

    if(arr[i]>0){
        PositiveCount++;
    }else if(arr[i]<0){
        NegativeCount++;
    }

 }
System.out.println("positive numbers are "+ PositiveCount);
System.out.println("Negative  numbers are "+ NegativeCount);
}
    
}
