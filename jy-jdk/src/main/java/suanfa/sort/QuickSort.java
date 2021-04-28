package suanfa.sort;

/**
 * @ClassName QuickSort
 * @Description
 * @Author ANIAN
 * @Date 2021/3/31 下午1:59
 * @Version V1.0
 **/
public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,4,5,3};
        sort(array, 0 , array.length-1);
        SelectionSort.printEle(array);
    }

    public static void sort(int[] arr ,int left , int right){
        if (left >= right) return;
        int mid = partion(arr , left , right);
        sort(arr , 0  , mid - 1);
        sort(arr , mid + 1  , right);

    }
    public static int partion(int[] arr ,int leftBound , int rightBound ){
        int left = leftBound;
        int right =  rightBound -1;
        int tempValue = arr[rightBound];
        while (left <= right ){
            while (left <= right && arr[left] <= tempValue)  left++;
            while (left <= right && arr[right] > tempValue) right--;
            if(left < right) SelectionSort.exchange(arr , left , right);
        }

        SelectionSort.exchange(arr , left , rightBound);
        return left;
    }
}
