package service;

import entity.JyUser;
import java.util.List;

/**
 * (JyUser)表服务接口
 *
 * @author makejava
 * @since 2021-01-20 14:17:54
 */
public interface JyUserService {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    JyUser queryById(Long id);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<JyUser> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param jyUser 实例对象
     * @return 实例对象
     */
    JyUser insert(JyUser jyUser);

    /**
     * 修改数据
     *
     * @param jyUser 实例对象
     * @return 实例对象
     */
    JyUser update(JyUser jyUser);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    boolean deleteById(Long id);

}