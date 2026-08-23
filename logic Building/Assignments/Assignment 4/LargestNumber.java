import java.util.*;
public class LargestNumber {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the 5 numbers");
        int arr[]= new int[5];
         
        int largest=arr[0];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(arr[i]>largest)

            largest=arr[i];
        }
        System.out.println("the largest is "+largest);
    }
}
