import java.util.*;
public class SumOfAllElements {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER A NUMBER");
        int N=sc.nextInt();
        int[]arr=new int[5];
        for(int i=0;i<N;i++){
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int x:arr){
            sum = sum + x;

        }
         System.out.println(sum);
    }
}
