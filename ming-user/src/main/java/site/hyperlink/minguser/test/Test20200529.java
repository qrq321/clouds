package site.hyperlink.minguser.test;

import common.util.GetName;
import lombok.Data;

import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

/**
 * @author: RuiQi
 * @Date: 2020/5/29 8:58
 */
@Data
public class Test20200529 {

    private String value;
    public static void main(String[] args) throws NoSuchMethodException {
        System.out.println(GetName.name(Test20200529::getValue));
        //Function 理解
        Function<Integer, Integer> name = e -> e + 2;
        Function<Integer, Integer> square = e -> e * e;
        System.out.println("name.apply:"+name.apply(5));
        System.out.println("square.apply:"+square.apply(5));
        System.out.println(square.compose(square).apply(3));
        int value = name.andThen(square).apply(3);
        System.out.println("andThen value=" + value);
        int value2 = name.compose(square).apply(3);
        System.out.println("compose value2=" + value2);
        //返回一个执行了apply()方法之后只会返回输入参数的函数对象
        Object identity = Function.identity().apply("huohuo");
        System.out.println(identity);
    }
    public static <T> List<T> distinct(List<T> list, Comparator<? super T> comparator){
        //java
        return list;
    }
}