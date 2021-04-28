package suanfa.sort;

/**
 * @ClassName BubbleSort
 * @Description
 * @Author ANIAN
 * @Date 2021/3/25 下午3:49
 * @Version V1.0
 **/
public class BubbleSort {

    private static int flag = 0;
    private static int lastIndex = 0; //z记录最后一次交换的位置

    public static void main(String[] args) {
        int[] array = {3,4,8,2,10,7,6,9};
        lastIndex= array.length -1;
        sort(array);
        SelectionSort.printEle(array);
    }

    public static void sort(int[] array) {
        for (int i = lastIndex ; i> 0; i--) {
            System.out.println("lastIndex:" + lastIndex);
            flag = 0;
            findMax(array, i);
            if(flag == 0 ){
                return;
            }
        }
    }

    public static void findMax(int[] array, int i) {
        for (int j = 0; j < i; j++) {
            if (array[j] > array[j+1]) {
                SelectionSort.exchange(array , j+1 , j);
                flag = 1;
                lastIndex = j+1;
            }
        }
    }
}
