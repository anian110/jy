package dao;

import entity.JyUser;
import org.apache.ibatis.annotations.Param;
import java.util.List;

/**
 * (JyUser)表数据库访问层
 *
 * @author makejava
 * @since 2021-01-20 14:17:50
 */
public interface JyUserDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    JyUser queryById(Long id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JyUser> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param jyUser 实例对象
     * @return 对象列表
     */
    List<JyUser> queryAll(JyUser jyUser);

    /**
     * 新增数据
     *
     * @param jyUser 实例对象
     * @return 影响行数
     */
    int insert(JyUser jyUser);

    /**
     * 修改数据
     *
     * @param jyUser 实例对象
     * @return 影响行数
     */
    int update(JyUser jyUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Long id);

}