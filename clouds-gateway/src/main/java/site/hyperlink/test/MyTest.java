package site.hyperlink.test;

import org.junit.Test;
import site.hyperlink.controller.UserController;
import site.hyperlink.service.UserService;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/9 14:46
 * @Description: {}
 */
public class MyTest {

    @Test
    public void test(){
        UserController userController = new UserController();
        Class<? extends UserController> clazz = userController.getClass();
        //创建对象
        UserService userService = new UserService();


    }
}
