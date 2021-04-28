package suanfa.sort;

/**
 * @ClassName CountSort
 * @Description
 * @Author ANIAN
 * @Date 2021/4/1 下午2:52
 * @Version V1.0
 **/
public class CountSort {

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,2,4,6,8,4,5,3,4,5,3,2,4,5,0,0,0,0,0};
        int[] temp = sort2(array);
        SelectionSort.printEle(temp);
    }
    public static int[] sort2(int[] array) {
        int[] count = new int[10];
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[array[i]] ++;
        }
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i-1];
        }
        for (int i = array.length -1; i >=0; i--) {
            temp[--count[array[i]] ] = array[i];
        }

        return temp;
    }
//不稳定算法
    public static int[] sort1(int[] array) {
        int[] count = new int[10];
        int[] temp = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            count[array[i]] ++;
        }
        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while(count[i]-- > 0) temp[index ++] = i;
        }
        return temp;
    }
}
