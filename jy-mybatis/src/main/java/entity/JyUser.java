package entity;

import java.io.Serializable;

/**
 * (JyUser)实体类
 *
 * @author makejava
 * @since 2021-01-20 14:17:49
 */
public class JyUser implements Serializable {
    private static final long serialVersionUID = -62052438805827559L;
    /**
    * 唯一键
    */
    private Long id;
    /**
    * 姓名
    */
    private String name;
    /**
    * 年龄
    */
    private Object age;
    /**
    * 性别
    */
    private Object sex;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Object getAge() {
        return age;
    }

    public void setAge(Object age) {
        this.age = age;
    }

    public Object getSex() {
        return sex;
    }

    public void setSex(Object sex) {
        this.sex = sex;
    }

    @Override
    public String toString() {
        return "JyUser{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", sex=" + sex +
                '}';
    }
}