package site.hyperlink.minguser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import site.hyperlink.minguser.dao.UserMapper;
import site.hyperlink.minguser.entity.User;
import site.hyperlink.minguser.service.UserService;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/7 11:40
 * @Description: {}
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
