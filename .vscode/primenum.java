import java.util.Scanner;
public class primenum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = sc.nextInt();
        boolean isprime = true;
         if(n<=1){
            isprime = false;
         }else{
            for(int i =2;i<=n/2;i++){
                if(n%i==0){
                    isprime = false;
                    break;
                }
         }
         }
         if(isprime){
            System.out.println("number is prime");
         }else{
            System.out.println("number is not prime");
         }
         sc.close();
        

    }
    
}
