package suanfa.sort;

import java.util.Arrays;

/**
 * @ClassName BaseSort
 * @Description
 * @Author ANIAN
 * @Date 2021/4/2 下午2:43
 * @Version V1.0
 **/
public class BaseSort {
    public static void main(String[] args) {
        int[] arr = {234,135,256,169,220,421,777,330,443,346};


        //分别对个、十、百位进行排序 所以遍历三次
        for (int n = 0; n < 3; n++) {
            int[] temp = new int[arr.length];
            int[] count = new int[10];
            int ii = (int)Math.pow(10,n);
            //每个桶进行计数
            for (int i = 0; i < arr.length; i++) {
                int v = arr[i] / ii % 10;
                count[v] ++;
            }
            //每一个桶里面元素出现的最后一个位置
            for (int i = 1; i < count.length; i++) {
                count[i] = count[i] + count[i-1];
            }
//            System.out.println("位置信息："+Arrays.toString(count));
            //倒序遍历和位置集合结合进行排序
            for (int i = arr.length -1; i >=0; i--) {
                int h =arr[i] / ii % 10;
                temp[--count[h]] = arr[i];
            }
            System.arraycopy(temp,0,arr,0,arr.length);

        }

        System.out.println("排序结果:"+Arrays.toString(arr));
    }
}
