public class ReverseList {
    public static void main(String[] args) {
        int[] list1 = {1, 2, 3, 4, 5, 6};
        int[] list2 = reverseList(list1);
        for (int list : list1) System.out.println(list);
        for (int list : list2) System.out.println(list);
    }

    public static int[] reverseList(int[] list) {
        int[] result = new int[list.length];
        for (int i = 0, j = result.length - 1; i < list.length; i++, j--) {
            result[j] = list[i];
        }
        return result;
    }
}