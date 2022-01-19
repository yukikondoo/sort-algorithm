public class BinarySearch {

    // time complexity is O(logn)
    public static void main(String[] args){

        int[] intArray = {-2, 1, 6, 8, 9, 19, 30, 77};

        System.out.println(recursiveBinarySearch(intArray, 1));

    }

    public static int binarySearch(int[] input, int value){
        int start = 0;
        int end = input.length;

        while (start < end){

            int mid = (start + end) / 2;
            if (input[mid] == value){
                return mid;
            }
            else if (input[mid] < value){
                start = mid +1;
            }
            else {
                end = mid;
            }
        }
        return -1;
    }
    public static int recursiveBinarySearch(int[] input, int value){
        return recursiveBinarySearch(input, 0, input.length, value);
    }
    public static int recursiveBinarySearch(int[] input, int start, int end, int value){
        if (start >= end){
            return -1;
        }
        int mid = (start + end) / 2;
        System.out.println("midpoint; " + mid);

        if (input[mid] == value){
            return mid;
        }
        else if (input[mid] < value){
            return recursiveBinarySearch(input, mid+1, end, value);
        }
        else{
            return recursiveBinarySearch(input, start, mid, value);
        }
    }
}
