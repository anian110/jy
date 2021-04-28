/**
 * @ClassName Intern
 * @Description
 * @Author ANIAN
 * @Date 2021/1/26 4:56 下午
 * @Version V1.0
 **/
public class Intern {

    public static void main(String[] args) {
        String str1 = new StringBuffer("计算机").append("软件").toString();
        System.out.println(str1.intern() == str1);
        String str2 = new StringBuffer("ja").append("va").toString();
        System.out.println(str2.intern() == str2);
    }
}
