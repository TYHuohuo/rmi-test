package com.cy.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 用户信息实体类
 * @author jackson
 * @date 2020/4/8
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User implements Serializable {

    private static final long serialVersionUID = 8103395528627802432L;
    /**
     * 用户名字
     */
    private String name;
    /**
     * 用户性别
     */
    private String sex;
    /**
     * 座右铭
     */
    private String motto;
}
