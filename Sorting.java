public class Sorting {
    public static void main(String[] args) {

        int arr[] = {3, 6, 4, 8, 7, 2, 1};
        

        for(int i = 0; i < arr.length - 1; i++) {
            int n = arr.length;
            for(int j = 0; j < n - i - 1; j++) {
                if(arr[j] > arr[j + 1]) {

                }
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        System.out.println("Sorted Array:");
        for(int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

// Zeroes at end of array
public class sorting{
    public static void main(String[] args){

        int[] arr = {0,45,0,-1,12,0,78};

        // Move zeros to last
        for(int i = 0; i < arr.length - 1; i++){

            for(int j = 0; j < arr.length - 1 - i; j++){

                if(arr[j] == 0){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Sort non-zero elements
        for(int i = 0; i < arr.length - 1; i++){

            for(int j = 0; j < arr.length - 1 - i; j++){

                if(arr[j] != 0 && arr[j+1] != 0){

                    if(arr[j] > arr[j + 1]){

                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;
                    }
                }
            }
        }

        System.out.println("Final Array:");

        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

// Bubble Sort
public class bubblesort{
    public static void main(String[] args){

        int[] arr = {34,12,-2,54,2,9};
        int n = arr.length;

        int count = 0;

        for(int i = 0; i < n - 1; i++){

            boolean isSorted = true;

            for(int j = 0; j < n - 1 - i; j++){

                if(arr[j] > arr[j + 1]){

                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    count++;

                    isSorted = false;
                }
            }

            if(isSorted == true){
                break;
            }
        }

        System.out.println("Sorted Array:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("Total swaps = " + count);
    }
}

// Selection Sort

public class selectionsort{
    public static void main(String[] args){

        int[] arr = {34,12,-2,54,2,9};
        int n = arr.length;

        for(int i = 0; i < n - 1; i++){

            int minIndex = i;

            for(int j = i + 1; j < n; j++){

                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }

            // Swap
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println("Sorted Array:");

        for(int i = 0; i < n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}

