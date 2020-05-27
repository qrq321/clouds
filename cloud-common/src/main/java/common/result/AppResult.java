package common.result;

import lombok.Data;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/7 16:57
 * @Description: {}
 */
@Data
public class AppResult<T> {
    private int code;
    private String msg;
    /**
     * 数据
     */
    private T data;
}
