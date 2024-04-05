import java.util.Arrays;

public class SortableArrayExample {
    public static void main(String[] args) {
        // Sort an array of integers
        Integer[] intArray = {5, 2, 9, 1, 7};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        SortableArray<Integer> sortableIntArray = new SortableArray<>(intArray);
        sortableIntArray.sort();
        System.out.println("Sorted Integer Array: " + Arrays.toString(sortableIntArray.toArray()));

        // Sort an array of strings
        String[] strArray = {"banana", "apple", "orange", "grape", "pineapple"};
        System.out.println("\nOriginal String Array: " + Arrays.toString(strArray));
        SortableArray<String> sortableStrArray = new SortableArray<>(strArray);
        sortableStrArray.sort();
        System.out.println("Sorted String Array: " + Arrays.toString(sortableStrArray.toArray()));
    }

    static class SortableArray<T extends Comparable<T>> {
        private T[] array;

        public SortableArray(T[] array) {
            this.array = array;
        }

        public void sort() {
            Arrays.sort(array);
        }

        public T[] toArray() {
            return array;
        }
    }
}
