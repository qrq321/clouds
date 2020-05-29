package site.hyperlink.minguser.test;

import java.util.function.Function;

/**
 * @author: RuiQi
 * @Date: 2020/5/29 15:46
 */
@FunctionalInterface
public interface Inter extends Function {

    static String getValue(){
        return "123";
    }
}
