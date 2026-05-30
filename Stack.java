import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println("Stack: " + stack);
        System.out.println("Top element: " + stack.peek());
        System.out.println("Removed: " + stack.pop());
        System.out.println("Stack after pop: " + stack);
        System.out.println("Is stack empty " + stack.isEmpty());
    }
}

// 1. Direct Copy Stack
import java.util.*;

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(6);
        Stack<Integer> rt = new Stack<>();
        rt.addAll(st);
        System.out.println(rt);
    }
}
// 2. Reverse Stack

import java.util.*;

public class stack {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(2);
        st.push(4);
        st.push(1);
        st.push(6);
        Collections.reverse(st);
        System.out.println(st);
    }
}

// at index

import java.util.*;
public class Main{
    public static void main(String[] args){
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(34);
        st.push(1);
        st.push(43);
        System.out.println(st);
        int idx = 2;
        int num = 55;
        Stack<Integer> gt = new Stack<>();
        while(st.size() > idx){
            gt.push(st.pop());
        }
        st.push(num);
        while(gt.size() > 0){
            st.push(gt.pop());
        }
        System.out.println(st);
    }
}

// Stack Display Using Recursion

import java.util.*;
public class Main{
    static void DisplayStack(Stack<Integer> st){
        if(st.size()==0){
            return;
        }
        int top=st.pop();
        System.out.print(top+" ");
        DisplayStack(st);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(34);
        st.push(1);
        st.push(43);
        DisplayStack(st);
    }
}

// Push Element At Bottom Using Recursion

import java.util.*;
public class Main{
    static void DisplayStack(Stack<Integer> st,int val){
        if(st.size()==0){
            st.push(val);
            return;
        }
        int top=st.pop();
        DisplayStack(st,val);
        st.push(top);
    }
    public static void main(String[] args){
        Stack<Integer> st=new Stack<>();
        st.push(12);
        st.push(34);
        st.push(1);
        st.push(43);
        DisplayStack(st,100);
        System.out.println(st);
    }
}

// Stack Using Array With Array Reverse And String Reverse

import java.util.Scanner;

class Stacks{
    int top=-1;
    int[] arr;
    final int CAPACITY;

    Stacks(int size){
        CAPACITY=size;
        arr=new int[CAPACITY];
    }

    public void push(int data){
        if(top==CAPACITY-1){
            System.out.println("Stack Overflow");
            return;
        }
        top++;
        arr[top]=data;
        System.out.println(data+" pushed");
    }

    public void pop(){
        if(top==-1){
            System.out.println("Stack Underflow");
            return;
        }
        System.out.println(arr[top]+" popped");
        top--;
    }

    public void peek(){
        if(top==-1){
            System.out.println("Stack Empty");
            return;
        }
        System.out.println("Top Element: "+arr[top]);
    }

    public void traverse(){
        if(top==-1){
            System.out.println("Stack Empty");
            return;
        }
        for(int i=top;i>=0;i--){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

    public void reverseArray(int[] a){
        Stacks temp=new Stacks(a.length);

        for(int i=0;i<a.length;i++){
            temp.push(a[i]);
        }

        for(int i=0;i<a.length;i++){
            a[i]=temp.arr[temp.top];
            temp.top--;
        }

        System.out.println("Reversed Array:");

        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }

        System.out.println();
    }

    public void reverseString(String str){
        char[] ch=new char[str.length()];
        int t=-1;

        for(int i=0;i<str.length();i++){
            t++;
            ch[t]=str.charAt(i);
        }

        System.out.println("Reversed String:");

        while(t!=-1){
            System.out.print(ch[t]);
            t--;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of stack:");
        int n=sc.nextInt();

        Stacks st=new Stacks(n);

        while(true){

            System.out.println("1. Push");
            System.out.println("2. Pop");
            System.out.println("3. Peek");
            System.out.println("4. Traverse");
            System.out.println("5. Reverse Array");
            System.out.println("6. Reverse String");
            System.out.println("0. Exit");

            System.out.println("Enter choice:");
            int ch=sc.nextInt();

            switch(ch){

                case 1:
                    System.out.println("Enter data:");
                    int data=sc.nextInt();
                    st.push(data);
                    break;

                case 2:
                    st.pop();
                    break;

                case 3:
                    st.peek();
                    break;

                case 4:
                    st.traverse();
                    break;

                case 5:
                    int[] a={12,34,1,43};
                    st.reverseArray(a);
                    break;

                case 6:
                    sc.nextLine();
                    System.out.println("Enter String:");
                    String str=sc.nextLine();
                    st.reverseString(str);
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}