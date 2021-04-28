package suanfa.sort;

/**
 * @ClassName ShellSort
 * @Description
 * @Author ANIAN
 * @Date 2021/3/29 下午3:03
 * @Version V1.0
 **/
public class ShellSort {
    public static void main(String[] args) {
        int[] array = {3,40,8,2,10,7,6,9,12,14,17,13,11,1,5,7};

        for (int gap = 4; gap >0 ; gap /=2) {
            for (int i = gap ; i<array.length;i++){
                for (int j = i ;j > gap-1; j-=gap){
                    if(array[j] < array[j-gap] ){
                        SelectionSort.exchange(array , j , j-gap );
                    }
                }
            }
            SelectionSort.printEle(array);
            System.out.println();
        }

    }
}
