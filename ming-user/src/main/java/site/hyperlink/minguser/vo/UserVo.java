package site.hyperlink.minguser.vo;

import cn.hutool.core.bean.BeanUtil;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import site.hyperlink.minguser.entity.TUser;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author hyperlink
 * 2020/5/31
 * @version 1.0
 */
@ApiModel(value="UserVo", description="返回")
@Data
public class UserVo implements Serializable {


    @ApiModelProperty(value = "用户名称")
    private String name;

    @ApiModelProperty(value = "创建时间")
    private LocalDateTime createTime;

    @ApiModelProperty(value = "修改时间")
    private LocalDateTime updateTime;

    @ApiModelProperty(value = "创建人")
    private Long createBy;

    @ApiModelProperty(value = "修改人")
    private Long updateBy;

    @ApiModelProperty(value = "删除标志 0-正常 1- 删除")
    private Integer delFlag;

    /**
     * 通过entity获取对应的Vo
     * @param user 用户信息
     * @return userVo
     * */
    public static UserVo getUserVo(TUser user){
        UserVo userVo = new UserVo();
        BeanUtil.copyProperties(user,userVo,true);
        return userVo;
    }
}
