import java.util.Arrays;

public class SortableArrayExample {
    public static void main(String[] args) {

        Integer[] intArray = {9, 4, 6, 2, 1};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        SortableArray<Integer> sortableIntArray = new SortableArray<>(intArray);
        sortableIntArray.sort();
        System.out.println("Sorted Integer Array: " + Arrays.toString(sortableIntArray.toArray()));


        String[] strArray = {"donut", "banana", "cherry", "peach", "sushi"};
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
