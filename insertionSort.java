import java.util.ArrayList;

public class insertionSort {
    private ArrayList<Integer> myIntAL = new ArrayList<Integer>();
    private int numToSort = 0;

    public insertionSort() {
        System.out.println("************  Unsorted **********************");
        numToSort = 10;// Number of items to create and sort
        buildArray(); // Creates a random ArrayList
        printArray(); // Prints the unsorted arraylist
        System.out.println("***********************************************");

        insertionSort(myIntAL); // Performs the bubble sort on the arraylist
        System.out.println("***********  Sorted   ******************");
        printArray();// Prints the sorted arraylist
        System.out.println("***********************************************");
    }

    // Builds array of random numbers to sort
    public void buildArray() {
        for (int i = 0; i < numToSort; i++) {
            myIntAL.add((int) (Math.random() * numToSort));
        }
    }

    public void printArray() {
        System.out.println(myIntAL);
    }

    // Sorts the array
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

            System.out.print("Cycle " + i + " ");
            printArray();
        }
    }

}