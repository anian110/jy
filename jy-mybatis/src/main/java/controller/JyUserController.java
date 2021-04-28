package controller;

import entity.JyUser;
import service.JyUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (JyUser)表控制层
 *
 * @author makejava
 * @since 2021-01-20 14:18:10
 */
@RestController
@RequestMapping("jyUser")
public class JyUserController {
    /**
     * 服务对象
     */
    @Resource
    private JyUserService jyUserService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public JyUser selectOne(Long id) {
        return this.jyUserService.queryById(id);
    }

}