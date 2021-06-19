import java.util.Scanner;
public class BubbleSort {
	public static void main(String args[]) {
		int number;
		int array[];
		System.out.println("Enter the count: ");
		Scanner scanner = new Scanner(System.in);
		number = scanner.nextInt();
		array = new int[number];
		System.out.println("Enter the numbers to sort: ");

		for(int i=0; i<array.length; i++) {
			array[i] = scanner.nextInt();
		}

		for(int i=0; i<array.length-1; i++) {
			for(int j=0; j<array.length-1; j++) {

				if(array[j]<array[j+1]){
					int temp = array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}

		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" ");
		}
	}
}
