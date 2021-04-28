package suanfa;

/**
 * @ClassName Or
 * @Description 异或算法题
 * 一个集合里，有两个数出现奇数次，其他都是偶数次 ,求这两个数？
 * @Author ANIAN
 * @Date 2021/4/13 下午3:31
 * @Version V1.0
 **/
public class Or {

    private static int[] a = {1,1,55,55,2,6,44,44};

    public static void main(String[] args) {

        int eor = 0 ;
        for (int i : a) {
            eor ^= i;
        }
        //获取两个出现奇数次的数在最左侧第一个不同位上的数
        /**
         * int a = 10000011
         * ~a    = 01111100
         * a+1
         *       10000011
         *     + 00000001
         *     ----------
         *       10000100
         *
         * a & (~a + 1)
         *     10000011
         *  &  00000001
         *   -----------
         *     00000010
         *
         */
        int rightOne = eor & (~eor + 1);


        int eorTemp = 0;
        for (int i : a) {
            if ((i & rightOne) == 0) {
                eorTemp ^= i;
            }
        }
        System.out.println("这两个数是" +  eorTemp +" 和 "+ (eor^eorTemp));

    }
}
