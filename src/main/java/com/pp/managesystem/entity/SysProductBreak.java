package com.pp.managesystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * <p>
 * 
 * </p>
 *
 * @author Jay
 * @since 2022-05-19
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysProductBreak implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 批次编号
     */
    private String prCode;

    /**
     * 份数的编号
     */
    private String prBreakCode;

    /**
     * 简化编号
     */
    @TableField(exist = false)
    private String prBreakCodeSim;

    /**
     * 是否生成了子条目
     */
    private String isChoose;

    /**
     * 该份的数量（默认为上级传入的，可更改）
     */
    private Integer count;


}
