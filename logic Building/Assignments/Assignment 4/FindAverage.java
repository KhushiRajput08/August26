import java.util.*;
public class FindAverage {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a  5 numbers");
        int arr[]= new int[5];
  int sum =0;
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();
          sum = sum+arr[i];

        }
        double Average = (double) sum/arr.length;
        System.out.println("The average is "+Average);

    }
}
