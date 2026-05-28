import java.util.Scanner;

public class Linearsearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n = sc.nextInt();
        int arr[]=new int[n];
        System.out.println("Enter the elements of array");
         for (int i=0;i<n;i++){
            arr[i] = sc.nextInt();
         }
         System.out.println("Enter the element to be searched");
         int search = sc.nextInt();
         for (int i=0;i<n;i++){
            if(arr[i]==search){
                System.out.println("Element found at index " + i);
                break;
            }
            if(i==n-1){
                System.out.println("Element not found in the array");
            }   
        }
        sc.close();
    }
}