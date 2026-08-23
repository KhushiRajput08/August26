import java.util.*;
public class CheckPalindrome {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string ");
        String str =sc.nextLine();
        String rev ="";
        for(int i=0;i<str.length()-1;i--){
           rev = rev+str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("Palindrome");
        }else{
            System.out.println("not palindrome");
        }
    }
    
}
