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

public class stack {
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