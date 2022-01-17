public class QuickSort {

    // O(nlogn) Unstable
    public static void merge(int[] input, int start, int mid, int end){
        int [] intArray = {20, 35, -15, 7, 55, 1, -22};

        quickSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }
    }
    public static void quickSort(int[] input, int start, int end){
        if (end - start < 2){
            return;
        }
        int pivotIndex = partition(input, start, end);
        quickSort(input, start, pivotIndex); //left subarray
        quickSort(input, pivotIndex + 1, end); // right subaaray
    }

    public static int partition(int [] input, int start, int end){
        // this is using the first element as a pivot\\\
        int pivot = input[start];
        int i = start;
        int j = end;

        while (i < j){
            // empty loop body
            while (i < j && input[--j] >= pivot);
            if (i < j){
                input[i] = input[j];
            }

            while (i < j && input[++i] <= pivot);
            if (i < j){
                input[j] = input[i];
            }
        }
        input[j] = pivot;
        return j;

    }

}
