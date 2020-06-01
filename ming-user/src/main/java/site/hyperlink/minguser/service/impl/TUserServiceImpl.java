package site.hyperlink.minguser.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;
import site.hyperlink.minguser.entity.TUser;
import site.hyperlink.minguser.mapper.TUserMapper;
import site.hyperlink.minguser.service.ITUserService;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author RuiQi
 * @since 2020-05-31
 */
@Service
public class TUserServiceImpl extends ServiceImpl<TUserMapper, TUser> implements ITUserService {

}
