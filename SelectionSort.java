import java.util.Scanner;
public class SelectionSort {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int arr[];
        System.out.println("Enter the count: ");
        number = scanner.nextInt();
        arr = new int[number];
        System.out.println("Enter the numbers: ");

        for(int i=0; i<arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        for(int i=0; i<arr.length-1; i++) {
            int indexOfSmallest = i;
            for(int j=i+1; j<arr.length; j++) {
                if(arr[j]<arr[indexOfSmallest]) {
                    indexOfSmallest = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[indexOfSmallest];
            arr[indexOfSmallest] = temp;
        }

        for(int i=0; i< arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
