

public class LinearSearch {
    public static void main(String[] args) {
        int[] myList = {1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(linearSearch(myList, 8));
    }

    public static int linearSearch(int[] list, int key) {
        for (int i = 0; i < list.length; i++) {
            if (list[i] == key) return i;
        }
        return -1;
    }
}