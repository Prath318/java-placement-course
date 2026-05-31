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
   
//Largest Element in Array

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 45, 2, 67, 34};

        int max = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] > max) {
                max = arr[i];
            }
        }

        System.out.println("Largest Element = " + max);
    }
}
```

---

//Smallest Element in Array

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 45, 2, 67, 34};

        int min = arr[0];

        for(int i = 1; i < arr.length; i++) {

            if(arr[i] < min) {
                min = arr[i];
            }
        }

        System.out.println("Smallest Element = " + min);
    }
}
```

---

//Reverse Array

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int i = 0;
        int j = arr.length - 1;

        while(i < j) {

            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;

            i++;
            j--;
        }

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```

---

//Sum of Array Elements

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        System.out.println("Sum = " + sum);
    }
}
```

---

//Average of Array

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40};

        int sum = 0;

        for(int num : arr) {
            sum += num;
        }

        double avg = (double)sum / arr.length;

        System.out.println("Average = " + avg);
    }
}
```

---

//Count Even and Odd Numbers

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 5, 8, 19, 20};

        int even = 0;
        int odd = 0;

        for(int num : arr) {

            if(num % 2 == 0) {
                even++;
            }
            else {
                odd++;
            }
        }

        System.out.println("Even = " + even);
        System.out.println("Odd = " + odd);
    }
}
```

---

//Linear Search

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};

        int target = 30;

        boolean found = false;

        for(int i = 0; i < arr.length; i++) {

            if(arr[i] == target) {
                found = true;
                System.out.println("Element Found at Index " + i);
                break;
            }
        }

        if(!found) {
            System.out.println("Element Not Found");
        }
    }
}
```

---

//Second Largest Element

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {12, 45, 67, 23, 89};

        int max = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for(int num : arr) {

            if(num > max) {
                second = max;
                max = num;
            }
            else if(num > second && num != max) {
                second = num;
            }
        }

        System.out.println("Second Largest = " + second);
    }
}

// Check Array Sorted or Not

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        boolean sorted = true;

        for(int i = 0; i < arr.length - 1; i++) {

            if(arr[i] > arr[i + 1]) {
                sorted = false;
                break;
            }
        }

        if(sorted) {
            System.out.println("Array is Sorted");
        }
        else {
            System.out.println("Array is Not Sorted");
        }
    }
}


## 20. Rotate Array by One Position

```java
public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};

        int last = arr[arr.length - 1];

        for(int i = arr.length - 1; i > 0; i--) {
            arr[i] = arr[i - 1];
        }

        arr[0] = last;

        for(int num : arr) {
            System.out.print(num + " ");
        }
    }
}
```
