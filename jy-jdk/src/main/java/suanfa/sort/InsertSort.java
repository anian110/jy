package suanfa.sort;

/**
 * @ClassName InsertSort
 * @Description
 * @Author ANIAN
 * @Date 2021/3/26 下午4:26
 * @Version V1.0
 **/
public class InsertSort {
    public static void main(String[] args) {
        int[] array = {3,4,8,2,10,7,6,9};
        for (int i = 1; i < array.length; i++) {
            for (int j = i; j > 0 && array[j] < array[j-1]  ; j--) {
                SelectionSort.exchange(array , j - 1 , j );
            }
        }
        SelectionSort.printEle(array);
    }
}
