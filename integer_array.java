import java.util.Arrays;

public class SortIntArray {
    public static void main(String[] args) {
        Integer[] intArray = {9, 6, 4, 1, 8};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));
        SortableArray<Integer> sortableIntArray = new SortableArray<>(intArray);
        sortableIntArray.sort();
        System.out.println("Sorted Integer Array: " + Arrays.toString(sortableIntArray.toArray()));
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
