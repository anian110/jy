package suanfa.sort;

/**
 * @ClassName SelectionSort
 * @Description
 * @Author ANIAN
 * @Date 2021/3/24 上午10:41
 * @Version V1.0
 **/
public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {3,4,8,2,10,7,6,9};
        for (int i = 0; i < array.length -1; i++) {
            int minPos = i;
            for (int j = i + 1; j < array.length; j++) {
                minPos = array[minPos] > array[j] ? j : minPos;
            }
            exchange(array, i, minPos);
        }
        printEle(array);
    }

    public static void printEle(int[] array) {
        for (int i : array) {
            System.out.print(i + " ");
        }
    }

    public static void exchange(int[] array, int i, int minPos) {
        int temp = array[i];
        array[i] = array[minPos];
        array[minPos] = temp;
    }
}
