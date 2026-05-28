import  java.util.Scanner;;

public class Array {
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);

      System.out.println("Enter the array size : ");
      int n = sc.nextInt();


      int arr[] = new int[n];

      for(int i=0;i<n;i++){{
          arr[i]=sc.nextInt();
        }
      }
       System.out.println("element to search :");
       int x = sc.nextInt();

for(int i=0;i<0;i++){
   if(arr[i]==x){
    System.out.println("elment is found");
    boolean found = true;
    break;
   }
   else{
    System.out.println("elment is not found");
    break;
   }
}
  sc.close();
}
}
    
