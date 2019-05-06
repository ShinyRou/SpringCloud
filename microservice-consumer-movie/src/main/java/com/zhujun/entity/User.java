package com.zhujun.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;

/**
 * className: User
 * create by: zhujun
 * description: TODO
 * create time: 2019/3/12 16:08
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    private Long id;


    private String username;


    private String name;


    private Integer age;


    private BigDecimal balance;
}
