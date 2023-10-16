import java.util.Scanner;

class ReverseArray2 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter 5 elements in an array");

        int arr[] = new int[5];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc1.nextInt();
        }

        System.out.println("Array Before Reversing : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); 

        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }

        System.out.println("Array after Reversing : ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}
