package site.hyperlink.minguser.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import site.hyperlink.minguser.entity.User;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/6 10:49
 * @Description: {}
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}

