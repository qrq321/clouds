package site.type.cloudscommon.entity;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author RuiQi
 * @since 2020-05-31
 */
@ApiModel(value="tUserCon对象", description="usercon对象")
@TableName("T_USER_CON")
@Data
public class TUserCon implements Serializable {

	@ApiModelProperty(value = "id")
	@TableId("id")
	private int id;

	@ApiModelProperty(value = "用户id")
	@TableField("user_id")
	private int userId;

	@ApiModelProperty(value = "类型")
	@TableField("type")
	private int type;
}