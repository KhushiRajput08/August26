import java.util.*;
public class FindIndex {
   public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println(" ENTER THE 5 NUMBERS");
    int[]arr = new int[5];

    for(int i=0;i<arr.length;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("ENTER A NUMBER TO SEARCH");
    int num=sc.nextInt();
    int index=Arrays.binarySearch(arr,num);

    if(index>=0){
        System.out.println("the number is "+ "is found at index"+index);
    }else{
        System.out.println("not found");
        
    }

   } 
}
