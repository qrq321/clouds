package site.hyperlink.minguser.controller;

import io.swagger.annotations.Api;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import site.hyperlink.minguser.service.ITUserService;
import site.hyperlink.minguser.vo.UserVo;
import site.type.cloudscommon.result.AppResult;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/7 11:23
 * @Description: {}
 */
@RestController
@AllArgsConstructor
@Api(value = "userController",tags = "用户controller")
@RequestMapping("/user")
public class UserController {


    /**
     * 用户服务
     * */
    private ITUserService userService;

    /**
     * 通过id查询用户
     * */
    @GetMapping("/getUser/{id}")
    public AppResult<UserVo> helloUser(@PathVariable Long id) {
        UserVo userVo = UserVo.getUserVo(userService.getById(id));
        AppResult<UserVo> result = new AppResult<>();
        result.setData(userVo);
        return result;

    }

}
