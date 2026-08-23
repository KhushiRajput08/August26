import java.util.*;
public class Even {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a N number");
        int N=sc.nextInt();
        for(int i=0;i<=N;i++){
            if(i%2==0)
             System.out.println(i);
            
        }

    }
}
