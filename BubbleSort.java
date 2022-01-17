public class BubbleSort {
    // this time complexity is O(n^2), which is not great!!

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

        for(int lastUnSortedIndex = intArray.length -1; lastUnSortedIndex >0 ; lastUnSortedIndex--){
            for (int i = 0; i < lastUnSortedIndex; i++){
                if (intArray[i] > intArray[i + 1]){
                    Swap(intArray, i, i+1);
                }
            }
        }

        for (int i =0; i < intArray.length; i++){
            System.out.println(intArray[i]);
        }



    }


}
