package common.util;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;

/**
 * @author: RuiQi
 * @Date: 2020/5/29 15:46
 */
@FunctionalInterface
public interface GetName extends Function<String,Object> {

    static Map<TypeFunction, String> map = new HashMap<>();

    /**
     * 获取对象属性名
     *
     * @param name
     * @param <T>
     * @param <R>
     * @return
     */
    public static <T, R> String name(TypeFunction<T, R> name) {
        if (map.containsKey(name)) {
            return map.get(name);
        }
        String lambdaColumnName = TypeFunction.getLambdaColumnName(name);
        map.put(name, lambdaColumnName);
        return lambdaColumnName;
    }
}
