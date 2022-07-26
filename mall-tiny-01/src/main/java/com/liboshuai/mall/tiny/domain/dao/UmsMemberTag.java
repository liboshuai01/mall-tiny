package com.liboshuai.mall.tiny.domain.dao;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * <p>
 * 用户标签表
 * </p>
 *
 * @author liboshuai
 * @since 2022-07-25
 */
@Data
@TableName("ums_member_tag")
@ApiModel(value = "UmsMemberTag对象", description = "用户标签表")
public class UmsMemberTag implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @TableField("name")
    private String name;

    @ApiModelProperty("自动打标签完成订单数量")
    @TableField("finish_order_count")
    private Integer finishOrderCount;

    @ApiModelProperty("自动打标签完成订单金额")
    @TableField("finish_order_amount")
    private BigDecimal finishOrderAmount;


}




