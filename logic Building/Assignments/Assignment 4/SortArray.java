import java.util.*;
public class SortArray {
public static void main(String[]args){
    System.out.println("Enter a 5 numbers ");
    Scanner sc=new Scanner(System.in);
    int[]arr=new int[5];
    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
        
    }
        Arrays.sort(arr);
        System.out.println("sorted Array is");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
 
}
    
}
