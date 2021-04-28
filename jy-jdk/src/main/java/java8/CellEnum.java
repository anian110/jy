package java8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @ClassName CellEnum
 * @Description
 * @Author ANIAN
 * @Date 2021/4/26 上午11:07
 * @Version V1.0
 **/
public enum  CellEnum {
    CHOOSE("请选择", ""),
    TOP_LINE("VIVO", "1"),
    POPULAR_LINE("OPP", "2"),
    ALL("全部", "3"),;

    //声明一个构造方法
    CellEnum(String name,String code){
        this.name=name;
        this.code=code;
    }

    private String name;
    private String code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    //讲枚举转换成list格式，这样前台遍历的时候比较容易，列如 下拉框 后台调用toList方法，你就可以得到code 和name了
    public static List toList() {
        List list = new ArrayList();
        //Lists.newArrayList()其实和new ArrayList()几乎一模
        //  一样, 唯一它帮你做的(其实是javac帮你做的), 就是自动推导(不是"倒")尖括号里的数据类型.

        for (CellEnum airlineTypeEnum : CellEnum.values()) {
            Map<String, Object> map = new HashMap<String, Object>();
            map.put("code", airlineTypeEnum.getCode());
            map.put("name", airlineTypeEnum.getName());
            list.add(map);
        }
        return list;
    }

}
