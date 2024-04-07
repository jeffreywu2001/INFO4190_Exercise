import java.util.Arrays;

class SortStrArray {
    public static void main(String[] args) {
        String[] strArray = {"b", "a", "c", "d", "e"};
        System.out.println("Original String Array: " + Arrays.toString(strArray));

        //create a sortablearray for strings
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
