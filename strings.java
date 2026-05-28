import java.nio.channels.Pipe.SourceChannel;
import java .util.Scanner;

public class strings {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        String  name = sc.nextLine();

        System.out.println("Enter the string : ");
        char ch = sc.next().charAt(0);

        System.out.println("First occurence of " + ch + " is at index : " + name.indexOf(ch);
        System.out.println("Last occurence of " + ch + " is at index : " + name.lastIndexOf(ch));

        System.out.println("wellcome" + name);

    }
    
}
