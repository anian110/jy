package suanfa;

import suanfa.sort.SelectionSort;

import java.util.HashMap;

/**
 * @ClassName SmallSum 小和问题
 * @Description
 * @Author ANIAN
 * @Date 2021/4/14 上午10:37
 * @Version V1.0
 **/
public class SmallSum {



    public static void main(String[] args) {
        int[] arr = {1,3,4,2,5};
        int process = process(arr, 0, arr.length - 1);
        System.out.println(process);
    }

    public static int  process(int[] arr , int left , int right){
        if(left == right){
            return 0 ;
        }
        int mid = left + (right - left) / 2;

        return process(arr , left , mid) + process(arr , mid + 1 , right) + meger(arr , left , mid , right);
    }

    public static int  meger(int[] arr , int left , int mid , int right){
        int pL = left;
        int pR = mid + 1;
        int t = 0;
        int[] temp = new int[right - left + 1];
        int result = 0 ;
        while (pL <= mid &&  pR <= right){
            result += arr[pL] < arr[pR] ? (right - pR + 1) * arr[pL] : 0;
            temp[t++] = arr[pL] < arr[pR] ? arr[pL++] : arr[pR++];
        }
        while (pL <= mid) {
            temp[t++] = arr[pL++];
        }
        while (pR <= right) {
            temp[t++] = arr[pR++];
        }
        for (int i = 0; i < temp.length; i++) {
            arr[left + i ] = temp[i];
        }
        return result;
    }
}
