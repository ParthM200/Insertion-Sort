import java.util.ArrayList;
import java.util.Scanner;

public class insertionSort {

    private ArrayList<Integer> myIntAL = new ArrayList<Integer>();
    int numToSort = 0;

    Scanner scanner = new Scanner(System.in);

    // Constructor
    public insertionSort() {
        runUserInput();
    }

    // Builds array based on user input
    public void buildArray() {
        for (int i = 0; i < numToSort; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            int userInt = scanner.nextInt();
            myIntAL.add(userInt);
        }
    }

    // Insertion sort method
    public void insertionSort(ArrayList<Integer> arr) {
        int n = arr.size();
        for (int i = 1; i < n; i++) {
            int key = arr.get(i);
            int j = i - 1;
            while ((j > -1) && (arr.get(j) > key)) {
                arr.set(j + 1, arr.get(j));
                j--;
            }
            arr.set(j + 1, key);

            System.out.print("Insertion Sort Cycle " + i + ": ");
            System.out.println(myIntAL);
        }
    }

    // Asks user for their input and runs all the processes to build and sort the
    // arraylist
    public void runUserInput() {
        System.out.print("\nHow long do you want the ArrayList to be?: ");
        numToSort = scanner.nextInt();

        buildArray();
        System.out.println("\n***********  Unsorted ArrayList   ******************");
        System.out.println(myIntAL);
        System.out.println();

        insertionSort(myIntAL);
        System.out.println("\n***********  Final Sorted ArrayList  ******************");
        System.out.println(myIntAL);
        System.out.println();
    }

}