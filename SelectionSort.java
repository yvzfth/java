public class SelectionSort {
    public static void main(String[] args) {
        // double[] list = { 55, 56, 46, 78, 11, 0, 65 };

        int count[] = new int[10];
        System.out.println(count[0]);
        // selectionSort(list);


    }

    /**
     * the method for sorting the numbers
     */
    public static void selectionSort(double[] list) {
        for (double x : list)
            System.out.println(x);
        for (int i = 0; i < list.length; i++) {
            // find the minimum in the list
            double currentMin = list[i];
            int currentMinIndex = i;

            for (int j = i + 1; j < list.length; j++) {
                if (currentMin > list[j]) {
                    currentMin = list[j];
                    currentMinIndex = j;
                }
            }
            // swap list[i] with list[currentMinIndex] if necessary
            if (currentMinIndex != i) {
                list[currentMinIndex] = list[i];
                list[i] = currentMin;
            }
        }
        for (double x : list)
            System.out.println(x);
    }
}