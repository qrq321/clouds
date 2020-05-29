package common.util;

import java.beans.Introspector;
import java.io.Serializable;
import java.lang.invoke.SerializedLambda;
import java.lang.reflect.Method;
import java.util.function.Function;

/**
 * @author: RuiQi
 * @Date: 2020/5/29 16:13
 */
@FunctionalInterface
public interface TypeFunction<T, R> extends Serializable, Function<T, R> {

    /**
     * 获取列名称
     *
     * @param lambda
     * @return String
     */
    static String getLambdaColumnName(Serializable lambda) {
        try {
            Method method = lambda.getClass().getDeclaredMethod("writeReplace");
            method.setAccessible(Boolean.TRUE);
            SerializedLambda serializedLambda = (SerializedLambda) method.invoke(lambda);
            String getter = serializedLambda.getImplMethodName();
            String fieldName = Introspector.decapitalize(getter.replace("get", ""));
            return fieldName;
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException(e);
        }
    }
}

