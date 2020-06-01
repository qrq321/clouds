package site.hyperlink.minguser.entity;

import java.io.Serializable;
import java.time.LocalDateTime;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * <p>
 * 
 * </p>
 *
 * @author RuiQi
 * @since 2020-05-31
 */
@ApiModel(value="TUser对象", description="")
@TableName("t_user")
@Data
public class TUser implements Serializable {

	@ApiModelProperty(value = "用户名称")
	@TableId("id")
	private Long id;

	@ApiModelProperty(value = "用户名称")
	@TableField("name")
	private String name;

	@TableField("CREATE_TIME")
	@ApiModelProperty(value = "创建时间")
	private LocalDateTime createTime;

	@TableField("UPDATE_TIME")
	@ApiModelProperty(value = "修改时间")
	private LocalDateTime updateTime;

	@TableField("CREATE_BY")
	@ApiModelProperty(value = "创建人")
	private Long createBy;

	@TableField("UPDATE_BY")
	@ApiModelProperty(value = "修改人")
	private Long updateBy;

	@TableField("DEL_FLAG")
	@ApiModelProperty(value = "删除标志 0-正常 1- 删除")
	private Integer delFlag;
}