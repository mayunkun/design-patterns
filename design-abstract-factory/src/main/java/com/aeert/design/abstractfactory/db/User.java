package com.aeert.design.abstractfactory.db;

import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @Author l'amour solitaire
 * @Description 用户表
 * @Date 2020/11/19 下午3:15
 **/
@Data
@Accessors(chain = true)
public class User {

    /**
     * ID
     **/
    private Long id;

    /**
     * 姓名
     **/
    private String name;

}
