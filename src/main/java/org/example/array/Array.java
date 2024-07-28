package org.example.array;

public class Array {

    public static void main(String[] args) {
        int arr[] = {1,2,3,4,5,6};
        //int[] res = reverseArray(arr);
//        for (int i = 0;i<arr.length;i++){
//            System.out.println(res[i]);
//        }

        System.out.println(findSecondLargestElement(arr)+"-> "+arr[4]);



    }

    static int[] reverseArray(int[] arr){
            int k=0;
            int j = arr.length-1;
            while (k<j){
                int temp = arr[k];
                arr[k] = arr[j];
                arr[j] = temp;
                k++;
                j--;



            }

        return arr;

    }

    static int findSecondLargestElement(int[] arr){
        int max = 0,prev = 0;
        for (int i = 1;i<arr.length;i++){
            if (arr[i]>arr[max]){
                prev = max;
                max = i;
            }
        }
        return prev;
    }

}
