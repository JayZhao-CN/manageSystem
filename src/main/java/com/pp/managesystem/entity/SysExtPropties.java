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
 * @since 2022-04-24
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
public class SysExtPropties implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    /**
     * x属性.表.name
     */
    private String name;

    /**
     * 颜色编码
     */
    private String color;

    /**
     * 图片url
     */
    private String image;

    /**
     * 属性标识符
     */
    private String proptiesCode;


}
