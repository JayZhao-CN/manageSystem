package com.pp.managesystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jay
 * @since 2022-05-16
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysProduct implements Serializable {

    private static final long serialVersionUID=1L;

    /**
     * ID
     */
    @TableId(value = "pr_id", type = IdType.AUTO)
    private Integer prId;

    /**
     * 公司编号+产品唯一标识+批次+数量
     */
    private String prCode;

    /**
     * 产品所属公司
     */
    private String prCompany;

    /**
     * 产品类型编号
     */
    private String prTypeCode;
    /**
     * 产品类型名称
     */
    @TableField(exist = false)
    private String prTypeCodeName;

    /**
     * 产品批次
     */
    private String prBatch;

    /**
     * 每个单位的数量
     */
    private Integer prPerCount;

    /**
     * 共计多少单位
     */
    private Integer prUnitCount;

    /**
     * 产品数量
     */
    private Integer prCount;

    /**
     * 备注
     */
    private String prRemark;

    /**
     * 添加日期
     */
    private Date prTime;

    /**
     * 添加日期格式化
     */
    @TableField(exist = false)
    private String  prTimeFormat;


}
