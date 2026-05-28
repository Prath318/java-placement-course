import java.util.Scanner;

public class function {
    public static int factorial (int a){
        int fact =1;

        for(int i=1; i<=a;i++){
            fact = fact*i;
        }
        return fact;
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        

        int  reasult = factorial(a);
        System.out.println(reasult);

        sc.close();
    }
}