public class LinearSearch {
    public static void main(String[] args){

        int[] intArray = {2, 1, 6, 8, 9, 19, 30, 77};

        System.out.println(linearSearch(intArray, 1));

    }
    public static int linearSearch(int[] input, int value){
        for (int i = 0; i < input.length; i++){
            if (input[i] == value){
                return input[i];
            }

        }
        return -1;
    }
}