public class MergeSort {
    // O(nlogn)
    // stable algorism
    public static void main (String[] args){

        int [] intArray = {20, 35, -15, 7, 55, 1, -22};

        mergeSort(intArray, 0, intArray.length);

        for (int i = 0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }

    }

    public static void mergeSort(int[] input, int start, int end){

        // Recursion
        if (end - start < 2){
            return;
        }
        int mid = (start + end) /2; //3
        mergeSort(input, start, mid); // {-15, 20, 35}, 
        mergeSort(input, mid, end); // {-22, 1, 7, 55}
        
        merge(input, start, mid, end);

    }

    // {20, 35, -15, 7, 55, 1, -22} 
    public static void merge(int[] input, int start, int mid, int end){

        if (input[mid - 1] <= input[mid]){ // 7, 55 you don't need to change anything
            return;
        }
        int i = start; //0
        int j = mid; //3
        int tempIndex = 0;

        int [] temp = new int[end - start]; // 7-0
        while (i < mid && j < end){
            temp[tempIndex++] = input[i] >= input[j] ? input[i++]: input[j++]; //temp[0] = 20 <= 7 therefore, input[0] = 
        }
        System.arraycopy(input, i, input, start + tempIndex, mid - i);  //{Source Array, left over element from the left, destination, the number of element we didnt copy}
        System.arraycopy(temp, 0, input, start, tempIndex); //{}

    }

}
// System.arraycopy(src, srcPos, dest, destPos, length)
// src − This is the source array.

// srcPos − This is the starting position in the source array.

// dest − This is the destination array.

// destPos − This is the starting position in the destination data.

// length − This is the number of array elements to be copied.
