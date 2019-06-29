public class MergeArrays {
    public static void main(String[] args) {
        int[] arr1 = {1,2,5,6,8,9,10};
        int[] arr2 = {0,2,5};
        int[] arr = new MergeArrays().merge(arr1, arr2);
        for(int i : arr){
            System.out.print(i+" ");
        }

    }

    public int[] merge(int[] arr1, int[] arr2){
        int[] arr = new int[arr1.length + arr2.length];
        int count = -1;
        int offset =0;
        for(int i =0; i<arr2.length; i++){
            if (arr1[i] > arr2[i]) {
                count += 1;
                arr[count]= arr2[i];
                count += 1;
                arr[count] = arr1[i];
            }else if (arr2[i] > arr1[i]) {
                count += 1;
                arr[count]= arr1[i];
                count += 1;
                arr[count] = arr2[i];
            }else{
                ++offset;
                count += 1;
                arr[count] = arr1[i];
            }
        }
        int len = arr2.length*2-offset;
        for(int j = arr2.length; j< arr1.length ; j++){
            arr[len] = arr1[j];
            ++len;
        }
        int[] result = new int[arr.length-offset];
        for(int i =0; i<arr.length-offset; i++){
            result[i] = arr[i];
        }
        return result;
    }
}
