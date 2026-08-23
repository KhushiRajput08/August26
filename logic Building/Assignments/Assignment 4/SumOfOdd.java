import java.util.*;
public class SumOfOdd {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a N number");
        int N=sc.nextInt();
        int sum=0;
        for(int i=0;i<=N;i++){
            if(i%2!=0)
                sum = sum+i;
          
        }
      System.out.println(" the sum off odd number "+sum);

    }
}
