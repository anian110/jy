package fromXMLBuild;

import dao.JyUserDao;
import entity.JyUser;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @ClassName FromXMLBuild
 * @Description
 * @Author ANIAN
 * @Date 2021/1/19 1:59 下午
 * @Version V1.0
 **/
public class FromXMLBuild {
    public static void main(String[] args) throws Exception {
        String resource = "mybaits-config/mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);

        SqlSession sqlSession = sqlSessionFactory.openSession();
        JyUserDao mapper = sqlSession.getMapper(JyUserDao.class);
//        JyUser jyUser = new JyUser();
//        jyUser.setName("cpx");
//        jyUser.setAge(29);
//        jyUser.setSex(1);
//        mapper.insert(jyUser);
        JyUser jyUser1 = mapper.queryById(2L);
//        System.out.println(jyUser1.toString());

    }
}
