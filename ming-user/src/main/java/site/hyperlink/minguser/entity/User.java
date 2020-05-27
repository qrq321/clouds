package site.hyperlink.minguser.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @Author: ruiqiqin
 * @Date: 2020/5/6 10:48
 * @Description: {}
 */
@Data
@ApiModel(value="用户")
public class User implements Serializable {
    @ApiModelProperty(value = "用户ID")
    private Long id;
    @ApiModelProperty(value = "用户名")
    private String name;
    @ApiModelProperty(value = "用户年龄")
    private Integer age;
    @ApiModelProperty(value = "用户邮箱")
    private String email;
}

