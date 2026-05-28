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
