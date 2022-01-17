
public class SelectionSort {
    // this time complexity is O(n^2), which is not great!!
    // Unstable Algorizm

    public static void Swap(int[] array, int i, int j){

        if (i == j){
            return;
        }

        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;

    }
    
    public static void main(String[] args){
        int[] intArray = {29, 1, 5, -4, 8};
        int largest =0;

        for(int lastUnSortedIndex = intArray.length -1; lastUnSortedIndex >0 ; lastUnSortedIndex--){
            for (int i = 0; i <= lastUnSortedIndex; i++){
                if (intArray[i] > intArray[largest]){
                    largest = i;
                }
            }
            Swap(intArray, largest, lastUnSortedIndex);
        }

        for (int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }



    }


}

