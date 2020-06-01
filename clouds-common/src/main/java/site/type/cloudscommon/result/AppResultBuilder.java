package site.type.cloudscommon.result;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/7 16:58
 * @Description: {}
 */
public class AppResultBuilder {
    private static Integer successCode = ResultCode.SUCCESS.getCode();
    private static String successMsg = ResultCode.SUCCESS.getMsg();

    //成功，不返回具体数据
    public static AppResult<String> success(){
        AppResult<String> result = new AppResult<String>();
        result.setCode(successCode);
        result.setMsg(successMsg);
        result.setData("");
        return result;
    }
    //成功，返回数据
    public static <T> AppResult<T> success(T t){
        AppResult<T> result = new AppResult<T>();
        result.setCode(successCode);
        result.setMsg(successMsg);
        result.setData(t);
        return result;
    }

    //失败，返回失败信息
    public static <T> AppResult<T> error(ResultCode code){
        AppResult<T> result = new AppResult<T>();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg());
        return result;
    }

    //失败，返回失败信息
    public static <T> AppResult<T> error(ResultCode code,String extraMsg){
        AppResult<T> result = new AppResult<T>();
        result.setCode(code.getCode());
        result.setMsg(code.getMsg() + "," + extraMsg);
        return result;
    }

    //失败，返回失败信息
    public static <T> AppResult<T> error(Integer code,String extraMsg){
        AppResult<T> result = new AppResult<T>();
        result.setCode(code);
        result.setMsg(extraMsg);
        return result;
    }
}
