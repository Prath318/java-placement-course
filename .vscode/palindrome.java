import java.util.Scanner;

public class palindrome {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter thee num:");
        int n= sc.nextInt();
        int temp = n,rev=0;
         while(n>0){
            rev=rev*10+n%10;
            n=n/10;
         }

        if(temp==rev){
            System.out.println("num is palindrome");
        }else{
            System.out.println("num is not palindrome");
        }
    sc.close();
    }
    
}
