public class RadixSort {
    public static void merge(int[] input, int start, int mid, int end){
        int [] radixArray = {4725, 4586, 1330, 8792, 1594, 5729};

        radixSort(radixArray, 10, 4);

        for (int i = 0; i < radixArray.length; i++){
            System.out.println(radixArray[i]);
        }
    }
    public static void radixSort(int[] input, int radix, int width){
        for (int i = 0; i < width; i++){
            radixSingleSort(input, i, radix);
        }
    }
    public static void radixSingleSort(int[] input, int position, int radix){
        int numItem = input.length;
        int[] countArray = new int[radix];

        // counting the number of the value that has spedfic digitn in a position
        for (int value: input){
            countArray[getDigit(position, value, radix)]++;
        }
        // Adujust the count array
        for (int j = 1; j < radix; j++){
            countArray[j] += countArray[j - 1];
        }
        // from right to left
        int[] temp = new int[numItem];
        for (int tempIndex = numItem - 1; tempIndex >= 0; tempIndex--){
            temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
        }
        for (int tempIndex = 0; tempIndex < numItem; tempIndex++){
            input[tempIndex] = temp[tempIndex];
        }

    }
    public static int getDigit(int position, int value, int radix){
        return value/ (int) Math.pow(radix, position) % radix;
    }
        
    
}
