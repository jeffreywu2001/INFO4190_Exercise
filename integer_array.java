import java.util.Arrays;

class SortIntArray {
    public static void main(String[] args) {
        Integer[] intArray = {3, 1, 2, 6, 5};
        System.out.println("Original Integer Array: " + Arrays.toString(intArray));

        //create a sortablearray for integers
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
