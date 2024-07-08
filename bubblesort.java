public class Main {
    // Method to print the sorted array
    public static void printSortedArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) { // Change from i <= arr.length to i < arr.length to avoid ArrayIndexOutOfBoundsException
            System.out.print(arr[i] + " "); // Change arr[] to arr[i] to correctly print each element
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7, 4, 5, 6, 8};//example input

        // Bubble sort algorithm
        for(int i = 0; i < arr.length - 1; i++) {
            for(int j = 0; j < arr.length - i - 1; j++) { // Change from j <= arr.length - i - 1 to j < arr.length - i - 1 to avoid ArrayIndexOutOfBoundsException
                if(arr[j] > arr[j + 1]) {
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        // Print the sorted array
        printSortedArray(arr);
    }
}
