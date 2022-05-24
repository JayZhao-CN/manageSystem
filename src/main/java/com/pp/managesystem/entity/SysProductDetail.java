package com.pp.managesystem.entity;

import com.baomidou.mybatisplus.annotation.IdType;
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
public class SysProductDetail implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * 产品批次的标识
     */
    private String prCode;

    /**
     * 该产品的唯一标识
     */
    private String prBreakCode;

    /**
     * 属性标识 -> 对应type配置的属性
     */
    private String proptiesCode;

    /**
     * 属性标识对应下的属性值
     */
    private String proptiesValueCode;


}
