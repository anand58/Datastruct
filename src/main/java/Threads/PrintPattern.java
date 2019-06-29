package Threads;

public class PrintPattern {

    public static void main(String[] args) {
     int[][] arr =  arr = new int[3][5];
        int num = 1;
        for(int i =0; i<3 ; i++){
            for(int j =0; j<5 ; j++){
                arr[i][j] = num;
                num++;
            }
        }

        PrintPattern p = new PrintPattern();

        int[][] arr2 = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        System.out.println(p.printArr(arr2));
    }

    public int printArr(int[][] arr){

        int sum = 0;
        for(int[] x : arr){
            for(int y : x){
                sum = sum +y;
                System.out.print(y+" ");
            }
            System.out.println();
        }
       return sum;

    }
}
