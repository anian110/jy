import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName Suanfa
 * @Description
 * @Author ANIAN
 * @Date 2021/1/5 4:02 下午
 * @Version V1.0
 **/
public class Suanfa {
    public static void main(String[] args) {
        List<List<Integer>> demo = demo("aaa");
        System.out.println(demo.toString());
    }
    public static List<List<Integer>> demo(String str){
        char[] charArray = str.toCharArray();
        int clen = charArray.length;
        List<List<Integer>> list  = new ArrayList<>();
        char tempChar =charArray[0];
        int startIndex = 0;
        int cousr = 1;
        for (int i = 1; i < clen; i++) {
            if (charArray[i] == tempChar) {
                cousr++;
            }else {
                if (cousr >= 3) {
                    list.add(Arrays.asList(startIndex , startIndex + cousr -1));
                }
                    tempChar = charArray[i];
                    cousr = 1;
                    startIndex = i;
            }

        }
        if (cousr >= 3) {
            list.add(Arrays.asList(startIndex , startIndex + cousr -1));
        }
        return list;
    }
}
