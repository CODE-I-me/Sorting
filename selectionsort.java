public class Main {
    // Method to print the sorted array
    public static void printSortedArray(int arr[]) {
        for(int i = 0; i < arr.length; i++) { // Change from i <= arr.length to i < arr.length to avoid ArrayIndexOutOfBoundsException
            System.out.print(arr[i] + " "); // Change arr[] to arr[i] to correctly print each element
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {9,7,5,4,6};//example input

        // Selection sort algorithm
        for(int i = 0; i < arr.length - 1; i++) {
            int small=i;
            for(int j = i+1; j < arr.length ; j++) { // Change from j <= arr.length - i - 1 to j < arr.length - i - 1 to avoid ArrayIndexOutOfBoundsException
                if (arr[small] > arr[j]) {
                    small = j;
                }
            }
                    // Swap arr[j] and arr[j + 1]
                    int temp = arr[small];
                    arr[small] = arr[i];
                    arr[i] = temp;
                }
        printSortedArray(arr); // Print the sorted array
            }
        }



