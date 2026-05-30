// Queue Implementation Using Array

import java.util.Scanner;
class Queue{
    int queue[],size,front,rear;
    public Queue(int n){
        size=n;
        queue=new int[size];
        front=0;
        rear=-1;
    }
    public void insert(int data){
        if(isFull()){
            System.out.println("Queue is Full");
            return;
        }
        rear++;
        queue[rear]=data;
    }
    public int delele(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int temp=queue[front];
        front++;
        return temp;
    }
    public void display(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return;
        }
        for(int i=front;i<=rear;i++){
            System.out.print(queue[i]+" ");
        }
        System.out.println();
    }
    public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        System.out.println("Front Element: "+queue[front]);
        return queue[front];
    }
    public boolean isFull(){
        return rear==size-1;
    }

    public boolean isEmpty(){
        return front>rear;
    }
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of Queue: ");
        int n=sc.nextInt();
        int data;
        Queue obj=new Queue(n);
        while(true){
            System.out.println("\n1. Insert");
            System.out.println("2. Delete");
            System.out.println("3. Display");
            System.out.println("4. Peek");
            System.out.println("0. Exit");
            int ch=sc.nextInt();
            switch(ch){
                case 1:
                    System.out.println("Enter data: ");
                    data=sc.nextInt();
                    obj.insert(data);
                    break;
                case 2:
                    data=obj.delele();
                    if(data!=-1){
                        System.out.println(data+" is Deleted");
                    }
                    break;
                case 3:
                    obj.display();
                    break;

                case 4:
                    obj.peek();
                    break;

                case 0:
                    System.exit(0);
            }
        }
    }
}