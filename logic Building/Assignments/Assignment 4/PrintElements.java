import java.util.*;
public class PrintElements {
    public static void main(String[]args){
       Scanner sc=new Scanner(System.in);
       System.out.println("Enter a number");
       int N=sc.nextInt();
       int arr[] = new int[5];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }

        for(int x:arr){
            System.out.println(x);
        }
    }
    
}
