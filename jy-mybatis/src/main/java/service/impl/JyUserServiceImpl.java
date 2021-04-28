package service.impl;

import entity.JyUser;
import dao.JyUserDao;
import service.JyUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (JyUser)表服务实现类
 *
 * @author makejava
 * @since 2021-01-20 14:18:01
 */
@Service("jyUserService")
public class JyUserServiceImpl implements JyUserService {
    @Resource
    private JyUserDao jyUserDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    @Override
    public JyUser queryById(Long id) {
        return this.jyUserDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<JyUser> queryAllByLimit(int offset, int limit) {
        return this.jyUserDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param jyUser 实例对象
     * @return 实例对象
     */
    @Override
    public JyUser insert(JyUser jyUser) {
        this.jyUserDao.insert(jyUser);
        return jyUser;
    }

    /**
     * 修改数据
     *
     * @param jyUser 实例对象
     * @return 实例对象
     */
    @Override
    public JyUser update(JyUser jyUser) {
        this.jyUserDao.update(jyUser);
        return this.queryById(jyUser.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Long id) {
        return this.jyUserDao.deleteById(id) > 0;
    }
}