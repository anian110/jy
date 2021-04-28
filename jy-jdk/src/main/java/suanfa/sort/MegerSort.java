package suanfa.sort;

/**
 * @ClassName MegerSort
 * @Description
 * @Author ANIAN
 * @Date 2021/3/30 上午11:17
 * @Version V1.0
 **/
public class MegerSort {
    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,4,5,3};
        sort(array , 0 , array.length - 1);
        SelectionSort.printEle(array);
    }

    public static void sort(int[] array , int left , int right){
        if(left == right) return;
        //分成两半
        int mid = left + (right - left) /2;
        //左边排序
        sort(array , 0 , mid);
        //右边排序
        sort(array , mid + 1 , right);
        meger(array , left , mid + 1 , right);
    }

    public static void meger(int[] array , int leftPtr , int rightPtr , int rightBound){
        int mid = rightPtr -1;
        int i = leftPtr;
        int j = mid+1;
        int k = 0;
        int[] tem = new int[rightBound - leftPtr + 1];
        while (i <= mid && j <= rightBound){
            tem[k++] =  array[i] <= array[j] ? array[i++] : array[j++];
        }
        while (i <= mid ) tem[k++] = array[i++];
        while (j <= rightBound ) tem[k++] = array[j++];
        for (int l = 0; l < tem.length; l++) {
            array[leftPtr+l] = tem[l];
        }
    }
}
